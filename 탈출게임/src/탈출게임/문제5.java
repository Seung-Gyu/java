package 탈출게임;
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

public class 문제5 extends JFrame {
	
	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					문제5 frame = new 문제5();
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
	public 문제5() {
		setTitle("문제5");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(641, 464);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 625, 426);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\\uC790\uBC14\uD559\uC2B5\\\uD0C8\uCD9C\uAC8C\uC784\\image\\Key.png"));
		lblNewLabel_2.setBounds(168, 186, 67, 62);
		panel.add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton(""); //맞으면  다음 프레임으로가게된다!!!!!!!!!!
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, "정답입니다!");
				dispose(); //프레임이 꺼지고 다음 프레임창이 켜짐.
				new 문제6().setVisible(true); //
			}
		});
		btnNewButton.setIcon(new ImageIcon("C:\\\uC790\uBC14\uD559\uC2B5\\\uD0C8\uCD9C\uAC8C\uC784\\image\\yeah.png"));
		btnNewButton.setBounds(299, 172, 100, 100);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "틀렸습니다!\n수고하셨습니다.\n랭킹에 등록되었습니다.");
				dispose();
				Save.savescore("4");
				new Main().setVisible(true);
			}
		});
		btnNewButton_1.setIcon(new ImageIcon("C:\\\uC790\uBC14\uD559\uC2B5\\\uD0C8\uCD9C\uAC8C\uC784\\image\\circle.png"));
		btnNewButton_1.setBounds(423, 172, 100, 100);
		panel.add(btnNewButton_1);
		
		JLabel lblNewLabel_3 = new JLabel("\uC8FC\uC758) \uAE30\uD68C\uB294 \uD55C\uBC88\uC785\uB2C8\uB2E4!");
		lblNewLabel_3.setForeground(Color.RED);
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_3.setBounds(173, 118, 207, 27);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_1 = new JLabel("Q. \uC5F4\uB300 \uC9C0\uBC29\uC5D0 \uC790\uB77C\uB294 \uB098\uBB34\uC5D0\uB294 \uB098\uC774\uD14C\uAC00 \uC5C6\uB2E4.");
		lblNewLabel_1.setFont(new Font("굴림", Font.BOLD, 20));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(161, 10, 459, 143);
		panel.add(lblNewLabel_1);
		

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(0, 0, 620, 426);
		lblNewLabel.setIcon(new ImageIcon("C:\\\uC790\uBC14\uD559\uC2B5\\\uD0C8\uCD9C\uAC8C\uC784\\image\\1.jpg"));
		panel.add(lblNewLabel);
		
	}
}