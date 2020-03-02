package ≈ª√‚∞‘¿”;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;

public class Ω√¿€ extends JFrame {

	private JPanel contentPane;
	private JTextField nick;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ω√¿€ frame = new Ω√¿€();
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
	public Ω√¿€() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(314, 400);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 304, 361);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("\uB2C9\uB124\uC784");
		lblNewLabel_1.setFont(new Font("±º∏≤", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(22, 101, 75, 31);
		panel.add(lblNewLabel_1);
		
		nick = new JTextField();
		nick.setBorder(new LineBorder(Color.BLACK));
		nick.setBounds(109, 106, 116, 21);
		panel.add(nick);
		nick.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("\uC0DD\uB144\uC6D4\uC77C");
		lblNewLabel.setFont(new Font("±º∏≤", Font.PLAIN, 14));
		lblNewLabel.setBounds(22, 142, 75, 31);
		panel.add(lblNewLabel);
		
		JTextField birth = new JTextField();
		birth.setBorder(new LineBorder(new Color(0, 0, 0)));
		birth.setBounds(109, 146, 116, 21);
		panel.add(birth);
		
		JLabel lblNewLabel_2 = new JLabel("Login");
		lblNewLabel_2.setForeground(Color.BLUE);
		lblNewLabel_2.setFont(new Font("±º∏≤", Font.BOLD, 25));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(22, 13, 249, 45);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("\uC131\uBCC4");
		lblNewLabel_3.setFont(new Font("±º∏≤", Font.PLAIN, 14));
		lblNewLabel_3.setBounds(22, 183, 75, 31);
		panel.add(lblNewLabel_3);
		
		String [] combo = {"≥≤º∫", "ø©º∫"};
		JComboBox gender = new JComboBox(combo);
		gender.setFont(new Font("±º∏≤", Font.PLAIN, 12));
		gender.setBounds(109, 186, 116, 25);
		panel.add(gender);

		JButton btnNewButton = new JButton("\uC2DC\uC791");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Save.delete();
				dispose();
				String nicktxt = nick.getText();
				String birthtxt = birth.getText();
				String gendertxt = gender.getSelectedItem().toString();
				Save.save(nicktxt, birthtxt, gendertxt);
				new πÆ¡¶1().setVisible(true);
			}
		});
		btnNewButton.setBounds(179, 299, 97, 31);
		panel.add(btnNewButton);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon("C:\\\uC790\uBC14\uD559\uC2B5\\\uD0C8\uCD9C\uAC8C\uC784\\image\\33.jpg"));
		lblNewLabel_4.setBounds(0, 0, 304, 361);
		panel.add(lblNewLabel_4);

		
	}
}
