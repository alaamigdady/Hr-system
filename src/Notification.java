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

public class Notification extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;

	
	public Notification() {
		setUndecorated(true);
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 400, 300);
		getContentPane().setLayout(null);
		contentPanel.setBounds(0, 0, 434, 229);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel);
		contentPanel.setLayout(null);
		{
			JLabel lblNewLabel = new JLabel("from");
			lblNewLabel.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
			lblNewLabel.setFont(new Font("Century Gothic", Font.PLAIN, 13));
			lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel.setBounds(26, 11, 92, 26);
			contentPanel.add(lblNewLabel);
		}
		{
			JLabel lblNewPassword = new JLabel("title");
			lblNewPassword.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewPassword.setFont(new Font("Century Gothic", Font.PLAIN, 13));
			lblNewPassword.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
			lblNewPassword.setBounds(26, 48, 92, 26);
			contentPanel.add(lblNewPassword);
		}
		{
			JLabel lblConformation = new JLabel("explanation");
			lblConformation.setHorizontalAlignment(SwingConstants.CENTER);
			lblConformation.setFont(new Font("Century Gothic", Font.PLAIN, 13));
			lblConformation.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
			lblConformation.setBounds(26, 85, 92, 26);
			contentPanel.add(lblConformation);
		}
		{
			passwordField = new JPasswordField();
			passwordField.setEditable(false);
			passwordField.setBorder(new LineBorder(SystemColor.activeCaption));
			passwordField.setBounds(158, 16, 225, 20);
			contentPanel.add(passwordField);
		}
		{
			passwordField_1 = new JPasswordField();
			passwordField_1.setEditable(false);
			passwordField_1.setBorder(new LineBorder(SystemColor.activeCaption));
			passwordField_1.setBounds(158, 53, 225, 20);
			contentPanel.add(passwordField_1);
		}
		{
			JTextPane textPane = new JTextPane();
			textPane.setBackground(SystemColor.menu);
			textPane.setBorder(new LineBorder(new Color(76,42,211)));
			textPane.setEditable(false);
			textPane.setBounds(158, 87, 225, 114);
			contentPanel.add(textPane);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBounds(-25, 256, 415, 33);
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane);
			{
				JButton okButton = new JButton("OK");
				okButton.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						dispose();
					}
				});
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("cancel");
				cancelButton.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						dispose();
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}

}
