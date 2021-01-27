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

public class spaSalonDisplay {

	private JFrame frame;
	private JTextArea textArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					spaSalonDisplay window = new spaSalonDisplay();
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
	public spaSalonDisplay() {
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
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\user\\eclipse-workspace\\Workspace\\BeautyProject\\img\\1335654-200.png"));
		lblNewLabel.setBounds(10, 11, 181, 187);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Spa & Salon");
		lblNewLabel_1.setFont(new Font("Script MT Bold", Font.PLAIN, 55));
		lblNewLabel_1.setBounds(172, 67, 302, 116);
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
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		textArea_1.setEditable(false);
		scrollPane.setViewportView(textArea_1);
		
		JButton btnNewButton_1 = new JButton("MASSAGE");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea_1.setText("-------MASSAGE-------"
						+ "\nType of Treatment: \n1) Swedish Massage Therapy \n2) Aromatherapy Massage \n3) Hot Stone Massage \n4) Reflexology \n5) Sport Massage \n"
						+ "\n---------------------------"
						+ "\nType of Package: \n1) Express Medi Pedi + Spa Facial + Shoulder And Foot Massage \n2) Manicure Pedicure/Full Body Massage + Facial \n3) Full Body Massage + Facial + Mani Pedi \n");
			}
		});
		btnNewButton_1.setBackground(new Color(255, 192, 203));
		btnNewButton_1.setFont(new Font("Comic Sans MS", Font.PLAIN, 25));
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\user\\eclipse-workspace\\Workspace\\BeautyProject\\img\\89201.png"));
		btnNewButton_1.setBounds(10, 11, 315, 85);
		panel_1.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("MANI & PEDI");
		btnNewButton_2.setForeground(new Color(0, 0, 0));
		btnNewButton_2.setBackground(new Color(255, 192, 203));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea_1.setText("-------MANICURE PEDICURE-------"
						+ "\nType of Treatment: \n1) Regular Mani And Pedi \n2) French Manicure/Pedicure \n3) Nail Spa \n4) Parafin \n5) Stone Manicure And Pedicure \n"
						+ "\n---------------------------"
						+ "\nType of Package: \n1) Express Medi Pedi + Spa Facial + Shoulder And Foot Massage \n2) Manicure Pedicure/Full Body Massage + Facial \n3)  Full Body Massage + Facial + Mani Pedi \\n");
			}
		});
		btnNewButton_2.setIcon(new ImageIcon("C:\\Users\\user\\eclipse-workspace\\Workspace\\BeautyProject\\img\\mani pedi.png"));
		btnNewButton_2.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		btnNewButton_2.setBounds(10, 203, 315, 85);
		panel_1.add(btnNewButton_2);
		
		JButton btnNewButton_2_1 = new JButton("FACIAL");
		btnNewButton_2_1.setBackground(new Color(255, 192, 203));
		btnNewButton_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea_1.setText("-------FACIAL-------"
						+ "\nType of Treatment: \n1) Sheet Masks \n2) Clay \n3) Cream Masks \n4) Gel Masks \n5) Charcoal Masks \n"
						+ "\n---------------------------"
						+ "\nType of Package: \n1) Express Medi Pedi + Spa Facial + Shoulder And Foot Massage \n2)Scalp Treatment For Hair Loss & Spa Facial \n3) Manicure Pedicure/Full Body Massage + Facial \n4) Full Body Massage + Facial + Mani Pedi \n");
			}
		});
		btnNewButton_2_1.setIcon(new ImageIcon("C:\\Users\\user\\eclipse-workspace\\Workspace\\BeautyProject\\img\\faicial.png"));
		btnNewButton_2_1.setFont(new Font("Comic Sans MS", Font.PLAIN, 25));
		btnNewButton_2_1.setBounds(10, 107, 315, 85);
		panel_1.add(btnNewButton_2_1);
		
		JButton btnNewButton_2_2 = new JButton("HAIR");
		btnNewButton_2_2.setBackground(new Color(255, 192, 203));
		btnNewButton_2_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea_1.setText("-------HAIR-------"
						+ "\nType of Treatment: \n1) Cutting \n2) Colouring \n3) Rebonding \n4) Stylist \n5) Washing \n"
						+ "\n---------------------------"
						+ "\nType of Package: \n1) Express Medi Pedi + Spa Facial + Shoulder And Foot Massage \n2)Scalp Treatment For Hair Loss & Spa Facial \n3) Manicure Pedicure/Full Body Massage + Facial \n4) Hair Treatment + Hair Cut \n5) Full Body Massage + Facial + Mani Pedi \n");
			}
		});
		btnNewButton_2_2.setIcon(new ImageIcon("C:\\Users\\user\\eclipse-workspace\\Workspace\\BeautyProject\\img\\hair.png"));
		btnNewButton_2_2.setFont(new Font("Comic Sans MS", Font.PLAIN, 25));
		btnNewButton_2_2.setBounds(10, 299, 315, 85);
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
				BuyNowSpaSalon.main(null);
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
