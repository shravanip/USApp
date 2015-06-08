package sg.nus.iss.se22ft1.frames;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import javax.swing.SwingUtilities;

import sg.nus.iss.se22ft1.manager.DiscountManager;


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
public class AddDiscountFrame extends javax.swing.JFrame {
	private JPanel jPanel1;
	private JTextField descriptionTF;
	private JLabel descriptionLabel;
	private JButton home;
	private JButton cancel;
	private JButton addDiscount;
	private JLabel memberAllLabel;
	private JTextField memberAllTF;
	private JTextField percentDiscountTF;
	private JLabel percentDiscountLabel;
	private JLabel periodDiscountLabel;
	private JTextField periodDescountTF;
	private JTextField startDateTF;
	private JLabel startDateLabel;
	private JTextField discountCodeTF;
	private JLabel discountCodeLabel;

	/**
	* Auto-generated main method to display this JFrame
	*/
		
	public AddDiscountFrame() {
		super();
		initGUI();
	}
	
	private void initGUI() {
		try {
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			{
				jPanel1 = new JPanel();
				getContentPane().add(jPanel1, BorderLayout.CENTER);
				jPanel1.setPreferredSize(new java.awt.Dimension(384, 204));
				jPanel1.setLayout(null);
				{
					discountCodeLabel = new JLabel();
					jPanel1.add(discountCodeLabel);
					discountCodeLabel.setText("Discount Code");
					discountCodeLabel.setBounds(72, 39, 105, 23);
				}
				{
					discountCodeTF = new JTextField();
					jPanel1.add(discountCodeTF);
					discountCodeTF.setBounds(224, 39, 114, 22);
				}
				{
					descriptionTF = new JTextField();
					jPanel1.add(descriptionTF);
					descriptionTF.setBounds(224, 66, 115, 24);
				}
				{
					descriptionLabel = new JLabel();
					jPanel1.add(descriptionLabel);
					descriptionLabel.setText("Description");
					descriptionLabel.setBounds(72, 68, 78, 18);
				}
				{
					startDateLabel = new JLabel();
					jPanel1.add(startDateLabel);
					startDateLabel.setText("Start date(yyyy-MM-dd)");
					startDateLabel.setBounds(72, 94, 140, 25);
				}
				{
					startDateTF = new JTextField();
					jPanel1.add(startDateTF);
					startDateTF.setBounds(224, 95, 112, 19);
				}
				{
					periodDescountTF = new JTextField();
					jPanel1.add(periodDescountTF);
					periodDescountTF.setBounds(222, 130, 113, 21);
				}
				{
					periodDiscountLabel = new JLabel();
					jPanel1.add(periodDiscountLabel);
					periodDiscountLabel.setText("Period of Discount");
					periodDiscountLabel.setBounds(72, 133, 132, 16);
				}
				{
					percentDiscountLabel = new JLabel();
					jPanel1.add(percentDiscountLabel);
					percentDiscountLabel.setText("% of Discount");
					percentDiscountLabel.setBounds(72, 162, 90, 14);
				}
				{
					percentDiscountTF = new JTextField();
					jPanel1.add(percentDiscountTF);
					percentDiscountTF.setBounds(221, 158, 113, 26);
				}
				{
					memberAllTF = new JTextField();
					jPanel1.add(memberAllTF);
					memberAllTF.setBounds(221, 188, 114, 21);
				}
				{
					memberAllLabel = new JLabel();
					jPanel1.add(memberAllLabel);
					memberAllLabel.setText("Member(M) or All(A)");
					memberAllLabel.setBounds(72, 191, 137, 16);
				}
				{
					addDiscount = new JButton();
					jPanel1.add(addDiscount);
					addDiscount.setText("AddDiscount");
					addDiscount.setBounds(103, 224, 112, 27);
					addDiscount.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent evt) {
							addDiscountActionPerformed(evt);
						}
					});
				}
				{
					cancel = new JButton();
					jPanel1.add(cancel);
					cancel.setText("Cancel");
					cancel.setBounds(232, 222, 94, 29);
					cancel.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent evt) {
							cancelActionPerformed(evt);
						}
					});
				}
				{
					home = new JButton();
					jPanel1.add(home);
					home.setText("Home");
					home.setBounds(258, 5, 90, 29);
					home.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent evt) {
							homeActionPerformed(evt);
						}
					});
				}
			}
			pack();
			setSize(400, 300);
		} catch (Exception e) {
		    //add your error handling code here
			e.printStackTrace();
		}
	}
	
	private void addDiscountActionPerformed(ActionEvent evt) {
		System.out.println("addDiscount.actionPerformed, event="+evt);
		String disCode=discountCodeTF.getText();
		String desc=descriptionTF.getText();
		String sDate =startDateTF.getText();
		String dPeriod = periodDescountTF.getText();
		double perDiscount = Double.parseDouble(percentDiscountTF.getText());
		String am=memberAllTF.getText();
		DiscountManager dm = new DiscountManager();
		dm.addDiscount(disCode, desc, sDate, dPeriod, perDiscount, am);
		String msg = "Discount Added Successfully";
		JOptionPane.showMessageDialog(new JFrame(), msg);
		
		discountCodeTF.setText("");
		descriptionTF.setText("");
		startDateTF.setText("");
		periodDescountTF.setText("");
		percentDiscountTF.setText("");
		memberAllTF.setText("");
	}
	
	private void cancelActionPerformed(ActionEvent evt) {
		System.out.println("cancel.actionPerformed, event="+evt);
		discountCodeTF.setText("");
		descriptionTF.setText("");
		startDateTF.setText("");
		periodDescountTF.setText("");
		percentDiscountTF.setText("");
		memberAllTF.setText("");
		
	}
	
	private void homeActionPerformed(ActionEvent evt) {
		MainMenuFrame mmf = new MainMenuFrame();
		mmf.setVisible(true);
		
	}

}
