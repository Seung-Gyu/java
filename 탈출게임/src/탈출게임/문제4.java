package Å»Ãâ°ÔÀÓ;

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

public class ¹®Á¦4 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					¹®Á¦4 frame = new ¹®Á¦4();
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
	public ¹®Á¦4() {
		setTitle("Plus");
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
		
		JButton btnNewButton = new JButton("\uD655\uC778");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(textField.getText().equals("22")) { // Á¤´ä ÀÚ¸®¿¡ Á¤´ä »õ·Î ³Ö±â
					JOptionPane.showMessageDialog(null, "Á¤´äÀÔ´Ï´Ù!");
					dispose();
					new ¹®Á¦5().setVisible(true);
				}
				else JOptionPane.showMessageDialog(null, "Æ²·È½À´Ï´Ù!!");
			}
		});
		
		JLabel lblNewLabel_3_1_2 = new JLabel("4 + 4 = ??");
		lblNewLabel_3_1_2.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 20));
		lblNewLabel_3_1_2.setBounds(188, 110, 162, 28);
		panel.add(lblNewLabel_3_1_2);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("6 + 3 = 21");
		lblNewLabel_3_1_1.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 20));
		lblNewLabel_3_1_1.setBounds(188, 80, 162, 28);
		panel.add(lblNewLabel_3_1_1);
		
		JLabel lblNewLabel_3_1 = new JLabel("5 + 1 = 5");
		lblNewLabel_3_1.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 20));
		lblNewLabel_3_1.setBounds(188, 51, 162, 28);
		panel.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_3 = new JLabel("3 + 2 = 7");
		lblNewLabel_3.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 20));
		lblNewLabel_3.setBounds(188, 22, 162, 28);
		panel.add(lblNewLabel_3);
		btnNewButton.setFont(new Font("±¼¸²", Font.PLAIN, 15));
		btnNewButton.setBounds(499, 197, 97, 38);
		panel.add(btnNewButton);
		
		textField = new JTextField();
		textField.setFont(new Font("±¼¸²", Font.PLAIN, 18));
		textField.setBounds(237, 197, 250, 38);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\\uC790\uBC14\uD559\uC2B5\\\uD0C8\uCD9C\uAC8C\uC784\\image\\Key.png"));
		lblNewLabel_2.setBounds(168, 186, 67, 62);
		panel.add(lblNewLabel_2);
		
		JButton btnNewButton_1 = new JButton("\uD3EC\uAE30");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null,	"¼ö°íÇÏ¼Ì½À´Ï´Ù.\n·©Å·¿¡ µî·ÏµÇ¾ú½À´Ï´Ù.");
				dispose();
				Save.savescore("3");
				new Main().setVisible(true);

			}
		});
		btnNewButton_1.setFont(new Font("±¼¸²", Font.PLAIN, 15));
		btnNewButton_1.setBounds(499, 245, 97, 38);
		panel.add(btnNewButton_1);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon("C:\\\uC790\uBC14\uD559\uC2B5\\\uD0C8\uCD9C\uAC8C\uC784\\image\\22.png"));
		lblNewLabel_4.setBounds(445, 25, 113, 109);
		panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(161, 10, 459, 143);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\\uC790\uBC14\uD559\uC2B5\\\uD0C8\uCD9C\uAC8C\uC784\\image\\1.jpg"));
		lblNewLabel.setBounds(0, 0, 620, 426);
		panel.add(lblNewLabel);
	}
}
