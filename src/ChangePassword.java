import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.border.EtchedBorder;
import javax.swing.JPasswordField;
import javax.swing.border.LineBorder;
import java.awt.SystemColor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ChangePassword extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;
	private JPasswordField passwordField_2;


	public ChangePassword() {
		setUndecorated(true);
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 441, 200);
		getContentPane().setLayout(null);
		contentPanel.setBounds(0, 0, 425, 145);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel);
		contentPanel.setLayout(null);
		{
			JLabel lblNewLabel = new JLabel("old password");
			lblNewLabel.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
			lblNewLabel.setFont(new Font("Century Gothic", Font.PLAIN, 13));
			lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel.setBounds(26, 11, 129, 26);
			contentPanel.add(lblNewLabel);
		}
		{
			JLabel lblNewPassword = new JLabel("new password");
			lblNewPassword.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewPassword.setFont(new Font("Century Gothic", Font.PLAIN, 13));
			lblNewPassword.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
			lblNewPassword.setBounds(26, 48, 129, 26);
			contentPanel.add(lblNewPassword);
		}
		{
			JLabel lblConformation = new JLabel("conformation");
			lblConformation.setHorizontalAlignment(SwingConstants.CENTER);
			lblConformation.setFont(new Font("Century Gothic", Font.PLAIN, 13));
			lblConformation.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
			lblConformation.setBounds(26, 85, 129, 26);
			contentPanel.add(lblConformation);
		}
		{
			passwordField = new JPasswordField();
			passwordField.setBorder(new LineBorder(SystemColor.activeCaption));
			passwordField.setBounds(191, 16, 234, 20);
			contentPanel.add(passwordField);
		}
		{
			passwordField_1 = new JPasswordField();
			passwordField_1.setBorder(new LineBorder(SystemColor.activeCaption));
			passwordField_1.setBounds(191, 53, 234, 20);
			contentPanel.add(passwordField_1);
		}
		{
			passwordField_2 = new JPasswordField();
			passwordField_2.setBorder(new LineBorder(SystemColor.activeCaption));
			passwordField_2.setBounds(191, 85, 234, 20);
			contentPanel.add(passwordField_2);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBounds(10, 156, 415, 33);
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane);
			{
				JButton okButton = new JButton("OK");
				okButton.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						if(!passwordField_1.getText().equals(passwordField_2.getText())){
							JOptionPane.showMessageDialog(null, "new password and confirmation don't match");
						}else {
						dispose();
					}
					}
				});
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
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
