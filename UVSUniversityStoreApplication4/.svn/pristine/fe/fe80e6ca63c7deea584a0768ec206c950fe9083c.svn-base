package sg.nus.iss.se22ft1.frames;

import java.awt.FlowLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;

import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ListModel;

import sg.nus.iss.se22ft1.entity.TransactionItem;
import sg.nus.iss.se22ft1.main.Shop;
import sg.nus.iss.se22ft1.manager.Receipt;
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
public class Printer extends javax.swing.JDialog implements Receipt {
	private JLabel jLabel1;
	private JTextField jTextField1;
	private JLabel jLabel2;
	private JLabel jLabel3;
	private JLabel jLabel4;
	private JList<String> jList1;
	private JLabel jLabel5;
	private JTextField jTextField6;
	private JLabel jLabel8;
	private JTextField jTextField5;
	private JLabel jLabel7;
	private JTextField jTextField4;
	private JLabel jLabel6;
	private JTextField jTextField3;
	private JTextField jTextField2;
	private TransactionManager transMgr;
	private String change = null;
	private String total = null;
	private JScrollBar jScrollBar1;
	private String cash = null;
	

	/**
	* Auto-generated main method to display this JDialog
	*/
		
	//public PrintReceipt(JFrame frame) {
	public Printer() {
	}
	
	private void initGUI() {
		try {
			FlowLayout thisLayout = new FlowLayout();
			getContentPane().setLayout(thisLayout);
			this.setLocation(new java.awt.Point(600, 200));
			this.addWindowListener(new WindowAdapter() {
				public void windowOpened(WindowEvent evt) {
					thisWindowOpened(evt);
				}
			});
			{
				jLabel1 = new JLabel();
				jLabel1.setLayout(null);
				getContentPane().add(jLabel1);
				jLabel1.setText("Customer ID");
				jLabel1.setPreferredSize(new java.awt.Dimension(114, 15));
			}
			{
				jTextField1 = new JTextField();
				getContentPane().add(jTextField1);
				jTextField1.setPreferredSize(new java.awt.Dimension(102, 22));
				jTextField1.setEditable(false);
			}
			{
				jLabel2 = new JLabel();
				getContentPane().add(jLabel2);
				jLabel2.setText("Trans ID");
				jLabel2.setPreferredSize(new java.awt.Dimension(114, 15));
				jLabel2.setLayout(null);
			}
			{
				jTextField2 = new JTextField();
				getContentPane().add(jTextField2);
				jTextField2.setPreferredSize(new java.awt.Dimension(102, 22));
				jTextField2.setEditable(false);
			}
			{
				jLabel3 = new JLabel();
				getContentPane().add(jLabel3);
				jLabel3.setText("Date");
				jLabel3.setPreferredSize(new java.awt.Dimension(114, 15));
				jLabel3.setLayout(null);
			}
			{
				jTextField3 = new JTextField();
				getContentPane().add(jTextField3);
				jTextField3.setPreferredSize(new java.awt.Dimension(102, 22));
				jTextField3.setEditable(false);
			}
			{
				jLabel4 = new JLabel();
				getContentPane().add(jLabel4);
				jLabel4.setText("------------------------------------------------------");
			}
			{
				ListModel<String> jList1Model = 
						new DefaultComboBoxModel<String>();
				jList1 = new JList<String>();
				getContentPane().add(jList1);
				jList1.setModel(jList1Model);
				jList1.setPreferredSize(new java.awt.Dimension(240, 93));

			}
			{
				jLabel5 = new JLabel();
				getContentPane().add(jLabel5);
				jLabel5.setText("------------------------------------------------------");
			}
			{
				jLabel6 = new JLabel();
				getContentPane().add(jLabel6);
				jLabel6.setText("Total");
				jLabel6.setPreferredSize(new java.awt.Dimension(114, 15));
				jLabel6.setLayout(null);
			}
			{
				jTextField4 = new JTextField();
				getContentPane().add(jTextField4);
				jTextField4.setPreferredSize(new java.awt.Dimension(102,22));
				jTextField4.setEditable(false);
			}
			{
				jLabel7 = new JLabel();
				getContentPane().add(jLabel7);
				jLabel7.setText("Cash ");
				jLabel7.setPreferredSize(new java.awt.Dimension(114, 15));
				jLabel7.setLayout(null);
			}
			{
				jTextField5 = new JTextField();
				getContentPane().add(jTextField5);
				jTextField5.setPreferredSize(new java.awt.Dimension(102, 22));
				jTextField5.setEditable(false);
			}
			{
				jLabel8 = new JLabel();
				getContentPane().add(jLabel8);
				jLabel8.setText("Change ");
				jLabel8.setPreferredSize(new java.awt.Dimension(114, 15));
				jLabel8.setLayout(null);
			}
			{
				jTextField6 = new JTextField();
				getContentPane().add(jTextField6);
				jTextField6.setPreferredSize(new java.awt.Dimension(102, 22));
				jTextField6.setEditable(false);
			}

			this.setSize(346, 398);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private void thisWindowOpened(WindowEvent evt) {
		System.out.println("this.windowOpened, event="+evt);
		

		ArrayList<TransactionItem> transList = transMgr.getTransaction().getTransItemList();
		String customer = transMgr.getTransaction().getCustomer().getCustomerId();
		String date = transMgr.getTransaction().getDate();
		jTextField2.setText(Integer.toString(transMgr.getTransId()));
		
		jTextField1.setText(customer);
		jTextField3.setText(date);
		
		jTextField4.setText(total);
		jTextField5.setText(cash);
		jTextField6.setText(change);
		
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

	@Override
	public void printReceipt(String total, String cash, String change) {
		this.transMgr = Shop.returnTransactionManager();
		this.cash = cash;
		this.total =  total;
		this.change = change;
		initGUI();
		this.setVisible(true);		
	}

}
