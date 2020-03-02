package ≈ª√‚∞‘¿”;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

public class πÆ¡¶6 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					πÆ¡¶6 frame = new πÆ¡¶6();
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
	public πÆ¡¶6() {
		setTitle("Food");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(641, 464);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 625, 426);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Q. \uCD1D\uC744 \uB300\uCDA9 \uB300\uCDA9 \uC3D8\uAC8C\uB418\uBA74?");
		lblNewLabel_1.setBounds(161, 10, 459, 143);
		lblNewLabel_1.setFont(new Font("±º∏≤", Font.BOLD, 25));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblNewLabel_1);
		
		
		JButton btnNewButton = new JButton("\uD655\uC778");
		btnNewButton.setBounds(499, 197, 97, 38);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField.getText().equals("º≥∑∑≈¡")) {
					JOptionPane.showMessageDialog(null, "¡§¥‰¿‘¥œ¥Ÿ!");
					dispose();
					new πÆ¡¶7().setVisible(true);
				}
				else JOptionPane.showMessageDialog(null, "∆≤∑»Ω¿¥œ¥Ÿ!!");
			}
		});
		btnNewButton.setFont(new Font("±º∏≤", Font.PLAIN, 15));
		panel.add(btnNewButton);
		
		
		textField = new JTextField();
		textField.setBounds(237, 197, 250, 38);
		textField.setFont(new Font("±º∏≤", Font.PLAIN, 18));
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel passkey = new JLabel("");
		passkey.setIcon(new ImageIcon("C:\\\uC790\uBC14\uD559\uC2B5\\\uD0C8\uCD9C\uAC8C\uC784\\image\\Key.png"));
		passkey.setBounds(168, 186, 67, 62);
		panel.add(passkey);
		
		JButton btnNewButton_1 = new JButton("\uD3EC\uAE30");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null,	"ºˆ∞Ì«œºÃΩ¿¥œ¥Ÿ.\n∑©≈∑ø° µÓ∑œµ«æ˙Ω¿¥œ¥Ÿ.");
				dispose();
				Save.savescore("5");
				new Main().setVisible(true);
				
			}
		});
		btnNewButton_1.setFont(new Font("±º∏≤", Font.PLAIN, 15));
		btnNewButton_1.setBounds(499, 245, 97, 38);
		panel.add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(0, 0, 620, 426);
		lblNewLabel.setIcon(new ImageIcon("C:\\\uC790\uBC14\uD559\uC2B5\\\uD0C8\uCD9C\uAC8C\uC784\\image\\1.jpg"));
		panel.add(lblNewLabel);
		
	}
}
