package sg.nus.iss.se22ft1.manager;
import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;

import sg.nus.iss.se22ft1.entity.Customer;
import sg.nus.iss.se22ft1.entity.Member;
import sg.nus.iss.se22ft1.entity.Product;
import sg.nus.iss.se22ft1.entity.Transaction;
import sg.nus.iss.se22ft1.main.Shop;
import sg.nus.iss.se22ft1.util.FileOperations;

/**
 * @category 	control the transaction list and other logic functions
 * @author 		xu xiao.
 * @version		2013/03/16 - Created by xu xiao.
 * 		
 */

public class TransactionManager {

	public static final String FILENAME = "Transaction.dat";
	public static final String FILEDETAILS = Shop.path + FILENAME;
	
	private String printFileName = Shop.path + "Transaction.rpt";
	private Receipt receipt =  null;
	private Reader reader =  null;
	private HashMap<Integer, Transaction> transMap;
	
	//public static HashMap<Integer, Transaction> transMap;
	
	private int transId = 0;
	
	public TransactionManager() {
		if(null == transMap){
			transMap = new HashMap<Integer, Transaction>();
		}	
		transId = getNextTransactionId() + 1;
	}

	public Transaction getTransaction() {
		
		return transMap.get(transId);
	}	
	

	public int getTransId() {
		return transId;
	}

	
	public void setTransId(int transId) {
		this.transId = transId;
	}

	/**
	 * @category 	get the max trans id from flat file
	 * @author 		xu xiao.
	 * @version		2013/03/16 - Created by xu xiao.
	 * 		
	 */
	public int getNextTransactionId(){
		
		File file= new File(FILEDETAILS);
        if(!file.exists()){
        	return 0;
        }
        int transId = 0;
        String s ="";
        String[] fromFile = null;
		String[] temp = null;
        
        s = FileOperations.readFromFile(FILEDETAILS).toString();
        
        if("" != s){
        	fromFile = FileOperations.readFromFile(FILEDETAILS).toString().split("\n");   
    		temp = fromFile[fromFile.length-1].split(",");
    		if(temp[0].matches("[0-9]+")){
    			transId = Integer.parseInt(temp[0]);	
    		}
        }

        return transId;
	}
	

	
	/**
	 * @category	add one transaction to transaction list
	 * @param productId
	 * @param customerId
	 * @param date
	 * @return 0 - SUCCESS 
	 * @return 1 - PRODUCT  is null
	 * @return 2 - CUSTOMER is null
	 * @return 3 - QUANTITY is INSUFFICIENT
	 * @author 2013/03/16 - Created by xu xiao.
	 * @exception InvalidInputtException
	 */
	
	public int addTransaction(int quantityPurchased, String productId, String customerId)
			throws  InvalidInputtException{
		
        String error = null;
		if(quantityPurchased <= 0 )
			error = "No quantity specified";
		else if("" == productId)
			error = "No product id specified";
		else if("" == customerId)
			error = "No customer id specified";
		if(null != error)
			throw new InvalidInputtException(error);
		
		Product product = Shop.getProductFromProductId(productId);
		Customer customer = null;

		transId =  getNextTransactionId() + 1;
		if(!customerId.equals("PUBLIC") && !customerId.equals("public")){
			customer = Shop.getMemberFromMemberId(customerId);
			if(null == customer){
				return 2;
			}
		}
		
		if(null == product){
			return 1;
		}
				
		if(quantityPurchased > product.getQuantityAvaliable()){
			return 3;
		}
		
	    DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
	    Date today = new Date();
	    String date = dateFormat.format(today);

		Transaction trans = transMap.get(transId);
		if(null == trans){
			Transaction transaction = new Transaction(transId, quantityPurchased, product, customer, date);
			transMap.put(transId, transaction);
		}else{
			trans.addTransactionItem(quantityPurchased, product);
		}

		return 0;
	}
	

	/**
	 * @category	add one transaction to transaction list
	 *
	 * @return -1 	- discountRate exception 
	 * @return >= 0 - amount
	 * @author 2013/03/16 - Created by xu xiao.
	 * @exception InvalidInputtException
	 */
	 public double caculateAmount() throws InvalidInputtException{
		
		Transaction trans = getTransaction();
		
		if(null == trans){
			throw new InvalidInputtException("No trans specified");
		}
	    double discountRate = 0;
	    double amount	= 0;
	    String customerType = "";
	    if(trans.getCustomer().getCustomerId().equals("PUBLIC") || trans.getCustomer().getCustomerId().equals("public")){
	    	customerType = "A";
	    }else{
	    	customerType = "M";
	    }
	    discountRate = Shop.getMaximumDiscount(customerType, trans.getDate());
	    if(discountRate < 0){
			return -1;
		}

	    	
	    amount = trans.caculateAmount();
	    return amount*(1- discountRate/100);
	 }

