package Project;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class MakeupDisplay {

	private JFrame frame;
	private JTextArea textArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MakeupDisplay window = new MakeupDisplay();
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
	public MakeupDisplay() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(250, 128, 114));
		frame.setBounds(10, 10, 951, 682);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(128, 0, 0), 2, true));
		panel.setBackground(new Color(255, 228, 225));
		panel.setBounds(10, 11, 474, 209);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\user\\eclipse-workspace\\Workspace\\BeautyProject\\img\\1024529.png"));
		lblNewLabel.setBounds(10, 35, 238, 145);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Makeup");
		lblNewLabel_1.setFont(new Font("Script MT Bold", Font.PLAIN, 55));
		lblNewLabel_1.setBounds(221, 53, 243, 116);
		panel.add(lblNewLabel_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(128, 0, 0), 2, true));
		panel_1.setBackground(new Color(255, 228, 225));
		panel_1.setBounds(10, 231, 335, 401);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(new Color(128, 0, 0), 2, true));
		panel_3.setBackground(new Color(255, 228, 225));
		panel_3.setBounds(355, 231, 575, 401);
		frame.getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 555, 379);
		panel_3.add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		textArea.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		textArea.setEditable(false);
		scrollPane.setViewportView(textArea);
		
		JButton btnNewButton_1 = new JButton("LIPSTICK");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText("-------LIPSTICK-------"
						+ "\nBrand: \n1) Fenty Beauty \n2) Maybelline \n3) MAC \n4) Revlon\n"
						+ "\n---------------------------"
						+ "\nHow to Use: \nApply thinly on your lip."
						+ "\n--------------------------"
						+ "\nWhere to buy: \n1) Midvalley \n2) AEON Shah Alam");
			}
		});
		btnNewButton_1.setBackground(new Color(255, 192, 203));
		btnNewButton_1.setFont(new Font("Comic Sans MS", Font.PLAIN, 25));
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\user\\eclipse-workspace\\Workspace\\BeautyProject\\img\\lipstick-icon.png"));
		btnNewButton_1.setBounds(30, 11, 272, 85);
		panel_1.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("MASCARA");
		btnNewButton_2.setBackground(new Color(255, 192, 203));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText("-------MASCARA-------"
						+ "\nBrand: \n1) Fenty Beauty \n2) Maybelline \n3) MAC \n4) Revlon"
						+ "\n---------------------------"
						+ "\nHow to Use: \nPull the mascara upward towards the tip of your eyelashes."
						+ "\n--------------------------"
						+ "\nWhere to buy: \n1) Midvalley \n2) AEON Shah Alam");
			}
		});
		btnNewButton_2.setIcon(new ImageIcon("C:\\Users\\user\\eclipse-workspace\\Workspace\\BeautyProject\\img\\08-mascara-icon.png"));
		btnNewButton_2.setFont(new Font("Comic Sans MS", Font.PLAIN, 25));
		btnNewButton_2.setBounds(30, 203, 272, 85);
		panel_1.add(btnNewButton_2);
		
		JButton btnNewButton_2_1 = new JButton("EYESHADOW");
		btnNewButton_2_1.setBackground(new Color(255, 192, 203));
		btnNewButton_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText("-------EYESHADOW-------"
						+ "\nBrand: \n1) Fenty Beauty \n2) Maybelline \n3) MAC \n4) Revlon"
						+ "\n---------------------------"
						+ "\nHow to Use: \nApply the eyeshadow on top of your eyelid."
						+ "\n--------------------------"
						+ "\nWhere to buy: \n1) Midvalley \n2) AEON Shah Alam");
			}
		});
		btnNewButton_2_1.setIcon(new ImageIcon("C:\\Users\\user\\eclipse-workspace\\Workspace\\BeautyProject\\img\\Makeup-icon.png"));
		btnNewButton_2_1.setFont(new Font("Comic Sans MS", Font.PLAIN, 25));
		btnNewButton_2_1.setBounds(30, 107, 272, 85);
		panel_1.add(btnNewButton_2_1);
		
		JButton btnNewButton_2_2 = new JButton("BLUSHER");
		btnNewButton_2_2.setBackground(new Color(255, 192, 203));
		btnNewButton_2_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText("-------BLUSHER-------"
						+ "\nBrand: \n1) Fenty Beauty \n2) Maybelline \n3) MAC \n4) Revlon"
						+ "\n---------------------------"
						+ "\nHow to Use: \nApply the blusher on top of your cheekbone."
						+ "\n--------------------------"
						+ "\nWhere to buy: \n1) Midvalley \n2) AEON Shah Alam");
			}
		});
		btnNewButton_2_2.setIcon(new ImageIcon("C:\\Users\\user\\eclipse-workspace\\Workspace\\BeautyProject\\img\\blusher.png"));
		btnNewButton_2_2.setFont(new Font("Comic Sans MS", Font.PLAIN, 25));
		btnNewButton_2_2.setBounds(30, 299, 272, 85);
		panel_1.add(btnNewButton_2_2);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(128, 0, 0), 2, true));
		panel_2.setBackground(new Color(255, 228, 225));
		panel_2.setBounds(494, 11, 436, 209);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JButton btnNewButton_3 = new JButton("BUY NOW");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BuyNowMakeup.main(null);
			}
		});
		btnNewButton_3.setBackground(new Color(255, 192, 203));
		btnNewButton_3.setBounds(43, 11, 360, 85);
		panel_2.add(btnNewButton_3);
		btnNewButton_3.setFont(new Font("Comic Sans MS", Font.PLAIN, 25));
		btnNewButton_3.setIcon(new ImageIcon("C:\\Users\\user\\eclipse-workspace\\Workspace\\BeautyProject\\img\\shopping-icon.png"));
		
		JButton btnNewButton = new JButton("RETURN TO MENU");
		btnNewButton.setBounds(43, 107, 360, 91);
		panel_2.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Menu.main(null);
			}
		});
		btnNewButton.setBackground(new Color(255, 192, 203));
		btnNewButton.setFont(new Font("Comic Sans MS", Font.PLAIN, 25));
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\user\\eclipse-workspace\\Workspace\\BeautyProject\\img\\Back-2-2-icon (1).png"));
		
		
	}
}
