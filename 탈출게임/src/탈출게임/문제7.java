package Ż�����;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.SwingConstants;

public class ����7 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					����7 frame = new ����7();
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
	public ����7() {
		setTitle("����7");
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
		
		JLabel lblNewLabel_1 = new JLabel("Q. \uB8E9\uC148\uBD80\uB974\uD06C\uC758 \uC218\uB3C4\uB294?");
		lblNewLabel_1.setBounds(161, 10, 438, 143);
		lblNewLabel_1.setFont(new Font("����", Font.BOLD, 25));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("\uD655\uC778");
		btnNewButton.setBounds(499, 197, 97, 38);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (textField.getText().equals("����θ�ũ")) {
					JOptionPane.showMessageDialog(null, "�����Դϴ�!");
					dispose();
					new ����8().setVisible(true);
				}
				else {
					JOptionPane.showMessageDialog(null, "Ʋ�Ƚ��ϴ�!!");
				}
					
			}
		});
		btnNewButton.setFont(new Font("����", Font.PLAIN, 15));
		panel.add(btnNewButton);
		
		textField = new JTextField();
		textField.setFont(new Font("����", Font.PLAIN, 18));
		textField.setBounds(237, 197, 250, 38);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBounds(168, 186, 67, 62);
		lblNewLabel_2.setIcon(new ImageIcon("C:\\\uC790\uBC14\uD559\uC2B5\\\uD0C8\uCD9C\uAC8C\uC784\\image\\Key.png"));
		panel.add(lblNewLabel_2);
		
		JButton btnNewButton_1 = new JButton("\uD3EC\uAE30");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null,	"�����ϼ̽��ϴ�.\n��ŷ�� ��ϵǾ����ϴ�.");
				dispose();
				Save.savescore("6");
				new Main().setVisible(true);
			}
		});
		btnNewButton_1.setFont(new Font("����", Font.PLAIN, 15));
		btnNewButton_1.setBounds(499, 245, 97, 38);
		panel.add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(0, 0, 625, 426);
		lblNewLabel.setIcon(new ImageIcon("C:\\\uC790\uBC14\uD559\uC2B5\\\uD0C8\uCD9C\uAC8C\uC784\\image\\1.jpg"));
		panel.add(lblNewLabel);
	}
}