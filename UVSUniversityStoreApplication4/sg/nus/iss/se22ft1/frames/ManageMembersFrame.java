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
import javax.swing.JPanel;
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
public class ManageMembersFrame extends JFrame{
	private static final long serialVersionUID = -4520569018048511660L;
	private JButton jButton1;
	private AbstractAction DeleteMemberAction;
	private AbstractAction NewMemberAction;
	private AbstractAction HomeAction;
	private JPanel jPanel1;
	private JButton jButton4;
	private JButton jButton2;

	public ManageMembersFrame() {
		setTitle("University Souvenir Store | Manage Members");
		setSize(300,250); 
		setLocationRelativeTo(null);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		{
			jPanel1 = new JPanel();
			getContentPane().add(jPanel1, BorderLayout.CENTER);
			GroupLayout jPanel1Layout = new GroupLayout((JComponent)jPanel1);
			jPanel1.setLayout(jPanel1Layout);
			jPanel1.setPreferredSize(new java.awt.Dimension(384, 264));
			{
				jButton1 = new JButton();
				jButton1.setText("HOME");
				jButton1.setAction(getHomeAction());
			}
			{
				jButton2 = new JButton();
				jButton2.setText("Delete Member");
				jButton2.setAction(getDeleteMemberAction());
			}
			{
				jButton4 = new JButton();
				jButton4.setText("Add New Member");
				jButton4.setAction(getNewMemberAction());
			}
			jPanel1Layout.setHorizontalGroup(jPanel1Layout.createSequentialGroup()
				.addContainerGap(47, 47)
				.addGroup(jPanel1Layout.createParallelGroup()
				    .addGroup(GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
				        .addComponent(jButton4, GroupLayout.PREFERRED_SIZE, 174, GroupLayout.PREFERRED_SIZE)
				        .addGap(0, 42, Short.MAX_VALUE))
				    .addGroup(GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
				        .addComponent(jButton2, GroupLayout.PREFERRED_SIZE, 174, GroupLayout.PREFERRED_SIZE)
				        .addGap(0, 42, Short.MAX_VALUE))
				    .addGroup(GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
				        .addGap(167)
				        .addComponent(jButton1, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
				        .addGap(0, 0, Short.MAX_VALUE)))
				.addContainerGap(121, 121));
			jPanel1Layout.linkSize(SwingConstants.HORIZONTAL, new Component[] {jButton2, jButton4});
			jPanel1Layout.setVerticalGroup(jPanel1Layout.createSequentialGroup()
				.addContainerGap(27, 27)
				.addComponent(jButton1, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
				.addGap(0, 57, Short.MAX_VALUE)
				.addComponent(jButton4, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
				.addGap(37)
				.addComponent(jButton2, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
				.addContainerGap(77, 77));
		}
	}

	private AbstractAction getHomeAction() {
		if(HomeAction == null) {
			HomeAction = new AbstractAction("HOME", null) {
				private static final long serialVersionUID = 7075276335155090739L;
				public void actionPerformed(ActionEvent evt) {
					new MainMenuFrame().setVisible(true);
					close();
				}
			};
		}
		return HomeAction;
	}

	public void close() {
		WindowEvent winClosingEvent = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
		Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
	}
	
	private AbstractAction getNewMemberAction() {
		if(NewMemberAction == null) {
			NewMemberAction = new AbstractAction("NewMemberAction", null) {
				private static final long serialVersionUID = -62567175271895926L;
				public void actionPerformed(ActionEvent evt) {
					new NewMemberFrame().setVisible(true);
					close();
				}
			};
		}
		return NewMemberAction;
	}
	
	private AbstractAction getDeleteMemberAction() {
		if(DeleteMemberAction == null) {
			DeleteMemberAction = new AbstractAction("Delete Member", null) {
				private static final long serialVersionUID = -7469692590981492284L;
				public void actionPerformed(ActionEvent evt) {
					new DeleteMember().setVisible(true);
					close();
				}
			};
		}
		return DeleteMemberAction;
	}
}