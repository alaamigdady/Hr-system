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

public class SalaryDetails extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;


	public SalaryDetails() {
		setResizable(false);
		setUndecorated(true);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 350,450);
		contentPane = new JPanel();
		contentPane.setBorder(new LineBorder(new Color(76, 42, 211)));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("Primary salary   :");
		label.setFont(new Font("Century Gothic", Font.PLAIN, 15));
		label.setBounds(10, 99, 188, 26);
		contentPane.add(label);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setColumns(10);
		textField.setBorder(new LineBorder(new Color(76,42,211)));
		textField.setBounds(149, 105, 168, 20);
		contentPane.add(textField);
		
		JLabel label_1 = new JLabel("Bonus                :");
		label_1.setFont(new Font("Century Gothic", Font.PLAIN, 15));
		label_1.setBounds(10, 159, 188, 26);
		contentPane.add(label_1);
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setColumns(10);
		textField_1.setBorder(new LineBorder(new Color(76,42,211)));
		textField_1.setBounds(149, 165, 168, 20);
		contentPane.add(textField_1);
		
		JLabel label_2 = new JLabel("Deduction         :");
		label_2.setFont(new Font("Century Gothic", Font.PLAIN, 15));
		label_2.setBounds(10, 220, 188, 26);
		contentPane.add(label_2);
		
		textField_2 = new JTextField();
		textField_2.setEditable(false);
		textField_2.setColumns(10);
		textField_2.setBorder(new LineBorder(new Color(76,42,211)));
		textField_2.setBounds(149, 226, 168, 20);
		contentPane.add(textField_2);
		
		JLabel label_3 = new JLabel("Over time         :");
		label_3.setFont(new Font("Century Gothic", Font.PLAIN, 15));
		label_3.setBounds(10, 285, 188, 26);
		contentPane.add(label_3);
		
		textField_3 = new JTextField();
		textField_3.setEditable(false);
		textField_3.setColumns(10);
		textField_3.setBorder(new LineBorder(new Color(76,42,211)));
		textField_3.setBounds(149, 291, 168, 20);
		contentPane.add(textField_3);
		
		JLabel label_4 = new JLabel("Total salary       :");
		label_4.setFont(new Font("Century Gothic", Font.PLAIN, 15));
		label_4.setBounds(10, 351, 188, 26);
		contentPane.add(label_4);
		
		textField_4 = new JTextField();
		textField_4.setEditable(false);
		textField_4.setColumns(10);
		textField_4.setBorder(new LineBorder(new Color(76,42,211)));
		textField_4.setBounds(149, 357, 168, 20);
		contentPane.add(textField_4);
		
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
		btnNewButton.setBounds(109, 416, 89, 23);
		contentPane.add(btnNewButton);
	}
}
