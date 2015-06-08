package sg.nus.iss.se22ft1.frames;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;



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
public class OkCancelDialog extends javax.swing.JDialog {
	private JLabel jLabel1;
	private JButton jButtonOk;
	private JButton jButtonCancel;
	protected JPanel jPanelOk = null;
	protected JPanel jPanelCancel = null;
	private JPanel jPanel2;
	private String lableStr = "";
	
	public OkCancelDialog(String str) {
		if(str != null){
			lableStr = str;
		}
		createFormPanel();
		createButtonPanel();
	}
	public OkCancelDialog() {
		createFormPanel();
		createButtonPanel();
	}

	
	protected void createButtonPanel() {
		if(jPanelOk == null || jPanelCancel == null){
			return;
		}
		try {
			{
				jButtonOk = new JButton();
				jPanelOk.add(jButtonOk, BorderLayout.EAST);
				jButtonOk.setText("Ok");
				jButtonOk.setPreferredSize(new java.awt.Dimension(113, 40));
				jButtonOk.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						performOkAction(evt);
					}
				});
			}
			{
				jButtonCancel = new JButton();
				jPanelCancel.add(jButtonCancel, BorderLayout.WEST);
				jButtonCancel.setText("Cancel");
				jButtonCancel.setPreferredSize(new java.awt.Dimension(105, 40));
				jButtonCancel.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						performCancelAction(evt);
					}
				});
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	protected void createFormPanel(){
		try {
			BorderLayout thisLayout = new BorderLayout();
			getContentPane().setLayout(thisLayout);
			this.setLocation(new java.awt.Point(800, 400));
			{
				jPanelOk = new JPanel();
				BorderLayout jPanel1Layout = new BorderLayout();
				jPanelOk.setLayout(jPanel1Layout);
				getContentPane().add(jPanelOk, BorderLayout.WEST);
				jPanelOk.setPreferredSize(new java.awt.Dimension(259, 30));
			}
			{
				jPanel2 = new JPanel();
				getContentPane().add(jPanel2, BorderLayout.EAST);
			}
			{
				jLabel1 = new JLabel();
				getContentPane().add(jLabel1, BorderLayout.NORTH);
				jLabel1.setText(lableStr);
				jLabel1.setPreferredSize(new java.awt.Dimension(553, 33));
			}
			{
				jPanelCancel = new JPanel();
				BorderLayout jPanel3Layout = new BorderLayout();
				jPanelCancel.setLayout(jPanel3Layout);
				getContentPane().add(jPanelCancel, BorderLayout.EAST);
				jPanelCancel.setPreferredSize(new java.awt.Dimension(296, 60));
			}
			this.setSize(560, 93);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	protected void performOkAction(ActionEvent evt) {
		System.out.println("performOkAction, event="+evt);
		setVisible(false);
		dispose();
	}
	
	protected void performCancelAction(ActionEvent evt) {
		System.out.println("performCancelAction, event="+evt);
		setVisible(false);
		dispose();
	}
	
	public void destoryDialog(){
		
	}

}
