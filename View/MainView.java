package View;

import java.awt.BorderLayout;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Button;
import java.awt.Font;

public class MainView extends JFrame{
	private JTextField textField;
	private JTextField textField_2;
	private JTextField textField_1;
	private JTextField textField_3;
	private JLabel lblEmail;
	private JLabel lblPassword;
	private JLabel lblRepeatPassword;
	public MainView() {
		getContentPane().setBackground(Color.WHITE);
		getContentPane().setLayout(null);

		JPanel panel = new JPanel();
		panel.setBackground(Color.GRAY);
		panel.setBounds(0, 0, 481, 578);
		getContentPane().add(panel);

		JLabel lblNewLabel = new JLabel("Username");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(598, 71, 86, 30);
		getContentPane().add(lblNewLabel);

		textField = new JTextField();
		textField.setBounds(598, 112, 251, 30);
		getContentPane().add(textField);
		textField.setColumns(10);

		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(598, 270, 251, 30);
		getContentPane().add(textField_2);

		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(598, 193, 251, 30);
		getContentPane().add(textField_1);

		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(598, 352, 251, 30);
		getContentPane().add(textField_3);
		
		lblEmail = new JLabel("Email");
		lblEmail.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblEmail.setBounds(598, 159, 86, 30);
		getContentPane().add(lblEmail);

		lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblPassword.setBounds(598, 234, 86, 30);
		getContentPane().add(lblPassword);

		lblRepeatPassword = new JLabel("Repeat Password");
		lblRepeatPassword.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblRepeatPassword.setBounds(598, 311, 147, 30);
		getContentPane().add(lblRepeatPassword);

		JButton btnNewButton = new JButton("Sign In");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setBackground(new Color(0, 0, 128));
		btnNewButton.setBounds(657, 432, 147, 30);
		getContentPane().add(btnNewButton);
	}
}
