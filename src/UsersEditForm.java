import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.UIManager;
import javax.swing.JRadioButton;
import java.awt.Choice;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import com.toedter.calendar.JCalendar;
import javax.swing.border.LineBorder;
import com.toedter.calendar.JDateChooser;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class UsersEditForm extends JFrame {

	private JPanel contentPane;
	private JPanel panel3;
	private JTextField textField;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_1;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_19;
	private JTextField textField_20;

	
	
	public UsersEditForm() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 851, 474);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new LineBorder(new Color(76,42,211), 2));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBackground(SystemColor.menu);
		tabbedPane.setBounds(25, 11, 816, 424);
		contentPane.add(tabbedPane);
		
		JPanel panel1 = new JPanel();
		panel1.setBorder(new LineBorder(new Color(255, 255, 255), 3));
		tabbedPane.addTab("Personal Info .", null, panel1, null);
		panel1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("National ID     :");
		lblNewLabel_1.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(24, 34, 168, 40);
		panel1.add(lblNewLabel_1);
		
		JLabel lblFullnameId = new JLabel("First Name      :");
		lblFullnameId.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		lblFullnameId.setBounds(24, 113, 168, 40);
		panel1.add(lblFullnameId);
		
		JLabel lblLastNameId = new JLabel("last Name      :");
		lblLastNameId.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		lblLastNameId.setBounds(24, 191, 168, 40);
		panel1.add(lblLastNameId);
		
		JLabel lblEmployeePhone = new JLabel("Place of birth  :");
		lblEmployeePhone.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		lblEmployeePhone.setBounds(374, 34, 189, 40);
		panel1.add(lblEmployeePhone);
		
		JLabel lblDepartment = new JLabel("Nationality     :");
		lblDepartment.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		lblDepartment.setBounds(24, 272, 168, 40);
		panel1.add(lblDepartment);
		
		JLabel lblGender = new JLabel("Gender           :");
		lblGender.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		lblGender.setBounds(374, 113, 168, 40);
		panel1.add(lblGender);
		
		JComboBox comboBoxGender = new JComboBox();
		comboBoxGender.setModel(new DefaultComboBoxModel(new String[] {"male", "female"}));
		comboBoxGender.setBounds(560, 127, 168, 20);
		panel1.add(comboBoxGender);
		
		JLabel lblPlaceOfBirth = new JLabel("Place of birth  :");
		lblPlaceOfBirth.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		lblPlaceOfBirth.setBounds(374, 191, 189, 40);
		panel1.add(lblPlaceOfBirth);
		
		JLabel lblDateOfBirth = new JLabel("Date of birth   :");
		lblDateOfBirth.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		lblDateOfBirth.setBounds(374, 272, 189, 40);
		panel1.add(lblDateOfBirth);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(560, 286, 178, 20);
		panel1.add(dateChooser);
		
		textField = new JTextField();
		textField.setBorder(new LineBorder(new Color(76,42,211)));
		textField.setBounds(183, 48, 168, 20);
		panel1.add(textField);
		textField.setColumns(10);
		
		 
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBorder(new LineBorder(new Color(76,42,211)));
		textField_2.setBounds(183, 127, 168, 20);
		panel1.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBorder(new LineBorder(new Color(76,42,211)));
		textField_3.setBounds(183, 205, 168, 20);
		panel1.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBorder(new LineBorder(new Color(76,42,211)));
		textField_4.setBounds(183, 286, 168, 20);
		panel1.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBorder(new LineBorder(new Color(76,42,211)));
		textField_5.setBounds(560, 48, 168, 20);
		panel1.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBorder(new LineBorder(new Color(76,42,211)));
		textField_6.setBounds(560, 205, 168, 20);
		panel1.add(textField_6);
		
		JLabel lblUploadPhoto = new JLabel("Photo             :");
		lblUploadPhoto.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		lblUploadPhoto.setBounds(24, 331, 168, 40);
		panel1.add(lblUploadPhoto);
		
		textField_20 = new JTextField();
		textField_20.setColumns(10);
		textField_20.setBorder(new LineBorder(new Color(76,42,211)));
		textField_20.setBounds(183, 345, 168, 20);
		panel1.add(textField_20);
		
		JButton btnUpload = new JButton("upload");
		btnUpload.setBounds(382, 344, 89, 23);
		panel1.add(btnUpload);
		
		JPanel panel2 = new JPanel();
		panel2.setBorder(new LineBorder(new Color(255, 255, 255)));
		tabbedPane.addTab("Work Info.", null, panel2, null);
		panel2.setLayout(null);
		
		JLabel label_1 = new JLabel("Employee ID :");
		label_1.setBounds(32, 44, 136, 26);
		label_1.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		panel2.add(label_1);
		
		JLabel lblWorkPossition = new JLabel("Possition         :");
		lblWorkPossition.setBounds(31, 104, 160, 26);
		lblWorkPossition.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		panel2.add(lblWorkPossition);
		
		JLabel lblLevel = new JLabel("Level             :");
		lblLevel.setBounds(32, 231, 136, 26);
		lblLevel.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		panel2.add(lblLevel);
		
		JLabel lblDepartment_1 = new JLabel("Department  :");
		lblDepartment_1.setBounds(31, 161, 137, 26);
		lblDepartment_1.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		panel2.add(lblDepartment_1);
		
		JLabel lblDateOfHiring = new JLabel("Date of hiring:");
		lblDateOfHiring.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		lblDateOfHiring.setBounds(32, 298, 136, 26);
		panel2.add(lblDateOfHiring);
		
		JDateChooser dateChooser_1 = new JDateChooser();
		dateChooser_1.setBounds(195, 298, 168, 20);
		panel2.add(dateChooser_1);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBorder(new LineBorder(new Color(76,42,211)));
		textField_7.setBounds(195, 51, 168, 20);
		panel2.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBorder(new LineBorder(new Color(76,42,211)));
		textField_8.setBounds(195, 111, 168, 20);
		panel2.add(textField_8);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"A", "B", "C"}));
		comboBox.setBounds(195, 168, 168, 20);
		panel2.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"entry", "junior", "senior"}));
		comboBox_1.setBounds(195, 231, 168, 20);
		panel2.add(comboBox_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new LineBorder(new Color(255, 255, 255)));
		tabbedPane.addTab("Education info.", null, panel_1, null);
		
		JLabel lblMajor = new JLabel("Major                    :");
		lblMajor.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		lblMajor.setBounds(33, 49, 188, 26);
		panel_1.add(lblMajor);
		
		textField_17 = new JTextField();
		textField_17.setColumns(10);
		textField_17.setBorder(new LineBorder(new Color(76,42,211)));
		textField_17.setBounds(234, 56, 168, 20);
		panel_1.add(textField_17);
		
		JLabel lblLevel_1 = new JLabel("Level                     :");
		lblLevel_1.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		lblLevel_1.setBounds(33, 109, 188, 26);
		panel_1.add(lblLevel_1);
		
		JLabel lblUniversity = new JLabel("University               :");
		lblUniversity.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		lblUniversity.setBounds(33, 170, 188, 26);
		panel_1.add(lblUniversity);
		
		JLabel lblGpa = new JLabel("GPA                       :");
		lblGpa.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		lblGpa.setBounds(33, 235, 188, 26);
		panel_1.add(lblGpa);
		
		JLabel lblDateOfGraduation = new JLabel("Date of graduation:");
		lblDateOfGraduation.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		lblDateOfGraduation.setBounds(33, 301, 235, 26);
		panel_1.add(lblDateOfGraduation);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setModel(new DefaultComboBoxModel(new String[] {"Bsc", "Msc"}));
		comboBox_3.setBounds(234, 116, 168, 20);
		panel_1.add(comboBox_3);
		
		JComboBox comboBox_4 = new JComboBox();
		comboBox_4.setModel(new DefaultComboBoxModel(new String[] {"JUST", "JU"}));
		comboBox_4.setBounds(234, 177, 168, 20);
		panel_1.add(comboBox_4);
		
		JComboBox comboBox_5 = new JComboBox();
		comboBox_5.setModel(new DefaultComboBoxModel(new String[] {"fair", "good", "very good", "excellent"}));
		comboBox_5.setBounds(234, 242, 168, 20);
		panel_1.add(comboBox_5);
		
		JDateChooser dateChooser_2 = new JDateChooser();
		dateChooser_2.setBounds(234, 301, 168, 20);
		panel_1.add(dateChooser_2);
		
		panel3 = new JPanel();
		tabbedPane.addTab("Contact Info.", null, panel3, null);
		panel3.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(255, 255, 255)));
		panel.setLayout(null);
		panel.setBounds(0, 0, 811, 424);
		panel3.add(panel);
		
		JLabel lblEmail = new JLabel("Email              :");
		lblEmail.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		lblEmail.setBounds(24, 34, 168, 40);
		panel.add(lblEmail);
		
		JLabel lblPhoneNo = new JLabel("Phone No.      :");
		lblPhoneNo.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		lblPhoneNo.setBounds(24, 113, 168, 40);
		panel.add(lblPhoneNo);
		
		JLabel lblMobile = new JLabel("Mobile            :");
		lblMobile.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		lblMobile.setBounds(24, 191, 168, 40);
		panel.add(lblMobile);
		
		JLabel lblMobile_1 = new JLabel("Mobile            :");
		lblMobile_1.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		lblMobile_1.setBounds(24, 272, 168, 40);
		panel.add(lblMobile_1);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBorder(new LineBorder(new Color(76,42,211)));
		textField_9.setBounds(196, 48, 168, 20);
		panel.add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBorder(new LineBorder(new Color(76,42,211)));
		textField_10.setBounds(196, 127, 168, 20);
		panel.add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBorder(new LineBorder(new Color(76,42,211)));
		textField_11.setBounds(196, 205, 168, 20);
		panel.add(textField_11);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBorder(new LineBorder(new Color(76,42,211)));
		textField_12.setBounds(196, 286, 168, 20);
		panel.add(textField_12);
		
		JPanel panel4 = new JPanel();
		panel4.setBorder(new LineBorder(new Color(255, 255, 255)));
		tabbedPane.addTab("salary", null, panel4, null);
		panel4.setLayout(null);
		
		JLabel lblEmployeeSalary = new JLabel("Primary salary   :");
		lblEmployeeSalary.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		lblEmployeeSalary.setBounds(33, 49, 188, 26);
		panel4.add(lblEmployeeSalary);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBorder(new LineBorder(new Color(76,42,211)));
		textField_1.setBounds(234, 56, 168, 20);
		panel4.add(textField_1);
		
		JLabel lblBonus = new JLabel("Bonus                :");
		lblBonus.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		lblBonus.setBounds(33, 109, 188, 26);
		panel4.add(lblBonus);
		
		textField_13 = new JTextField();
		textField_13.setColumns(10);
		textField_13.setBorder(new LineBorder(new Color(76,42,211)));
		textField_13.setBounds(234, 116, 168, 20);
		panel4.add(textField_13);
		
		JLabel lblDeduction = new JLabel("Deduction         :");
		lblDeduction.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		lblDeduction.setBounds(33, 170, 188, 26);
		panel4.add(lblDeduction);
		
		textField_14 = new JTextField();
		textField_14.setColumns(10);
		textField_14.setBorder(new LineBorder(new Color(76,42,211)));
		textField_14.setBounds(234, 177, 168, 20);
		panel4.add(textField_14);
		
		JLabel lblOverTime = new JLabel("Over time         :");
		lblOverTime.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		lblOverTime.setBounds(33, 235, 188, 26);
		panel4.add(lblOverTime);
		
		textField_15 = new JTextField();
		textField_15.setColumns(10);
		textField_15.setBorder(new LineBorder(new Color(76,42,211)));
		textField_15.setBounds(234, 242, 168, 20);
		panel4.add(textField_15);
		
		JLabel lblTotalSalary = new JLabel("Total salary       :");
		lblTotalSalary.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		lblTotalSalary.setBounds(33, 301, 188, 26);
		panel4.add(lblTotalSalary);
		
		textField_16 = new JTextField();
		textField_16.setColumns(10);
		textField_16.setBorder(new LineBorder(new Color(76,42,211)));
		textField_16.setBounds(234, 308, 168, 20);
		panel4.add(textField_16);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14"}));
		comboBox_2.setBounds(440, 242, 37, 20);
		panel4.add(comboBox_2);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("A");
		chckbxNewCheckBox.setBounds(433, 115, 97, 23);
		panel4.add(chckbxNewCheckBox);
		
		JCheckBox chckbxB = new JCheckBox("B");
		chckbxB.setBounds(554, 115, 97, 23);
		panel4.add(chckbxB);
		
		JCheckBox chckbxC = new JCheckBox("C");
		chckbxC.setBounds(677, 115, 97, 23);
		panel4.add(chckbxC);
		
		JCheckBox chckbxA = new JCheckBox("A");
		chckbxA.setBounds(433, 176, 97, 23);
		panel4.add(chckbxA);
		
		JCheckBox chckbxB_1 = new JCheckBox("B");
		chckbxB_1.setBounds(554, 176, 97, 23);
		panel4.add(chckbxB_1);
		
		JCheckBox chckbxC_1 = new JCheckBox("C");
		chckbxC_1.setBounds(677, 176, 97, 23);
		panel4.add(chckbxC_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBorder(new LineBorder(new Color(255, 255, 255)));
		tabbedPane.addTab("Attendence", null, panel_2, null);
		
		JLabel lblAnnualLeaves = new JLabel("Annual leaves   :");
		lblAnnualLeaves.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		lblAnnualLeaves.setBounds(33, 49, 188, 26);
		panel_2.add(lblAnnualLeaves);
		
		textField_18 = new JTextField();
		textField_18.setColumns(10);
		textField_18.setBorder(new LineBorder(new Color(76,42,211)));
		textField_18.setBounds(234, 56, 168, 20);
		panel_2.add(textField_18);
		
		JLabel lblSickLeaves = new JLabel("Sick leaves         :");
		lblSickLeaves.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		lblSickLeaves.setBounds(33, 109, 188, 26);
		panel_2.add(lblSickLeaves);
		
		textField_19 = new JTextField();
		textField_19.setColumns(10);
		textField_19.setBorder(new LineBorder(new Color(76,42,211)));
		textField_19.setBounds(234, 116, 168, 20);
		panel_2.add(textField_19);
		
		JButton btnNewButton_1 = new JButton("add");
		btnNewButton_1.setBounds(449, 55, 67, 23);
		panel_2.add(btnNewButton_1);
		
		JButton btnAdd = new JButton("add");
		btnAdd.setBounds(449, 115, 67, 23);
		panel_2.add(btnAdd);
		
		JButton btnNewButton = new JButton("save");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
			}
		});
		btnNewButton.setBounds(653, 446, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnCancel = new JButton("cancel");
		btnCancel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
			}
		});
		btnCancel.setBounds(752, 446, 89, 23);
		contentPane.add(btnCancel);
	}
	
	public  void setTextfield (String s) {
		textField.setText(s);
	}
}
