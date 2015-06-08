package sg.nus.iss.se22ft1.frames;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;

import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;
import javax.swing.SwingUtilities;

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
public class addVendors extends javax.swing.JFrame {
	private JComboBox jComboBox1;
	private JLabel vendorDescLabel3;
	private JTextField vdescTextField2;
	private JTextField vdescTextField3;
	private JButton addVendorButton;
	private JTextField vdescTextField1;
	private JLabel vendorDescLabel2;
	private JLabel vendorDescLabel1;
	private JTextField vnameTextField3;
	private JTextField vnameTextField2;
	private JTextField vnameTextField1;
	private JLabel vendorLabel3;
	private JLabel vendorLabel2;
	private JLabel vendorLabel1;
	CategoryManager cm;
	Category c;
	/**
	* Auto-generated main method to display this JFrame
	*/
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				addVendors inst = new addVendors();
				inst.setLocationRelativeTo(null);
				inst.setVisible(true);
			}
		});
	}
	
	public addVendors() {
		super();
		initGUI();
	}
	
	private void initGUI() {
		try {
			GroupLayout thisLayout = new GroupLayout((JComponent)getContentPane());
			getContentPane().setLayout(thisLayout);
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			{
				cm= new CategoryManager();
				JPanel panel= new JPanel();
				jComboBox1= new JComboBox(cm.getCategories());
				panel.add(jComboBox1);
				getContentPane().add(panel);
				jComboBox1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						jComboBox1ActionPerformed(evt);
					}
			});
			}
			{
				vendorLabel1 = new JLabel();
				vendorLabel1.setText("Vendor Name");
			}
			{
				vendorLabel2 = new JLabel();
				vendorLabel2.setText("Vandor Name");
			}
			{
				vendorLabel3 = new JLabel();
				vendorLabel3.setText("Vendor Name");
			}
			{
				vnameTextField1 = new JTextField();
			}
			{
				vnameTextField2 = new JTextField();
			}
			{
				vnameTextField3 = new JTextField();
			}
			{
				vendorDescLabel1 = new JLabel();
				vendorDescLabel1.setText("Vendor  Description");
			}
			{
				vendorDescLabel2 = new JLabel();
				vendorDescLabel2.setText("Vendor Description");
			}
			{
				vendorDescLabel3 = new JLabel();
				vendorDescLabel3.setText("Vendor Description");
			}
			{
				vdescTextField1 = new JTextField();
			}
			{
				vdescTextField2 = new JTextField();
			}
			{
				vdescTextField3 = new JTextField();
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
			thisLayout.setVerticalGroup(thisLayout.createSequentialGroup()
				//.addComponent(panel, GroupLayout.PREFERRED_SIZE, 0, GroupLayout.PREFERRED_SIZE)
				.addGap(12)
				.addComponent(jComboBox1, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
				.addGap(68)
				.addGroup(thisLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
				    .addComponent(vnameTextField1, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
				    .addComponent(vendorLabel1, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
				    .addComponent(vendorDescLabel1, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
				    .addComponent(vdescTextField1, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
				.addGap(22)
				.addGroup(thisLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
				    .addComponent(vnameTextField2, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
				    .addComponent(vendorLabel2, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
				    .addComponent(vendorDescLabel2, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
				    .addComponent(vdescTextField2, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
				.addGap(17)
				.addGroup(thisLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
				    .addComponent(vnameTextField3, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
				    .addComponent(vendorLabel3, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
				    .addComponent(vendorDescLabel3, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
				    .addComponent(vdescTextField3, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
				.addGap(48)
				.addComponent(addVendorButton, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
				.addContainerGap(43, Short.MAX_VALUE));
			thisLayout.setHorizontalGroup(thisLayout.createSequentialGroup()
				//.addComponent(panel, GroupLayout.PREFERRED_SIZE, 0, GroupLayout.PREFERRED_SIZE)
				.addGap(32)
				.addGroup(thisLayout.createParallelGroup()
				    .addComponent(vendorLabel1, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)
				    .addComponent(vendorLabel2, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)
				    .addComponent(vendorLabel3, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE))
				.addGap(22)
				.addGroup(thisLayout.createParallelGroup()
				    .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				        .addComponent(vnameTextField1, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
				        .addGap(144))
				    .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				        .addComponent(vnameTextField2, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
				        .addGap(144))
				    .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				        .addComponent(vnameTextField3, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
				        .addGap(144))
				    .addGroup(thisLayout.createSequentialGroup()
				        .addGap(23)
				        .addGroup(thisLayout.createParallelGroup()
				            .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				                .addComponent(addVendorButton, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
				                .addGap(19)
				                .addGroup(thisLayout.createParallelGroup()
				                    .addComponent(vendorDescLabel1, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 112, GroupLayout.PREFERRED_SIZE)
				                    .addComponent(vendorDescLabel2, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 112, GroupLayout.PREFERRED_SIZE)
				                    .addComponent(vendorDescLabel3, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 112, GroupLayout.PREFERRED_SIZE)))
				            .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				                .addGap(49)
				                .addComponent(jComboBox1, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
				                .addGap(46)))))
				.addGroup(thisLayout.createParallelGroup()
				    .addComponent(vdescTextField1, GroupLayout.Alignment.LEADING, 0, 137, Short.MAX_VALUE)
				    .addGroup(thisLayout.createSequentialGroup()
				        .addComponent(vdescTextField2, GroupLayout.PREFERRED_SIZE, 137, GroupLayout.PREFERRED_SIZE)
				        .addGap(0, 0, Short.MAX_VALUE))
				    .addGroup(thisLayout.createSequentialGroup()
				        .addComponent(vdescTextField3, GroupLayout.PREFERRED_SIZE, 137, GroupLayout.PREFERRED_SIZE)
				        .addGap(0, 0, Short.MAX_VALUE)))
				.addContainerGap());
			thisLayout.linkSize(SwingConstants.HORIZONTAL, new Component[] {vdescTextField2, vdescTextField3, vdescTextField1});

			pack();
			this.setSize(538, 357);
		} catch (Exception e) {
		    //add your error handling code here
			e.printStackTrace();
		}
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
		
		//TODO add your code for addVendorButton.actionPerformed
	}

	private void jComboBox1ActionPerformed(ActionEvent evt) {
		
		JComboBox cb = (JComboBox)evt.getSource();
        String selected = (String)cb.getSelectedItem();
        
        cm = new CategoryManager();
        int i=1;
        for (Iterator<Category> iterator = cm.CategoryList.iterator(); iterator.hasNext();i++) {
        	
        	c = (Category) iterator.next();
			if(c.getCategoryName().equals(selected)){
				System.out.println(c.getCategoryName());
				
				break;
			}
        	}
	}
	}
