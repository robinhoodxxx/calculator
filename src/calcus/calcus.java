package calcus;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class calcus {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calcus window = new calcus();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public calcus() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 496, 625);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD, 20));
		textField.setBounds(10, 41, 466, 90);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JRadioButton rdbtnNewRadioButtonON = new JRadioButton("on");
		rdbtnNewRadioButtonON.setFont(new Font("Tahoma", Font.PLAIN, 15));
		rdbtnNewRadioButtonON.setBounds(10, 155, 59, 29);
		frame.getContentPane().add(rdbtnNewRadioButtonON);
		
		JRadioButton rdbtnNewRadioButton_OFF = new JRadioButton("off");
		rdbtnNewRadioButton_OFF.setFont(new Font("Tahoma", Font.PLAIN, 15));
		rdbtnNewRadioButton_OFF.setBounds(10, 198, 59, 21);
		frame.getContentPane().add(rdbtnNewRadioButton_OFF);
		
		JButton btnNewButtonBack = new JButton("<--");
		btnNewButtonBack.setFont(new Font("Tahoma", Font.BOLD, 22));
		btnNewButtonBack.setBounds(121, 155, 85, 52);
		frame.getContentPane().add(btnNewButtonBack);
		
		JButton btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 textField.setText("");
			}
		});
		btnC.setFont(new Font("Tahoma", Font.BOLD, 24));
		btnC.setBounds(253, 155, 85, 52);
		frame.getContentPane().add(btnC);
		
		JButton btnNewButton_add = new JButton("+");
		btnNewButton_add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 textField.setText(textField.getText()+"+");
				
			}
		});
		btnNewButton_add.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnNewButton_add.setBounds(391, 155, 85, 52);
		frame.getContentPane().add(btnNewButton_add);
		
		JButton btnNewButton_7 = new JButton("7");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 textField.setText(textField.getText()+"7");
			}
		});
		btnNewButton_7.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnNewButton_7.setBounds(10, 236, 85, 52);
		frame.getContentPane().add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("8");
		btnNewButton_8.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 textField.setText(textField.getText()+"8");
			}
		});
		btnNewButton_8.setBounds(121, 236, 85, 52);
		frame.getContentPane().add(btnNewButton_8);
		
		JButton btnNewButton_9 = new JButton("9");
		btnNewButton_9.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 textField.setText(textField.getText()+"9");
			}
		});
		btnNewButton_9.setBounds(253, 236, 85, 52);
		frame.getContentPane().add(btnNewButton_9);
		
		JButton btnNewButton_sub = new JButton("-");
		btnNewButton_sub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 textField.setText(textField.getText()+"-");
			}
		});
		btnNewButton_sub.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnNewButton_sub.setBounds(391, 236, 85, 52);
		frame.getContentPane().add(btnNewButton_sub);
		
		JButton btnNewButton_4 = new JButton("4");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 textField.setText(textField.getText()+"4");
			}
		});
		btnNewButton_4.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnNewButton_4.setBounds(10, 330, 85, 52);
		frame.getContentPane().add(btnNewButton_4);
		
		JButton btnNewButton_1 = new JButton("1");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			             textField.setText(textField.getText()+"1");
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnNewButton_1.setBounds(10, 424, 85, 52);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_5 = new JButton("5");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 textField.setText(textField.getText()+"5");
			}
		});
		btnNewButton_5.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnNewButton_5.setBounds(121, 330, 85, 52);
		frame.getContentPane().add(btnNewButton_5);
		
		JButton btnNewButton_2 = new JButton("2");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 textField.setText(textField.getText()+"2");
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnNewButton_2.setBounds(121, 424, 85, 52);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_6 = new JButton("6");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 textField.setText(textField.getText()+"6");
			}
		});
		btnNewButton_6.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnNewButton_6.setBounds(253, 330, 85, 52);
		frame.getContentPane().add(btnNewButton_6);
		
		JButton btnNewButton_2_1_6 = new JButton("3");
		btnNewButton_2_1_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 textField.setText(textField.getText()+"3");
			}
		});
		btnNewButton_2_1_6.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnNewButton_2_1_6.setBounds(253, 424, 85, 52);
		frame.getContentPane().add(btnNewButton_2_1_6);
		
		JButton btnNewButton_mult = new JButton("X");
		btnNewButton_mult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 textField.setText(textField.getText()+"*");
			}
		});
		btnNewButton_mult.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnNewButton_mult.setBounds(391, 330, 85, 52);
		frame.getContentPane().add(btnNewButton_mult);
		
		JButton btnNewButton_div = new JButton("/");
		btnNewButton_div.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 textField.setText(textField.getText()+"/");
			}
		});
		btnNewButton_div.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnNewButton_div.setBounds(391, 424, 85, 52);
		frame.getContentPane().add(btnNewButton_div);
		
		JButton btnNewButton_0 = new JButton("0");
		btnNewButton_0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 textField.setText(textField.getText()+"0");
			}
		});
		btnNewButton_0.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnNewButton_0.setBounds(10, 513, 85, 52);
		frame.getContentPane().add(btnNewButton_0);
		
		JButton btnNewButtonpoint = new JButton(".");
		btnNewButtonpoint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 textField.setText(textField.getText()+".");
			}
		});
		btnNewButtonpoint.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnNewButtonpoint.setBounds(121, 513, 85, 52);
		frame.getContentPane().add(btnNewButtonpoint);
		
		JButton btnNewButtonEqual = new JButton("=");
		btnNewButtonEqual.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnNewButtonEqual.setBounds(253, 513, 219, 52);
		frame.getContentPane().add(btnNewButtonEqual);
	}
}
