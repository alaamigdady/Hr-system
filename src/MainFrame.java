import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Cursor;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.CardLayout;
import javax.swing.JTabbedPane;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Image;

import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.SystemColor;
import javax.swing.UIManager;
import javax.swing.JTextPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.border.TitledBorder;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.border.LineBorder;
import javax.swing.JScrollBar;

public class MainFrame extends JFrame {
	
	
	Image profileImage = new ImageIcon(MainFrame.class.getResource("icon/username.png")).getImage().getScaledInstance(60, 60, Image.SCALE_SMOOTH);
	
	
	private JPanel contentPane;
	private JLayeredPane layeredPane;
	private JPanel panelHome;
	private JPanel panelProfile;
	private JPanel panelEmployees;
	private JLabel lblHome;
	private JLabel lblProfile;
	private JPanel panelDepartment;
	private JPanel panelNotification;
	private JPanel panelAnnouncement;
	private JPanel panelDashboard;
	private JLabel lblNoEmployees;
	private JLabel lbldepartments;
	private JLabel lblemployees;
	private JLabel lblnotifications;
	private JLabel lblprofileImage;
	private JPanel panel_1;
	private JLabel ID;
	DefaultTableModel dtm;
	private JLabel lblName;
	private JLabel lblNationality;
	private JLabel lblPlaceOfBirth;
	private JLabel lblDateOfBirth;
	private JTextField textField;
	private JTextField txtAlaaMigdady;
	private JTextField txtJordainin;
	private JTextField txtIrbid;
	private JTextField textField_1;
	private JPanel panel_2;
	private JLabel lblDepartment;
	private JLabel lblPosition;
	private JLabel lblLevel;
	private JLabel lblSalary;
	private JLabel lblAttendence;
	private JTextField txtIt;
	private JTextField txtSoftwareEngineer;
	private JTextField txtEntry;
	private JTextField textField_5;
	private JTextField txtDays;
	private JPanel panel_3;
	private JLabel lblEmail;
	private JLabel lblPhoneNumber;
	private JTextField txtAlaamohammadgmailcom;
	private JTextField textField_8;
	private JPanel panel_4;
	private JLabel lblUserName;
	private JLabel lblPassword;
	private JTextField txtAlaamigdady;
	private JPasswordField pwdabc;
	private JTextField txtChangePassword;
	private JTable table;
	private JScrollPane scrollPane;
	private JTextField textField_7;
	private JLabel lblNewLabel;
	private JLabel lblSearchBy;
	private JLabel lblAddUser;
	private JLabel lblEdit;
	private JLabel lblDelete;
	static MainFrame frame;
	private JScrollPane scrollPane_1;
	private JRadioButton radioButton;
	private JRadioButton radioButton_2;
	private JTextField textField_9;
	private JLabel label_1;
	private JLabel label_2;
	private JLabel lblAddDepartment;
	private JLabel label_4;
	private JLabel label_5;
	private JLabel label_3;
	private JLabel label_6;
	private JLabel label_7;
	private JLabel label_8;
	private JLabel label_9;
	private JLabel label_10;
	private JLabel label_11;
	private JLabel label_12;
	private JLabel label_13;
	private JLabel lblNewAnnouncement;
	private JLabel lblAnnouncement;
	private JLabel lblNewAnnouncement_1;
	private JLabel lblNewAnnouncement_2;
	private JLabel lblNewAnnouncement_3;
	private JLabel lblNewAnnouncement_4;
	private JLabel lblNewAnnouncement_5;
	private JLabel lblNewAnnouncement_6;
	private JLabel lblNewAnnouncement_7;
	private JLabel lblNewAnnouncement_8;
	private JTextField txtNewAnnouncment;
	private JLabel lblWarnings;
	private JPanel panelWarnings;
	private JLabel lblNewWarning;
	private JLabel lblNewWarning_1;
	private JLabel lblNewWarning_2;
	private JLabel lblNewWarning_3;
	private JLabel lblNewWarning_4;
	private JLabel lblNewWarning_5;
	private JLabel lblNewWarning_6;
	private JLabel lblNewWarning_7;
	private JLabel lblNewWarning_8;
	private JLabel lblNewWarning_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField txtDetais;
	private JTextField txtDetails;
	private JPanel panel_6;
	private JLabel lblNewLabel_2;
	private JLabel label_14;
	private JLabel label_15;
	private JLabel label_16;
	private JLabel lblNotification;
	private JLabel label_17;
	private JLabel label_18;
	private JLabel label_19;
	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					 frame = new MainFrame();
//					frame.setVisible(true);
//					frame.setLocationRelativeTo(null);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the frame.
	 */
	public MainFrame() {
		//setVisible(true);
		//setLocationRelativeTo(null);
		this.setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(76, 42, 211));
		panel.setBounds(0, 0, 217, 600);
		contentPane.add(panel);
		panel.setLayout(null);

