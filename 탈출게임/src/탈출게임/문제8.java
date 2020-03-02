package 탈출게임;

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

public class 문제8 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					문제8 frame = new 문제8();
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
	public 문제8() {
		setTitle("문제8");
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
		
		JLabel lblNewLabel_1 = new JLabel("<html>Q. \uC885\uAD50\uB97C \uAC00\uC9C4 \uC0AC\uB78C\uB4E4\uC774<br> &nbsp;&nbsp;&nbsp;\uAC00\uC7A5 \uC2EB\uC5B4\uD558\uB294  \uBE44\uB294?</html>");
		lblNewLabel_1.setBounds(230, 10, 326, 143);
		lblNewLabel_1.setFont(new Font("굴림", Font.BOLD, 24));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.LEFT);
		panel.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("\uD655\uC778");
		btnNewButton.setBounds(499, 197, 97, 38);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (textField.getText().equals("사이비")) {
					JOptionPane.showMessageDialog(null, "정답입니다!\n문제를 다 풀었습니다!\n자동으로 랭킹에 등록됩니다.");
					Save.savescore("8");
					dispose();
					new Main().setVisible(true);
				}
				else {
					JOptionPane.showMessageDialog(null, "틀렸습니다!!");
				}
					
			}
		});
		btnNewButton.setFont(new Font("굴림", Font.PLAIN, 15));
		panel.add(btnNewButton);
		
		textField = new JTextField();
		textField.setFont(new Font("굴림", Font.PLAIN, 18));
		textField.setBounds(237, 197, 250, 38);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBounds(168, 186, 67, 62);
		lblNewLabel_2.setIcon(new ImageIcon("C:\\\uC790\uBC14\uD559\uC2B5\\\uD0C8\uCD9C\uAC8C\uC784\\image\\Key.png"));
		panel.add(lblNewLabel_2);
		
		JButton btnNewButton_1 = new JButton("\uD3EC\uAE30");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null,	"수고하셨습니다.\n랭킹에 등록되었습니다.");
				dispose();
				Save.savescore("7");
				new Main().setVisible(true);
				
			}
		});
		btnNewButton_1.setFont(new Font("굴림", Font.PLAIN, 15));
		btnNewButton_1.setBounds(499, 245, 97, 38);
		panel.add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(0, 0, 625, 426);
		lblNewLabel.setIcon(new ImageIcon("C:\\\uC790\uBC14\uD559\uC2B5\\\uD0C8\uCD9C\uAC8C\uC784\\image\\1.jpg"));
		panel.add(lblNewLabel);
	}
}