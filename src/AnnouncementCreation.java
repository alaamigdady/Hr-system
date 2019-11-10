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

public class AnnouncementCreation extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textField;

	
	public AnnouncementCreation() {
		setUndecorated(true);
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 400, 300);
		getContentPane().setLayout(null);
		contentPanel.setBounds(0, 0, 434, 245);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel);
		contentPanel.setLayout(null);
		{
			JLabel lblText = new JLabel("title");
			lblText.setHorizontalAlignment(SwingConstants.CENTER);
			lblText.setFont(new Font("Century Gothic", Font.PLAIN, 13));
			lblText.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
			lblText.setBounds(26, 21, 92, 26);
			contentPanel.add(lblText);
		}
		{
			JLabel lblConformation = new JLabel("text");
			lblConformation.setHorizontalAlignment(SwingConstants.CENTER);
			lblConformation.setFont(new Font("Century Gothic", Font.PLAIN, 13));
			lblConformation.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
			lblConformation.setBounds(26, 70, 92, 26);
			contentPanel.add(lblConformation);
		}
		{
			JTextPane textPane = new JTextPane();
			textPane.setBorder(new LineBorder(new Color(76,42,211)));
			textPane.setEditable(false);
			textPane.setBounds(158, 70, 225, 114);
			contentPanel.add(textPane);
		}
		{
			textField = new JTextField();
			textField.setBorder(new LineBorder(new Color(76, 42, 211)));
			textField.setBounds(158, 26, 225, 21);
			contentPanel.add(textField);
			textField.setColumns(10);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBounds(-25, 256, 415, 33);
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane);
			{
				JButton okButton = new JButton("create");
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