		lblHome = new JLabel("Home");
		lblHome.setOpaque(true);
		lblHome.setBackground(new Color(76, 42, 211));
		lblHome.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				lblHome.setBackground((new Color(106, 72, 241)));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				lblHome.setBackground(new Color(76, 42, 211));
				
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				displayPanel(panelHome,lblHome);
				
			}
		});
		lblHome.setHorizontalAlignment(SwingConstants.CENTER);
		lblHome.setForeground(new Color(255, 255, 255));
		lblHome.setFont(new Font("Century Gothic", Font.PLAIN, 22));
		lblHome.setBounds(0, 36, 217, 33);
		panel.add(lblHome);

		lblProfile = new JLabel("Profile");
		lblProfile.setOpaque(true);
		lblProfile.setBackground(new Color(76, 42, 211));
		lblProfile.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				lblProfile.setBackground((new Color(106, 72, 241)));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				lblProfile.setBackground(new Color(76, 42, 211));
			}
			
			public void mouseClicked(MouseEvent e) {
				displayPanel(panelProfile,lblProfile);
			}
		});
		lblProfile.setHorizontalAlignment(SwingConstants.CENTER);
		lblProfile.setForeground(Color.WHITE);
		lblProfile.setFont(new Font("Century Gothic", Font.PLAIN, 22));
		lblProfile.setBounds(0, 103, 217, 33);
		panel.add(lblProfile);

		JLabel lblEmployees = new JLabel("Employees");
		lblEmployees.setOpaque(true);
		lblEmployees.setBackground(new Color(76, 42, 211));
		lblEmployees.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				lblEmployees.setBackground((new Color(106, 72, 241)));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				lblEmployees.setBackground(new Color(76, 42, 211));
			}
			public void mouseClicked(MouseEvent e) {
				displayPanel(panelEmployees,lblEmployees);
			}
		});
		lblEmployees.setHorizontalAlignment(SwingConstants.CENTER);
		lblEmployees.setForeground(Color.WHITE);
		lblEmployees.setFont(new Font("Century Gothic", Font.PLAIN, 22));
		lblEmployees.setBounds(0, 175, 217, 33);
		panel.add(lblEmployees);

		JLabel lblDepartments = new JLabel("Departments");
		lblDepartments.setOpaque(true);
		lblDepartments.setBackground(new Color(76, 42, 211));
		lblDepartments.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				lblDepartments.setBackground((new Color(106, 72, 241)));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				lblDepartments.setBackground(new Color(76, 42, 211));
			}
			public void mouseClicked(MouseEvent e) {
				displayPanel(panelDepartment,lblDepartments);
			}
		});
		lblDepartments.setHorizontalAlignment(SwingConstants.CENTER);
		lblDepartments.setForeground(Color.WHITE);
		lblDepartments.setFont(new Font("Century Gothic", Font.PLAIN, 22));
		lblDepartments.setBounds(0, 253, 217, 33);
		panel.add(lblDepartments);

		JLabel lblNotifications = new JLabel("Notifications");
		lblNotifications.setOpaque(true);
		lblNotifications.setBackground(new Color(76, 42, 211));
		lblNotifications.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				lblNotifications.setBackground((new Color(106, 72, 241)));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				lblNotifications.setBackground(new Color(76, 42, 211));
			}
			public void mouseClicked(MouseEvent e) {
				displayPanel(panelNotification,lblNotifications);
			}
		});
		lblNotifications.setHorizontalAlignment(SwingConstants.CENTER);
		lblNotifications.setForeground(Color.WHITE);
		lblNotifications.setFont(new Font("Century Gothic", Font.PLAIN, 22));
		lblNotifications.setBounds(0, 335, 217, 33);
		panel.add(lblNotifications);

		JLabel lblAnnouncements = new JLabel("Announcements");
		lblAnnouncements.setOpaque(true);
		lblAnnouncements.setBackground(new Color(76, 42, 211));
		lblAnnouncements.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				lblAnnouncements.setBackground((new Color(106, 72, 241)));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				lblAnnouncements.setBackground(new Color(76, 42, 211));
			}
			public void mouseClicked(MouseEvent e) {
				displayPanel(panelAnnouncement,lblAnnouncements);
			}
		});
		lblAnnouncements.setHorizontalAlignment(SwingConstants.CENTER);
		lblAnnouncements.setForeground(Color.WHITE);
		lblAnnouncements.setFont(new Font("Century Gothic", Font.PLAIN, 22));
		lblAnnouncements.setBounds(0, 409, 217, 33);
		panel.add(lblAnnouncements);

		JLabel lblLogout = new JLabel("Logout");
		lblLogout.setOpaque(true);
		lblLogout.setBackground(new Color(76, 42, 211));
		lblLogout.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				lblLogout.setBackground((new Color(106, 72, 241)));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				lblLogout.setBackground(new Color(76, 42, 211));
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				if (JOptionPane.showConfirmDialog(null, "Are you Suse to Logout", "Confirmation",JOptionPane.YES_NO_OPTION)==0) {
					Login login = new Login();
					login.setVisible(true);
					dispose();
					//System.exit(0);	
				}
				
			}
		});
		lblLogout.setHorizontalAlignment(SwingConstants.CENTER);
		lblLogout.setForeground(Color.WHITE);
		lblLogout.setFont(new Font("Century Gothic", Font.PLAIN, 22));
		lblLogout.setBounds(0, 545, 217, 33);
		panel.add(lblLogout);
		
		lblWarnings = new JLabel("Warnings");
		lblWarnings.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				lblWarnings.setBackground((new Color(106, 72, 241)));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				lblWarnings.setBackground(new Color(76, 42, 211));
			}
			public void mouseClicked(MouseEvent e) {
				displayPanel(panelWarnings,lblWarnings);
			}
		});
		lblWarnings.setOpaque(true);
		lblWarnings.setHorizontalAlignment(SwingConstants.CENTER);
		lblWarnings.setForeground(Color.WHITE);
		lblWarnings.setFont(new Font("Century Gothic", Font.PLAIN, 22));
		lblWarnings.setBackground(new Color(76, 42, 211));
		lblWarnings.setBounds(0, 478, 217, 33);
		panel.add(lblWarnings);

		layeredPane = new JLayeredPane();
		layeredPane.setAutoscrolls(true);
		layeredPane.setBackground(new Color(0, 0, 0));
		layeredPane.setBounds(215, 0, 585, 600);
		contentPane.add(layeredPane);
		layeredPane.setLayout(new CardLayout(0, 0));

		panelHome = new JPanel();
		panelHome.setForeground(UIManager.getColor("MenuItem.selectionForeground"));
		panelHome.setAutoscrolls(true);
		panelHome.setFocusable(false);
		panelHome.setBackground(SystemColor.menu);
		layeredPane.add(panelHome, "name_1927307604739500");
		panelHome.setLayout(null);
		
		panelDashboard = new JPanel();
		panelDashboard.setBounds(37, 29, 519, 313);
		panelHome.add(panelDashboard);
		panelDashboard.setLayout(null);
		
		lblNoEmployees = new JLabel("<html><center>50<br/>Employees</center> </html>",SwingConstants.CENTER);
		lblNoEmployees.setForeground(Color.WHITE);
		lblNoEmployees.setOpaque(true);
		lblNoEmployees.setBackground(new Color (76,42,211));
		lblNoEmployees.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNoEmployees.setHorizontalAlignment(SwingConstants.CENTER);
		lblNoEmployees.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		lblNoEmployees.setBounds(46, 34, 167, 100);
		panelDashboard.add(lblNoEmployees);
		
		lbldepartments = new JLabel("<html><center>10<br/>Departments</center> </html>", SwingConstants.CENTER);
		lbldepartments.setBorder(new LineBorder(new Color(76,42,211)));
		lbldepartments.setHorizontalTextPosition(SwingConstants.CENTER);
		lbldepartments.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		lbldepartments.setBounds(287, 34, 167, 100);
		panelDashboard.add(lbldepartments);
		
		lblemployees = new JLabel("<html><center>50<br/>Announcements</center> </html>", SwingConstants.CENTER);
		lblemployees.setBorder(new LineBorder(new Color(76,42,211)));
		lblemployees.setHorizontalTextPosition(SwingConstants.CENTER);
		lblemployees.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		lblemployees.setBounds(59, 186, 167, 100);
		panelDashboard.add(lblemployees);
		
		lblnotifications = new JLabel("<html><center>5<br/>Notifications</center></html>", SwingConstants.CENTER);
		lblnotifications.setForeground(Color.WHITE);
		lblnotifications.setOpaque(true);
		lblnotifications.setBackground(new Color(76,42,211));
		lblnotifications.setHorizontalTextPosition(SwingConstants.CENTER);
		lblnotifications.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		lblnotifications.setBounds(287, 186, 167, 100);
		panelDashboard.add(lblnotifications);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new TitledBorder(null, "announcement", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(76,42,211)));
		panel_5.setBounds(37, 366, 235, 223);
		panelHome.add(panel_5);
		panel_5.setLayout(null);
		
		lblNewLabel_2 = new JLabel("anouncement");
		lblNewLabel_2.setBorder(new LineBorder(new Color(76,42,211)));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(10, 27, 215, 24);
		panel_5.add(lblNewLabel_2);
		
		label_14 = new JLabel("anouncement");
		label_14.setHorizontalAlignment(SwingConstants.CENTER);
		label_14.setBorder(new LineBorder(new Color(76,42,211)));
		label_14.setBounds(10, 83, 215, 24);
		panel_5.add(label_14);
		
		label_15 = new JLabel("anouncement");
		label_15.setHorizontalAlignment(SwingConstants.CENTER);
		label_15.setBorder(new LineBorder(new Color(76,42,211)));
		label_15.setBounds(10, 138, 215, 24);
		panel_5.add(label_15);
		
		label_16 = new JLabel("anouncement");
		label_16.setHorizontalAlignment(SwingConstants.CENTER);
		label_16.setBorder(new LineBorder(new Color(76,42,211)));
		label_16.setBounds(10, 188, 215, 24);
		panel_5.add(label_16);
		
		panel_6 = new JPanel();
		panel_6.setLayout(null);
		panel_6.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "notifications", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(76, 42, 211)));
		panel_6.setBounds(302, 366, 235, 223);
		panelHome.add(panel_6);
		
		lblNotification = new JLabel("notification");
		lblNotification.setHorizontalAlignment(SwingConstants.CENTER);
		lblNotification.setBorder(new LineBorder(new Color(76,42,211)));
		lblNotification.setBounds(10, 29, 215, 24);
		panel_6.add(lblNotification);
		
		label_17 = new JLabel("notification");
		label_17.setHorizontalAlignment(SwingConstants.CENTER);
		label_17.setBorder(new LineBorder(new Color(76,42,211)));
		label_17.setBounds(10, 78, 215, 24);
		panel_6.add(label_17);
		
		label_18 = new JLabel("notification");
		label_18.setHorizontalAlignment(SwingConstants.CENTER);
		label_18.setBorder(new LineBorder(new Color(76,42,211)));
		label_18.setBounds(10, 129, 215, 24);
		panel_6.add(label_18);
		
		label_19 = new JLabel("notification");
		label_19.setHorizontalAlignment(SwingConstants.CENTER);
		label_19.setBorder(new LineBorder(new Color(76,42,211)));
		label_19.setBounds(10, 176, 215, 24);
		panel_6.add(label_19);

		panelProfile = new JPanel();
		panelProfile.setBackground(SystemColor.menu);
		layeredPane.add(panelProfile, "name_1927307628307000");
		panelProfile.setLayout(null);

		JLabel lblWelcome = new JLabel("Welcome Employee");
		lblWelcome.setFont(new Font("Goudy Old Style", Font.PLAIN, 22));
		lblWelcome.setBounds(34, 5, 392, 74);
		panelProfile.add(lblWelcome);
		
		lblprofileImage = new JLabel("");
		lblprofileImage.setHorizontalAlignment(SwingConstants.CENTER);
		lblprofileImage.setBounds(464, 5, 92, 80);
		panelProfile.add(lblprofileImage);
		lblprofileImage.setIcon(new ImageIcon(profileImage));
		
		panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Personal", TitledBorder.LEADING, TitledBorder.TOP, null, new Color (76,42,211)));
		panel_1.setBounds(34, 79, 507, 156);
		panelProfile.add(panel_1);
		panel_1.setLayout(null);
		
		ID = new JLabel("National ID      :");
		ID.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		ID.setForeground(new Color (76,42,211));
		ID.setBounds(10, 25, 114, 14);
		panel_1.add(ID);
		
		lblName = new JLabel("Name              :");
		lblName.setForeground(new Color(76, 42, 211));
		lblName.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		lblName.setBounds(10, 50, 114, 14);
		panel_1.add(lblName);
		
		lblNationality = new JLabel("Nationality      :");
		lblNationality.setForeground(new Color(76, 42, 211));
		lblNationality.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		lblNationality.setBounds(10, 76, 114, 14);
		panel_1.add(lblNationality);
		
		lblPlaceOfBirth = new JLabel("Place of birth  :");
		lblPlaceOfBirth.setForeground(new Color(76, 42, 211));
		lblPlaceOfBirth.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		lblPlaceOfBirth.setBounds(10, 101, 114, 14);
		panel_1.add(lblPlaceOfBirth);
		
		lblDateOfBirth = new JLabel("Date of birth   :");
		lblDateOfBirth.setForeground(new Color(76, 42, 211));
		lblDateOfBirth.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		lblDateOfBirth.setBounds(10, 124, 114, 14);
		panel_1.add(lblDateOfBirth);
		
		textField = new JTextField();
		textField.setForeground(SystemColor.infoText);
		textField.setHorizontalAlignment(SwingConstants.LEFT);
		textField.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		textField.setText("9892006063");
		textField.setEditable(false);
		textField.setBorder(null);
		textField.setBackground(SystemColor.menu);
		textField.setBounds(126, 24, 132, 20);
		panel_1.add(textField);
		textField.setColumns(10);
		
		txtAlaaMigdady = new JTextField();
		txtAlaaMigdady.setText("Ala'a Migdady");
		txtAlaaMigdady.setHorizontalAlignment(SwingConstants.LEFT);
		txtAlaaMigdady.setForeground(Color.BLACK);
		txtAlaaMigdady.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		txtAlaaMigdady.setEditable(false);
		txtAlaaMigdady.setColumns(10);
		txtAlaaMigdady.setBorder(null);
		txtAlaaMigdady.setBackground(SystemColor.menu);
		txtAlaaMigdady.setBounds(125, 48, 202, 20);
		panel_1.add(txtAlaaMigdady);
		
		txtJordainin = new JTextField();
		txtJordainin.setText("Jordanian");
		txtJordainin.setHorizontalAlignment(SwingConstants.LEFT);
		txtJordainin.setForeground(Color.BLACK);
		txtJordainin.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		txtJordainin.setEditable(false);
		txtJordainin.setColumns(10);
		txtJordainin.setBorder(null);
		txtJordainin.setBackground(SystemColor.menu);
		txtJordainin.setBounds(126, 71, 132, 20);
		panel_1.add(txtJordainin);
		
		txtIrbid = new JTextField();
		txtIrbid.setText("Irbid");
		txtIrbid.setHorizontalAlignment(SwingConstants.LEFT);
		txtIrbid.setForeground(Color.BLACK);
		txtIrbid.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		txtIrbid.setEditable(false);
		txtIrbid.setColumns(10);
		txtIrbid.setBorder(null);
		txtIrbid.setBackground(SystemColor.menu);
		txtIrbid.setBounds(126, 96, 132, 20);
		panel_1.add(txtIrbid);
		
		textField_1 = new JTextField();
		textField_1.setText("21/8/1989\r\n");
		textField_1.setHorizontalAlignment(SwingConstants.LEFT);
		textField_1.setForeground(Color.BLACK);
		textField_1.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		textField_1.setEditable(false);
		textField_1.setColumns(10);
		textField_1.setBorder(null);
		textField_1.setBackground(SystemColor.menu);
		textField_1.setBounds(126, 123, 132, 20);
		panel_1.add(textField_1);
		
		panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Job", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(76, 42, 211)));
		panel_2.setBounds(34, 241, 507, 156);
		panelProfile.add(panel_2);
		
		lblDepartment = new JLabel("Department    :");
		lblDepartment.setForeground(new Color(76, 42, 211));
		lblDepartment.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		lblDepartment.setBounds(10, 25, 114, 14);
		panel_2.add(lblDepartment);
		
		lblPosition = new JLabel("Position            :");
		lblPosition.setForeground(new Color(76, 42, 211));
		lblPosition.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		lblPosition.setBounds(10, 50, 114, 14);
		panel_2.add(lblPosition);
		
		lblLevel = new JLabel("Level                :");
		lblLevel.setForeground(new Color(76, 42, 211));
		lblLevel.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		lblLevel.setBounds(10, 76, 114, 14);
		panel_2.add(lblLevel);
		
		lblSalary = new JLabel("Salary              :");
		lblSalary.setForeground(new Color(76, 42, 211));
		lblSalary.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		lblSalary.setBounds(10, 101, 114, 14);
		panel_2.add(lblSalary);
		
		lblAttendence = new JLabel("Attendence    :");
		lblAttendence.setForeground(new Color(76, 42, 211));
		lblAttendence.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		lblAttendence.setBounds(10, 124, 114, 14);
		panel_2.add(lblAttendence);
		
		txtIt = new JTextField();
		txtIt.setText("IT");
		txtIt.setHorizontalAlignment(SwingConstants.LEFT);
		txtIt.setForeground(Color.BLACK);
		txtIt.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		txtIt.setEditable(false);
		txtIt.setColumns(10);
		txtIt.setBorder(null);
		txtIt.setBackground(SystemColor.menu);
		txtIt.setBounds(126, 24, 132, 20);
		panel_2.add(txtIt);
		
		txtSoftwareEngineer = new JTextField();
		txtSoftwareEngineer.setText("software engineer");
		txtSoftwareEngineer.setHorizontalAlignment(SwingConstants.LEFT);
		txtSoftwareEngineer.setForeground(Color.BLACK);
		txtSoftwareEngineer.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		txtSoftwareEngineer.setEditable(false);
		txtSoftwareEngineer.setColumns(10);
		txtSoftwareEngineer.setBorder(null);
		txtSoftwareEngineer.setBackground(SystemColor.menu);
		txtSoftwareEngineer.setBounds(126, 48, 202, 20);
		panel_2.add(txtSoftwareEngineer);
		
		txtEntry = new JTextField();
		txtEntry.setText("entry");
		txtEntry.setHorizontalAlignment(SwingConstants.LEFT);
		txtEntry.setForeground(Color.BLACK);
		txtEntry.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		txtEntry.setEditable(false);
		txtEntry.setColumns(10);
		txtEntry.setBorder(null);
		txtEntry.setBackground(SystemColor.menu);
		txtEntry.setBounds(126, 71, 132, 20);
		panel_2.add(txtEntry);
		
		textField_5 = new JTextField();
		textField_5.setText("500");
		textField_5.setHorizontalAlignment(SwingConstants.LEFT);
		textField_5.setForeground(Color.BLACK);
		textField_5.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		textField_5.setEditable(false);
		textField_5.setColumns(10);
		textField_5.setBorder(null);
		textField_5.setBackground(SystemColor.menu);
		textField_5.setBounds(126, 96, 132, 20);
		panel_2.add(textField_5);
		
		txtDays = new JTextField();
		txtDays.setText("15 days");
		txtDays.setHorizontalAlignment(SwingConstants.LEFT);
		txtDays.setForeground(Color.BLACK);
		txtDays.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		txtDays.setEditable(false);
		txtDays.setColumns(10);
		txtDays.setBorder(null);
		txtDays.setBackground(SystemColor.menu);
		txtDays.setBounds(126, 123, 132, 20);
		panel_2.add(txtDays);
		
		txtDetais = new JTextField();
		txtDetais.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				txtDetais.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				SalaryDetails salary = new SalaryDetails();
				salary.setVisible(true);
				salary.setLocationRelativeTo(null);
				setState(Frame.ICONIFIED);
			}
		});
		txtDetais.setText("details");
		txtDetais.setHorizontalAlignment(SwingConstants.LEFT);
		txtDetais.setForeground(new Color(76, 42, 211));
		txtDetais.setFont(new Font("Century Gothic", Font.PLAIN, 13));
		txtDetais.setEditable(false);
		txtDetais.setColumns(10);
		txtDetais.setBorder(null);
		txtDetais.setBackground(SystemColor.menu);
		txtDetais.setBounds(380, 100, 117, 20);
		panel_2.add(txtDetais);
		
		txtDetails = new JTextField();
		txtDetails.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				txtDetails.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				AttendDetails att = new AttendDetails();
				att.setVisible(true);
				att.setLocationRelativeTo(null);
				setState(Frame.ICONIFIED);
			}
		});
		txtDetails.setText("details");
		txtDetails.setHorizontalAlignment(SwingConstants.LEFT);
		txtDetails.setForeground(new Color(76, 42, 211));
		txtDetails.setFont(new Font("Century Gothic", Font.PLAIN, 13));
		txtDetails.setEditable(false);
		txtDetails.setColumns(10);
		txtDetails.setBorder(null);
		txtDetails.setBackground(SystemColor.menu);
		txtDetails.setBounds(380, 123, 117, 20);
		panel_2.add(txtDetails);
		
		panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Contact info.", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(76, 42, 211)));
		panel_3.setBounds(34, 405, 507, 80);
		panelProfile.add(panel_3);
		
		lblEmail = new JLabel("Email               :");
		lblEmail.setForeground(new Color(76, 42, 211));
		lblEmail.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		lblEmail.setBounds(10, 25, 114, 14);
		panel_3.add(lblEmail);
		
		lblPhoneNumber = new JLabel("Phone No.      :");
		lblPhoneNumber.setForeground(new Color(76, 42, 211));
		lblPhoneNumber.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		lblPhoneNumber.setBounds(10, 50, 114, 14);
		panel_3.add(lblPhoneNumber);
		
		txtAlaamohammadgmailcom = new JTextField();
		txtAlaamohammadgmailcom.setText("alaamohammad283@gmail.com");
		txtAlaamohammadgmailcom.setHorizontalAlignment(SwingConstants.LEFT);
		txtAlaamohammadgmailcom.setForeground(Color.BLACK);
		txtAlaamohammadgmailcom.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		txtAlaamohammadgmailcom.setEditable(false);
		txtAlaamohammadgmailcom.setColumns(10);
		txtAlaamohammadgmailcom.setBorder(null);
		txtAlaamohammadgmailcom.setBackground(SystemColor.menu);
		txtAlaamohammadgmailcom.setBounds(129, 23, 275, 20);
		panel_3.add(txtAlaamohammadgmailcom);
		
		textField_8 = new JTextField();
		textField_8.setText("0780398086");
		textField_8.setHorizontalAlignment(SwingConstants.LEFT);
		textField_8.setForeground(Color.BLACK);
		textField_8.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		textField_8.setEditable(false);
		textField_8.setColumns(10);
		textField_8.setBorder(null);
		textField_8.setBackground(SystemColor.menu);
		textField_8.setBounds(134, 48, 202, 20);
		panel_3.add(textField_8);
		
		panel_4 = new JPanel();
		panel_4.setLayout(null);
		panel_4.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Account info.", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(76, 42, 211)));
		panel_4.setBounds(34, 496, 507, 80);
		panelProfile.add(panel_4);
		
		lblUserName = new JLabel("User name      :");
		lblUserName.setForeground(new Color(76, 42, 211));
		lblUserName.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		lblUserName.setBounds(10, 25, 114, 14);
		panel_4.add(lblUserName);
		
		lblPassword = new JLabel("Password        :");
		lblPassword.setForeground(new Color(76, 42, 211));
		lblPassword.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		lblPassword.setBounds(10, 50, 114, 14);
		panel_4.add(lblPassword);
		
		txtAlaamigdady = new JTextField();
		txtAlaamigdady.setText("alaa.migdady");
		txtAlaamigdady.setHorizontalAlignment(SwingConstants.LEFT);
		txtAlaamigdady.setForeground(Color.BLACK);
		txtAlaamigdady.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		txtAlaamigdady.setEditable(false);
		txtAlaamigdady.setColumns(10);
		txtAlaamigdady.setBorder(null);
		txtAlaamigdady.setBackground(SystemColor.menu);
		txtAlaamigdady.setBounds(129, 23, 275, 20);
		panel_4.add(txtAlaamigdady);
		
		pwdabc = new JPasswordField();
		pwdabc.setText("123.abc");
		pwdabc.setBorder(null);
		pwdabc.setBackground(SystemColor.menu);
		pwdabc.setBounds(129, 49, 92, 20);
		panel_4.add(pwdabc);
		
		txtChangePassword = new JTextField();
		txtChangePassword.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				txtChangePassword.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				ChangePassword change = new ChangePassword();
				change.setLocationRelativeTo(null);
				change.setVisible(true);
				setState(Frame.ICONIFIED);
			}
		});
		txtChangePassword.setText("change password");
		txtChangePassword.setHorizontalAlignment(SwingConstants.LEFT);
		txtChangePassword.setForeground(new Color (76,42,211));
		txtChangePassword.setFont(new Font("Century Gothic", Font.PLAIN, 13));
		txtChangePassword.setEditable(false);
		txtChangePassword.setColumns(10);
		txtChangePassword.setBorder(null);
		txtChangePassword.setBackground(SystemColor.menu);
		txtChangePassword.setBounds(380, 48, 117, 20);
		panel_4.add(txtChangePassword);
        
		
		
		panelEmployees = new JPanel();
		panelEmployees.setForeground(SystemColor.window);
		panelEmployees.setBackground(SystemColor.menu);
		layeredPane.add(panelEmployees, "name_1927307649022500");
		panelEmployees.setLayout(null);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(73, 213, 423, 324);
		panelEmployees.add(scrollPane);
		
		table = new JTable();
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
			}
		});
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{001, "x", "A"},
				{002, "y", "A"},
				{003, "z", "B"},
				{201, "x", "A"},
				{701, "x", "A"},
				{503, "z", "B"},
				{203, "z", "B"},
				{103, "z", "B"},
				{001, "x", "A"},
				{002, "y", "A"},
				{003, "z", "B"},
				{201, "x", "A"},
				{701, "x", "A"},
				{503, "z", "B"},
				{203, "z", "B"},
				{103, "z", "B"},
				{001, "x", "A"},
				{002, "y", "A"},
				{003, "z", "B"},
				{201, "x", "A"},
				{701, "x", "A"},
				{503, "z", "B"},
				{203, "z", "B"},
				{103, "z", "B"},
				{001, "x", "A"},
				{002, "y", "A"},
				{003, "z", "B"},
				{201, "x", "A"},
				{701, "x", "A"},
				{503, "z", "B"},
				{203, "z", "B"},
				{103, "z", "B"},
			},
			new String[] {
				"Id", "Name", "Department"
			}
		));
		
		scrollPane.setViewportView(table);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Name");
		rdbtnNewRadioButton.setBounds(152, 121, 71, 23);
		panelEmployees.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnDepartment = new JRadioButton("Department");
		rdbtnDepartment.setBounds(239, 121, 122, 23);
		panelEmployees.add(rdbtnDepartment);
		
		JRadioButton rdbtnId = new JRadioButton("ID");
		rdbtnId.setBounds(73, 121, 109, 23);
		panelEmployees.add(rdbtnId);
		
		textField_7 = new JTextField();
		textField_7.setBounds(73, 67, 265, 31);
		panelEmployees.add(textField_7);
		textField_7.setColumns(10);
		
		lblNewLabel = new JLabel("search");
		lblNewLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				lblNewLabel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

			}
		});
		lblNewLabel.setOpaque(true);
		lblNewLabel.setBackground(new Color (76,42,211));
		lblNewLabel.setForeground(SystemColor.window);
		lblNewLabel.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(372, 67, 89, 31);
		panelEmployees.add(lblNewLabel);
		
		lblSearchBy = new JLabel("search by");
		lblSearchBy.setOpaque(true);
		lblSearchBy.setHorizontalAlignment(SwingConstants.CENTER);
		lblSearchBy.setForeground(Color.WHITE);
		lblSearchBy.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		lblSearchBy.setBackground(new Color (76,42,211));
		lblSearchBy.setBounds(372, 109, 89, 31);
		panelEmployees.add(lblSearchBy);
		
		lblAddUser = new JLabel("add user");
		lblAddUser.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				UsersEditForm window = new UsersEditForm();
				window.setVisible(true);
				window.setLocationRelativeTo(null);
				setState(Frame.ICONIFIED);
			}
		});
		lblNewLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				lblAddUser.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

			}
		});
		lblAddUser.setOpaque(true);
		lblAddUser.setHorizontalAlignment(SwingConstants.CENTER);
		lblAddUser.setForeground(Color.WHITE);
		lblAddUser.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		lblAddUser.setBackground(new Color (76,42,211));
		lblAddUser.setBounds(73, 558, 89, 31);
		panelEmployees.add(lblAddUser);
		
		lblEdit = new JLabel("edit");
		lblEdit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				
			    //String id1 = (String)table.getValueAt(1, 2);
				UsersEditForm window = new UsersEditForm();
				//window.setTextfield(id1);
				window.setVisible(true);
				window.setLocationRelativeTo(null);
				setState(Frame.ICONIFIED);
			}
		});
		lblNewLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				lblEdit.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

			}
		});
		lblEdit.setOpaque(true);
		lblEdit.setHorizontalAlignment(SwingConstants.CENTER);
		lblEdit.setForeground(Color.WHITE);
		lblEdit.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		lblEdit.setBackground(new Color (76,42,211));
		lblEdit.setBounds(239, 558, 89, 31);
		panelEmployees.add(lblEdit);
		
		lblDelete = new JLabel("delete");
		lblNewLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				lblDelete.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

			}
		});
		lblDelete.setOpaque(true);
		lblDelete.setHorizontalAlignment(SwingConstants.CENTER);
		lblDelete.setForeground(Color.WHITE);
		lblDelete.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		lblDelete.setBackground(new Color (76,42,211));
		lblDelete.setBounds(407, 558, 89, 31);
		panelEmployees.add(lblDelete);
		
		//create table 
		
		
		//JScrollPane sp = new JScrollPane();
				

		panelNotification = new JPanel();
		layeredPane.add(panelNotification, "name_1927307671627100");
		panelNotification.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("notification from x ");
		lblNewLabel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				lblNewLabel_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				Notification not = new Notification();
				not.setVisible(true);
				not.setLocationRelativeTo(null);
				setState(Frame.ICONIFIED);
			}
		});
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		lblNewLabel_1.setBorder(new LineBorder(new Color(76,42,211)));
		lblNewLabel_1.setBounds(130, 105, 350, 32);
		panelNotification.add(lblNewLabel_1);
		
		label_3 = new JLabel("notification from x ");
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		label_3.setBorder(new LineBorder(new Color(76,42,211)));
		label_3.setBounds(130, 150, 350, 32);
		panelNotification.add(label_3);
		
		label_6 = new JLabel("notification from x ");
		label_6.setHorizontalAlignment(SwingConstants.CENTER);
		label_6.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		label_6.setBorder(new LineBorder(new Color(76,42,211)));
		label_6.setBounds(130, 194, 350, 32);
		panelNotification.add(label_6);
		
		label_7 = new JLabel("notification from x ");
		label_7.setHorizontalAlignment(SwingConstants.CENTER);
		label_7.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		label_7.setBorder(new LineBorder(new Color(76,42,211)));
		label_7.setBounds(130, 237, 350, 32);
		panelNotification.add(label_7);
		
		label_8 = new JLabel("notification from x ");
		label_8.setHorizontalAlignment(SwingConstants.CENTER);
		label_8.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		label_8.setBorder(new LineBorder(new Color(76,42,211)));
		label_8.setBounds(130, 280, 350, 32);
		panelNotification.add(label_8);
		
		label_9 = new JLabel("notification from x ");
		label_9.setHorizontalAlignment(SwingConstants.CENTER);
		label_9.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		label_9.setBorder(new LineBorder(new Color(76,42,211)));
		label_9.setBounds(130, 323, 350, 32);
		panelNotification.add(label_9);
		
		label_10 = new JLabel("notification from x ");
		label_10.setHorizontalAlignment(SwingConstants.CENTER);
		label_10.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		label_10.setBorder(new LineBorder(new Color(76,42,211)));
		label_10.setBounds(130, 369, 350, 32);
		panelNotification.add(label_10);
		
		label_11 = new JLabel("notification from x ");
		label_11.setHorizontalAlignment(SwingConstants.CENTER);
		label_11.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		label_11.setBorder(new LineBorder(new Color(76,42,211)));
		label_11.setBounds(130, 412, 350, 32);
		panelNotification.add(label_11);
		
		label_12 = new JLabel("notification from x ");
		label_12.setHorizontalAlignment(SwingConstants.CENTER);
		label_12.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		label_12.setBorder(new LineBorder(new Color(76,42,211)));
		label_12.setBounds(130, 455, 350, 32);
		panelNotification.add(label_12);
		
		label_13 = new JLabel("notification from x ");
		label_13.setHorizontalAlignment(SwingConstants.CENTER);
		label_13.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		label_13.setBorder(new LineBorder(new Color(76,42,211)));
		label_13.setBounds(130, 498, 350, 32);
		panelNotification.add(label_13);
		
		JTextField txtSeeAll = new JTextField();
		txtSeeAll.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				txtSeeAll.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			}
			@Override
			public void mouseClicked(MouseEvent arg0) {
				EmployeeList list = new EmployeeList();
				list.setVisible(true);
				list.setLocationRelativeTo(null);
				setState(Frame.ICONIFIED);
				
				
			}
		});
		txtSeeAll.setText("see all");
		txtSeeAll.setHorizontalAlignment(SwingConstants.LEFT);
		txtSeeAll.setForeground(new Color(76, 42, 211));
		txtSeeAll.setFont(new Font("Century Gothic", Font.PLAIN, 15));
		txtSeeAll.setEditable(false);
		txtSeeAll.setColumns(10);
		txtSeeAll.setBorder(null);
		txtSeeAll.setBackground(SystemColor.menu);
		txtSeeAll.setBounds(287, 555, 117, 20);
		panelNotification.add(txtSeeAll);
		

		panelAnnouncement = new JPanel();
		layeredPane.add(panelAnnouncement, "name_1927307692666700");
		panelAnnouncement.setLayout(null);
		
		lblNewAnnouncement = new JLabel("new Announcement");
		lblNewAnnouncement.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				lblNewAnnouncement.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			}
			
			public void mouseClicked(MouseEvent arg0) {
				Announcement ann = new Announcement();
				ann.setVisible(true);
				ann.setLocationRelativeTo(null);
				setState(Frame.ICONIFIED);
				
				
			}
		});
		lblNewAnnouncement.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewAnnouncement.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		lblNewAnnouncement.setBorder(new LineBorder(new Color(76,42,211)));
		lblNewAnnouncement.setBounds(126, 94, 350, 32);
		panelAnnouncement.add(lblNewAnnouncement);
		
		lblAnnouncement = new JLabel(" new Announcement");
		lblAnnouncement.setHorizontalAlignment(SwingConstants.CENTER);
		lblAnnouncement.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		lblAnnouncement.setBorder(new LineBorder(new Color(76,42,211)));
		lblAnnouncement.setBounds(126, 139, 350, 32);
		panelAnnouncement.add(lblAnnouncement);
		
		lblNewAnnouncement_1 = new JLabel(" new Announcement");
		lblNewAnnouncement_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewAnnouncement_1.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		lblNewAnnouncement_1.setBorder(new LineBorder(new Color(76,42,211)));
		lblNewAnnouncement_1.setBounds(126, 183, 350, 32);
		panelAnnouncement.add(lblNewAnnouncement_1);
		
		lblNewAnnouncement_2 = new JLabel(" new Announcement");
		lblNewAnnouncement_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewAnnouncement_2.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		lblNewAnnouncement_2.setBorder(new LineBorder(new Color(76,42,211)));
		lblNewAnnouncement_2.setBounds(126, 226, 350, 32);
		panelAnnouncement.add(lblNewAnnouncement_2);
		
		lblNewAnnouncement_3 = new JLabel(" new Announcement");
		lblNewAnnouncement_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewAnnouncement_3.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		lblNewAnnouncement_3.setBorder(new LineBorder(new Color(76,42,211)));
		lblNewAnnouncement_3.setBounds(126, 269, 350, 32);
		panelAnnouncement.add(lblNewAnnouncement_3);
		
		lblNewAnnouncement_4 = new JLabel(" new Announcement");
		lblNewAnnouncement_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewAnnouncement_4.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		lblNewAnnouncement_4.setBorder(new LineBorder(new Color(76,42,211)));
		lblNewAnnouncement_4.setBounds(126, 312, 350, 32);
		panelAnnouncement.add(lblNewAnnouncement_4);
		
		lblNewAnnouncement_5 = new JLabel(" new Announcement");
		lblNewAnnouncement_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewAnnouncement_5.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		lblNewAnnouncement_5.setBorder(new LineBorder(new Color(76,42,211)));
		lblNewAnnouncement_5.setBounds(126, 358, 350, 32);
		panelAnnouncement.add(lblNewAnnouncement_5);
		
		lblNewAnnouncement_6 = new JLabel(" new Announcement");
		lblNewAnnouncement_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewAnnouncement_6.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		lblNewAnnouncement_6.setBorder(new LineBorder(new Color(76,42,211)));
		lblNewAnnouncement_6.setBounds(126, 401, 350, 32);
		panelAnnouncement.add(lblNewAnnouncement_6);
		
		lblNewAnnouncement_7 = new JLabel(" new Announcement");
		lblNewAnnouncement_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewAnnouncement_7.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		lblNewAnnouncement_7.setBorder(new LineBorder(new Color(76,42,211)));
		lblNewAnnouncement_7.setBounds(126, 444, 350, 32);
		panelAnnouncement.add(lblNewAnnouncement_7);
		
		lblNewAnnouncement_8 = new JLabel(" new Announcement");
		lblNewAnnouncement_8.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewAnnouncement_8.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		lblNewAnnouncement_8.setBorder(new LineBorder(new Color(76,42,211)));
		lblNewAnnouncement_8.setBounds(126, 487, 350, 32);
		panelAnnouncement.add(lblNewAnnouncement_8);
		
		JTextField txtSeeAl = new JTextField();
		txtSeeAl.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				txtSeeAl.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			}
			@Override
			public void mouseClicked(MouseEvent arg0) {
				EmployeeList list = new EmployeeList();
				list.setVisible(true);
				list.setLocationRelativeTo(null);
				setState(Frame.ICONIFIED);
				
				
			}
		});
		txtSeeAl.setText("see all");
		txtSeeAl.setHorizontalAlignment(SwingConstants.CENTER);
		txtSeeAl.setForeground(new Color(76, 42, 211));
		txtSeeAl.setFont(new Font("Century Gothic", Font.PLAIN, 15));
		txtSeeAl.setEditable(false);
		txtSeeAl.setColumns(10);
		txtSeeAl.setBorder(null);
		txtSeeAl.setBackground(SystemColor.menu);
		txtSeeAl.setBounds(126, 553, 117, 20);
		panelAnnouncement.add(txtSeeAl);
		
		txtNewAnnouncment = new JTextField();
		txtNewAnnouncment.addMouseListener(new MouseAdapter() {
			
			public void mouseEntered(MouseEvent e) {
				txtNewAnnouncment.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				AnnouncementCreation announce = new AnnouncementCreation();
				announce.setVisible(true);
				announce.setLocationRelativeTo(null);
				setState(Frame.ICONIFIED);

			}
		});
		txtNewAnnouncment.setText("add ");
		txtNewAnnouncment.setHorizontalAlignment(SwingConstants.CENTER);
		txtNewAnnouncment.setForeground(new Color(76, 42, 211));
		txtNewAnnouncment.setFont(new Font("Century Gothic", Font.PLAIN, 15));
		txtNewAnnouncment.setEditable(false);
		txtNewAnnouncment.setColumns(10);
		txtNewAnnouncment.setBorder(null);
		txtNewAnnouncment.setBackground(SystemColor.menu);
		txtNewAnnouncment.setBounds(332, 553, 130, 20);
		panelAnnouncement.add(txtNewAnnouncment);
		
		
		panelDepartment = new JPanel();
		layeredPane.add(panelDepartment, "name_1999275103837800");
		panelDepartment.setLayout(null);
		
		scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(76, 230, 423, 201);
		panelDepartment.add(scrollPane_1);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{001, "x"},
				{001, "x"},
				{001, "x"},
				{001, "x"},
				{001, "x"},
				{001, "x"},
				{001, "x"},
				{001, "x"},
				{001, "x"},
				{001, "x"},
				{001, "x"},
			},
			new String[] {
				"Id", "Name"
			}
		));
		scrollPane_1.setViewportView(table);
		
		radioButton = new JRadioButton("Name");
		radioButton.setBounds(194, 147, 71, 23);
		panelDepartment.add(radioButton);
		
		radioButton_2 = new JRadioButton("ID");
		radioButton_2.setBounds(76, 147, 109, 23);
		panelDepartment.add(radioButton_2);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(76, 96, 265, 31);
		panelDepartment.add(textField_9);
		
		label_1 = new JLabel("search");
		label_1.setOpaque(true);
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setForeground(Color.WHITE);
		label_1.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		label_1.setBackground(new Color(76, 42, 211));
		label_1.setBounds(410, 96, 89, 31);
		panelDepartment.add(label_1);
		
		label_2 = new JLabel("search by");
		label_2.setOpaque(true);
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setForeground(Color.WHITE);
		label_2.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		label_2.setBackground(new Color(76, 42, 211));
		label_2.setBounds(410, 141, 89, 31);
		panelDepartment.add(label_2);
		
		lblAddDepartment = new JLabel("add ");
		lblAddDepartment.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				DepartmentEditForm form = new DepartmentEditForm();
				form.setVisible(true);
				form.setLocationRelativeTo(null);
				setState(Frame.ICONIFIED);
				
			}
		});
		lblAddDepartment.setOpaque(true);
		lblAddDepartment.setHorizontalAlignment(SwingConstants.CENTER);
		lblAddDepartment.setForeground(Color.WHITE);
		lblAddDepartment.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		lblAddDepartment.setBackground(new Color(76, 42, 211));
		lblAddDepartment.setBounds(76, 526, 89, 31);
		panelDepartment.add(lblAddDepartment);
		
		label_4 = new JLabel("edit");
		label_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				DepartmentEditForm form = new DepartmentEditForm();
				form.setVisible(true);
				form.setLocationRelativeTo(null);
				setState(Frame.ICONIFIED);
			}
		});
		label_4.setOpaque(true);
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		label_4.setForeground(Color.WHITE);
		label_4.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		label_4.setBackground(new Color(76, 42, 211));
		label_4.setBounds(243, 526, 89, 31);
		panelDepartment.add(label_4);
		
		label_5 = new JLabel("delete");
		label_5.setOpaque(true);
		label_5.setHorizontalAlignment(SwingConstants.CENTER);
		label_5.setForeground(Color.WHITE);
		label_5.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		label_5.setBackground(new Color(76, 42, 211));
		label_5.setBounds(410, 526, 89, 31);
		panelDepartment.add(label_5);
		
		panelWarnings = new JPanel();
		panelWarnings.setLayout(null);
		layeredPane.add(panelWarnings, "name_82798726532400");
		
		lblNewWarning = new JLabel("new Warning");
		lblNewWarning.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				lblNewWarning.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

			}
			public void mouseClicked(MouseEvent arg0) {
				Warning warn = new Warning();
				warn.setVisible(true);
				warn.setLocationRelativeTo(null);
				setState(Frame.ICONIFIED);
				
				
			}
		});
		lblNewWarning.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewWarning.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		lblNewWarning.setBorder(new LineBorder(new Color(76,42,211)));
		lblNewWarning.setBounds(126, 94, 350, 32);
		panelWarnings.add(lblNewWarning);
		
		lblNewWarning_1 = new JLabel("new Warning");
		lblNewWarning_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewWarning_1.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		lblNewWarning_1.setBorder(new LineBorder(new Color(76,42,211)));
		lblNewWarning_1.setBounds(126, 139, 350, 32);
		panelWarnings.add(lblNewWarning_1);
		
		lblNewWarning_2 = new JLabel("new Warning");
		lblNewWarning_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewWarning_2.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		lblNewWarning_2.setBorder(new LineBorder(new Color(76,42,211)));
		lblNewWarning_2.setBounds(126, 183, 350, 32);
		panelWarnings.add(lblNewWarning_2);
		
		lblNewWarning_3 = new JLabel("new Warning");
		lblNewWarning_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewWarning_3.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		lblNewWarning_3.setBorder(new LineBorder(new Color(76,42,211)));
		lblNewWarning_3.setBounds(126, 226, 350, 32);
		panelWarnings.add(lblNewWarning_3);
		
		lblNewWarning_4 = new JLabel("new Warning");
		lblNewWarning_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewWarning_4.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		lblNewWarning_4.setBorder(new LineBorder(new Color(76,42,211)));
		lblNewWarning_4.setBounds(126, 269, 350, 32);
		panelWarnings.add(lblNewWarning_4);
		
		lblNewWarning_5 = new JLabel("new Warning");
		lblNewWarning_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewWarning_5.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		lblNewWarning_5.setBorder(new LineBorder(new Color(76,42,211)));
		lblNewWarning_5.setBounds(126, 312, 350, 32);
		panelWarnings.add(lblNewWarning_5);
		
		lblNewWarning_6 = new JLabel("new Warning");
		lblNewWarning_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewWarning_6.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		lblNewWarning_6.setBorder(new LineBorder(new Color(76,42,211)));
		lblNewWarning_6.setBounds(126, 358, 350, 32);
		panelWarnings.add(lblNewWarning_6);
		
		lblNewWarning_7 = new JLabel("new Warning");
		lblNewWarning_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewWarning_7.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		lblNewWarning_7.setBorder(new LineBorder(new Color(76,42,211)));
		lblNewWarning_7.setBounds(126, 401, 350, 32);
		panelWarnings.add(lblNewWarning_7);
		
		lblNewWarning_8 = new JLabel("new Warning");
		lblNewWarning_8.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewWarning_8.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		lblNewWarning_8.setBorder(new LineBorder(new Color(76,42,211)));
		lblNewWarning_8.setBounds(126, 444, 350, 32);
		panelWarnings.add(lblNewWarning_8);
		
		lblNewWarning_9 = new JLabel("new Warning");
		lblNewWarning_9.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewWarning_9.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		lblNewWarning_9.setBorder(new LineBorder(new Color(76,42,211)));
		lblNewWarning_9.setBounds(126, 487, 350, 32);
		panelWarnings.add(lblNewWarning_9);
		
		textField_10 = new JTextField();
		textField_10.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				textField_10.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			}
			@Override
			public void mouseClicked(MouseEvent arg0) {
				EmployeeList list = new EmployeeList();
				list.setVisible(true);
				list.setLocationRelativeTo(null);
				setState(Frame.ICONIFIED);
				
				
			}
		});
		textField_10.setText("see all");
		textField_10.setHorizontalAlignment(SwingConstants.CENTER);
		textField_10.setForeground(new Color(76, 42, 211));
		textField_10.setFont(new Font("Century Gothic", Font.PLAIN, 15));
		textField_10.setEditable(false);
		textField_10.setColumns(10);
		textField_10.setBorder(null);
		textField_10.setBackground(SystemColor.menu);
		textField_10.setBounds(126, 553, 117, 20);
		panelWarnings.add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				textField_11.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

			}
			public void mouseClicked(MouseEvent arg0) {
				WarningCreation warn = new WarningCreation();
				warn.setVisible(true);
				warn.setLocationRelativeTo(null);
				setState(Frame.ICONIFIED);
				
				
			}
		});
		textField_11.setText("add ");
		textField_11.setHorizontalAlignment(SwingConstants.CENTER);
		textField_11.setForeground(new Color(76, 42, 211));
		textField_11.setFont(new Font("Century Gothic", Font.PLAIN, 15));
		textField_11.setEditable(false);
		textField_11.setColumns(10);
		textField_11.setBorder(null);
		textField_11.setBackground(SystemColor.menu);
		textField_11.setBounds(332, 553, 130, 20);
		panelWarnings.add(textField_11);
	}

	//JLabel preveious;
	
	public void displayPanel(JPanel panel,JLabel label) {
//		if(preveious !=null) {
//			preveious.setBackground(new Color(76,42,211));
//			preveious.setForeground(Color.white);
//		}
		layeredPane.removeAll();
		layeredPane.add(panel);
		layeredPane.repaint();
		layeredPane.revalidate();
//		label.setBackground(Color.white);
//		label.setForeground(new Color(76,42,211));
//		preveious = label;
		
		
		
	}
}
