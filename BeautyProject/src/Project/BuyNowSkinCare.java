package Project;

import java.awt.EventQueue;

import javax.swing.JFrame;

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
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;

public class BuyNowSkinCare {

	private JFrame frame;
	private JTextField textField_name;
	private JTextField textField_phone;
	private JTextField textField_email;
	private JTextField textField_address;
	private JTextField jtxtTotal;
	private JTextField textField_SC;
	private JTextField textField_SM;
	private JTextField textField_ST;
	private JTextField textField_SS;
	private JTextField textField_SIMC;
	private JTextField textField_SIMM;
	private JTextField textField_SIMT;
	private JTextField textField_HIMC;
	private JTextField textField_HIMM;
	private JTextField textField_LOS;
	private JTextField textField_LOM;
	private JTextField textField_BIOM;
	private JTextField textField_BIOT;
	private JTextArea jtxtReceipt_;
	
	String iTotal;
	int [] itemcost = new int[16];

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BuyNowSkinCare window = new BuyNowSkinCare();
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
	public BuyNowSkinCare() {
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
		lblNewLabel.setBounds(30, 11, 228, 127);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Buy Now");
		lblNewLabel_1.setFont(new Font("Script MT Bold", Font.PLAIN, 40));
		lblNewLabel_1.setBounds(179, 33, 236, 91);
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
		comboBox_location.setModel(new DefaultComboBoxModel(new String[] {"- Please Select -", "Watson", "Guardian", "Farmasi"}));
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
		
		JCheckBox chckbxSC = new JCheckBox("Safi - Cleansing (RM 20)");
		chckbxSC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxSC.isSelected()){
					textField_SC.setEnabled(true);
					textField_SC.setText("");
					textField_SC.requestFocus();
				}
				else {
					textField_SC.setEnabled(false);
					textField_SC.setText("0");
				}
			}
		});
		chckbxSC.setBackground(new Color(255, 228, 225));
		chckbxSC.setBounds(20, 53, 286, 27);
		panel_2.add(chckbxSC);
		chckbxSC.setFont(new Font("Comic Sans MS", Font.PLAIN, 17));
		
		JCheckBox chckbxSM = new JCheckBox("Safi - Moisturing (RM25)");
		chckbxSM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxSM.isSelected()){
					textField_SM.setEnabled(true);
					textField_SM.setText("");
					textField_SM.requestFocus();
				}
				else {
					textField_SM.setEnabled(false);
					textField_SM.setText("0");
				}
			}
		});
		chckbxSM.setBackground(new Color(255, 228, 225));
		chckbxSM.setFont(new Font("Comic Sans MS", Font.PLAIN, 17));
		chckbxSM.setBounds(20, 84, 286, 27);
		panel_2.add(chckbxSM);
		
		JCheckBox chckbxST = new JCheckBox("Safi - Toner (RM18)");
		chckbxST.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxST.isSelected()){
					textField_ST.setEnabled(true);
					textField_ST.setText("");
					textField_ST.requestFocus();
				}
				else {
					textField_ST.setEnabled(false);
					textField_ST.setText("0");
				}
			}
		});
		chckbxST.setBackground(new Color(255, 228, 225));
		chckbxST.setFont(new Font("Comic Sans MS", Font.PLAIN, 17));
		chckbxST.setBounds(20, 114, 286, 27);
		panel_2.add(chckbxST);
		
		JCheckBox chckbxSS = new JCheckBox("Safi - Serum (RM35)");
		chckbxSS.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxSS.isSelected()){
					textField_SS.setEnabled(true);
					textField_SS.setText("");
					textField_SS.requestFocus();
				}
				else {
					textField_SS.setEnabled(false);
					textField_SS.setText("0");
				}
			}
		});
		chckbxSS.setBackground(new Color(255, 228, 225));
		chckbxSS.setFont(new Font("Comic Sans MS", Font.PLAIN, 17));
		chckbxSS.setBounds(20, 144, 286, 27);
		panel_2.add(chckbxSS);
		
		JCheckBox chckbxSIMC = new JCheckBox("Simple - Cleansing (RM25)");
		chckbxSIMC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxSIMC.isSelected()){
					textField_SIMC.setEnabled(true);
					textField_SIMC.setText("");
					textField_SIMC.requestFocus();
				}
				else {
					textField_SIMC.setEnabled(false);
					textField_SIMC.setText("0");
				}
			}
		});
		chckbxSIMC.setBackground(new Color(255, 228, 225));
		chckbxSIMC.setFont(new Font("Comic Sans MS", Font.PLAIN, 17));
		chckbxSIMC.setBounds(20, 174, 286, 27);
		panel_2.add(chckbxSIMC);
		
		JCheckBox chckbxSIMM = new JCheckBox("Simple-Moisturing(RM26)");
		chckbxSIMM.addActionListener(new ActionListener() {
           public void actionPerformed(ActionEvent e) {
				if(chckbxSIMM.isSelected()){
					textField_SIMM.setEnabled(true);
					textField_SIMM.setText("");
					textField_SIMM.requestFocus();
				}
				else {
					textField_SIMM.setEnabled(false);
					textField_SIMM.setText("0");
				}
			}
		});
		chckbxSIMM.setBackground(new Color(255, 228, 225));
		chckbxSIMM.setFont(new Font("Comic Sans MS", Font.PLAIN, 17));
		chckbxSIMM.setBounds(20, 204, 286, 27);
		panel_2.add(chckbxSIMM);
		
		JCheckBox chckbxSIMT = new JCheckBox("Simple - Toner (RM30)");
		chckbxSIMT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxSIMT.isSelected()){
					textField_SIMT.setEnabled(true);
					textField_SIMT.setText("");
					textField_SIMT.requestFocus();
				}
				else {
					textField_SIMT.setEnabled(false);
					textField_SIMT.setText("0");
				}
			}
		});
		chckbxSIMT.setBackground(new Color(255, 228, 225));
		chckbxSIMT.setFont(new Font("Comic Sans MS", Font.PLAIN, 17));
		chckbxSIMT.setBounds(20, 234, 286, 27);
		panel_2.add(chckbxSIMT);
		
		JCheckBox chckbxHIMC = new JCheckBox("Himalaya - Cleansing (RM18)");
		chckbxHIMC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxHIMC.isSelected()){
					textField_HIMC.setEnabled(true);
					textField_HIMC.setText("");
					textField_HIMC.requestFocus();
				}
				else {
					textField_HIMC.setEnabled(false);
					textField_HIMC.setText("0");
				}
			}
		});
		chckbxHIMC.setBackground(new Color(255, 228, 225));
		chckbxHIMC.setFont(new Font("Comic Sans MS", Font.PLAIN, 17));
		chckbxHIMC.setBounds(20, 264, 286, 27);
		panel_2.add(chckbxHIMC);
		
		JCheckBox chckbxHIMM = new JCheckBox("Himalaya - Moisturing (RM25)");
		chckbxHIMM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxHIMM.isSelected()){
					textField_HIMM.setEnabled(true);
					textField_HIMM.setText("");
					textField_HIMM.requestFocus();
				}
				else {
					textField_HIMM.setEnabled(false);
					textField_HIMM.setText("0");
				}
			}
		});
		chckbxHIMM.setBackground(new Color(255, 228, 225));
		chckbxHIMM.setFont(new Font("Comic Sans MS", Font.PLAIN, 17));
		chckbxHIMM.setBounds(20, 294, 286, 27);
		panel_2.add(chckbxHIMM);
		
		JCheckBox chckbxLOS = new JCheckBox("Loreal - Serum (RM60)");
		chckbxLOS.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxLOS.isSelected()){
					textField_LOS.setEnabled(true);
					textField_LOS.setText("");
					textField_LOS.requestFocus();
				}
				else {
					textField_LOS.setEnabled(false);
					textField_LOS.setText("0");
				}
			}
		});
		chckbxLOS.setBackground(new Color(255, 228, 225));
		chckbxLOS.setFont(new Font("Comic Sans MS", Font.PLAIN, 17));
		chckbxLOS.setBounds(20, 324, 311, 27);
		panel_2.add(chckbxLOS);
		
		JCheckBox chckbxLOM = new JCheckBox("Loreal - Moisturing (RM50)");
		chckbxLOM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxLOM.isSelected()){
					textField_LOM.setEnabled(true);
					textField_LOM.setText("");
					textField_LOM.requestFocus();
				}
				else {
					textField_LOM.setEnabled(false);
					textField_LOM.setText("0");
				}
			}
		});
		chckbxLOM.setBackground(new Color(255, 228, 225));
		chckbxLOM.setFont(new Font("Comic Sans MS", Font.PLAIN, 17));
		chckbxLOM.setBounds(20, 354, 286, 27);
		panel_2.add(chckbxLOM);
		
		JCheckBox chckbxBIOM = new JCheckBox("Biore - Moisturing (RM27)");
		chckbxBIOM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxBIOM.isSelected()){
					textField_BIOM.setEnabled(true);
					textField_BIOM.setText("");
					textField_BIOM.requestFocus();
				}
				else {
					textField_BIOM.setEnabled(false);
					textField_BIOM.setText("0");
				}
			}
		});
		chckbxBIOM.setBackground(new Color(255, 228, 225));
		chckbxBIOM.setFont(new Font("Comic Sans MS", Font.PLAIN, 17));
		chckbxBIOM.setBounds(20, 381, 286, 27);
		panel_2.add(chckbxBIOM);
		
		JCheckBox chckbxBIOT = new JCheckBox("Biore - Toner (RM22)");
		chckbxBIOT.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				if(chckbxBIOT.isSelected()){
					textField_BIOT.setEnabled(true);
					textField_BIOT.setText("");
					textField_BIOT.requestFocus();
				}
				else {
					textField_BIOT.setEnabled(false);
					textField_BIOT.setText("0");
				}
			}
		});
		
		chckbxBIOT.setBackground(new Color(255, 228, 225));
		chckbxBIOT.setFont(new Font("Comic Sans MS", Font.PLAIN, 17));
		chckbxBIOT.setBounds(20, 411, 286, 27);
		panel_2.add(chckbxBIOT);
		
		
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
		
		textField_SC = new JTextField();
		textField_SC.setHorizontalAlignment(SwingConstants.CENTER);
		textField_SC.setText("0");
		textField_SC.setBounds(365, 53, 156, 27);
		panel_2.add(textField_SC);
		textField_SC.setColumns(10);
		
		textField_SM = new JTextField();
		textField_SM.setText("0");
		textField_SM.setHorizontalAlignment(SwingConstants.CENTER);
		textField_SM.setColumns(10);
		textField_SM.setBounds(365, 84, 156, 27);
		panel_2.add(textField_SM);
		
		textField_ST = new JTextField();
		textField_ST.setHorizontalAlignment(SwingConstants.CENTER);
		textField_ST.setText("0");
		textField_ST.setColumns(10);
		textField_ST.setBounds(365, 114, 156, 27);
		panel_2.add(textField_ST);
		
		textField_SS = new JTextField();
		textField_SS.setHorizontalAlignment(SwingConstants.CENTER);
		textField_SS.setText("0");
		textField_SS.setColumns(10);
		textField_SS.setBounds(365, 144, 156, 27);
		panel_2.add(textField_SS);
		
		textField_SIMC = new JTextField();
		textField_SIMC.setHorizontalAlignment(SwingConstants.CENTER);
		textField_SIMC.setText("0");
		textField_SIMC.setColumns(10);
		textField_SIMC.setBounds(365, 174, 156, 27);
		panel_2.add(textField_SIMC);
		
		textField_SIMM = new JTextField();
		textField_SIMM.setHorizontalAlignment(SwingConstants.CENTER);
		textField_SIMM.setText("0");
		textField_SIMM.setColumns(10);
		textField_SIMM.setBounds(365, 204, 156, 27);
		panel_2.add(textField_SIMM);
		
		textField_SIMT = new JTextField();
		textField_SIMT.setHorizontalAlignment(SwingConstants.CENTER);
		textField_SIMT.setText("0");
		textField_SIMT.setColumns(10);
		textField_SIMT.setBounds(365, 234, 156, 27);
		panel_2.add(textField_SIMT);
		
		textField_HIMC = new JTextField();
		textField_HIMC.setText("0");
		textField_HIMC.setHorizontalAlignment(SwingConstants.CENTER);
		textField_HIMC.setColumns(10);
		textField_HIMC.setBounds(365, 264, 156, 27);
		panel_2.add(textField_HIMC);
		
		textField_HIMM = new JTextField();
		textField_HIMM.setText("0");
		textField_HIMM.setHorizontalAlignment(SwingConstants.CENTER);
		textField_HIMM.setColumns(10);
		textField_HIMM.setBounds(365, 294, 156, 27);
		panel_2.add(textField_HIMM);
		
		textField_LOS = new JTextField();
		textField_LOS.setText("0");
		textField_LOS.setHorizontalAlignment(SwingConstants.CENTER);
		textField_LOS.setColumns(10);
		textField_LOS.setBounds(365, 324, 156, 27);
		panel_2.add(textField_LOS);
		
		textField_BIOM = new JTextField();
		textField_BIOM.setText("0");
		textField_BIOM.setHorizontalAlignment(SwingConstants.CENTER);
		textField_BIOM.setColumns(10);
		textField_BIOM.setBounds(365, 384, 156, 27);
		panel_2.add(textField_BIOM);
		
		textField_BIOT = new JTextField();
		textField_BIOT.setText("0");
		textField_BIOT.setHorizontalAlignment(SwingConstants.CENTER);
		textField_BIOT.setColumns(10);
		textField_BIOT.setBounds(365, 414, 156, 27);
		panel_2.add(textField_BIOT);
		
		textField_LOM = new JTextField();
		textField_LOM.setBounds(365, 354, 156, 27);
		panel_2.add(textField_LOM);
		textField_LOM.setText("0");
		textField_LOM.setHorizontalAlignment(SwingConstants.CENTER);
		textField_LOM.setColumns(10);
		
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
				itemcost[0] = Integer.parseInt(textField_SC.getText()) *20;
				itemcost[1] = Integer.parseInt(textField_SM.getText()) *25;
				itemcost[2] = Integer.parseInt(textField_ST.getText()) *18;
				itemcost[3] = Integer.parseInt(textField_SS.getText()) *35;
				itemcost[4] = Integer.parseInt(textField_SIMC.getText()) *25;
				itemcost[5] = Integer.parseInt(textField_SIMM.getText()) *26;
				itemcost[6] = Integer.parseInt(textField_SIMT.getText()) *30;
				itemcost[7] = Integer.parseInt(textField_HIMC.getText()) *18;
				itemcost[8] = Integer.parseInt(textField_HIMM.getText()) *25;
				itemcost[9] = Integer.parseInt(textField_LOS.getText()) *60;
				itemcost[10] = Integer.parseInt(textField_LOM.getText()) *50;
				itemcost[11] = Integer.parseInt(textField_BIOM.getText()) *27;
				itemcost[12] = Integer.parseInt(textField_BIOT.getText()) *22;
				
				
				//DIVIDE INTO 2 TO ADD ALL ITEM
				itemcost[13] = itemcost[0] + itemcost[1] + itemcost[2] + itemcost[3] + itemcost[4] + itemcost[5] + itemcost[6];
				itemcost[14] = itemcost[7] + itemcost[8] + itemcost[9] + itemcost[10] + itemcost[11] + itemcost[12];
				
				//ARRAY [20] IS A TOTAL FOR ALL 
				itemcost[15] = itemcost[13] + itemcost[14];
				
				//PRINT FORMAT
				iTotal = String.format("RM " + itemcost[15]);
				
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
						"\nSafi-Cleansing\t\t\t" + textField_SC.getText() +
						"\nSafi-Moisturing\t\t\t" + textField_SM.getText() +
						"\nSafi-Toner\t\t\t" + textField_ST.getText() +
						"\nSafi-Serum\t\t\t" + textField_SS.getText() + 
						
						"\nSimple-Cleansing\t\t" + textField_SIMC.getText() +
						"\nSimple-Moisturing\t\t" + textField_SIMM.getText() +
						"\nSimple-Toner\t\t\t" + textField_SIMT.getText() +
						
						"\nHimalaya-Cleasing\t\t" + textField_HIMC.getText() +
						"\nHimalaya-Moisturing\t\t" + textField_HIMM.getText() +
						
						"\nLoreal-Serum\t\t\t" + textField_LOS.getText() +
						"\nLoreal-Moisturing\t\t" + textField_LOM.getText() +
						
						"\nBiore-Moisturing\t\t" + textField_BIOM.getText() + 
						"\nBiore-Toner\t\t\t" + textField_BIOT.getText() + 
						
						
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
				textField_SC.setEnabled(false);
				textField_SM.setEnabled(false);
				textField_ST.setEnabled(false);
				textField_SS.setEnabled(false);
				textField_SIMC.setEnabled(false);
				textField_SIMM.setEnabled(false);
				textField_SIMT.setEnabled(false);
				textField_HIMC.setEnabled(false);
				textField_HIMM.setEnabled(false);
				textField_LOS.setEnabled(false);
				textField_LOM.setEnabled(false);
				textField_BIOM.setEnabled(false);
				textField_BIOT.setEnabled(false);

				
				
				//RESET QUANTITY
				textField_SC.setText("0");
				textField_SM.setText("0");
				textField_ST.setText("0");
				textField_SS.setText("0");
				textField_SIMC.setText("0");
				textField_SIMM.setText("0");
				textField_SIMT.setText("0");
				textField_HIMC.setText("0");
				textField_HIMM.setText("0");
				textField_LOS.setText("0");
				textField_LOM.setText("0");
				textField_BIOM.setText("0");
				textField_BIOT.setText("0");
				

				//RESET CHECKBOX
				chckbxSC.setSelected(false);
				chckbxSM.setSelected(false);
				chckbxST.setSelected(false);
				chckbxSS.setSelected(false);
				chckbxSIMC.setSelected(false);
				chckbxSIMM.setSelected(false);
				chckbxSIMT.setSelected(false);
				chckbxHIMC.setSelected(false);
				chckbxHIMM.setSelected(false);
				chckbxLOS.setSelected(false);
				chckbxLOM.setSelected(false);
				chckbxBIOM.setSelected(false);
				chckbxBIOT.setSelected(false);
				
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
