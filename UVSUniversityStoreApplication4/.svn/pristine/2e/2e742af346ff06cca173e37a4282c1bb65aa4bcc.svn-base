package sg.nus.iss.se22ft1.entity;

import java.util.ArrayList;


/**
 * @category 	control the transaction item list
 * @author 		xu xiao.
 * @version 	2013/03/16 - Created by xu xiao.
 */


public class Transaction implements Comparable<Transaction>{

	
	private	ArrayList<TransactionItem> transItemList = null;
	
	private int transId 			= 0;
	private	int	quantityPurchased 	= 0;
	private	Product product 		= null;
	private Customer customer 		= null;
	private	String date				= null;
	
	public Transaction(int transId, int quantityPurchased, Product product,
			Customer customer, String date) {
		
		this.transId = transId;
		this.quantityPurchased = quantityPurchased;
		this.product 	= product;
		this.customer 	= customer;
		this.date		= date;
		
		if(null == transItemList){
			transItemList = new ArrayList<TransactionItem>();
		}
		addTransactionItem(quantityPurchased, product);
	}

	
	
	public int getTransId() {
		return transId;
	}



	public int getQuantityPurchased() {
		return quantityPurchased;
	}



	public Product getProduct() {
		return product;
	}



	public String getDate() {
		return date;
	}



	public Customer getCustomer() {
		return customer;
	}

	public ArrayList<TransactionItem> getTransItemList() {
		return transItemList;
	}

	public void addTransactionItem(int quantityPurchased, Product product){
		TransactionItem transItem = new TransactionItem(quantityPurchased, product);
		transItemList.add(transItem);		
	}



	public void removeTransaction(int index){
		if(transItemList == null || index > transItemList.size() || index < 0){
			return;
		}
		int i = index;
		transItemList.remove(i);
	}


	
    public double caculateAmount(){
    	
    	double amount	= 0;
 
    	for(TransactionItem transItem : transItemList){
        		int quantity = transItem.getQuantityPurchased();
        		double price = transItem.getProduct().getPrice();
        		amount +=  quantity * price;	
    	}
    	return amount;
    }
    
	@Override
    public String toString () {
        String s = "";
        int i = 0;
    	for(TransactionItem transItem : getTransItemList()){

    		s+= transId + "," + transItem.getProduct().getProductId() + "," + customer.getCustomerId()
    		+ "," + transItem.getQuantityPurchased() + "," + date;
    		//if(i < getTransItemList().size()){
    		//	s+= "\n";
    		//}
    		s+= "\n";
    		i++;
    	}
    	return s;
    }



	@Override
	public int compareTo(Transaction trans) {
		return this.transId - trans.transId;
	}


}
