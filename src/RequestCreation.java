import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.border.EtchedBorder;
import javax.swing.JPasswordField;
import javax.swing.border.LineBorder;
import java.awt.SystemColor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTextPane;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class RequestCreation extends JDialog {

	private final JPanel contentPanel = new JPanel();

	
	public RequestCreation() {
		setUndecorated(true);
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 400, 300);
		getContentPane().setLayout(null);
		contentPanel.setBounds(0, 0, 434, 222);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel);
		contentPanel.setLayout(null);
		{
			JLabel lblText = new JLabel("explanation");
			lblText.setHorizontalAlignment(SwingConstants.CENTER);
			lblText.setFont(new Font("Century Gothic", Font.PLAIN, 13));
			lblText.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
			lblText.setBounds(26, 72, 92, 26);
			contentPanel.add(lblText);
		}
		
		{
			JTextPane textPane = new JTextPane();
			textPane.setBorder(new LineBorder(new Color(76,42,211)));
			textPane.setEditable(false);
			textPane.setBounds(155, 72, 225, 150);
			contentPanel.add(textPane);
		}
		{
			JLabel lblTo = new JLabel("type");
			lblTo.setHorizontalAlignment(SwingConstants.CENTER);
			lblTo.setFont(new Font("Century Gothic", Font.PLAIN, 13));
			lblTo.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
			lblTo.setBounds(26, 18, 92, 26);
			contentPanel.add(lblTo);
		}
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBorder(new LineBorder(new Color(76,42,211),1));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"sick leave", "annual leave", "departure"}));
		comboBox.setBounds(155, 23, 225, 20);
		contentPanel.add(comboBox);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBounds(-25, 256, 415, 33);
			getContentPane().add(buttonPane);
			{
				JButton okButton = new JButton("OK");
				okButton.setBounds(277, 11, 55, 23);
				okButton.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						dispose();
					}
				});
				buttonPane.setLayout(null);
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton btnCancel = new JButton("cancel");
				btnCancel.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						dispose();
					}
				});
				btnCancel.setActionCommand("OK");
				btnCancel.setBounds(340, 11, 73, 23);
				buttonPane.add(btnCancel);
			}
		}
	}
}
