package Project;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.border.LineBorder;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;

public class BuyNowMakeup {

	private JFrame frame;
	private JTextField textField_name;
	private JTextField textField_phone;
	private JTextField textField_email;
	private JTextField textField_address;
	private JTextField jtxtTotal;
	private JTextField textField_ML;
	private JTextField textField_ME;
	private JTextField textField_MM;
	private JTextField textField_MB;
	private JTextField textField_MBL;
	private JTextField textField_MBE;
	private JTextField textField_MBM;
	private JTextField textField_MBB;
	private JTextField textField_FL;
	private JTextField textField_FE;
	private JTextField textField_FM;
	private JTextField textField_FB;
	private JTextField textField_RL;
	private JTextField textField_RE;
	private JTextField textField_RM;
	private JTextField textField_RB;
	private JTextArea jtxtReceipt_;
	
	String iTotal;
	int [] itemcost = new int[19];

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BuyNowMakeup window = new BuyNowMakeup();
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
	public BuyNowMakeup() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(250, 128, 114));
		frame.setBounds(10, 10, 1360, 716);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(128, 0, 0), 2, true));
		panel.setBackground(new Color(255, 228, 225));
		panel.setBounds(10, 11, 425, 149);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\user\\Pictures\\shopping-bag-full.png"));
		lblNewLabel.setBounds(25, 11, 192, 127);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Buy Now");
		lblNewLabel_1.setFont(new Font("Script MT Bold", Font.PLAIN, 40));
		lblNewLabel_1.setBounds(166, 28, 236, 91);
		panel.add(lblNewLabel_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(128, 0, 0), 2, true));
		panel_1.setBackground(new Color(255, 228, 225));
		panel_1.setBounds(10, 171, 425, 263);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Full Name :");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNewLabel_2.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(56, 10, 114, 35);
		panel_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Phone Number :");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNewLabel_3.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		lblNewLabel_3.setBounds(10, 56, 160, 35);
		panel_1.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Email :");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNewLabel_4.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		lblNewLabel_4.setBounds(20, 102, 150, 35);
		panel_1.add(lblNewLabel_4);
		
		textField_name = new JTextField();
		textField_name.setBounds(180, 14, 232, 35);
		panel_1.add(textField_name);
		textField_name.setColumns(10);
		
		textField_phone = new JTextField();
		textField_phone.setBounds(180, 60, 232, 35);
		panel_1.add(textField_phone);
		textField_phone.setColumns(10);
		
		textField_email = new JTextField();
		textField_email.setBounds(180, 106, 232, 35);
		panel_1.add(textField_email);
		textField_email.setColumns(10);
		
		textField_address = new JTextField();
		textField_address.setBounds(180, 152, 232, 35);
		panel_1.add(textField_address);
		textField_address.setColumns(10);
		
		JComboBox comboBox_location = new JComboBox();
		comboBox_location.setModel(new DefaultComboBoxModel(new String[] {"- Please Select -", "Midvalley Megamall", "Aeon Shah Alam"}));
		comboBox_location.setBounds(180, 198, 232, 35);
		panel_1.add(comboBox_location);
		
		JLabel lblNewLabel_7 = new JLabel("Address :");
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNewLabel_7.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		lblNewLabel_7.setBounds(56, 152, 114, 35);
		panel_1.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Location :");
		lblNewLabel_8.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		lblNewLabel_8.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNewLabel_8.setBounds(32, 198, 138, 35);
		panel_1.add(lblNewLabel_8);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(128, 0, 0), 2, true));
		panel_2.setBackground(new Color(255, 228, 225));
		panel_2.setBounds(445, 11, 549, 655);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_5 = new JLabel("Please Tick Item to Buy :");
		lblNewLabel_5.setBounds(10, 11, 252, 35);
		panel_2.add(lblNewLabel_5);
		lblNewLabel_5.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		
		JCheckBox chckbxML = new JCheckBox("MAC - Lipstick (RM 25)");
		chckbxML.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxML.isSelected()){
					textField_ML.setEnabled(true);
					textField_ML.setText("");
					textField_ML.requestFocus();
				}
				else {
					textField_ML.setEnabled(false);
					textField_ML.setText("0");
				}
			}
		});
		chckbxML.setBackground(new Color(255, 228, 225));
		chckbxML.setBounds(20, 53, 286, 27);
		panel_2.add(chckbxML);
		chckbxML.setFont(new Font("Comic Sans MS", Font.PLAIN, 17));
		
		JCheckBox chckbxME = new JCheckBox("MAC - Eyeshadow (RM40)");
		chckbxME.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxME.isSelected()){
					textField_ME.setEnabled(true);
					textField_ME.setText("");
					textField_ME.requestFocus();
				}
				else {
					textField_ME.setEnabled(false);
					textField_ME.setText("0");
				}
			}
		});
		chckbxME.setBackground(new Color(255, 228, 225));
		chckbxME.setFont(new Font("Comic Sans MS", Font.PLAIN, 17));
		chckbxME.setBounds(20, 84, 286, 27);
		panel_2.add(chckbxME);
		
		JCheckBox chckbxMM = new JCheckBox("MAC - Mascara (RM30)");
		chckbxMM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxMM.isSelected()){
					textField_MM.setEnabled(true);
					textField_MM.setText("");
					textField_MM.requestFocus();
				}
				else {
					textField_MM.setEnabled(false);
					textField_MM.setText("0");
				}
			}
		});
		chckbxMM.setBackground(new Color(255, 228, 225));
		chckbxMM.setFont(new Font("Comic Sans MS", Font.PLAIN, 17));
		chckbxMM.setBounds(20, 114, 286, 27);
		panel_2.add(chckbxMM);
		
		JCheckBox chckbxMB = new JCheckBox("MAC - Blusher (RM35)");
		chckbxMB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxMB.isSelected()){
					textField_MB.setEnabled(true);
					textField_MB.setText("");
					textField_MB.requestFocus();
				}
				else {
					textField_MB.setEnabled(false);
					textField_MB.setText("0");
				}
			}
		});
		chckbxMB.setBackground(new Color(255, 228, 225));
		chckbxMB.setFont(new Font("Comic Sans MS", Font.PLAIN, 17));
		chckbxMB.setBounds(20, 144, 286, 27);
		panel_2.add(chckbxMB);
		
		JCheckBox chckbxMBL = new JCheckBox("Maybelline - Lipstick (RM20)");
		chckbxMBL.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxMBL.isSelected()){
					textField_MBL.setEnabled(true);
					textField_MBL.setText("");
					textField_MBL.requestFocus();
				}
				else {
					textField_MBL.setEnabled(false);
					textField_MBL.setText("0");
				}
			}
		});
		chckbxMBL.setBackground(new Color(255, 228, 225));
		chckbxMBL.setFont(new Font("Comic Sans MS", Font.PLAIN, 17));
		chckbxMBL.setBounds(20, 174, 286, 27);
		panel_2.add(chckbxMBL);
		
		JCheckBox chckbxMBE = new JCheckBox("Maybelline - Eyeshadow (RM35)");
		chckbxMBE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxMBE.isSelected()){
					textField_MBE.setEnabled(true);
					textField_MBE.setText("");
					textField_MBE.requestFocus();
				}
				else {
					textField_MBE.setEnabled(false);
					textField_MBE.setText("0");
				}
			}
		});
		chckbxMBE.setBackground(new Color(255, 228, 225));
		chckbxMBE.setFont(new Font("Comic Sans MS", Font.PLAIN, 17));
		chckbxMBE.setBounds(20, 204, 286, 27);
		panel_2.add(chckbxMBE);
		
		JCheckBox chckbxMBM = new JCheckBox("Maybelline - Mascara (RM30)");
		chckbxMBM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxMBM.isSelected()){
					textField_MBM.setEnabled(true);
					textField_MBM.setText("");
					textField_MBM.requestFocus();
				}
				else {
					textField_MBM.setEnabled(false);
					textField_MBM.setText("0");
				}
			}
		});
		chckbxMBM.setBackground(new Color(255, 228, 225));
		chckbxMBM.setFont(new Font("Comic Sans MS", Font.PLAIN, 17));
		chckbxMBM.setBounds(20, 234, 286, 27);
		panel_2.add(chckbxMBM);
		
		JCheckBox chckbxMBB = new JCheckBox("Maybelline - Blusher (RM25)");
		chckbxMBB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxMBB.isSelected()){
					textField_MBB.setEnabled(true);
					textField_MBB.setText("");
					textField_MBB.requestFocus();
				}
				else {
					textField_MBB.setEnabled(false);
					textField_MBB.setText("0");
				}
			}
		});
		chckbxMBB.setBackground(new Color(255, 228, 225));
		chckbxMBB.setFont(new Font("Comic Sans MS", Font.PLAIN, 17));
		chckbxMBB.setBounds(20, 264, 286, 27);
		panel_2.add(chckbxMBB);
		
		JCheckBox chckbxFL = new JCheckBox("Fenty Beauty - Lipstick (RM40)");
		chckbxFL.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxFL.isSelected()){
					textField_FL.setEnabled(true);
					textField_FL.setText("");
					textField_FL.requestFocus();
				}
				else {
					textField_FL.setEnabled(false);
					textField_FL.setText("0");
				}
			}
		});
		chckbxFL.setBackground(new Color(255, 228, 225));
		chckbxFL.setFont(new Font("Comic Sans MS", Font.PLAIN, 17));
		chckbxFL.setBounds(20, 294, 286, 27);
		panel_2.add(chckbxFL);
		
		JCheckBox chckbxFE = new JCheckBox("Fenty Beauty - Eyeshadow (RM60)");
		chckbxFE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxFE.isSelected()){
					textField_FE.setEnabled(true);
					textField_FE.setText("");
					textField_FE.requestFocus();
				}
				else {
					textField_FE.setEnabled(false);
					textField_FE.setText("0");
				}
			}
		});
		chckbxFE.setBackground(new Color(255, 228, 225));
		chckbxFE.setFont(new Font("Comic Sans MS", Font.PLAIN, 17));
		chckbxFE.setBounds(20, 324, 311, 27);
		panel_2.add(chckbxFE);
		
		JCheckBox chckbxFM = new JCheckBox("Fenty Beauty - Mascara (RM50)");
		chckbxFM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxFM.isSelected()){
					textField_FM.setEnabled(true);
					textField_FM.setText("");
					textField_FM.requestFocus();
				}
				else {
					textField_FM.setEnabled(false);
					textField_FM.setText("0");
				}
			}
		});
		chckbxFM.setBackground(new Color(255, 228, 225));
		chckbxFM.setFont(new Font("Comic Sans MS", Font.PLAIN, 17));
		chckbxFM.setBounds(20, 354, 286, 27);
		panel_2.add(chckbxFM);
		
		JCheckBox chckbxFB = new JCheckBox("Fenty Beauty - Blusher (RM45)");
		chckbxFB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxFB.isSelected()){
					textField_FB.setEnabled(true);
					textField_FB.setText("");
					textField_FB.requestFocus();
				}
				else {
					textField_FB.setEnabled(false);
					textField_FB.setText("0");
				}
			}
		});
		chckbxFB.setBackground(new Color(255, 228, 225));
		chckbxFB.setFont(new Font("Comic Sans MS", Font.PLAIN, 17));
		chckbxFB.setBounds(20, 384, 286, 27);
		panel_2.add(chckbxFB);
		
		JCheckBox chckbxRE = new JCheckBox("Revlon - Eyeshadow (RM25)");
		chckbxRE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxRE.isSelected()){
					textField_RE.setEnabled(true);
					textField_RE.setText("");
					textField_RE.requestFocus();
				}
				else {
					textField_RE.setEnabled(false);
					textField_RE.setText("0");
				}
			}
		});
		chckbxRE.setBackground(new Color(255, 228, 225));
		chckbxRE.setFont(new Font("Comic Sans MS", Font.PLAIN, 17));
		chckbxRE.setBounds(20, 444, 286, 27);
		panel_2.add(chckbxRE);
		
		JCheckBox chckbxRM = new JCheckBox("Revlon - Mascara (RM30)");
		chckbxRM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxRM.isSelected()){
					textField_RM.setEnabled(true);
					textField_RM.setText("");
					textField_RM.requestFocus();
				}
				else {
					textField_RM.setEnabled(false);
					textField_RM.setText("0");
				}
			}
		});
		chckbxRM.setBackground(new Color(255, 228, 225));
		chckbxRM.setFont(new Font("Comic Sans MS", Font.PLAIN, 17));
		chckbxRM.setBounds(20, 474, 286, 27);
		panel_2.add(chckbxRM);
		
		JCheckBox chckbxRB = new JCheckBox("Revlon - Blusher (RM20)");
		chckbxRB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxRB.isSelected()){
					textField_RB.setEnabled(true);
					textField_RB.setText("");
					textField_RB.requestFocus();
				}
				else {
					textField_RB.setEnabled(false);
					textField_RB.setText("0");
				}
			}
		});
		chckbxRB.setBackground(new Color(255, 228, 225));
		chckbxRB.setFont(new Font("Comic Sans MS", Font.PLAIN, 17));
		chckbxRB.setBounds(17, 504, 289, 27);
		panel_2.add(chckbxRB);
		
		JCheckBox chckbxRL = new JCheckBox("Revlon - Lipstick (RM15)");
		chckbxRL.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxRL.isSelected()){
					textField_RL.setEnabled(true);
					textField_RL.setText("");
					textField_RL.requestFocus();
				}
				else {
					textField_RL.setEnabled(false);
					textField_RL.setText("0");
				}
			}
		});
		chckbxRL.setBackground(new Color(255, 228, 225));
		chckbxRL.setFont(new Font("Comic Sans MS", Font.PLAIN, 17));
		chckbxRL.setBounds(20, 414, 286, 27);
		panel_2.add(chckbxRL);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(new Color(250, 128, 114));
		panel_5.setBounds(10, 554, 529, 90);
		panel_2.add(panel_5);
		panel_5.setLayout(null);
		
		JLabel lblNewLabel_6 = new JLabel("TOTAL = ");
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNewLabel_6.setFont(new Font("Comic Sans MS", Font.PLAIN, 25));
		lblNewLabel_6.setBounds(10, 11, 153, 68);
		panel_5.add(lblNewLabel_6);
		
		jtxtTotal = new JTextField();
		jtxtTotal.setEditable(false);
		jtxtTotal.setBounds(191, 11, 271, 65);
		panel_5.add(jtxtTotal);
		jtxtTotal.setColumns(10);
		
		textField_ML = new JTextField();
		textField_ML.setHorizontalAlignment(SwingConstants.CENTER);
		textField_ML.setText("0");
		textField_ML.setBounds(365, 53, 156, 27);
		panel_2.add(textField_ML);
		textField_ML.setColumns(10);
		
		textField_ME = new JTextField();
		textField_ME.setText("0");
		textField_ME.setHorizontalAlignment(SwingConstants.CENTER);
		textField_ME.setColumns(10);
		textField_ME.setBounds(365, 84, 156, 27);
		panel_2.add(textField_ME);
		
		textField_MM = new JTextField();
		textField_MM.setHorizontalAlignment(SwingConstants.CENTER);
		textField_MM.setText("0");
		textField_MM.setColumns(10);
		textField_MM.setBounds(365, 114, 156, 27);
		panel_2.add(textField_MM);
		
		textField_MB = new JTextField();
		textField_MB.setHorizontalAlignment(SwingConstants.CENTER);
		textField_MB.setText("0");
		textField_MB.setColumns(10);
		textField_MB.setBounds(365, 144, 156, 27);
		panel_2.add(textField_MB);
		
		textField_MBL = new JTextField();
		textField_MBL.setHorizontalAlignment(SwingConstants.CENTER);
		textField_MBL.setText("0");
		textField_MBL.setColumns(10);
		textField_MBL.setBounds(365, 174, 156, 27);
		panel_2.add(textField_MBL);
		
		textField_MBE = new JTextField();
		textField_MBE.setHorizontalAlignment(SwingConstants.CENTER);
		textField_MBE.setText("0");
		textField_MBE.setColumns(10);
		textField_MBE.setBounds(365, 204, 156, 27);
		panel_2.add(textField_MBE);
		
		textField_MBM = new JTextField();
		textField_MBM.setHorizontalAlignment(SwingConstants.CENTER);
		textField_MBM.setText("0");
		textField_MBM.setColumns(10);
		textField_MBM.setBounds(365, 234, 156, 27);
		panel_2.add(textField_MBM);
		
		textField_MBB = new JTextField();
		textField_MBB.setText("0");
		textField_MBB.setHorizontalAlignment(SwingConstants.CENTER);
		textField_MBB.setColumns(10);
		textField_MBB.setBounds(365, 264, 156, 27);
		panel_2.add(textField_MBB);
		
		textField_FL = new JTextField();
		textField_FL.setText("0");
		textField_FL.setHorizontalAlignment(SwingConstants.CENTER);
		textField_FL.setColumns(10);
		textField_FL.setBounds(365, 294, 156, 27);
		panel_2.add(textField_FL);
		
		textField_FE = new JTextField();
		textField_FE.setText("0");
		textField_FE.setHorizontalAlignment(SwingConstants.CENTER);
		textField_FE.setColumns(10);
		textField_FE.setBounds(365, 324, 156, 27);
		panel_2.add(textField_FE);
		
		textField_FM = new JTextField();
		textField_FM.setText("0");
		textField_FM.setHorizontalAlignment(SwingConstants.CENTER);
		textField_FM.setColumns(10);
		textField_FM.setBounds(365, 354, 156, 27);
		panel_2.add(textField_FM);
		
		textField_FB = new JTextField();
		textField_FB.setText("0");
		textField_FB.setHorizontalAlignment(SwingConstants.CENTER);
		textField_FB.setColumns(10);
		textField_FB.setBounds(365, 384, 156, 27);
		panel_2.add(textField_FB);
		
		textField_RL = new JTextField();
		textField_RL.setText("0");
		textField_RL.setHorizontalAlignment(SwingConstants.CENTER);
		textField_RL.setColumns(10);
		textField_RL.setBounds(365, 414, 156, 27);
		panel_2.add(textField_RL);
		
		textField_RE = new JTextField();
		textField_RE.setText("0");
		textField_RE.setHorizontalAlignment(SwingConstants.CENTER);
		textField_RE.setColumns(10);
		textField_RE.setBounds(365, 444, 156, 27);
		panel_2.add(textField_RE);
		
		textField_RM = new JTextField();
		textField_RM.setText("0");
		textField_RM.setHorizontalAlignment(SwingConstants.CENTER);
		textField_RM.setColumns(10);
		textField_RM.setBounds(365, 474, 156, 27);
		panel_2.add(textField_RM);
		
		textField_RB = new JTextField();
		textField_RB.setText("0");
		textField_RB.setHorizontalAlignment(SwingConstants.CENTER);
		textField_RB.setColumns(10);
		textField_RB.setBounds(365, 504, 156, 27);
		panel_2.add(textField_RB);
		
		JLabel lblNewLabel_5_1 = new JLabel("Quantity");
		lblNewLabel_5_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5_1.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		lblNewLabel_5_1.setBounds(383, 11, 117, 35);
		panel_2.add(lblNewLabel_5_1);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(new Color(128, 0, 0), 2, true));
		panel_3.setBackground(new Color(255, 228, 225));
		panel_3.setBounds(10, 445, 425, 221);
		frame.getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new LineBorder(new Color(128, 0, 0), 2, true));
		panel_4.setBackground(new Color(255, 228, 225));
		panel_4.setBounds(1004, 11, 330, 655);
		frame.getContentPane().add(panel_4);
		panel_4.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 310, 633);
		panel_4.add(scrollPane);
		
		JTextArea jtxtReceipt_1 = new JTextArea();
		scrollPane.setViewportView(jtxtReceipt_1);
		
		//THIS CODE TO COUNT THE TOTAL ITEM TO BUY
		JButton btnNewButton = new JButton("TOTAL");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//DECLARE EACH TEXTFIELD QUANTITY AND MULTIPLY TO THE PRICE
				itemcost[0] = Integer.parseInt(textField_ML.getText()) *25;
				itemcost[1] = Integer.parseInt(textField_ME.getText()) *40;
				itemcost[2] = Integer.parseInt(textField_MM.getText()) *30;
				itemcost[3] = Integer.parseInt(textField_MB.getText()) *35;
				itemcost[4] = Integer.parseInt(textField_MBL.getText()) *20;
				itemcost[5] = Integer.parseInt(textField_MBE.getText()) *35;
				itemcost[6] = Integer.parseInt(textField_MBM.getText()) *30;
				itemcost[7] = Integer.parseInt(textField_MBB.getText()) *25;
				itemcost[8] = Integer.parseInt(textField_FL.getText()) *40;
				itemcost[9] = Integer.parseInt(textField_FE.getText()) *60;
				itemcost[10] = Integer.parseInt(textField_FM.getText()) *50;
				itemcost[11] = Integer.parseInt(textField_FB.getText()) *45;
				itemcost[12] = Integer.parseInt(textField_RL.getText()) *15;
				itemcost[13] = Integer.parseInt(textField_RE.getText()) *25;
				itemcost[14] = Integer.parseInt(textField_RM.getText()) *30;
				itemcost[15] = Integer.parseInt(textField_RB.getText()) *20;
				
				//DIVIDE INTO 2 TO ADD ALL ITEM
				itemcost[16] = itemcost[0] + itemcost[1] + itemcost[2] + itemcost[3] + itemcost[4] + itemcost[5] + itemcost[6] + itemcost[7];
				itemcost[17] = itemcost[8] + itemcost[9] + itemcost[10] + itemcost[11] + itemcost[12] + itemcost[13] + itemcost[14] + itemcost[15];
				
				//ARRAY [20] IS A TOTAL FOR ALL 
				itemcost[18] = itemcost[16] + itemcost[17];
				
				//PRINT FORMAT
				iTotal = String.format("RM " + itemcost[18]);
				
				//CALL FOR OUTPUT
				jtxtTotal.setText(iTotal);
			}
		}); 
		btnNewButton.setFont(new Font("Comic Sans MS", Font.PLAIN, 23));
		btnNewButton.setBounds(41, 11, 166, 57);
		panel_3.add(btnNewButton);
		
		//PRINT RECEIPT CODE
		JButton btnPrint = new JButton("RECEIPT");
		btnPrint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jtxtReceipt_1.append("\tCustomer Billing System\n" +
						"\n===================================================\t" +
						"\nName:" + textField_name.getText() +
						"\nPhone Number:" + textField_phone.getText() +
						"\nEmail:" + textField_email.getText() +
						"\nAddress:" + textField_address.getText() +
						"\nLocation select: " + comboBox_location.getSelectedItem() +
						"\n===================================================\t" +
						"\nMAC-Lipstick\t\t\t" + textField_ML.getText() +
						"\nMAC-Eyeshadow\t\t" + textField_ME.getText() +
						"\nMAC-Mascara\t\t\t" + textField_MM.getText() +
						"\nMAC-Blusher\t\t\t" + textField_MB.getText() + 
						
						"\nMaybelline-Lipstick\t\t" + textField_MBL.getText() +
						"\nMaybelline-Eyeshadow\t\t" + textField_MBE.getText() +
						"\nMaybelline-Mascara\t\t" + textField_MBM.getText() +
						"\nMaybelline-Blusher\t\t" + textField_MBB.getText() +
						
						"\nFenty Beauty-Lipstick\t\t" + textField_FL.getText() +
						"\nFenty Beauty-Eyeshadow\t\t" + textField_FE.getText() +
						"\nFenty Beauty-Mascara\t\t" + textField_FM.getText() +
						"\nFenty Beauty-Blusher\t\t" + textField_FB.getText() +
						
						"\nRevlon-Lipstick\t\t\t" + textField_RL.getText() + 
						"\nRevlon-Eyeshadow\t\t" + textField_RE.getText() + 
						"\nRevlon-Mascara\t\t" + textField_RM.getText() +
						"\nRevlon-Blusher\t\t\t" + textField_RB.getText() + 
						
						"\n===================================================\t" +
						
						"\nTotal =\t\t" + iTotal + 
						
						"\n===================================================\t" +
						
						"\nThank You for Shopping with us.\n\n");
			}
		});
		btnPrint.setFont(new Font("Comic Sans MS", Font.PLAIN, 23));
		btnPrint.setBounds(229, 11, 166, 57);
		panel_3.add(btnPrint);
		
		//RESET BUTTON FUNCTION
		JButton btnReset = new JButton("RESET");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//RESET INFORMATION
				textField_name.setText(null);
				textField_phone.setText(null);
				textField_email.setText(null);
				textField_address.setText(null);
				comboBox_location.setSelectedIndex(0);
				
				//CHANGE ENABLE TO FALSE FOR TEXTFIELD QUANTITY
				textField_ML.setEnabled(false);
				textField_ME.setEnabled(false);
				textField_MM.setEnabled(false);
				textField_MB.setEnabled(false);
				textField_MBL.setEnabled(false);
				textField_MBE.setEnabled(false);
				textField_MBM.setEnabled(false);
				textField_MBB.setEnabled(false);
				textField_FL.setEnabled(false);
				textField_FE.setEnabled(false);
				textField_FM.setEnabled(false);
				textField_FB.setEnabled(false);
				textField_RL.setEnabled(false);
				textField_RE.setEnabled(false);
				textField_RM.setEnabled(false);
				textField_RB.setEnabled(false);
				
				//RESET QUANTITY
				textField_ML.setText("0");
				textField_ME.setText("0");
				textField_MM.setText("0");
				textField_MB.setText("0");
				textField_MBL.setText("0");
				textField_MBE.setText("0");
				textField_MBM.setText("0");
				textField_MBB.setText("0");
				textField_FL.setText("0");
				textField_FE.setText("0");
				textField_FM.setText("0");
				textField_FB.setText("0");
				textField_RL.setText("0");
				textField_RE.setText("0");
				textField_RM.setText("0");
				textField_RB.setText("0");
				
				//RESET CHECKBOX
				chckbxML.setSelected(false);
				chckbxME.setSelected(false);
				chckbxMM.setSelected(false);
				chckbxMB.setSelected(false);
				chckbxMBL.setSelected(false);
				chckbxMBE.setSelected(false);
				chckbxMBM.setSelected(false);
				chckbxMBB.setSelected(false);
				chckbxFL.setSelected(false);
				chckbxFE.setSelected(false);
				chckbxFM.setSelected(false);
				chckbxFB.setSelected(false);
				chckbxRL.setSelected(false);
				chckbxRE.setSelected(false);
				chckbxRM.setSelected(false);
				chckbxRB.setSelected(false);
				
			}
		});
		btnReset.setFont(new Font("Comic Sans MS", Font.PLAIN, 23));
		btnReset.setBounds(41, 79, 166, 57);
		panel_3.add(btnReset);
		
		//SAVE TO TXT FILE
		JButton btnSave = new JButton("SAVE");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try
		        {
		            File file = new File ("/Users/user/eclipse-workspace/Workspace/BeautyProject/Receipt.txt");
		            if(!file.exists())
		            {
		                file.createNewFile();
		            }
		            
		            FileWriter fw = new FileWriter(file.getAbsoluteFile());
		            BufferedWriter bw = new BufferedWriter(fw);
		            
		            bw.write(jtxtReceipt_1.getText());

		            bw.close();
		            fw.close();
		            JOptionPane.showConfirmDialog(frame, "Save To File", "Customer Billing System",
		            		JOptionPane.OK_OPTION);
		        }
		        catch(Exception ex)
		        {
		            ex.printStackTrace();
		        }
	        }
		});
		btnSave.setFont(new Font("Comic Sans MS", Font.PLAIN, 23));
		btnSave.setBounds(229, 79, 166, 57);
		panel_3.add(btnSave);
		
		//EXIT BUTTON
		JButton btnExit = new JButton("EXIT");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame = new JFrame();
				if(JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit ?", "Customer Billing System",
						JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
			}
		});
		btnExit.setFont(new Font("Comic Sans MS", Font.PLAIN, 23));
		btnExit.setBounds(132, 147, 166, 57);
		panel_3.add(btnExit);
		
		
		
		
	}
}
