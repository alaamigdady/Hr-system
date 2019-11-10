import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class AttendDetails extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;


	public AttendDetails() {
		setResizable(false);
		setUndecorated(true);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 350,250);
		contentPane = new JPanel();
		contentPane.setBorder(new LineBorder(new Color(76, 42, 211)));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblAnnualLeaves = new JLabel("Annual leaves  :");
		lblAnnualLeaves.setFont(new Font("Century Gothic", Font.PLAIN, 15));
		lblAnnualLeaves.setBounds(10, 99, 188, 26);
		contentPane.add(lblAnnualLeaves);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setColumns(10);
		textField.setBorder(new LineBorder(new Color(76,42,211)));
		textField.setBounds(149, 105, 168, 20);
		contentPane.add(textField);
		
		JLabel lblSickLeaves = new JLabel("Sick leaves        :");
		lblSickLeaves.setFont(new Font("Century Gothic", Font.PLAIN, 15));
		lblSickLeaves.setBounds(10, 159, 188, 26);
		contentPane.add(lblSickLeaves);
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setColumns(10);
		textField_1.setBorder(new LineBorder(new Color(76,42,211)));
		textField_1.setBounds(149, 165, 168, 20);
		contentPane.add(textField_1);
		
		JLabel lblMonth = new JLabel("Month               :");
		lblMonth.setFont(new Font("Century Gothic", Font.PLAIN, 15));
		lblMonth.setBounds(10, 33, 188, 26);
		contentPane.add(lblMonth);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBorder(new LineBorder(new Color (76,42,211)));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Jan", "Feb", "March", "April", "May", "Jun", "July", "Aug", "Sep", "Oct", "Nov", "Dec"}));
		comboBox.setBounds(149, 38, 168, 20);
		contentPane.add(comboBox);
		
		JButton btnNewButton = new JButton("OK");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				dispose();
			}
		});
		btnNewButton.setBounds(109, 216, 89, 23);
		contentPane.add(btnNewButton);
	}
}
