package sg.nus.iss.se22ft1.frames;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.WindowEvent;

import javax.swing.AbstractAction;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.SwingConstants;

import sg.nus.iss.se22ft1.main.Shop;

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
public class NewMemberFrame extends JFrame {
	private static final long serialVersionUID = -7724221254385146135L;
	public static final String ALREADY_EXISTS = "Member with that ID already exists.";
	public static final String MEMBER_ADDED = "Member Added Successfully";
	public static final String NAME_TOO_LONG = "Please restrict the member name to 15 characters";
	public static final String ID_TOO_LONG = "Invalid ID. The ID can be upto 10 characters.";
	public static final String MISSING_PARAMETER = "Member name or ID is missing. Please try again!";

	private JButton jButton1;
	private AbstractAction AddMemberAction;
	private AbstractAction CancelAction;
	private AbstractAction HomeAction;
	private JButton jButton3;
	private JPanel jPanel1;
	private JButton jButton2;
	private JTextField jTextField2;
	private JLabel jLabel2;
	private JTextField jTextField1;
	private JLabel jLabel1;

	public NewMemberFrame() {
		setTitle("University Souvenir Store | Manage Members");
		setSize(400,300); 
		setLocationRelativeTo(null);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		{
			jPanel1 = new JPanel();
			GroupLayout jPanel1Layout = new GroupLayout((JComponent)jPanel1);
			jPanel1.setLayout(jPanel1Layout);
			getContentPane().add(jPanel1, BorderLayout.CENTER);
			jPanel1.setPreferredSize(new java.awt.Dimension(384, 264));
			{
				jButton1 = new JButton();
				jButton1.setText("HOME");
				jButton1.setAction(getHomeAction());
			}
			{
				jLabel1 = new JLabel();
				jLabel1.setText("Enter Member Name:");
			}
			{
				jTextField1 = new JTextField("",10);
			}
			{
				jButton3 = new JButton();
				jButton3.setText("Cancel");
				jButton3.setAction(getCancelAction());
			}
			{
				jLabel2 = new JLabel();
				jLabel2.setText("Enter Member Id:");
			}
			{
				jTextField2 = new JTextField("",10);
			}
			{
				jButton2 = new JButton();
				jButton2.setText("Add Member");
				jButton2.setAction(getAddMemberAction());
			}
			jPanel1Layout.setHorizontalGroup(jPanel1Layout.createSequentialGroup()
					.addContainerGap(72, 72)
					.addGroup(jPanel1Layout.createParallelGroup()
							.addComponent(jLabel1, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGroup(jPanel1Layout.createSequentialGroup()
									.addPreferredGap(jLabel1, jLabel2, LayoutStyle.ComponentPlacement.INDENT)
									.addGroup(jPanel1Layout.createParallelGroup()
											.addGroup(GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
													.addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
													.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED))
													.addGroup(GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
															.addPreferredGap(jLabel2, jButton2, LayoutStyle.ComponentPlacement.INDENT)
															.addComponent(jButton2, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)))
															.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)))
															.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
															.addGroup(jPanel1Layout.createParallelGroup()
																	.addGroup(jPanel1Layout.createSequentialGroup()
																			.addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
																			.addGroup(jPanel1Layout.createSequentialGroup()
																					.addComponent(jTextField2, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
																					.addGroup(jPanel1Layout.createSequentialGroup()
																							.addGap(32)
																							.addGroup(jPanel1Layout.createParallelGroup()
																									.addGroup(jPanel1Layout.createSequentialGroup()
																											.addComponent(jButton3, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE))
																											.addGroup(GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
																													.addGap(35)
																													.addComponent(jButton1, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)))))
																													.addContainerGap(71, Short.MAX_VALUE));
			jPanel1Layout.linkSize(SwingConstants.HORIZONTAL, new Component[] {jButton2, jButton3});
			jPanel1Layout.setVerticalGroup(jPanel1Layout.createSequentialGroup()
					.addContainerGap(17, 17)
					.addComponent(jButton1, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(35)
					.addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
							.addComponent(jTextField1, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
							.addComponent(jLabel1, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
							.addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
									.addComponent(jTextField2, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
									.addComponent(jLabel2, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
									.addGap(46)
									.addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
											.addComponent(jButton3, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
											.addComponent(jButton2, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
											.addContainerGap(66, 66));
			jPanel1Layout.linkSize(SwingConstants.VERTICAL, new Component[] {jButton2, jButton3});
		}
	}

	private AbstractAction getHomeAction() {
		if(HomeAction == null) {
			HomeAction = new AbstractAction("HOME", null) {
				private static final long serialVersionUID = -7142066954447701399L;
				public void actionPerformed(ActionEvent evt) {
					new MainMenuFrame().setVisible(true);
					close();
				}
			};
		}
		return HomeAction;
	}

	private AbstractAction getCancelAction() {
		if(CancelAction == null) {
			CancelAction = new AbstractAction("Cancel", null) {
				private static final long serialVersionUID = -4798668817892208495L;
				public void actionPerformed(ActionEvent evt) {
					new ManageMembersFrame().setVisible(true);
					close();
				}
			};
		}
		return CancelAction;
	}

	private AbstractAction getAddMemberAction() {
		if(AddMemberAction == null) {
			AddMemberAction = new AbstractAction("Add Member", null) {
				private static final long serialVersionUID = -5362062061392546700L;
				public void actionPerformed(ActionEvent evt) {
					String name = jTextField1.getText(), id=jTextField2.getText();
					if(name.length()>15){
						JOptionPane.showMessageDialog(jPanel1, NAME_TOO_LONG);
						jTextField1.setText("");
					}else if(id.length()>10){
						JOptionPane.showMessageDialog(jPanel1, ID_TOO_LONG);
						jTextField2.setText("");
					}else{
						String returnString = Shop.addMember(id, name, 0); 
						switch (returnString){
						case "MISSING_PARAMETER":
							JOptionPane.showMessageDialog(jPanel1, MISSING_PARAMETER);
							resetFields();
							break;
						case "ALREADY_EXISTS":
							JOptionPane.showMessageDialog(jPanel1, ALREADY_EXISTS);
							resetFields();
							break;
						case "MEMBER_ADDED":
							JOptionPane.showMessageDialog(jPanel1, MEMBER_ADDED);
							new MainMenuFrame().setVisible(true);
							close();
							break;
						}
					}
				}
			};
		}
		return AddMemberAction;
	}

	public void close() {
		WindowEvent winClosingEvent = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
		Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
	}

	public void resetFields(){
		jTextField1.setText("");
		jTextField2.setText("");
	}
}