	    /**
	     * @category	caculate total balance of transaction list
	     * @param amount
	     * @param points
	     * @param balance
	     * @param avaPoints
	     * @param cash
	     * @param change
	     * @return AMOUNT
	     * @author 2013/03/16 - Created by xu xiao.
	     * @exception InvalidInputtException
	     */
	 public double caculateBalance(double amount, double points, double balance, 
	    		double avaPoints, double cash, double change) throws InvalidInputtException{
	
	    String error = null;
		if(amount <= 0 )
			error = "No amount specified";
		else if(points > avaPoints)
			error = "avaPoints is less than input points";
		else if(balance < cash)
			error = "balance is less than cash";
		if(null != error)
			throw new InvalidInputtException(error);
	    		
	    change = cash - balance;
	    		
	    return change;
	   }

		/**
	     * @category	sync transaction list to flat file
	     * @return
	     * @author 2013/03/16 - Created by xu xiao.
		 */
		public void syncTransactionSources(){
			File file= new File(FILEDETAILS);
	        if(!file.exists()){
	            try {
					file.createNewFile();
				} catch (IOException e) {
					e.printStackTrace();
					System.out.println("file error");
					return;
				}
	        }
			String s = "";
			
			Transaction trans = transMap.get(transId);
			if(null != trans){
				s+=trans.toString();
			}
			FileOperations.appendToFile(FILEDETAILS, s);
		}
		/**
		 * @category	generate report
		 * @param startDate
		 * @param endDate
		 * @return
		 */		
		public int generateTransactionReport(String startDate, String endDate) throws InvalidInputtException {
		
			DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
			
		    String error = null;
			if("" == startDate )
				error = "No startDate specified";
			else if("" ==  endDate)
				error = "No endDate specified";
			else
				try {
					if(df.parse(startDate).compareTo(df.parse(endDate)) >0 )
						error = "Start date is earlier than end date";
				} catch (ParseException e1) {
					e1.printStackTrace();
				}
			
			if(null != error)
				throw new InvalidInputtException(error);



			String s = String.format("\tTransaction Report    [%s] - [%s]\n\t====================================================\n"
					+ "\nTrans ID\t  Product ID\t  Member ID\t    Quantity"
					+ "\t       Date\n"
					+ "------------------------------------------------------------------------------\n", startDate, endDate);
	
			File file= new File(FILEDETAILS);
	        if(!file.exists()){
	        	return -1;
	        }

	        String[] fromFile= null;
	        String y = FileOperations.readFromFile(FILEDETAILS).toString();
	        if("" != y){
	        	fromFile = y.split("\n");
	        }
			
			String[] temp = null;
			int	transId = 0;
			String productId = null;
			String memberId = null;
			int quantity =0;
			String date =  null;
			for (int i = 0; i < fromFile.length; i++) {
				temp=fromFile[i].split(",");
				
				if(temp[0].matches("[A-Z]*[1-9]+")){
					transId=Integer.parseInt(temp[0]);
				}else{
					continue;
				}
					
				productId=temp[1];
				memberId=temp[2];
				if(temp[3].matches("[0-9]+")){
					quantity = Integer.parseInt(temp[3]);
				}
				date=temp[4];
				
				try {
					if((df.parse(date).compareTo(df.parse(startDate))) >= 0 &&
							df.parse(date).compareTo(df.parse(endDate)) <= 0){
						//s += trans.toString();
						s += String.format("%-20s%-16s%-18s%-15s%-15s", transId, productId, memberId, quantity,
								date);
						s += "\n";
					}
				} catch (ParseException e) {
					e.printStackTrace();
				}

			}
			System.out.print(s);
			printFileName += "." + startDate + "-" + endDate;
			FileOperations.overwriteFile(printFileName, s);
			return 0;
		}

		/**
		 * @category	set receipt interface
		 * @param index
		 * @author 2013/03/16 - Created by xu xiao.
		 */	
		
		public void setReceipt(Receipt receipt) {
			this.receipt  = receipt;
		}

		/**
		 * @category	call receipt interface
		 * @param index
		 * @author 2013/03/16 - Created by xu xiao.
		 */	
		public void printReceipt(String total, String cash, String change){
			receipt.printReceipt(total, cash, change);
		}
	
		/**
		 * @category	set bar code interface
		 * @param index
		 * @author 2013/03/16 - Created by xu xiao.
		 */	
		public void setReader(Reader reader) {
			this.reader  = reader;
		}

		/**
		 * @category	call bar code interface
		 * @param index
		 * @author 2013/03/16 - Created by xu xiao.
		 */	
		public void readBarCode(){
			reader.readBarCode();
		}
		
		/**
		 * @category	remove transaction from transaction list
		 * @param index
		 * @author 2013/03/16 - Created by xu xiao.
		 * @exception InvalidInputtException
		 */	
		public void removeTransactionItem(int index) throws InvalidInputtException{
			if(index < 0){
				throw new InvalidInputtException("INPUT CAN NOT BE EMPTY");
			}
		
			getTransaction().removeTransaction(index);
		}
		
		 public void updateMemberPoints(String customerId, int points, double total){
			 Member member = null;
			 member =  Shop.getMemberFromMemberId(customerId);
			 if(null != member){
				 //dollar-to-point $10 spend = 1 point if dollar less than 10, set point to 0
				 //point-to-dollar 1 point = $1
				 int updPoints =  member.getLoyaltyPoints() - points;
				 updPoints +=  (int)total/10;
				 member.setLoyaltyPoints(updPoints);
				 Shop.updateMember(member);
			 }
		 }
		
}
