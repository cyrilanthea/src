package View;

import java.awt.BorderLayout;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Button;

public class MainView extends JFrame{
	public MainView() {
		getContentPane().setBackground(Color.WHITE);
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.GRAY);
		panel.setBounds(0, 0, 481, 578);
		getContentPane().add(panel);
		
		Button button = new Button("Sign in");
		button.setForeground(new Color(255, 255, 255));
		button.setFont(null);
		button.setBackground(new Color(139, 69, 19));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button.setBounds(609, 406, 235, 60);
		getContentPane().add(button);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(609, 226, 235, 34);
		getContentPane().add(textPane);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(609, 247, 180, 13);
		getContentPane().add(separator);
	}
}
