package sg.nus.iss.se22ft1.frames;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.WindowEvent;

import javax.swing.AbstractAction;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
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
public class ReportsFrame extends JFrame{
	private static final long serialVersionUID = 8679742600994508451L;
	private JButton jButton1;
	private AbstractAction TransactionRepAction;
	private AbstractAction ProductReportAction;
	private AbstractAction CategoryReportAction;
	private AbstractAction MemberReportAction;
	private AbstractAction HomeAction;
	private JPanel jPanel1;
	private JButton jButton5;
	private JButton jButton4;
	private JButton jButton3;
	private JButton jButton2;
	private JTextArea jTextArea1;
	private JScrollPane scrolltxt;

	public ReportsFrame() {
		setTitle("University Souvenir Store | Reports");
		setSize(700,500); 
		setLocationRelativeTo(null);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		{
			jPanel1 = new JPanel();
			GroupLayout jPanel1Layout = new GroupLayout((JComponent)jPanel1);
			jPanel1.setLayout(jPanel1Layout);
			getContentPane().add(jPanel1, BorderLayout.CENTER);
			jPanel1.setPreferredSize(new java.awt.Dimension(684, 464));
			{
				jButton1 = new JButton();
				jButton1.setText("HOME");
				jButton1.setAction(getHomeAction());
			}
			{
				jTextArea1 = new JTextArea();
				jTextArea1.setEditable(false);
				jTextArea1.setFont(new Font("Courier New", Font.PLAIN, 12));
			}
			{
				jButton2 = new JButton();
				jButton2.setText("Generate Category Reports");
				jButton2.setAction(getCategoryReportAction());
			}
			{
				jButton3 = new JButton();
				jButton3.setText("Generate Member Report");
				jButton3.setAction(getMemberReportAction());
			}
			{
				jButton4 = new JButton();
				jButton4.setText("Generate Transaction Report");
				jButton4.setAction(getTransactionRepAction());
			}
			{
				jButton5 = new JButton();
				jButton5.setText("Generate Product Report");
				jButton5.setAction(getProductReportAction());
			}
			{
				scrolltxt = new JScrollPane(jTextArea1);
			}
				jPanel1Layout.setHorizontalGroup(jPanel1Layout.createSequentialGroup()
				.addContainerGap(41, 41)
				.addGroup(jPanel1Layout.createParallelGroup()
				    .addGroup(jPanel1Layout.createSequentialGroup()
				        .addComponent(scrolltxt, GroupLayout.PREFERRED_SIZE, 547, GroupLayout.PREFERRED_SIZE)
				        .addGap(0, 0, Short.MAX_VALUE))
				    .addGroup(jPanel1Layout.createSequentialGroup()
				        .addGap(40)
				        .addGroup(jPanel1Layout.createParallelGroup()
				            .addComponent(jButton5, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 169, GroupLayout.PREFERRED_SIZE)
				            .addComponent(jButton3, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 169, GroupLayout.PREFERRED_SIZE))
				        .addGap(115)
				        .addGroup(jPanel1Layout.createParallelGroup()
				            .addGroup(GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
				                .addGap(0, 0, Short.MAX_VALUE)
				                .addComponent(jButton2, GroupLayout.PREFERRED_SIZE, 169, GroupLayout.PREFERRED_SIZE)
				                .addGap(12))
				            .addGroup(GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
				                .addGap(0, 0, Short.MAX_VALUE)
				                .addComponent(jButton4, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
				                .addGap(12))
				            .addGroup(GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
				                .addGap(0, 104, Short.MAX_VALUE)
				                .addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 77, GroupLayout.PREFERRED_SIZE)))
				        .addGap(42)))
				.addContainerGap(96, 96));
				jPanel1Layout.linkSize(SwingConstants.HORIZONTAL, new Component[] {jButton4, jButton3, jButton5, jButton2});
				jPanel1Layout.setVerticalGroup(jPanel1Layout.createSequentialGroup()
				.addContainerGap()
				.addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
				.addComponent(scrolltxt, GroupLayout.PREFERRED_SIZE, 217, GroupLayout.PREFERRED_SIZE)
				.addGap(0, 35, Short.MAX_VALUE)
				.addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
				    .addComponent(jButton2, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
				    .addComponent(jButton5, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
				.addGap(33)
				.addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
				    .addComponent(jButton4, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
				    .addComponent(jButton3, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
				.addContainerGap(75, 75));
				jPanel1Layout.linkSize(SwingConstants.VERTICAL, new Component[] {jButton4, jButton3, jButton5, jButton2});
		}
	}
	
	private AbstractAction getHomeAction() {
		if(HomeAction == null) {
			HomeAction = new AbstractAction("HOME", null) {
				private static final long serialVersionUID = -8582559975485338723L;
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
	
	private AbstractAction getMemberReportAction() {
		if(MemberReportAction == null) {
			MemberReportAction = new AbstractAction("Generate Member Report", null) {
				private static final long serialVersionUID = -5295035247312398905L;
				public void actionPerformed(ActionEvent evt) {
					jTextArea1.setText(Shop.generateMemberReport());
				}
			};
		}
		return MemberReportAction;
	}
	
	private AbstractAction getCategoryReportAction() {
		if(CategoryReportAction == null) {
			CategoryReportAction = new AbstractAction("GenerateCategoryReport", null) {
				private static final long serialVersionUID = 1L;
				public void actionPerformed(ActionEvent evt) {
					jTextArea1.setText(Shop.categoryReport());
				}
			};
		}
		return CategoryReportAction;
	}
	
	private AbstractAction getProductReportAction() {
		if(ProductReportAction == null) {
			ProductReportAction = new AbstractAction("Generate Product Report", null) {
				private static final long serialVersionUID = 1L;
				public void actionPerformed(ActionEvent evt) {
					jTextArea1.setText(Shop.productReport());
				}
			};
		}
		return ProductReportAction;
	}
	
	private AbstractAction getTransactionRepAction() {
		if(TransactionRepAction == null) {
			TransactionRepAction = new AbstractAction("Generate Transaction Report", null) {
				private static final long serialVersionUID = 1856034556939602036L;
				public void actionPerformed(ActionEvent evt) {
					jTextArea1.setText(Shop.generateTransactionReport());
				}
			};
		}
		return TransactionRepAction;
	}
}
