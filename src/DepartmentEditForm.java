import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Image;
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
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;

public class DepartmentEditForm extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_1;
	private JTextField txtSeeAll;


	public DepartmentEditForm() {
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
		tabbedPane.setBounds(25, 11, 816, 412);
		contentPane.add(tabbedPane);
		
		JPanel panel1 = new JPanel();
		panel1.setBorder(new LineBorder(new Color(255, 255, 255), 3));
		tabbedPane.addTab("General", null, panel1, null);
		panel1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Department ID            :");
		lblNewLabel_1.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(24, 34, 231, 40);
		panel1.add(lblNewLabel_1);
		
		JLabel lblFullnameId = new JLabel("Deaprtment Name      :");
		lblFullnameId.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		lblFullnameId.setBounds(24, 113, 231, 40);
		panel1.add(lblFullnameId);
		
		JLabel lblLastNameId = new JLabel("Manager Name           :");
		lblLastNameId.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		lblLastNameId.setBounds(24, 191, 231, 40);
		panel1.add(lblLastNameId);
		
		JLabel lblDateOfBirth = new JLabel("Date of establishment  :");
		lblDateOfBirth.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		lblDateOfBirth.setBounds(24, 258, 242, 40);
		panel1.add(lblDateOfBirth);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(276, 269, 168, 20);
		panel1.add(dateChooser);
		
		textField = new JTextField();
		textField.setBorder(new LineBorder(new Color(76,42,211)));
		textField.setBounds(276, 48, 168, 20);
		panel1.add(textField);
		textField.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBorder(new LineBorder(new Color(76,42,211)));
		textField_2.setBounds(276, 127, 168, 20);
		panel1.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBorder(new LineBorder(new Color(76,42,211)));
		textField_3.setBounds(276, 205, 168, 20);
		panel1.add(textField_3);
		
		JLabel lblNumberOfEmployees = new JLabel("Number of employees :");
		lblNumberOfEmployees.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		lblNumberOfEmployees.setBounds(24, 309, 284, 40);
		panel1.add(lblNumberOfEmployees);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBorder(new LineBorder(new Color(76,42,211)));
		textField_1.setBounds(276, 323, 168, 20);
		panel1.add(textField_1);
		
		txtSeeAll = new JTextField();
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
		txtSeeAll.setBounds(485, 323, 117, 20);
		panel1.add(txtSeeAll);
		
		JButton btnNewButton = new JButton("save");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
			}
		});
		btnNewButton.setBounds(653, 434, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnCancel = new JButton("cancel");
		btnCancel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
			}
		});
		btnCancel.setBounds(752, 434, 89, 23);
		contentPane.add(btnCancel);
	}
}
