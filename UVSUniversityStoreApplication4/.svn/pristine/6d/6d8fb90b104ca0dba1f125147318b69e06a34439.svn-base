package sg.nus.iss.se22ft1.frames;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.InputMethodEvent;
import java.awt.event.InputMethodListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.ListModel;
import javax.swing.WindowConstants;
import javax.swing.SwingUtilities;

import sg.nus.iss.se22ft1.entity.Member;
import sg.nus.iss.se22ft1.entity.Product;
import sg.nus.iss.se22ft1.entity.Transaction;
import sg.nus.iss.se22ft1.entity.TransactionItem;
import sg.nus.iss.se22ft1.main.Shop;
import sg.nus.iss.se22ft1.manager.InvalidInputtException;
import sg.nus.iss.se22ft1.manager.TransactionManager;




/**
* This code was edited or generated using CloudGarden's Jigloo
* SWT/Swing GUI Builder, which is free for non-commercial
* use. If Jigloo is being used commercially (ie, by a corporation,
* company or business for any purpose whatever) then you
* should purchase a license for each developer using Jigloo.
* Please visit www.cloudgarden.com for details.
* Use of Jigloo implies acceptance of these licensing terms.
* A COMMERCIAL LICENSE HAS NOT BEEN PURCHASED FOR
* THIS MACHINE, SO JIGLOO OR THIS CODE CANNOT BE USED
* LEGALLY FOR ANY CORPORATE OR COMMERCIAL PURPOSE.
*/
public class AddTransactionFrame extends javax.swing.JFrame {
	private static final boolean falase = false;
	private JPanel jPanel1;
	private JLabel jLabel3;
	private JButton jButton1;
	private JPanel jPanel4;
	private JList<String> jList1;
	private JLabel jLabel5;
	private JPanel jPanel7;
	private JButton jButton2;
	private JPanel jPanel6;
	private JTextField jTextField9;
	private JLabel jLabel9;
	private JTextField jTextField8;
	private JTextField jTextField7;
	private JLabel jLabel8;
	private JTextField jTextField6;
	private JButton jButton5;
	private JButton jButton4;
	private JButton jButton3;
	private JLabel jLabel7;
	private JLabel jLabel6;
	private JTextField jTextField5;
	private JPanel jPanel5;
	private JLabel jLabel4;
	private JTextField jTextField4;
	private JPanel jPanel3;
	private JPanel jPanel2;
	private JTextField jTextField3;
	private JTextField jTextField2;
	private JLabel jLabel2;
	private JTextField jTextField1;
	private JLabel jLabel1;
	private TransactionManager transMgr;
	private ArrayList<TransactionItem> transList;
	
	/**
	* Auto-generated main method to display this JFrame
	*/
	
	public AddTransactionFrame() {	
		super();

		//transMgr =  new TransactionManager();
		transMgr = Shop.returnTransactionManager();
		initGUI();
		this.setLocationRelativeTo(null);
		jTextField3.requestFocus();

	}
	
