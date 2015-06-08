package sg.nus.iss.se22ft1.frames;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;
import javax.swing.SwingUtilities;

import com.sun.org.apache.xerces.internal.impl.dtd.models.CMAny;

import sg.nus.iss.se22ft1.entity.Category;
import sg.nus.iss.se22ft1.entity.Vendor;
import sg.nus.iss.se22ft1.manager.CategoryManager;

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
public class AddCategory extends javax.swing.JFrame {
	private JTextField catCodeTextField1;
	private JLabel catCodeLabel1;
	private JLabel vendorLabel2;
	private JTextField vnameTextField2;
	private JLabel vendorDescLabel2;
	private JTextField vdescTextField2;
	private JLabel vendorLabel3;
	private JTextField vnameTextField3;
	private JLabel vendorDescLabel3;
	private JTextField vdescTextField3;
	private JButton addVendorButton;
	private JTextField vdescTextField1;
	private JLabel vendorDescLabel1;
	private JTextField vnameTextField1;
	private JLabel vendorLabel1;
	private JTextArea categoryListTextArea;
	private JButton cancelButton;
	private JLabel catNameLabel2;
	private JTextField catNameTextField2;
	private JButton addCategoryButton;
	
	CategoryManager cm;
	Category c;
	/**
	* Auto-generated main method to display this JFrame
	*/
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				AddCategory inst = new AddCategory();
				inst.setLocationRelativeTo(null);
				inst.setVisible(true);
			}
		});
	}
	
	public AddCategory() {
		super();
		initGUI();
	}
	
	private void initGUI() {
		try {
			GroupLayout thisLayout = new GroupLayout((JComponent)getContentPane());
			getContentPane().setLayout(thisLayout);
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			this.setTitle("Add a Category");
			{
				addCategoryButton = new JButton();
				addCategoryButton.setText("Add Category");
				addCategoryButton.setFont(new java.awt.Font("Segoe UI",0,12));
				addCategoryButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						addCategoryButtonActionPerformed(evt);
					}
				});
				
			}
			{
				catCodeTextField1 = new JTextField();
			}
			{
				catNameTextField2 = new JTextField();
			}
			{
				catCodeLabel1 = new JLabel();
				catCodeLabel1.setText("Three Letter Category Code");
			}
			{
				categoryListTextArea = new JTextArea();
				CategoryManager c= new CategoryManager();
				String s = String.format("\nCategory Code\t  Category Desc\n"
			              
			              + "----------------------------------------------------------------------\n");
				categoryListTextArea.setText(s+c.arrayListToString());
			}
			{
				addVendorButton = new JButton();
				addVendorButton.setText("Add Vendors");
				addVendorButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						addVendorButtonActionPerformed(evt);
					}
				});
			}
			{
				vdescTextField3 = new JTextField();
			}
			{
				vendorDescLabel3 = new JLabel();
				vendorDescLabel3.setText("Vendor Description");
			}
			{
				vnameTextField3 = new JTextField();
			}
			{
				vendorLabel3 = new JLabel();
				vendorLabel3.setText("Vendor Name");
			}
			{
				vdescTextField2 = new JTextField();
			}
			{
				vendorDescLabel2 = new JLabel();
				vendorDescLabel2.setText("Vendor Description");
			}
			{
				vnameTextField2 = new JTextField();
			}
			{
				vendorLabel2 = new JLabel();
				vendorLabel2.setText("Vendor Name");
			}
			{
				vendorLabel1 = new JLabel();
				vendorLabel1.setText("Vendor Name");
			}
			{
				vnameTextField1 = new JTextField();
			}
			{
				vendorDescLabel1 = new JLabel();
				vendorDescLabel1.setText("Vendor Description");
			}
			{
				vdescTextField1 = new JTextField();
			}
			{
				cancelButton = new JButton();
				cancelButton.setText("Cancel");
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						cancelButtonActionPerformed(evt);
					}
				});
			}
			{
				catNameLabel2 = new JLabel();
				catNameLabel2.setText("Name for Catgeory");
			}
			thisLayout.setVerticalGroup(thisLayout.createSequentialGroup()
				.addContainerGap(39, 39)
				.addGroup(thisLayout.createParallelGroup()
				    .addGroup(thisLayout.createSequentialGroup()
				        .addComponent(categoryListTextArea, GroupLayout.PREFERRED_SIZE, 216, GroupLayout.PREFERRED_SIZE)
				        .addGap(0, 0, Short.MAX_VALUE))
				    .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				        .addGap(22)
				        .addGroup(thisLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
				            .addComponent(catCodeTextField1, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
				            .addComponent(catCodeLabel1, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE))
				        .addGap(0, 22, Short.MAX_VALUE)
				        .addGroup(thisLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
				            .addComponent(catNameTextField2, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
				            .addComponent(catNameLabel2, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
				        .addGap(34)
				        .addComponent(addCategoryButton, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
				        .addGap(67)))
				.addGap(0, 26, GroupLayout.PREFERRED_SIZE)
				.addGroup(thisLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
				    .addComponent(vdescTextField1, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
				    .addComponent(vnameTextField1, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
				    .addComponent(vendorLabel1, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
				    .addComponent(vendorDescLabel1, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE))
				.addGap(0, 33, GroupLayout.PREFERRED_SIZE)
				.addGroup(thisLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
				    .addComponent(vdescTextField2, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
				    .addComponent(vnameTextField2, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
				    .addComponent(vendorLabel2, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
				    .addComponent(vendorDescLabel2, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE))
				.addGap(0, 28, GroupLayout.PREFERRED_SIZE)
				.addGroup(thisLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
				    .addComponent(vdescTextField3, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
				    .addComponent(vnameTextField3, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
				    .addComponent(vendorLabel3, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
				    .addComponent(vendorDescLabel3, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE))
				.addGap(0, 35, GroupLayout.PREFERRED_SIZE)
				.addGroup(thisLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
				    .addComponent(cancelButton, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
				    .addComponent(addVendorButton, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
				.addContainerGap(18, 18));
			thisLayout.setHorizontalGroup(thisLayout.createSequentialGroup()
				.addGap(7)
				.addGroup(thisLayout.createParallelGroup()
				    .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				        .addComponent(categoryListTextArea, GroupLayout.PREFERRED_SIZE, 236, GroupLayout.PREFERRED_SIZE)
				        .addGap(12)
				        .addGroup(thisLayout.createParallelGroup()
				            .addGroup(thisLayout.createSequentialGroup()
				                .addGroup(thisLayout.createParallelGroup()
				                    .addComponent(vendorDescLabel3, GroupLayout.Alignment.LEADING, 0, 128, Short.MAX_VALUE)
				                    .addComponent(vendorDescLabel2, GroupLayout.Alignment.LEADING, 0, 128, Short.MAX_VALUE)
				                    .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				                        .addComponent(vendorDescLabel1, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE)
				                        .addGap(0, 11, Short.MAX_VALUE)))
				                .addGap(7)
				                .addGroup(thisLayout.createParallelGroup()
				                    .addComponent(vdescTextField3, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 145, GroupLayout.PREFERRED_SIZE)
				                    .addComponent(vdescTextField2, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 145, GroupLayout.PREFERRED_SIZE)
				                    .addComponent(vdescTextField1, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 145, GroupLayout.PREFERRED_SIZE))
				                .addGap(12))
				            .addGroup(thisLayout.createSequentialGroup()
				                .addGroup(thisLayout.createParallelGroup()
				                    .addComponent(catNameLabel2, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 158, GroupLayout.PREFERRED_SIZE)
				                    .addComponent(catCodeLabel1, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 158, GroupLayout.PREFERRED_SIZE))
				                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
				                .addGroup(thisLayout.createParallelGroup()
				                    .addGroup(thisLayout.createSequentialGroup()
				                        .addComponent(catNameTextField2, GroupLayout.PREFERRED_SIZE, 122, GroupLayout.PREFERRED_SIZE)
				                        .addGap(0, 0, Short.MAX_VALUE))
				                    .addGroup(thisLayout.createSequentialGroup()
				                        .addComponent(catCodeTextField1, GroupLayout.PREFERRED_SIZE, 122, GroupLayout.PREFERRED_SIZE)
				                        .addGap(0, 0, Short.MAX_VALUE))
				                    .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				                        .addPreferredGap(catNameTextField2, cancelButton, LayoutStyle.ComponentPlacement.INDENT)
				                        .addComponent(cancelButton, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
				                        .addGap(0, 30, Short.MAX_VALUE))))))
				    .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				        .addGap(23)
				        .addGroup(thisLayout.createParallelGroup()
				            .addComponent(vendorLabel3, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 88, GroupLayout.PREFERRED_SIZE)
				            .addComponent(vendorLabel2, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 88, GroupLayout.PREFERRED_SIZE)
				            .addComponent(vendorLabel1, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 88, GroupLayout.PREFERRED_SIZE))
				        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
				        .addGroup(thisLayout.createParallelGroup()
				            .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				                .addComponent(vnameTextField3, GroupLayout.PREFERRED_SIZE, 107, GroupLayout.PREFERRED_SIZE)
				                .addGap(72))
				            .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				                .addComponent(vnameTextField2, GroupLayout.PREFERRED_SIZE, 107, GroupLayout.PREFERRED_SIZE)
				                .addGap(72))
				            .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				                .addComponent(vnameTextField1, GroupLayout.PREFERRED_SIZE, 107, GroupLayout.PREFERRED_SIZE)
				                .addGap(72))
				            .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				                .addGap(73)
				                .addComponent(addVendorButton, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE)))
				        .addGap(0, 33, Short.MAX_VALUE)
				        .addComponent(addCategoryButton, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE)
				        .addGap(86)))
				.addContainerGap(48, 48));
			thisLayout.linkSize(SwingConstants.VERTICAL, new Component[] {vendorDescLabel1, vendorLabel1, vendorLabel2, vendorDescLabel2, vendorDescLabel3, vendorLabel3});
			thisLayout.linkSize(SwingConstants.VERTICAL, new Component[] {addCategoryButton, cancelButton});
			thisLayout.linkSize(SwingConstants.VERTICAL, new Component[] {vdescTextField3, vdescTextField2, vdescTextField1, vnameTextField1, vnameTextField2, vnameTextField3});
			thisLayout.linkSize(SwingConstants.HORIZONTAL, new Component[] {catCodeTextField1, catNameTextField2});
			thisLayout.linkSize(SwingConstants.HORIZONTAL, new Component[] {catNameLabel2, catCodeLabel1});
			pack();
			this.setSize(611, 536);
		} catch (Exception e) {
		    //add your error handling code here
			e.printStackTrace();
		}
	}
	
	private void addCategoryButtonActionPerformed(ActionEvent evt) {
		cm= new CategoryManager();
		String code="",name="";
		code=catCodeTextField1.getText();
		name=catNameTextField2.getText();
		if(code==null)
			code="";
		if(name==null)
			name="";
		c = new Category(code,name);
		
		cm.addCategory(c);
	}
	
	private void cancelButtonActionPerformed(ActionEvent evt) {
		setVisible(false); 
		dispose();
		//TODO add your code for cancelButton.actionPerformed
	}
	
	private void addVendorButtonActionPerformed(ActionEvent evt) {
		
		Vendor v1= new Vendor(vnameTextField1.getText(),vdescTextField1.getText());
		Vendor v2= new Vendor(vnameTextField2.getText(),vdescTextField2.getText());
		Vendor v3= new Vendor(vnameTextField3.getText(),vdescTextField3.getText());
		
		
		c.vendorList.add(v1);
		c.vendorList.add(v2);
		c.vendorList.add(v3);
		//TODO add your code for addVendorButton.actionPerformed
		
		cm.addVendorForCategory(c, c.vendorList);
		
	}

}
