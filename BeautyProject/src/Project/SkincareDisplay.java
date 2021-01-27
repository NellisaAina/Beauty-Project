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

public class SkincareDisplay {

	private JFrame frame;
	private JTextArea textArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SkincareDisplay window = new SkincareDisplay();
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
	public SkincareDisplay() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(250, 128, 114));
		frame.setBounds(10, 10, 951, 689);
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
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\user\\eclipse-workspace\\Workspace\\BeautyProject\\img\\755525-200.png"));
		lblNewLabel.setBounds(10, 35, 238, 145);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Skincare");
		lblNewLabel_1.setFont(new Font("Script MT Bold", Font.PLAIN, 55));
		lblNewLabel_1.setBounds(221, 53, 243, 116);
		panel.add(lblNewLabel_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(128, 0, 0), 2, true));
		panel_1.setBackground(new Color(255, 228, 225));
		panel_1.setBounds(10, 231, 335, 414);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(new Color(128, 0, 0), 2, true));
		panel_3.setBackground(new Color(255, 228, 225));
		panel_3.setBounds(355, 231, 575, 414);
		frame.getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 555, 392);
		panel_3.add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		textArea.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		textArea.setEditable(false);
		scrollPane.setViewportView(textArea);
		
		JButton btnNewButton_1 = new JButton("Cleansing");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText("-------Cleansing-------"
						+ "\nBrands: \n1) Safi \n2)Loreal \n3) Simple \n4) Himalaya \n5) Biore"
						+ "\n---------------------------"
						+ "\nHow to Use: \nApplying to put your face and wash your face using cleansing."
						+ "\n--------------------------"
						+ "\nWhere to buy: \n1) Watson \n2) Guardian \n3) Farmasi");
			}
		});
		btnNewButton_1.setBackground(new Color(255, 192, 203));
		btnNewButton_1.setFont(new Font("Comic Sans MS", Font.PLAIN, 25));
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\user\\eclipse-workspace\\Workspace\\BeautyProject\\img\\cleansing.png"));
		btnNewButton_1.setBounds(30, 11, 272, 95);
		panel_1.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Moisturing");
		btnNewButton_2.setBackground(new Color(255, 192, 203));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText("-------MOISTURING-------"
						+ "\nBrand: \n1) Safi \n2) Simple \n3) Himalaya \n4) Biore"
						+ "\n---------------------------"
						+ "\nHow to Use: \nThe last step make sure your put the moisturing."
						+ "\n--------------------------"
						+ "\nWhere to buy: \n1) Watson \n2) Guardian \n3) Farmasi");
			}
		});
		btnNewButton_2.setIcon(new ImageIcon("C:\\Users\\user\\eclipse-workspace\\Workspace\\BeautyProject\\img\\moist.png"));
		btnNewButton_2.setFont(new Font("Comic Sans MS", Font.PLAIN, 25));
		btnNewButton_2.setBounds(30, 210, 272, 95);
		panel_1.add(btnNewButton_2);
		
		JButton btnNewButton_2_1 = new JButton("Toner");
		btnNewButton_2_1.setBackground(new Color(255, 192, 203));
		btnNewButton_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText("-------TONER-------"
						+ "\nBrand: \n1) Safi \n2) Simple"
						+ "\n---------------------------"
						+ "\nHow to Use: \nApplying the toner after wash your face."
						+ "\n--------------------------"
						+ "\nWhere to buy: \n1)Watson \n2) Guardian \n3) Farmasi");
			}
		});
		btnNewButton_2_1.setIcon(new ImageIcon("C:\\Users\\user\\eclipse-workspace\\Workspace\\BeautyProject\\img\\toner.png"));
		btnNewButton_2_1.setFont(new Font("Comic Sans MS", Font.PLAIN, 25));
		btnNewButton_2_1.setBounds(30, 111, 272, 95);
		panel_1.add(btnNewButton_2_1);
		
		JButton btnNewButton_2_2 = new JButton("Serum");
		btnNewButton_2_2.setBackground(new Color(255, 192, 203));
		btnNewButton_2_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText("-------SERUM-------"
						+ "\nBrand: \n1) Safi \n2) Loreal \n3) biore"
						+ "\n---------------------------"
						+ "\nHow to Use: \nAfter put the toner make sure put also serum in your face."
						+ "\n--------------------------"
						+ "\nWhere to buy: \n1Watson \n2) Guardian \n3) Farmasi");
			}
		});
		btnNewButton_2_2.setIcon(new ImageIcon("C:\\Users\\user\\eclipse-workspace\\Workspace\\BeautyProject\\img\\serum1.png"));
		btnNewButton_2_2.setFont(new Font("Comic Sans MS", Font.PLAIN, 25));
		btnNewButton_2_2.setBounds(30, 310, 272, 95);
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
				BuyNowSkinCare.main(null);
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