	private void initGUI() {
		try {
			FlowLayout thisLayout = new FlowLayout();
			getContentPane().setLayout(thisLayout);
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			{
				jPanel1 = new JPanel();
				getContentPane().add(jPanel1);
				jPanel1.setPreferredSize(new java.awt.Dimension(421, 83));
				{
					jLabel1 = new JLabel();
					jPanel1.add(jLabel1);
					jLabel1.setText("Member ID");
					jLabel1.setPreferredSize(new java.awt.Dimension(184, 15));
				}
				{
					jTextField1 = new JTextField();
					jPanel1.add(jTextField1);
					jTextField1.setPreferredSize(new java.awt.Dimension(195, 22));
					jTextField1.addMouseListener(new MouseAdapter() {
						public void mouseClicked(MouseEvent evt) {
							jTextField1MouseClicked(evt);
						}
					});

				}
				{
					jLabel2 = new JLabel();
					jPanel1.add(jLabel2);
					jLabel2.setText("Product ID");
					jLabel2.setPreferredSize(new java.awt.Dimension(185, 15));
				}
				{
					jTextField2 = new JTextField();
					jPanel1.add(jTextField2);
					jTextField2.setPreferredSize(new java.awt.Dimension(195,22));
					jTextField2.addMouseListener(new MouseAdapter() {
						public void mouseClicked(MouseEvent evt) {
							jTextField2MouseClicked(evt);
						}
					});
				}
				{
					jLabel3 = new JLabel();
					jPanel1.add(jLabel3);
					jLabel3.setText("Quantity");
					jLabel3.setPreferredSize(new java.awt.Dimension(182, 15));
				}
				{
					jTextField3 = new JTextField();
					jPanel1.add(jTextField3);
					jTextField3.setPreferredSize(new java.awt.Dimension(195, 22));
				}
			}
			{
				jPanel2 = new JPanel();
				BorderLayout jPanel2Layout = new BorderLayout();
				jPanel2.setLayout(jPanel2Layout);
				getContentPane().add(jPanel2);
				jPanel2.setPreferredSize(new java.awt.Dimension(385, 26));
				{
					jButton5 = new JButton();
					jPanel2.add(jButton5, BorderLayout.WEST);
					jButton5.setText("Add");
					jButton5.setPreferredSize(new java.awt.Dimension(56, 26));
					jButton5.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent evt) {
							jButton5ActionPerformed(evt);
						}
					});
				}
				{
					jButton1 = new JButton();
					jPanel2.add(jButton1, BorderLayout.EAST);
					jButton1.setText("Remove");
					jButton1.setPreferredSize(new java.awt.Dimension(80, 26));
					jButton1.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent evt) {
							jButton1ActionPerformed(evt);
						}
					});
				}
			}
			{
				jPanel3 = new JPanel();
				getContentPane().add(jPanel3);
				jPanel3.setPreferredSize(new java.awt.Dimension(458, 170));
				{
					
					ListModel<String> jList1Model = 
							new DefaultComboBoxModel<String>();
					jList1 = new JList<String>();
					jPanel3.add(jList1);
					jList1.setModel(jList1Model);
					jList1.setPreferredSize(new java.awt.Dimension(386, 147));
					
					/*
					DefaultListModel model = new DefaultListModel();
					for(int i = 0; i < transList.size(); i++){
						model.addElement(transList.get(i).toString());
					}
					jList1 = new JList(model);
					this.add(jList1);
					*/
										
					
				}
			}
			{
				jPanel4 = new JPanel();
				getContentPane().add(jPanel4);
				jPanel4.setPreferredSize(new java.awt.Dimension(216, 128));
				{
					jLabel4 = new JLabel();
					jPanel4.add(jLabel4);
					jLabel4.setText("Total");
					jLabel4.setPreferredSize(new java.awt.Dimension(83, 15));
				}
				{
					jTextField4 = new JTextField();
					jPanel4.add(jTextField4);
					jTextField4.setPreferredSize(new java.awt.Dimension(106, 22));
					jTextField4.setEditable(false);
				}
				{
					jLabel5 = new JLabel();
					jPanel4.add(jLabel5);
					jLabel5.setText("Loyalty Points");
					jLabel5.setPreferredSize(new java.awt.Dimension(84, 15));
				}
				{
					jTextField5 = new JTextField();
					jPanel4.add(jTextField5);
					jTextField5.setPreferredSize(new java.awt.Dimension(103, 22));
					jTextField5.addFocusListener(new FocusAdapter() {
						public void focusLost(FocusEvent evt) {
							jTextField5FocusLost(evt);
						}
					});
				}
				{
					jLabel7 = new JLabel();
					jPanel4.add(jLabel7);
					jLabel7.setText("Balance");
					jLabel7.setPreferredSize(new java.awt.Dimension(84, 15));
				}
				{
					jTextField6 = new JTextField();
					jPanel4.add(jTextField6);
					jTextField6.setPreferredSize(new java.awt.Dimension(103,22));
					jTextField6.setEditable(false);
				}
				{
					jLabel8 = new JLabel();
					jPanel4.add(jLabel8);
					jLabel8.setText("Cash Received");
					jLabel8.setPreferredSize(new java.awt.Dimension(84, 15));
				}
				{
					jTextField7 = new JTextField();
					jPanel4.add(jTextField7);
					jTextField7.setPreferredSize(new java.awt.Dimension(103, 22));
				}
			}
			{
				jPanel5 = new JPanel();
				FlowLayout jPanel5Layout = new FlowLayout();
				jPanel5.setLayout(jPanel5Layout);
				getContentPane().add(jPanel5);
				jPanel5.setPreferredSize(new java.awt.Dimension(216, 96));
				{
					jLabel6 = new JLabel();
					jPanel5.add(jLabel6);
					jLabel6.setText("Pointe Available");
					jLabel6.setPreferredSize(new java.awt.Dimension(115, 26));
				}
				{
					jTextField8 = new JTextField();
					jPanel5.add(jTextField8);
					jTextField8.setPreferredSize(new java.awt.Dimension(65, 22));
					jTextField8.setEditable(false);
				}
				{
					jLabel9 = new JLabel();
					jPanel5.add(jLabel9);
					jLabel9.setText("Change");
					jLabel9.setPreferredSize(new java.awt.Dimension(115, 26));
				}
				{
					jTextField9 = new JTextField();
					jPanel5.add(jTextField9);
					jTextField9.setPreferredSize(new java.awt.Dimension(65, 22));
					jTextField9.setEditable(false);
				}
				{
					jPanel6 = new JPanel();
					BorderLayout jPanel6Layout = new BorderLayout();
					jPanel6.setLayout(jPanel6Layout);
					jPanel5.add(jPanel6);
					jPanel6.setPreferredSize(new java.awt.Dimension(180, 24));
					{
						jButton2 = new JButton();
						jPanel6.add(jButton2, BorderLayout.EAST);
						jButton2.setText("Caculate");
						jButton2.setPreferredSize(new java.awt.Dimension(91, 24));
						jButton2.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent evt) {
								jButton2ActionPerformed(evt);
							}
						});
					}
				}
			}
			{	

				jPanel7 = new JPanel();
				getContentPane().add(jPanel7);
				BorderLayout jPanel7Layout = new BorderLayout();
				jPanel7.setPreferredSize(new java.awt.Dimension(388, 31));
				jPanel7.setLayout(jPanel7Layout);
				{
					jButton3 = new JButton();
					jPanel7.add(jButton3, BorderLayout.EAST);
					jButton3.setText("Cancel");
					jButton3.setPreferredSize(new java.awt.Dimension(106, 31));
					jButton3.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent evt) {
							jButton3ActionPerformed(evt);
						}
					});
				}
				{
					jButton4 = new JButton();
					jPanel7.add(jButton4, BorderLayout.WEST);
					jButton4.setText("Payment Received");
					jButton4.setPreferredSize(new java.awt.Dimension(152, 31));
					jButton4.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent evt) {
							jButton4ActionPerformed(evt);
						}
					});
				}
				
			}
			pack();
			this.setSize(484, 500);
		} catch (Exception e) {
		    //add your error handling code here
			e.printStackTrace();
		}
	}
	
	private void jButton5ActionPerformed(ActionEvent evt) {
		System.out.println("jButton5.actionPerformed, event="+evt);
		if(jTextField3.getText().trim().equals("")){
			JOptionPane.showMessageDialog(null, "please input product quantity");
			return;
		}
		
		String buffer =  jTextField3.getText().trim();
		Pattern p = Pattern.compile("^[+-]?[0-9]+$");
		Matcher m = p.matcher(buffer);
		if(!m.find(0)){
			JOptionPane.showMessageDialog(null, "Please input the correct digitl in quantity tab");
			jTextField3.setText("");
			jTextField3.requestFocus();
			return;
		}
		
		int quantity = Integer.parseInt(jTextField3.getText().trim());
		String customerId =  jTextField1.getText().trim();
		String productId =  jTextField2.getText().trim();
		
		int ret = 0;
		try {
			ret = transMgr.addTransaction(quantity, productId, customerId);
		} catch (InvalidInputtException e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, e.getMessage());
			return;
		}
		
		if(1 == ret){
			JOptionPane.showMessageDialog(null, "please input available product ID");
			jTextField2.setText("");
			jTextField2.requestFocus();
			return;
		}else if(2 == ret){
			JOptionPane.showMessageDialog(null, "please input available customer ID");
			jTextField1.setText("");
			jTextField1.requestFocus();
			return;
		}else if(3 == ret){
			/**TODO call productMgr */
			Product product = Shop.getProductFromProductId(productId);
			JOptionPane.showMessageDialog(null, "the available product quantity is " + product.getQuantityAvaliable());
			jTextField3.setText("");
			jTextField3.requestFocus();
			return;
		}
		
		double total = 0;
		try {
			total = transMgr.caculateAmount();
		} catch (InvalidInputtException e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, e.getMessage());
			return;
		}
		
		BigDecimal	bd	=	new	BigDecimal(total);   
		bd	=	bd.setScale(2,BigDecimal.ROUND_HALF_UP);  
		jTextField4.setText(bd.toString());
		jTextField6.setText(bd.toString());
		
		/* TODO  CALL getMemberFromMemberId */
		if(!customerId.equals("PUBLIC") || !customerId.equals("public")){
			jTextField8.setText(Integer.toString((Shop.getMemberFromMemberId(customerId).getLoyaltyPoints())));
		}else{
			jTextField8.setText("");
		}
			

		
		refresh();
		//jTextField1.setText("");
		jTextField2.setText("");
		jTextField3.setText("");
		jTextField5.setText("");
		jTextField9.setText("");
		jTextField1.setEditable(false);
		
	}
	
    public void refresh() {
		transList = transMgr.getTransaction().getTransItemList();
        jList1.removeAll();
        DefaultListModel<String> model = new DefaultListModel<String>();

		for(int i = 0; i < transList.size(); i++){
			String s = transMgr.getTransaction().getTransItemList().get(i).getProduct().getProductId()
					+ "  " + transMgr.getTransaction().getTransItemList().get(i).getProduct().getProductName()
					+ "  " + transMgr.getTransaction().getTransItemList().get(i).getProduct().getProductDescription()
					+ "  " + transMgr.getTransaction().getTransItemList().get(i).getQuantityPurchased();
				model.addElement(s);
		}
		jList1.setModel(model);
		
    }
    
	private int getSelectedMember(){		
		int i  =  jList1.getSelectedIndex();
		return i;
	}
	
    private void jButton1ActionPerformed(ActionEvent evt) {
    	System.out.println("jButton1.actionPerformed, event="+evt);
    	int index = getSelectedMember();
    	if(index < 0){
    		return;
    	}
    	
    	double total = 0;
    	try{
        	transMgr.removeTransactionItem(index);
        	total = transMgr.caculateAmount();    		
    	} catch (InvalidInputtException e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, e.getMessage());
			return;
		}

    	refresh();
		BigDecimal	bd	=	new	BigDecimal(total);   
		bd	=	bd.setScale(2,BigDecimal.ROUND_HALF_UP);
		jTextField4.setText(bd.toString());
		jTextField6.setText(bd.toString());
		jTextField8.setText(bd.toString());
		jTextField9.setText(bd.toString());

    }
    
    private void jTextField5FocusLost(FocusEvent evt) {
    	System.out.println("jTextField5.focusLost, event="+evt);
    	double total = Double.parseDouble(jTextField4.getText().trim());
    	if(!jTextField5.getText().trim().equals("") && null != jTextField5.getText().trim()){
        	if(Integer.parseInt(jTextField5.getText().trim()) > Integer.parseInt(jTextField8.getText().trim()) ||
        			Integer.parseInt(jTextField5.getText().trim()) > Double.parseDouble(jTextField4.getText().trim()) ){
    			JOptionPane.showMessageDialog(null, "Points must less than total and available points");
    			jTextField5.setText("");
    			jTextField5.requestFocus();
        	}else{
            	int points  = Integer.parseInt(jTextField5.getText().trim());
            	double balance = total -  points;
        		BigDecimal	bd	=	new	BigDecimal(balance);   
        		bd	=	bd.setScale(2,BigDecimal.ROUND_HALF_UP);  
            	jTextField6.setText(bd.toString());
            	jTextField7.requestFocus();
        	}
    	}
    }
    
    private void jButton2ActionPerformed(ActionEvent evt) {
    	System.out.println("jButton2.actionPerformed, event="+evt);
    	if(jTextField7.getText().trim().equals("") || null == jTextField7.getText().trim()){
    		JOptionPane.showMessageDialog(null, "please input cash received");
    		jTextField7.requestFocus();
    		return;
    	}
    		
    	double cash = Double.parseDouble(jTextField7.getText().trim());
    	double total = Double.parseDouble(jTextField6.getText().trim());
    	double change = cash- total;
		BigDecimal	bd	=	new	BigDecimal(change);   
		bd	=	bd.setScale(2,BigDecimal.ROUND_HALF_UP);  
    	jTextField9.setText(bd.toString());
    	
    }
    
    private void jButton4ActionPerformed(ActionEvent evt) {
    	System.out.println("jButton4.actionPerformed, event="+evt);
    	if(jTextField7.getText().trim().equals("") || null == jTextField7.getText().trim()||
    			jTextField9.getText().trim().equals("") || null == jTextField9.getText().trim()){
    		JOptionPane.showMessageDialog(null, "please execute caculate change");
    		jTextField7.requestFocus();
    		return;
    	}
    	transMgr.setReceipt(new Printer());
    	transMgr.printReceipt(jTextField6.getText().trim(), jTextField7.getText().trim(), jTextField9.getText().trim());
    	transMgr.syncTransactionSources();
    	if(!jTextField5.getText().equals("")){
    		int points = Integer.parseInt(jTextField5.getText());
        	transMgr.updateMemberPoints(jTextField1.getText(), points, Double.parseDouble(jTextField6.getText()));	
    	}

		setVisible(false);
		dispose();
   
    }
    
    private void jButton3ActionPerformed(ActionEvent evt) {
    	System.out.println("jButton3.actionPerformed, event="+evt);
		setVisible(false);
		dispose();
    }
    

    
    private void jTextField1MouseClicked(MouseEvent evt) {
    	System.out.println("jTextField1.mouseClicked, event="+evt);
    	System.out.println(jLabel1.getName());
    	System.out.println(jLabel1.getText());
    	//jTextField1.setEditable(falase);
    	transMgr.setReader(new ReaderDialog(jLabel1, jTextField1));
    	transMgr.readBarCode();
    	//TODO add your code for jTextField1.mouseClicked
    }
    
    private void jTextField2MouseClicked(MouseEvent evt) {
    	System.out.println("jTextField2.mouseClicked, event="+evt);
    	//jTextField2.setEditable(falase);
    	transMgr.setReader(new ReaderDialog(jLabel2, jTextField2));
    	transMgr.readBarCode();
    }

	/*
	private void jTextField1FocusLost(FocusEvent evt) {
		String buffer = jTextField1.getText().trim();
		if(null == buffer || buffer.equals("")){
			JOptionPane.showMessageDialog(null, "Please input the Member ID");
			jTextField1.requestFocus();
			return;
		}
		Pattern p = Pattern.compile("[a-zA-Z0-9]+");
		Matcher m = p.matcher(buffer);
		if(!m.find(0)){
			JOptionPane.showMessageDialog(null, "Please input the correct formatter");
			jTextField1.setText("");
			jTextField1.requestFocus();
			return;
		}
	}
	*/
   
	
}
