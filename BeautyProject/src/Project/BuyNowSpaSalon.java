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

public class BuyNowSpaSalon {

	private JFrame frame;
	private JTextField textField_name;
	private JTextField textField_phone;
	private JTextField textField_email;
	private JTextField textField_address;
	private JTextField jtxtTotal;
	private JTextField textField_SM;
	private JTextField textField_AM;
	private JTextField textField_HS;
	private JTextField textField_R;
	private JTextField textField_SPM;
	private JTextField textField_RMP;
	private JTextField textField_FMP;
	private JTextField textField_NS;
	private JTextField textField_PARA;
	private JTextField textField_SMP;
	private JTextField textField_FSM;
	private JTextField textField_FC;
	private JTextField textField_FCM;
	private JTextField textField_FGM;
	private JTextField textField_CHARM;
	private JTextField textField_HC;
	private JTextField textField_HCW;
	private JTextField textField_HRS;
	private JTextArea jtxtReceipt_;
	
	String iTotal;
	int [] itemcost = new int[21];
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BuyNowSpaSalon window = new BuyNowSpaSalon();
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
	public BuyNowSpaSalon() {
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
		
		JComboBox comboBox_choose = new JComboBox();
		comboBox_choose.setModel(new DefaultComboBoxModel(new String[] {"- Please Select -", "Ala Charte", "Package"}));
		comboBox_choose.setBounds(180, 198, 232, 35);
		panel_1.add(comboBox_choose);
		
		JLabel lblNewLabel_7 = new JLabel("Address :");
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNewLabel_7.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		lblNewLabel_7.setBounds(56, 152, 114, 35);
		panel_1.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Choose :");
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
		
		JCheckBox chckbxSM = new JCheckBox("M - Swedish massage therapy RM59");
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
		chckbxSM.setBounds(20, 53, 339, 27);
		panel_2.add(chckbxSM);
		chckbxSM.setFont(new Font("Comic Sans MS", Font.PLAIN, 17));
		
		JCheckBox chckbxAM = new JCheckBox("M - Aromatherapy Massage RM59\r\n");
		chckbxAM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxAM.isSelected()){
					textField_AM.setEnabled(true);
					textField_AM.setText("");
					textField_AM.requestFocus();
				}
				else {
					textField_AM.setEnabled(false);
					textField_AM.setText("0");
				}
			}
		});
		chckbxAM.setBackground(new Color(255, 228, 225));
		chckbxAM.setFont(new Font("Comic Sans MS", Font.PLAIN, 17));
		chckbxAM.setBounds(20, 84, 339, 27);
		panel_2.add(chckbxAM);
		
		JCheckBox chckbxHS = new JCheckBox("M - Hot Stone RM59\r\n");
		chckbxHS.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxHS.isSelected()){
					textField_HS.setEnabled(true);
					textField_HS.setText("");
					textField_HS.requestFocus();
				}
				else {
					textField_HS.setEnabled(false);
					textField_HS.setText("0");
				}
			}
		});
		chckbxHS.setBackground(new Color(255, 228, 225));
		chckbxHS.setFont(new Font("Comic Sans MS", Font.PLAIN, 17));
		chckbxHS.setBounds(20, 114, 286, 27);
		panel_2.add(chckbxHS);
		
		JCheckBox chckbxR = new JCheckBox("M - Reflexology RM59");
		chckbxR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxR.isSelected()){
					textField_R.setEnabled(true);
					textField_R.setText("");
					textField_R.requestFocus();
				}
				else {
					textField_R.setEnabled(false);
					textField_R.setText("0");
				}
			}
		});
		chckbxR.setBackground(new Color(255, 228, 225));
		chckbxR.setFont(new Font("Comic Sans MS", Font.PLAIN, 17));
		chckbxR.setBounds(20, 144, 286, 27);
		panel_2.add(chckbxR);
		
		JCheckBox chckbxSPM = new JCheckBox("M - Sport Massage RM59");
		chckbxSPM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxSPM.isSelected()){
					textField_SPM.setEnabled(true);
					textField_SPM.setText("");
					textField_SPM.requestFocus();
				}
				else {
					textField_SPM.setEnabled(false);
					textField_SPM.setText("0");
				}
			}
		});
		chckbxSPM.setBackground(new Color(255, 228, 225));
		chckbxSPM.setFont(new Font("Comic Sans MS", Font.PLAIN, 17));
		chckbxSPM.setBounds(20, 174, 286, 27);
		panel_2.add(chckbxSPM);
		
		JCheckBox chckbxRMP = new JCheckBox("MP - Regular Mani&Pedi RM 45");
		chckbxRMP.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxRMP.isSelected()){
					textField_RMP.setEnabled(true);
					textField_RMP.setText("");
					textField_RMP.requestFocus();
				}
				else {
					textField_RMP.setEnabled(false);
					textField_RMP.setText("0");
				}
			}
		});
		chckbxRMP.setBackground(new Color(255, 228, 225));
		chckbxRMP.setFont(new Font("Comic Sans MS", Font.PLAIN, 17));
		chckbxRMP.setBounds(20, 204, 286, 27);
		panel_2.add(chckbxRMP);
		
		JCheckBox chckbxFMP = new JCheckBox("MP - French Mani/Pedi RM45");
		chckbxFMP.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxFMP.isSelected()){
					textField_FMP.setEnabled(true);
					textField_FMP.setText("");
					textField_FMP.requestFocus();
				}
				else {
					textField_FMP.setEnabled(false);
					textField_FMP.setText("0");
				}
			}
		});
		chckbxFMP.setBackground(new Color(255, 228, 225));
		chckbxFMP.setFont(new Font("Comic Sans MS", Font.PLAIN, 17));
		chckbxFMP.setBounds(20, 234, 286, 27);
		panel_2.add(chckbxFMP);
		
		JCheckBox chckbxNS = new JCheckBox("MP - Nail Spa RM45");
		chckbxNS.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxNS.isSelected()){
					textField_NS.setEnabled(true);
					textField_NS.setText("");
					textField_NS.requestFocus();
				}
				else {
					textField_NS.setEnabled(false);
					textField_NS.setText("0");
				}
			}
		});
		chckbxNS.setBackground(new Color(255, 228, 225));
		chckbxNS.setFont(new Font("Comic Sans MS", Font.PLAIN, 17));
		chckbxNS.setBounds(20, 264, 286, 27);
		panel_2.add(chckbxNS);
		
		JCheckBox chckbxPARA = new JCheckBox("MP - Parafin RM45");
		chckbxPARA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxPARA.isSelected()){
					textField_PARA.setEnabled(true);
					textField_PARA.setText("");
					textField_PARA.requestFocus();
				}
				else {
					textField_PARA.setEnabled(false);
					textField_PARA.setText("0");
				}
			}
		});
		chckbxPARA.setBackground(new Color(255, 228, 225));
		chckbxPARA.setFont(new Font("Comic Sans MS", Font.PLAIN, 17));
		chckbxPARA.setBounds(20, 294, 286, 27);
		panel_2.add(chckbxPARA);
		
		JCheckBox chckbxFE = new JCheckBox("MP - Stone Mani&Pedi RM45");
		chckbxFE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxFE.isSelected()){
					textField_SMP.setEnabled(true);
					textField_SMP.setText("");
					textField_SMP.requestFocus();
				}
				else {
					textField_SMP.setEnabled(false);
					textField_SMP.setText("0");
				}
			}
		});
		chckbxFE.setBackground(new Color(255, 228, 225));
		chckbxFE.setFont(new Font("Comic Sans MS", Font.PLAIN, 17));
		chckbxFE.setBounds(20, 324, 311, 27);
		panel_2.add(chckbxFE);
		
		JCheckBox chckbxFSM = new JCheckBox("F - Sheet Masks RM69");
		chckbxFSM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxFSM.isSelected()){
					textField_FSM.setEnabled(true);
					textField_FSM.setText("");
					textField_FSM.requestFocus();
				}
				else {
					textField_FSM.setEnabled(false);
					textField_FSM.setText("0");
				}
			}
		});
		chckbxFSM.setBackground(new Color(255, 228, 225));
		chckbxFSM.setFont(new Font("Comic Sans MS", Font.PLAIN, 17));
		chckbxFSM.setBounds(20, 354, 286, 27);
		panel_2.add(chckbxFSM);
		
		JCheckBox chckbxFC = new JCheckBox("F - Clay RM69");
		chckbxFC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxFC.isSelected()){
					textField_FC.setEnabled(true);
					textField_FC.setText("");
					textField_FC.requestFocus();
				}
				else {
					textField_FC.setEnabled(false);
					textField_FC.setText("0");
				}
			}
		});
		chckbxFC.setBackground(new Color(255, 228, 225));
		chckbxFC.setFont(new Font("Comic Sans MS", Font.PLAIN, 17));
		chckbxFC.setBounds(20, 384, 286, 27);
		panel_2.add(chckbxFC);
		
		JCheckBox chckbxFGM = new JCheckBox("F - Gel Masks RM69");
		chckbxFGM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxFGM.isSelected()){
					textField_FGM.setEnabled(true);
					textField_FGM.setText("");
					textField_FGM.requestFocus();
				}
				else {
					textField_FGM.setEnabled(false);
					textField_FGM.setText("0");
				}
			}
		});
		chckbxFGM.setBackground(new Color(255, 228, 225));
		chckbxFGM.setFont(new Font("Comic Sans MS", Font.PLAIN, 17));
		chckbxFGM.setBounds(20, 444, 286, 27);
		panel_2.add(chckbxFGM);
		
		JCheckBox chckbxCHARM = new JCheckBox("F - Charcoal Masks RM69");
		chckbxCHARM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxCHARM.isSelected()){
					textField_CHARM.setEnabled(true);
					textField_CHARM.setText("");
					textField_CHARM.requestFocus();
				}
				else {
					textField_CHARM.setEnabled(false);
					textField_CHARM.setText("0");
				}
			}
		});
		chckbxCHARM.setBackground(new Color(255, 228, 225));
		chckbxCHARM.setFont(new Font("Comic Sans MS", Font.PLAIN, 17));
		chckbxCHARM.setBounds(20, 474, 286, 27);
		panel_2.add(chckbxCHARM);
		
		JCheckBox chckbxHC = new JCheckBox("H - Cutting RM66");
		chckbxHC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxHC.isSelected()){
					textField_HC.setEnabled(true);
					textField_HC.setText("");
					textField_HC.requestFocus();
				}
				else {
					textField_HC.setEnabled(false);
					textField_HC.setText("0");
				}
			}
		});
		chckbxHC.setBackground(new Color(255, 228, 225));
		chckbxHC.setFont(new Font("Comic Sans MS", Font.PLAIN, 17));
		chckbxHC.setBounds(20, 504, 289, 27);
		panel_2.add(chckbxHC);
		
		JCheckBox chckbxFCM = new JCheckBox("F - Cream Masks RM69");
		chckbxFCM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxFCM.isSelected()){
					textField_FCM.setEnabled(true);
					textField_FCM.setText("");
					textField_FCM.requestFocus();
				}
				else {
					textField_FCM.setEnabled(false);
					textField_FCM.setText("0");
				}
			}
		});
		chckbxFCM.setBackground(new Color(255, 228, 225));
		chckbxFCM.setFont(new Font("Comic Sans MS", Font.PLAIN, 17));
		chckbxFCM.setBounds(20, 414, 286, 27);
		panel_2.add(chckbxFCM);
		
		JCheckBox chckbxHCW = new JCheckBox("H - Colouring&Washing RM66");
		chckbxHCW.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxHCW.isSelected()){
					textField_HCW.setEnabled(true);
					textField_HCW.setText("");
					textField_HCW.requestFocus();
				}
				else {
					textField_HCW.setEnabled(false);
					textField_HCW.setText("0");
				}
			}
		});
		chckbxHCW.setBackground(new Color(255, 228, 225));
		chckbxHCW.setFont(new Font("Comic Sans MS", Font.PLAIN, 17));
		chckbxHCW.setBounds(20, 534, 339, 23);
		panel_2.add(chckbxHCW);
		
		JCheckBox chckbxHRS = new JCheckBox("H - Rebonding&Stylist RM66");
		chckbxHRS.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxHRS.isSelected()){
					textField_HRS.setEnabled(true);
					textField_HRS.setText("");
					textField_HRS.requestFocus();
				}
				else {
					textField_HRS.setEnabled(false);
					textField_HRS.setText("0");
				}
			}
		});
		chckbxHRS.setBackground(new Color(255, 228, 225));
		chckbxHRS.setFont(new Font("Comic Sans MS", Font.PLAIN, 17));
		chckbxHRS.setBounds(20, 560, 339, 23);
		panel_2.add(chckbxHRS);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(new Color(250, 128, 114));
		panel_5.setBounds(10, 595, 529, 49);
		panel_2.add(panel_5);
		panel_5.setLayout(null);
		
		JLabel lblNewLabel_6 = new JLabel("TOTAL = ");
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNewLabel_6.setFont(new Font("Comic Sans MS", Font.PLAIN, 17));
		lblNewLabel_6.setBounds(28, -12, 153, 68);
		panel_5.add(lblNewLabel_6);
		
		jtxtTotal = new JTextField();
		jtxtTotal.setFont(new Font("Tahoma", Font.PLAIN, 11));
		jtxtTotal.setEditable(false);
		jtxtTotal.setBounds(192, 6, 271, 38);
		panel_5.add(jtxtTotal);
		jtxtTotal.setColumns(10);
		
		textField_SM = new JTextField();
		textField_SM.setHorizontalAlignment(SwingConstants.CENTER);
		textField_SM.setText("0");
		textField_SM.setBounds(365, 53, 156, 27);
		panel_2.add(textField_SM);
		textField_SM.setColumns(10);
		
		textField_AM = new JTextField();
		textField_AM.setText("0");
		textField_AM.setHorizontalAlignment(SwingConstants.CENTER);
		textField_AM.setColumns(10);
		textField_AM.setBounds(365, 84, 156, 27);
		panel_2.add(textField_AM);
		
		textField_HS = new JTextField();
		textField_HS.setHorizontalAlignment(SwingConstants.CENTER);
		textField_HS.setText("0");
		textField_HS.setColumns(10);
		textField_HS.setBounds(365, 114, 156, 27);
		panel_2.add(textField_HS);
		
		textField_R = new JTextField();
		textField_R.setHorizontalAlignment(SwingConstants.CENTER);
		textField_R.setText("0");
		textField_R.setColumns(10);
		textField_R.setBounds(365, 144, 156, 27);
		panel_2.add(textField_R);
		
		textField_SPM = new JTextField();
		textField_SPM.setHorizontalAlignment(SwingConstants.CENTER);
		textField_SPM.setText("0");
		textField_SPM.setColumns(10);
		textField_SPM.setBounds(365, 174, 156, 27);
		panel_2.add(textField_SPM);
		
		textField_RMP = new JTextField();
		textField_RMP.setHorizontalAlignment(SwingConstants.CENTER);
		textField_RMP.setText("0");
		textField_RMP.setColumns(10);
		textField_RMP.setBounds(365, 204, 156, 27);
		panel_2.add(textField_RMP);
		
		textField_FMP = new JTextField();
		textField_FMP.setHorizontalAlignment(SwingConstants.CENTER);
		textField_FMP.setText("0");
		textField_FMP.setColumns(10);
		textField_FMP.setBounds(365, 234, 156, 27);
		panel_2.add(textField_FMP);
		
		textField_NS = new JTextField();
		textField_NS.setText("0");
		textField_NS.setHorizontalAlignment(SwingConstants.CENTER);
		textField_NS.setColumns(10);
		textField_NS.setBounds(365, 264, 156, 27);
		panel_2.add(textField_NS);
		
		textField_PARA = new JTextField();
		textField_PARA.setText("0");
		textField_PARA.setHorizontalAlignment(SwingConstants.CENTER);
		textField_PARA.setColumns(10);
		textField_PARA.setBounds(365, 294, 156, 27);
		panel_2.add(textField_PARA);
		
		textField_SMP = new JTextField();
		textField_SMP.setText("0");
		textField_SMP.setHorizontalAlignment(SwingConstants.CENTER);
		textField_SMP.setColumns(10);
		textField_SMP.setBounds(365, 324, 156, 27);
		panel_2.add(textField_SMP);
		
		textField_FSM = new JTextField();
		textField_FSM.setText("0");
		textField_FSM.setHorizontalAlignment(SwingConstants.CENTER);
		textField_FSM.setColumns(10);
		textField_FSM.setBounds(365, 354, 156, 27);
		panel_2.add(textField_FSM);
		
		textField_FC = new JTextField();
		textField_FC.setText("0");
		textField_FC.setHorizontalAlignment(SwingConstants.CENTER);
		textField_FC.setColumns(10);
		textField_FC.setBounds(365, 384, 156, 27);
		panel_2.add(textField_FC);
		
		textField_FCM = new JTextField();
		textField_FCM.setText("0");
		textField_FCM.setHorizontalAlignment(SwingConstants.CENTER);
		textField_FCM.setColumns(10);
		textField_FCM.setBounds(365, 414, 156, 27);
		panel_2.add(textField_FCM);
		
		textField_FGM = new JTextField();
		textField_FGM.setText("0");
		textField_FGM.setHorizontalAlignment(SwingConstants.CENTER);
		textField_FGM.setColumns(10);
		textField_FGM.setBounds(365, 444, 156, 27);
		panel_2.add(textField_FGM);
		
		textField_CHARM = new JTextField();
		textField_CHARM.setText("0");
		textField_CHARM.setHorizontalAlignment(SwingConstants.CENTER);
		textField_CHARM.setColumns(10);
		textField_CHARM.setBounds(365, 474, 156, 27);
		panel_2.add(textField_CHARM);
		
		textField_HC = new JTextField();
		textField_HC.setText("0");
		textField_HC.setHorizontalAlignment(SwingConstants.CENTER);
		textField_HC.setColumns(10);
		textField_HC.setBounds(365, 504, 156, 27);
		panel_2.add(textField_HC);
		
		
		textField_HCW = new JTextField();
		textField_HCW.setText("0");
		textField_HCW.setHorizontalAlignment(SwingConstants.CENTER);
		textField_HCW.setColumns(10);
		textField_HCW.setBounds(365, 534, 156, 27);
		panel_2.add(textField_HCW);
		
		
		textField_HRS = new JTextField();
		textField_HRS.setHorizontalAlignment(SwingConstants.CENTER);
		textField_HRS.setText("0");
		textField_HRS.setBounds(365, 564, 156, 27);
		panel_2.add(textField_HRS);
		textField_HRS.setColumns(10);
		
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
				itemcost[0] = Integer.parseInt(textField_SM.getText()) *59;
				itemcost[1] = Integer.parseInt(textField_AM.getText()) *59;
				itemcost[2] = Integer.parseInt(textField_HS.getText()) *59;
				itemcost[3] = Integer.parseInt(textField_R.getText()) *59;
				itemcost[4] = Integer.parseInt(textField_SPM.getText()) *59;
				itemcost[5] = Integer.parseInt(textField_RMP.getText()) *45;
				itemcost[6] = Integer.parseInt(textField_FMP.getText()) *45;
				itemcost[7] = Integer.parseInt(textField_NS.getText()) *45;
				itemcost[8] = Integer.parseInt(textField_PARA.getText()) *45;
				itemcost[9] = Integer.parseInt(textField_SMP.getText()) *45;
				itemcost[10] = Integer.parseInt(textField_FSM.getText()) *69;
				itemcost[11] = Integer.parseInt(textField_FC.getText()) *69;
				itemcost[12] = Integer.parseInt(textField_FCM.getText()) *69;
				itemcost[13] = Integer.parseInt(textField_FGM.getText()) *69;
				itemcost[14] = Integer.parseInt(textField_CHARM.getText()) *69;
				itemcost[15] = Integer.parseInt(textField_HC.getText()) *66;
				itemcost[16] = Integer.parseInt(textField_HCW.getText())*66;
				itemcost[17] = Integer.parseInt(textField_HRS.getText())*66;
				
				
				//DIVIDE INTO 2 TO ADD ALL ITEM
				itemcost[18] = itemcost[0] + itemcost[1] + itemcost[2] + itemcost[3] + itemcost[4] + itemcost[5] + itemcost[6] + itemcost[7] + itemcost[8] + itemcost[9];;
				itemcost[19] = itemcost[10] + itemcost[11] + itemcost[12] + itemcost[13] + itemcost[14] + itemcost[15] + itemcost[16] + itemcost[17];
				
				//ARRAY [20] IS A TOTAL FOR ALL 
				itemcost[20] = itemcost[19] + itemcost[18];
				
				//PRINT FORMAT
				iTotal = String.format("RM " + itemcost[20]);
				
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
						"\nYou choose: " + comboBox_choose.getSelectedItem() +
						"\n===================================================\t" +
						"\nM - Swedish Massage Therapy\t\t" + textField_SM.getText() +
						"\nM - Aromatherapy Massage\t\t" + textField_AM.getText() +
						"\nM - Hot Stone\t\t\t" + textField_HS.getText() +
						"\nM - Reflexology\t\t\t" + textField_R.getText() + 
						"\nM - Sport Massage\t\t" + textField_SPM.getText() +
						
						"\nMP - Regular Mani&Pedi\t\t" + textField_RMP.getText() +
						"\nMP - French Mani/Pedi\t\t" + textField_FMP.getText() +
						"\nMP - Nail Spa\t\t\t" + textField_NS.getText() +
						"\nMP - Parafin\t\t\t" + textField_PARA.getText() +
						"\nMP - Stone Mani&Pedi\t\t" + textField_SMP.getText() +
						
						"\nF - Sheet Masks\t\t" + textField_FSM.getText() +
						"\nF - Clay\t\t\t" + textField_FC.getText() +
						"\nF - Cream Masks\t\t" + textField_FCM.getText() + 
						"\nF - Gel Masks\t\t\t" + textField_FGM.getText() + 
						"\nF - Charcoal Masks\t\t" + textField_CHARM.getText() +
						
						"\nH - Cutting\t\t\t" + textField_HC.getText() + 
						"\nH - Colouring&Washing\t\t" + textField_HCW.getText() +
						"\nH - Rebonding&Stylist\t\t" + textField_HRS.getText() +
						
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
				comboBox_choose.setSelectedIndex(0);
				
				//CHANGE ENABLE TO FALSE FOR TEXTFIELD QUANTITY
				textField_SM.setEnabled(false);
				textField_AM.setEnabled(false);
				textField_HS.setEnabled(false);
				textField_R.setEnabled(false);
				textField_SPM.setEnabled(false);
				textField_RMP.setEnabled(false);
				textField_FMP.setEnabled(false);
				textField_NS.setEnabled(false);
				textField_PARA.setEnabled(false);
				textField_SMP.setEnabled(false);
				textField_FSM.setEnabled(false);
				textField_FC.setEnabled(false);
				textField_FCM.setEnabled(false);
				textField_FGM.setEnabled(false);
				textField_CHARM.setEnabled(false);
				textField_HC.setEnabled(false);
				textField_HCW.setEnabled(false);
				textField_HRS.setEnabled(false);
				
				//RESET QUANTITY
				textField_SM.setText("0");
				textField_AM.setText("0");
				textField_HS.setText("0");
				textField_R.setText("0");
				textField_SPM.setText("0");
				textField_RMP.setText("0");
				textField_FMP.setText("0");
				textField_NS.setText("0");
				textField_PARA.setText("0");
				textField_SMP.setText("0");
				textField_FSM.setText("0");
				textField_FC.setText("0");
				textField_FCM.setText("0");
				textField_FGM.setText("0");
				textField_CHARM.setText("0");
				textField_HC.setText("0");
				textField_HCW.setText("0");
				textField_HRS.setText("0");
				
				//RESET CHECKBOX
				chckbxSM.setSelected(false);
				chckbxAM.setSelected(false);
				chckbxHS.setSelected(false);
				chckbxR.setSelected(false);
				chckbxSPM.setSelected(false);
				chckbxRMP.setSelected(false);
				chckbxFMP.setSelected(false);
				chckbxNS.setSelected(false);
				chckbxPARA.setSelected(false);
				chckbxFE.setSelected(false);
				chckbxFSM.setSelected(false);
				chckbxFC.setSelected(false);
				chckbxFCM.setSelected(false);
				chckbxFGM.setSelected(false);
				chckbxCHARM.setSelected(false);
				chckbxHC.setSelected(false);
				chckbxHCW.setSelected(false);
				chckbxHRS.setSelected(false);
				
				
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
