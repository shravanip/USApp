package sg.nus.iss.se22ft1.frames;

import java.awt.Component;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.WindowEvent;
import java.util.Iterator;
import java.util.List;

import javax.swing.AbstractAction;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.LayoutStyle;
import javax.swing.SwingConstants;

import sg.nus.iss.se22ft1.entity.Member;
import sg.nus.iss.se22ft1.main.Shop;

public class DeleteMember extends JFrame {
	public static final String DELETE_SUCCESS = " has been removed.";
	private static final long serialVersionUID = 4538259659570112625L;
	private JButton jButton1;
	private AbstractAction DeleteAction;
	private AbstractAction CancelAction;
	private AbstractAction HomeAction;
	private JButton jButton3;
	private JButton jButton2;
	private List<Member> members;
	private java.awt.List memberList;
	
	public void refresh () {
		members = Shop.getMembers();
		memberList.removeAll();
		Iterator<Member> it = members.iterator();
		while (it.hasNext()) {
			memberList.add(Shop.customersForDisplay(it.next()));			
		}
	}

	public DeleteMember() {
		setTitle("University Souvenir Store | Delete Member");
		setSize(500,300); 
		setLocationRelativeTo(null);
		GroupLayout thisLayout = new GroupLayout((JComponent)getContentPane());
		getContentPane().setLayout(thisLayout);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		{
			jButton3 = new JButton();
			jButton3.setText("Home");
			jButton3.setAction(getHomeAction());
		}
		{
			jButton1 = new JButton();
			jButton1.setText("Delete Member");
			jButton1.setAction(getDeleteAction());
		}
		{
			jButton2 = new JButton();
			jButton2.setText("Cancel");
			jButton2.setAction(getCancelAction());
		}
		{
			memberList = new java.awt.List (10);
			memberList.setMultipleMode (false);
			refresh();
		}
			thisLayout.setVerticalGroup(thisLayout.createSequentialGroup()
				.addContainerGap(18, Short.MAX_VALUE)
				.addComponent(jButton3, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
				.addComponent(memberList, GroupLayout.PREFERRED_SIZE, 113, GroupLayout.PREFERRED_SIZE)
				.addGap(51)
				.addGroup(thisLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
				    .addComponent(jButton2, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
				    .addComponent(jButton1, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE))
				.addContainerGap(20, 20));
			thisLayout.setHorizontalGroup(thisLayout.createSequentialGroup()
				.addContainerGap(65, 65)
				.addGroup(thisLayout.createParallelGroup()
				    .addGroup(thisLayout.createSequentialGroup()
				        .addComponent(memberList, GroupLayout.PREFERRED_SIZE, 347, GroupLayout.PREFERRED_SIZE))
				    .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				        .addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 142, GroupLayout.PREFERRED_SIZE)
				        .addGap(63)
				        .addGroup(thisLayout.createParallelGroup()
				            .addGroup(thisLayout.createSequentialGroup()
				                .addComponent(jButton2, GroupLayout.PREFERRED_SIZE, 142, GroupLayout.PREFERRED_SIZE))
				            .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				                .addGap(64)
				                .addComponent(jButton3, GroupLayout.PREFERRED_SIZE, 78, GroupLayout.PREFERRED_SIZE)))))
				.addContainerGap(72, Short.MAX_VALUE));
			thisLayout.linkSize(SwingConstants.VERTICAL, new Component[] {jButton1, jButton2});
			thisLayout.linkSize(SwingConstants.HORIZONTAL, new Component[] {jButton1, jButton2});
	}

	public void close() {
		WindowEvent winClosingEvent = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
		Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
	}
	
	private AbstractAction getHomeAction() {
		if(HomeAction == null) {
			HomeAction = new AbstractAction("HOME", null) {
				private static final long serialVersionUID = 1856161437052990633L;
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
				private static final long serialVersionUID = -6515107057947939786L;
				public void actionPerformed(ActionEvent evt) {
					new ManageMembersFrame().setVisible(true);
					close();
				}
			};
		}
		return CancelAction;
	}
	
	private AbstractAction getDeleteAction() {
		if(DeleteAction == null) {
			DeleteAction = new AbstractAction("Delete Member", null) {
				private static final long serialVersionUID = -1762820385637495736L;
				public void actionPerformed(ActionEvent evt) {
					Member memberToBeDeleted = getSelectedMember();
					Shop.deleteMember(memberToBeDeleted);
					JOptionPane.showMessageDialog(getContentPane(), memberToBeDeleted.getMemberName() + DELETE_SUCCESS);
					System.out.println(memberToBeDeleted.getMemberName() + DELETE_SUCCESS);
					refresh();
				}
			};
		}
		return DeleteAction;
	}
	
	public Member getSelectedMember(){
		int idx = memberList.getSelectedIndex();
        return (idx == -1) ? null : members.get(idx);
	}
}
