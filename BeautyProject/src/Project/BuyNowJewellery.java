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

public class BuyNowJewellery {

	private JFrame frame;
	private JTextField textField_name;
	private JTextField textField_phone;
	private JTextField textField_email;
	private JTextField textField_address;
	private JTextField jtxtTotal;
	private JTextField textField_ON;
	private JTextField textField_SE;
	private JTextField textField_BB;
	private JTextField textField_WR;
	private JTextField textField_MCN;
	private JTextField textField_LE;
	private JTextField textField_CB;
	private JTextField textField_BSR;
	private JTextField textField_TN;
	private JTextField textField_CE;
	private JTextField textField_BDB;
	private JTextField textField_PR;
	private JTextField textField_CR;
	private JTextField textField_CN;
	private JTextField textField_COE;
	private JTextField textField_DB;
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
					BuyNowJewellery window = new BuyNowJewellery();
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
	public BuyNowJewellery() {
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
		
		JCheckBox chckbxON = new JCheckBox("Opera - Necklace (RM 2500)");
		chckbxON.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxON.isSelected()){
					textField_ON.setEnabled(true);
					textField_ON.setText("");
					textField_ON.requestFocus();
				}
				else {
					textField_ON.setEnabled(false);
					textField_ON.setText("0");
				}
			}
		});
		chckbxON.setBackground(new Color(255, 228, 225));
		chckbxON.setBounds(20, 53, 286, 27);
		panel_2.add(chckbxON);
		chckbxON.setFont(new Font("Comic Sans MS", Font.PLAIN, 17));
		
		JCheckBox chckbxSE = new JCheckBox("Stud - Earrings (RM500)");
		chckbxSE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxSE.isSelected()){
					textField_SE.setEnabled(true);
					textField_SE.setText("");
					textField_SE.requestFocus();
				}
				else {
					textField_SE.setEnabled(false);
					textField_SE.setText("0");
				}
			}
		});
		chckbxSE.setBackground(new Color(255, 228, 225));
		chckbxSE.setFont(new Font("Comic Sans MS", Font.PLAIN, 17));
		chckbxSE.setBounds(20, 84, 286, 27);
		panel_2.add(chckbxSE);
		
		JCheckBox chckbxBB = new JCheckBox("Bangle - Bracelets (RM350)");
		chckbxBB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxBB.isSelected()){
					textField_BB.setEnabled(true);
					textField_BB.setText("");
					textField_BB.requestFocus();
				}
				else {
					textField_BB.setEnabled(false);
					textField_BB.setText("0");
				}
			}
		});
		chckbxBB.setBackground(new Color(255, 228, 225));
		chckbxBB.setFont(new Font("Comic Sans MS", Font.PLAIN, 17));
		chckbxBB.setBounds(20, 114, 286, 27);
		panel_2.add(chckbxBB);
		
		JCheckBox chckbxWR = new JCheckBox("Wedding - Ring (RM350)");
		chckbxWR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxWR.isSelected()){
					textField_WR.setEnabled(true);
					textField_WR.setText("");
					textField_WR.requestFocus();
				}
				else {
					textField_WR.setEnabled(false);
					textField_WR.setText("0");
				}
			}
		});
		chckbxWR.setBackground(new Color(255, 228, 225));
		chckbxWR.setFont(new Font("Comic Sans MS", Font.PLAIN, 17));
		chckbxWR.setBounds(20, 144, 286, 27);
		panel_2.add(chckbxWR);
		
		JCheckBox chckbxMCN = new JCheckBox("Multicolour - Necklace (RM2800)");
		chckbxMCN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxMCN.isSelected()){
					textField_MCN.setEnabled(true);
					textField_MCN.setText("");
					textField_MCN.requestFocus();
				}
				else {
					textField_MCN.setEnabled(false);
					textField_MCN.setText("0");
				}
			}
		});
		chckbxMCN.setBackground(new Color(255, 228, 225));
		chckbxMCN.setFont(new Font("Comic Sans MS", Font.PLAIN, 17));
		chckbxMCN.setBounds(20, 174, 311, 27);
		panel_2.add(chckbxMCN);
		
		JCheckBox chckbxLE = new JCheckBox("Loop - Earrings (RM850)");
		chckbxLE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxLE.isSelected()){
					textField_LE.setEnabled(true);
					textField_LE.setText("");
					textField_LE.requestFocus();
				}
				else {
					textField_LE.setEnabled(false);
					textField_LE.setText("0");
				}
			}
		});
		chckbxLE.setBackground(new Color(255, 228, 225));
		chckbxLE.setFont(new Font("Comic Sans MS", Font.PLAIN, 17));
		chckbxLE.setBounds(20, 204, 286, 27);
		panel_2.add(chckbxLE);
		
		JCheckBox chckbxCB = new JCheckBox("Charm - Bracelets (RM350)");
		chckbxCB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxCB.isSelected()){
					textField_CB.setEnabled(true);
					textField_CB.setText("");
					textField_CB.requestFocus();
				}
				else {
					textField_CB.setEnabled(false);
					textField_CB.setText("0");
				}
			}
		});
		chckbxCB.setBackground(new Color(255, 228, 225));
		chckbxCB.setFont(new Font("Comic Sans MS", Font.PLAIN, 17));
		chckbxCB.setBounds(20, 234, 286, 27);
		panel_2.add(chckbxCB);
		
		JCheckBox chckbxBSR = new JCheckBox("Birthstone - Ring (RM450)");
		chckbxBSR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxBSR.isSelected()){
					textField_BSR.setEnabled(true);
					textField_BSR.setText("");
					textField_BSR.requestFocus();
				}
				else {
					textField_BSR.setEnabled(false);
					textField_BSR.setText("0");
				}
			}
		});
		chckbxBSR.setBackground(new Color(255, 228, 225));
		chckbxBSR.setFont(new Font("Comic Sans MS", Font.PLAIN, 17));
		chckbxBSR.setBounds(20, 264, 286, 27);
		panel_2.add(chckbxBSR);
		
		JCheckBox chckbxTN = new JCheckBox("Thread - Necklace (RM1000)");
		chckbxTN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxTN.isSelected()){
					textField_TN.setEnabled(true);
					textField_TN.setText("");
					textField_TN.requestFocus();
				}
				else {
					textField_TN.setEnabled(false);
					textField_TN.setText("0");
				}
			}
		});
		chckbxTN.setBackground(new Color(255, 228, 225));
		chckbxTN.setFont(new Font("Comic Sans MS", Font.PLAIN, 17));
		chckbxTN.setBounds(20, 294, 286, 27);
		panel_2.add(chckbxTN);
		
		JCheckBox chckbxCE = new JCheckBox("Chandelier - Earring (RM600)");
		chckbxCE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxCE.isSelected()){
					textField_CE.setEnabled(true);
					textField_CE.setText("");
					textField_CE.requestFocus();
				}
				else {
					textField_CE.setEnabled(false);
					textField_CE.setText("0");
				}
			}
		});
		chckbxCE.setBackground(new Color(255, 228, 225));
		chckbxCE.setFont(new Font("Comic Sans MS", Font.PLAIN, 17));
		chckbxCE.setBounds(20, 324, 311, 27);
		panel_2.add(chckbxCE);
		
		JCheckBox chckbxBDB = new JCheckBox("Beaded - Bracelets (RM500)");
		chckbxBDB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxBDB.isSelected()){
					textField_BDB.setEnabled(true);
					textField_BDB.setText("");
					textField_BDB.requestFocus();
				}
				else {
					textField_BDB.setEnabled(false);
					textField_BDB.setText("0");
				}
			}
		});
		chckbxBDB.setBackground(new Color(255, 228, 225));
		chckbxBDB.setFont(new Font("Comic Sans MS", Font.PLAIN, 17));
		chckbxBDB.setBounds(20, 354, 286, 27);
		panel_2.add(chckbxBDB);
		
		JCheckBox chckbxPR = new JCheckBox("Promise - Ring (RM450)");
		chckbxPR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxPR.isSelected()){
					textField_PR.setEnabled(true);
					textField_PR.setText("");
					textField_PR.requestFocus();
				}
				else {
					textField_PR.setEnabled(false);
					textField_PR.setText("0");
				}
			}
		});
		chckbxPR.setBackground(new Color(255, 228, 225));
		chckbxPR.setFont(new Font("Comic Sans MS", Font.PLAIN, 17));
		chckbxPR.setBounds(20, 384, 286, 27);
		panel_2.add(chckbxPR);
		
		JCheckBox chckbxCN = new JCheckBox("Collar - Necklace (RM2500)");
		chckbxCN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxCN.isSelected()){
					textField_CN.setEnabled(true);
					textField_CN.setText("");
					textField_CN.requestFocus();
				}
				else {
					textField_CN.setEnabled(false);
					textField_CN.setText("0");
				}
			}
		});
		chckbxCN.setBackground(new Color(255, 228, 225));
		chckbxCN.setFont(new Font("Comic Sans MS", Font.PLAIN, 17));
		chckbxCN.setBounds(20, 444, 286, 27);
		panel_2.add(chckbxCN);
		
		JCheckBox chckbxCOE = new JCheckBox("Clip-on - Earrings (RM900)");
		chckbxCOE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxCOE.isSelected()){
					textField_COE.setEnabled(true);
					textField_COE.setText("");
					textField_COE.requestFocus();
				}
				else {
					textField_COE.setEnabled(false);
					textField_COE.setText("0");
				}
			}
		});
		chckbxCOE.setBackground(new Color(255, 228, 225));
		chckbxCOE.setFont(new Font("Comic Sans MS", Font.PLAIN, 17));
		chckbxCOE.setBounds(20, 474, 286, 27);
		panel_2.add(chckbxCOE);
		
		JCheckBox chckbxDB = new JCheckBox("Designer - Bracelets (RM400)");
		chckbxDB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxDB.isSelected()){
					textField_DB.setEnabled(true);
					textField_DB.setText("");
					textField_DB.requestFocus();
				}
				else {
					textField_DB.setEnabled(false);
					textField_DB.setText("0");
				}
			}
		});
		chckbxDB.setBackground(new Color(255, 228, 225));
		chckbxDB.setFont(new Font("Comic Sans MS", Font.PLAIN, 17));
		chckbxDB.setBounds(17, 504, 289, 27);
		panel_2.add(chckbxDB);
		
		JCheckBox chckbxCR = new JCheckBox("Class - Ring (RM150)");
		chckbxCR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxCR.isSelected()){
					textField_CR.setEnabled(true);
					textField_CR.setText("");
					textField_CR.requestFocus();
				}
				else {
					textField_CR.setEnabled(false);
					textField_CR.setText("0");
				}
			}
		});
		chckbxCR.setBackground(new Color(255, 228, 225));
		chckbxCR.setFont(new Font("Comic Sans MS", Font.PLAIN, 17));
		chckbxCR.setBounds(20, 414, 286, 27);
		panel_2.add(chckbxCR);
		
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
		
		textField_ON = new JTextField();
		textField_ON.setHorizontalAlignment(SwingConstants.CENTER);
		textField_ON.setText("0");
		textField_ON.setBounds(365, 53, 156, 27);
		panel_2.add(textField_ON);
		textField_ON.setColumns(10);
		
		textField_SE = new JTextField();
		textField_SE.setText("0");
		textField_SE.setHorizontalAlignment(SwingConstants.CENTER);
		textField_SE.setColumns(10);
		textField_SE.setBounds(365, 84, 156, 27);
		panel_2.add(textField_SE);
		
		textField_BB = new JTextField();
		textField_BB.setHorizontalAlignment(SwingConstants.CENTER);
		textField_BB.setText("0");
		textField_BB.setColumns(10);
		textField_BB.setBounds(365, 114, 156, 27);
		panel_2.add(textField_BB);
		
		textField_WR = new JTextField();
		textField_WR.setHorizontalAlignment(SwingConstants.CENTER);
		textField_WR.setText("0");
		textField_WR.setColumns(10);
		textField_WR.setBounds(365, 144, 156, 27);
		panel_2.add(textField_WR);
		
		textField_MCN = new JTextField();
		textField_MCN.setHorizontalAlignment(SwingConstants.CENTER);
		textField_MCN.setText("0");
		textField_MCN.setColumns(10);
		textField_MCN.setBounds(365, 174, 156, 27);
		panel_2.add(textField_MCN);
		
		textField_LE = new JTextField();
		textField_LE.setHorizontalAlignment(SwingConstants.CENTER);
		textField_LE.setText("0");
		textField_LE.setColumns(10);
		textField_LE.setBounds(365, 204, 156, 27);
		panel_2.add(textField_LE);
		
		textField_CB = new JTextField();
		textField_CB.setHorizontalAlignment(SwingConstants.CENTER);
		textField_CB.setText("0");
		textField_CB.setColumns(10);
		textField_CB.setBounds(365, 234, 156, 27);
		panel_2.add(textField_CB);
		
		textField_BSR = new JTextField();
		textField_BSR.setText("0");
		textField_BSR.setHorizontalAlignment(SwingConstants.CENTER);
		textField_BSR.setColumns(10);
		textField_BSR.setBounds(365, 264, 156, 27);
		panel_2.add(textField_BSR);
		
		textField_TN = new JTextField();
		textField_TN.setText("0");
		textField_TN.setHorizontalAlignment(SwingConstants.CENTER);
		textField_TN.setColumns(10);
		textField_TN.setBounds(365, 294, 156, 27);
		panel_2.add(textField_TN);
		
		textField_CE = new JTextField();
		textField_CE.setText("0");
		textField_CE.setHorizontalAlignment(SwingConstants.CENTER);
		textField_CE.setColumns(10);
		textField_CE.setBounds(365, 324, 156, 27);
		panel_2.add(textField_CE);
		
		textField_BDB = new JTextField();
		textField_BDB.setText("0");
		textField_BDB.setHorizontalAlignment(SwingConstants.CENTER);
		textField_BDB.setColumns(10);
		textField_BDB.setBounds(365, 354, 156, 27);
		panel_2.add(textField_BDB);
		
		textField_PR = new JTextField();
		textField_PR.setText("0");
		textField_PR.setHorizontalAlignment(SwingConstants.CENTER);
		textField_PR.setColumns(10);
		textField_PR.setBounds(365, 384, 156, 27);
		panel_2.add(textField_PR);
		
		textField_CR = new JTextField();
		textField_CR.setText("0");
		textField_CR.setHorizontalAlignment(SwingConstants.CENTER);
		textField_CR.setColumns(10);
		textField_CR.setBounds(365, 414, 156, 27);
		panel_2.add(textField_CR);
		
		textField_CN = new JTextField();
		textField_CN.setText("0");
		textField_CN.setHorizontalAlignment(SwingConstants.CENTER);
		textField_CN.setColumns(10);
		textField_CN.setBounds(365, 444, 156, 27);
		panel_2.add(textField_CN);
		
		textField_COE = new JTextField();
		textField_COE.setText("0");
		textField_COE.setHorizontalAlignment(SwingConstants.CENTER);
		textField_COE.setColumns(10);
		textField_COE.setBounds(365, 474, 156, 27);
		panel_2.add(textField_COE);
		
		textField_DB = new JTextField();
		textField_DB.setText("0");
		textField_DB.setHorizontalAlignment(SwingConstants.CENTER);
		textField_DB.setColumns(10);
		textField_DB.setBounds(365, 504, 156, 27);
		panel_2.add(textField_DB);
		
		JLabel lblNewLabel_5_1 = new JLabel("Quantity");
		lblNewLabel_5_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5_1.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		lblNewLabel_5_1.setBounds(365, 11, 156, 35);
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
				itemcost[0] = Integer.parseInt(textField_ON.getText()) *2500;
				itemcost[1] = Integer.parseInt(textField_SE.getText()) *500;
				itemcost[2] = Integer.parseInt(textField_BB.getText()) *350;
				itemcost[3] = Integer.parseInt(textField_WR.getText()) *350;
				itemcost[4] = Integer.parseInt(textField_MCN.getText()) *2800;
				itemcost[5] = Integer.parseInt(textField_LE.getText()) *850;
				itemcost[6] = Integer.parseInt(textField_CB.getText()) *350;
				itemcost[7] = Integer.parseInt(textField_BSR.getText()) *450;
				itemcost[8] = Integer.parseInt(textField_TN.getText()) *1000;
				itemcost[9] = Integer.parseInt(textField_CE.getText()) *600;
				itemcost[10] = Integer.parseInt(textField_BDB.getText()) *500;
				itemcost[11] = Integer.parseInt(textField_PR.getText()) *450;
				itemcost[12] = Integer.parseInt(textField_CR.getText()) *150;
				itemcost[13] = Integer.parseInt(textField_CN.getText()) *2500;
				itemcost[14] = Integer.parseInt(textField_COE.getText()) *900;
				itemcost[15] = Integer.parseInt(textField_DB.getText()) *400;
				
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
						"\nOpera-Necklace\t\t" + textField_ON.getText() +
						"\nStud-Earring\t\t\t" + textField_SE.getText() +
						"\nBangles-Bracelets\t\t" + textField_BB.getText() +
						"\nWedding-Ring\t\t\t" + textField_WR.getText() + 
						
						"\nMultiColoured-Necklace\t\t" + textField_MCN.getText() +
						"\nLoop-Earring\t\t\t" + textField_LE.getText() +
						"\nCharm-Bracelets\t\t" + textField_CB.getText() +
						"\nBirthstone-Ring\t\t\t" + textField_BSR.getText() +
						
						"\nThread-Necklace\t\t" + textField_TN.getText() +
						"\nChandelier-Earring\t\t" + textField_CE.getText() +
					    "\nBeaded-Bracelets\t\t" + textField_BDB.getText() +
						"\nPromise-Ring\t\t\t" + textField_PR.getText() +
						
						"\nCollar-Necklace\t\t" + textField_CR.getText() + 
						"\nClip-on-Earring\t\t\t" + textField_CN.getText() + 
						"\nDesigner-Bracelets\t\t" + textField_COE.getText() +
						"\nClass-Ring\t\t\t" + textField_DB.getText() + 
						
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
				textField_ON.setEnabled(false);
				textField_SE.setEnabled(false);
				textField_BB.setEnabled(false);
				textField_WR.setEnabled(false);
				textField_MCN.setEnabled(false);
				textField_LE.setEnabled(false);
				textField_CB.setEnabled(false);
				textField_BSR.setEnabled(false);
				textField_TN.setEnabled(false);
				textField_CE.setEnabled(false);
				textField_BDB.setEnabled(false);
				textField_PR.setEnabled(false);
				textField_CR.setEnabled(false);
				textField_CN.setEnabled(false);
				textField_COE.setEnabled(false);
				textField_DB.setEnabled(false);
				
				//RESET QUANTITY
				textField_ON.setText("0");
				textField_SE.setText("0");
				textField_BB.setText("0");
				textField_WR.setText("0");
				textField_MCN.setText("0");
				textField_LE.setText("0");
				textField_CB.setText("0");
				textField_BSR.setText("0");
				textField_TN.setText("0");
				textField_CE.setText("0");
				textField_BDB.setText("0");
				textField_PR.setText("0");
				textField_CR.setText("0");
				textField_CN.setText("0");
				textField_COE.setText("0");
				textField_DB.setText("0");
				
				//RESET CHECKBOX
				chckbxON.setSelected(false);
				chckbxSE.setSelected(false);
				chckbxBB.setSelected(false);
				chckbxWR.setSelected(false);
				chckbxMCN.setSelected(false);
				chckbxLE.setSelected(false);
				chckbxCB.setSelected(false);
				chckbxBSR.setSelected(false);
				chckbxTN.setSelected(false);
				chckbxCE.setSelected(false);
				chckbxBDB.setSelected(false);
				chckbxPR.setSelected(false);
				chckbxCR.setSelected(false);
				chckbxCN.setSelected(false);
				chckbxCOE.setSelected(false);
				chckbxDB.setSelected(false);
				
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

