import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Image;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.border.BevelBorder;
import javax.swing.border.MatteBorder;
import java.awt.SystemColor;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField textUserName;
	private JPasswordField txtPassword;
	private JPanel panel_2;
	JComboBox comboBox;
	static Login frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					 frame = new Login();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Login() {
		setBackground(new Color(0, 255, 255));
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 550);
		contentPane = new JPanel();
		contentPane.setFont(new Font("Tahoma", Font.PLAIN, 18));
		contentPane.setLocation(-134, -231);
		contentPane.setBackground(SystemColor.menu);
		contentPane.setBorder(new LineBorder(new Color(76, 42, 211), 3));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(76, 42, 211)));
		panel.setBackground(SystemColor.menu);
		panel.setBounds(50, 294, 300, 47);
		contentPane.add(panel);
		panel.setLayout(null);
		
		textUserName = new JTextField();
		textUserName.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent arg0) {
				if (textUserName.getText().equals("Username")) {
					textUserName.setText("");					
				}else {
						textUserName.selectAll();
					}	
				}
			@Override
			public void focusLost(FocusEvent e) {
				if (textUserName.getText().equals("")) {
					textUserName.setText("Username");					
				}	
				}
			}
	
		);
		textUserName.setForeground(new Color(76,42,211));
		textUserName.setBackground(SystemColor.menu);
		textUserName.setBorder(null);
		textUserName.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		textUserName.setText("Username");
		textUserName.setBounds(10, 9, 197, 27);
		panel.add(textUserName);
		textUserName.setColumns(10);
		
		JLabel lblUsername = new JLabel("");
		lblUsername.setHorizontalAlignment(SwingConstants.CENTER);
		lblUsername.setBounds(264, 0, 36, 47);
		panel.add(lblUsername);
		Image img_username = new ImageIcon(Login.class.getResource("icon/username.png")).getImage()
				.getScaledInstance(lblUsername.getWidth(), lblUsername.getHeight(), Image.SCALE_SMOOTH);
		lblUsername.setIcon(new ImageIcon(img_username));
		
		
		JPanel panelPassword = new JPanel();
		panelPassword.setBorder(new LineBorder(new Color(76, 42, 211)));
		panelPassword.setBackground(SystemColor.menu);
		panelPassword.setBounds(50, 352, 300, 47);
		contentPane.add(panelPassword);
		panelPassword.setLayout(null);
		
		txtPassword = new JPasswordField();
		txtPassword.setForeground(new Color(76,42,211));

		txtPassword.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if(txtPassword.getText().equals("Password")){
					txtPassword.setText("");
					txtPassword.setEchoChar('*');
				}else {
					txtPassword.selectAll();
					
				}
				
			}
			@Override
			public void focusLost(FocusEvent e) {
				if(txtPassword.getText().equals("")){
					txtPassword.setText("Password");
					txtPassword.setEchoChar((char)0);
				}
				
				
			}
		});
		txtPassword.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		txtPassword.setBackground(SystemColor.menu);
		txtPassword.setBorder(null);
		txtPassword.setText("Password");
		txtPassword.setEchoChar((char)0);
		txtPassword.setBounds(10, 11, 199, 25);
		panelPassword.add(txtPassword);
		
		JLabel lblpassword = new JLabel("");
		lblpassword.setBounds(258, 0, 42, 47);
		panelPassword.add(lblpassword);
	    Image img_password = new ImageIcon(Login.class.getResource("icon/lock.png")).getImage()
				.getScaledInstance(lblpassword.getWidth(), lblpassword.getHeight(), Image.SCALE_SMOOTH);
		lblpassword.setIcon(new ImageIcon(img_password));
		
		
		panel_2 = new JPanel();
		panel_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(textUserName.getText().equals("") || txtPassword.getText().equals("") || textUserName.getText().equals("Username" )|| txtPassword.getText().equals("Password")) {
					JOptionPane.showMessageDialog(null, "Please Fill all fields ");
				}else  {
				String type =(String) comboBox.getSelectedItem();
				String user = textUserName.getText();
				String pass = txtPassword.getText();
				if (checkEntries(user,pass,type)) {
					if(type.equals("admin")) {
					MainFrame main = new MainFrame(frame);
					main.setVisible(true);
					main.setLocationRelativeTo(null);
					frame.setVisible(false);
					}else if(type.equals("employee")) {
					EmployeeFrame emp = new EmployeeFrame();
					emp.setVisible(true);
					emp.setLocationRelativeTo(null);
					frame.setVisible(false);
					}
				}else {
					JOptionPane.showMessageDialog(null, "Wrong information ");
				}
			}
				
			}
		});
		panel_2.setBackground(new Color(76, 42, 211));
		panel_2.setBounds(50, 470, 300, 47);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("LOGIN");
		lblNewLabel.setForeground(new Color(154, 205, 50));
		lblNewLabel.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		lblNewLabel.setBounds(10, 11, 140, 25);
		panel_2.add(lblNewLabel);
		
		JLabel lbllogin = new JLabel("");
		lbllogin.setBounds(225, 0, 75, 47);
		panel_2.add(lbllogin);
	    Image img_login = new ImageIcon(Login.class.getResource("icon/Key-icon.png")).getImage()
				.getScaledInstance(lbllogin.getWidth(), lbllogin.getHeight(), Image.SCALE_SMOOTH);
		lbllogin.setIcon(new ImageIcon(img_login));
		
		
		JLabel lblX = new JLabel("x");
		lblX.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if(JOptionPane.showConfirmDialog(null, "Are you Sure you want to Close Window", "Confirmation", JOptionPane.YES_NO_OPTION)==0) {
				System.exit(0);
				}
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				lblX.setForeground(Color.white);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lblX.setForeground(new Color (76,42,211));
			}
		});
		lblX.setForeground(new Color (76,42,211));
		lblX.setHorizontalAlignment(SwingConstants.CENTER);
		lblX.setFont(new Font("Arial", Font.BOLD, 20));
		lblX.setBounds(373, 0, 27, 31);
		contentPane.add(lblX);
		
		comboBox = new JComboBox();
		comboBox.setForeground(new Color(76,42,211));
		comboBox.setFont(new Font("Century Gothic", Font.PLAIN, 18));
		comboBox.setToolTipText("");
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"admin", "employee"}));
		comboBox.setBackground(SystemColor.menu);
		comboBox.setBounds(50, 410, 300, 31);
		contentPane.add(comboBox);
		
		JLabel lblLogo = new JLabel("");
		lblLogo.setBounds(50, 11, 300, 239);
		contentPane.add(lblLogo);
		setLocationRelativeTo(null);
		Image img_logo = new ImageIcon(Login.class.getResource("icon/interim-hr-experts-icon.png")).getImage()
				.getScaledInstance(lblLogo.getWidth(), lblLogo.getHeight(), Image.SCALE_SMOOTH);
		lblLogo.setIcon(new ImageIcon(img_logo));
		
	}
	
	public boolean checkEntries(String user, String pass , String type) {
		try (BufferedReader read = new BufferedReader(new FileReader("../login.csv"))){	
			String row;
			while((row = read.readLine()) !=null) {
				String username = row.split(",")[0];
				String password = row.split(",")[1];
				String t = row.split(",")[2];
				if(user.equals(username) && pass.equals(password)&& type.equals(type)) {
					return true;
				}		
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		return false;
	}
}
