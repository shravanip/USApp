package sg.nus.iss.se22ft1.frames;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;

import javax.swing.AbstractAction;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.LayoutStyle;
import javax.swing.SwingConstants;


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
public class MainMenuFrame extends JFrame{

	private static final long serialVersionUID = 1319939780258060837L;
	private JButton jButton1;
	private AbstractAction ReportsScreenAction;
	private AbstractAction NewUserAction;
	private AbstractAction LogoutAction;
	private AbstractAction ManageProductsAction;
	private AbstractAction ManageMemberAction;
	private AbstractAction ManageDiscountAction;
	private AbstractAction ExitAction;
	private JPanel jPanel1;
	private JButton jButton8;
	private JButton jButton7;
	private JButton jButton6;
	private JButton jButton5;
	private JButton jButton4;
	private JButton jButton3;
	private JButton jButton2;

	public MainMenuFrame() {
		setTitle("University Souvenir Store");
		setSize(400,300); 
		setLocationRelativeTo(null);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		{
			jPanel1 = new JPanel();
			GroupLayout jPanel1Layout = new GroupLayout((JComponent)jPanel1);
			jPanel1.setLayout(jPanel1Layout);
			getContentPane().add(jPanel1, BorderLayout.NORTH);
			jPanel1.setPreferredSize(new java.awt.Dimension(384, 264));
			{
				jButton4 = new JButton();
				jButton4.setText("Add New Discount");
				jButton4.setBounds(230, 132, 113, 22);
				jButton4.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						jButton4ActionPerformed(evt);
					}
				});
			}
			{
				jButton5 = new JButton();
				jButton5.setText("Make New Transaction");
				jButton5.setBounds(240, 68, 135, 22);
				jButton5.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						jButton5ActionPerformed(evt);
					}
				});
			}
			{
				jButton6 = new JButton();
				jButton6.setText("Exit");
				jButton6.setBounds(194, 69, 32, 22);
				jButton6.setAction(getExitAction());
			}
			{
				jButton7 = new JButton();
				jButton7.setText("Logout");
				jButton7.setBounds(236, 97, 52, 22);
				jButton7.setAction(getLogoutAction());
			}
			{
				jButton8 = new JButton();
				jButton8.setText("Create New User");
				jButton8.setBounds(145, 93, 101, 22);
				jButton8.setAction(getManageMemberAction());
			}
			{
				jButton1 = new JButton();
				jButton1.setText("Manage Products");
				jButton1.setAction(getManageProductsAction());
			}
			{
				jButton2 = new JButton();
				jButton2.setText("Manage Members");
				jButton2.setAction(getManageMemberAction());
			}
			{
				jButton3 = new JButton();
				jButton3.setText("Generate Reports");
				jButton3.setAction(getReportsScreenAction());
			}
				jPanel1Layout.setHorizontalGroup(jPanel1Layout.createSequentialGroup()
				.addContainerGap(48, 48)
				.addGroup(jPanel1Layout.createParallelGroup()
				    .addGroup(GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
				        .addComponent(jButton5, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
				        .addGap(14)
				        .addGroup(jPanel1Layout.createParallelGroup()
				            .addGroup(jPanel1Layout.createSequentialGroup()
				                .addComponent(jButton2, GroupLayout.PREFERRED_SIZE, 113, GroupLayout.PREFERRED_SIZE))
				            .addGroup(jPanel1Layout.createSequentialGroup()
				                .addComponent(jButton4, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)))
				        .addGap(0, 18, Short.MAX_VALUE))
				    .addGroup(jPanel1Layout.createSequentialGroup()
				        .addPreferredGap(jButton5, jButton3, LayoutStyle.ComponentPlacement.INDENT)
				        .addGroup(jPanel1Layout.createParallelGroup()
				            .addGroup(GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
				                .addComponent(jButton3, GroupLayout.PREFERRED_SIZE, 113, GroupLayout.PREFERRED_SIZE)
				                .addGap(28))
				            .addGroup(GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
				                .addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 113, GroupLayout.PREFERRED_SIZE)
				                .addGap(28))
				            .addGroup(GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
				                .addGap(40)
				                .addComponent(jButton8, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)))
				        .addGap(20)
				        .addGroup(jPanel1Layout.createParallelGroup()
				            .addGroup(GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
				                .addComponent(jButton7, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE)
				                .addGap(0, 18, Short.MAX_VALUE))
				            .addGroup(GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
				                .addGap(18)
				                .addComponent(jButton6, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE)
				                .addGap(0, 0, Short.MAX_VALUE)))))
				.addContainerGap(56, 56));
				jPanel1Layout.linkSize(SwingConstants.HORIZONTAL, new Component[] {jButton7, jButton6});
				jPanel1Layout.linkSize(SwingConstants.HORIZONTAL, new Component[] {jButton2, jButton4, jButton3, jButton1});
				jPanel1Layout.setVerticalGroup(jPanel1Layout.createSequentialGroup()
				.addGap(7)
				.addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
				    .addComponent(jButton7, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
				    .addComponent(jButton8, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
				.addGap(36)
				.addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
				    .addComponent(jButton1, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
				    .addComponent(jButton2, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
				.addGap(28)
				.addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
				    .addComponent(jButton3, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
				    .addComponent(jButton4, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
				.addGap(48)
				.addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
				    .addComponent(jButton6, GroupLayout.Alignment.BASELINE, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
				    .addComponent(jButton5, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
				.addContainerGap(57, 57));
				jPanel1Layout.linkSize(SwingConstants.VERTICAL, new Component[] {jButton8, jButton7, jButton2, jButton1, jButton3, jButton4, jButton5, jButton6});
		}
	}
	
	public void close() {
		WindowEvent winClosingEvent = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
		Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
	}

	private AbstractAction getExitAction() {
		if(ExitAction == null) {
			ExitAction = new AbstractAction("Exit", null) {
				private static final long serialVersionUID = 2874734541122471460L;
				public void actionPerformed(ActionEvent evt) {
					System.exit(1);
				}
			};
		}
		return ExitAction;
	}
	
	private AbstractAction getLogoutAction() {
		if(LogoutAction == null) {
			LogoutAction = new AbstractAction("Logout", null) {
				private static final long serialVersionUID = 5963268622676036899L;
				public void actionPerformed(ActionEvent evt) {
//					new LoginFrame().setVisible(true);
					close();
				}
			};
		}
		return LogoutAction;
	}

	private AbstractAction getNewUserAction() {
		if(NewUserAction == null) {
			NewUserAction = new AbstractAction("Create New User", null) {
				private static final long serialVersionUID = 8287454350463289331L;
				public void actionPerformed(ActionEvent evt) {
//					new NewUserFrame().setVisible(true);
					close();
				}
			};
		}
		return NewUserAction;
	}
	
	private AbstractAction getReportsScreenAction() {
		if(ReportsScreenAction == null) {
			ReportsScreenAction = new AbstractAction("Generate Reports", null) {
				private static final long serialVersionUID = 8165726277767539871L;
				public void actionPerformed(ActionEvent evt) {
//					new ReportsFrame().setVisible(true);
					close();
				}
			};
		}
		return ReportsScreenAction;
	}
	
	private AbstractAction getManageMemberAction() {
		if(ManageMemberAction == null) {
			ManageMemberAction = new AbstractAction("Manage Members", null) {
				private static final long serialVersionUID = -5955808663145617639L;
				public void actionPerformed(ActionEvent evt) {
					new ManageMembersFrame().setVisible(true);
					close();
				}
			};
		}
		return ManageMemberAction;
	}
	
	
	
	
	

	private AbstractAction getManageProductsAction() {
		if(ManageProductsAction == null) {
			ManageProductsAction = new AbstractAction("Manage Products", null) {
				private static final long serialVersionUID = -3180462046086878588L;
				public void actionPerformed(ActionEvent evt) {
//					new ManageProductsFrame().setVisible(true);
					close();
				}
			};
		}
		return ManageProductsAction;
	}
	
	private void jButton4ActionPerformed(ActionEvent evt) {
		System.out.println("jButton4.actionPerformed, event="+evt);
		AddDiscountFrame add = new AddDiscountFrame();
		add.setVisible(true);
		
	}
	
	private void jButton5ActionPerformed(ActionEvent evt) {
		System.out.println("jButton5.actionPerformed, event="+evt);
		AddTransactionFrame add = new AddTransactionFrame();
		add.setVisible(true);
	}

}
