package sg.nus.iss.se22ft1.frames;


import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;



import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


import sg.nus.iss.se22ft1.manager.Reader;


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
public class ReaderDialog extends OkCancelDialog implements Reader{

	private JLabel jLabel2;
	private JTextField jTextField2;
	private JLabel jLabel1;
	private JTextField jTextField1;
	
	public ReaderDialog(JLabel jLable, JTextField jTextField) {
		super(jLable.getText());
		this.setTitle(jLable.getText());
		jLabel2.setText(jLable.getText());
		jLabel1 = jLable;
		jTextField1 = jTextField;
	}
	@Override
	protected void createFormPanel() {
		try {
			FlowLayout thisLayout = new FlowLayout();
			getContentPane().setLayout(thisLayout);
			this.setTitle("");
			this.setLocation(new java.awt.Point(600, 400));
			{
				jLabel2 = new JLabel();
				getContentPane().add(jLabel2);
				jLabel2.setText("");
				jLabel2.setPreferredSize(new java.awt.Dimension(171, 15));
			}
			{
				jTextField2 = new JTextField();
				getContentPane().add(jTextField2);
				jTextField2.setPreferredSize(new java.awt.Dimension(164, 22));
			}
			{
				jPanelOk = new JPanel();
				BorderLayout jPanel1Layout = new BorderLayout();
				getContentPane().add(jPanelOk);
				jPanelOk.setLayout(jPanel1Layout);
			}
			{
				jPanelCancel = new JPanel();
				BorderLayout jPanel2Layout = new BorderLayout();
				getContentPane().add(jPanelCancel);
				jPanelCancel.setLayout(jPanel2Layout);
				
			}
			this.setSize(403, 93);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@Override
	protected void performOkAction(ActionEvent evt) {
		System.out.print("AddMenmberDialog performOkAction");
		if(!jTextField2.getText().trim().equals("")){
			jTextField1.setText(jTextField2.getText());						
		}
		setVisible(false);
		dispose();	
	}
	@Override
	protected void performCancelAction(ActionEvent evt) {
		System.out.println("AddMenmberDialog performCancelAction");
		jTextField2.setText("");
		setVisible(false);
		dispose();	
	}
	
	@Override
	public void readBarCode() {
		this.setLocationRelativeTo(null);
		this.setVisible(true);	
	}
}
