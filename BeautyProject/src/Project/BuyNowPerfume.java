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
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;

public class BuyNowPerfume {

   private JFrame frame;
   private JTextField textField_name;
   private JTextField textField_phone;
   private JTextField textField_email;
   private JTextField textField_address;
   private JTextField jtxtTotal;
   private JTextField textFieldDFHE;
   private JTextField textFieldDFHI;
   private JTextField textFieldCFHE;
   private JTextField textFieldVSFHE;
   private JTextField textFieldGFHE;
   private JTextField textFieldBFHE;
   private JTextField textFieldBFHI;
   private JTextField textFieldHBFHI;
   private JTextArea jtxtReceipt_;
	
   String iTotal;
   int [] itemcost = new int[11];

	/**
	 * Launch the application.
	 */
   public static void main(String[] args) {
      EventQueue.invokeLater(
         new Runnable() {
            public void run() {
               try {
                  BuyNowPerfume window = new BuyNowPerfume();
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
   public BuyNowPerfume() {
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
      comboBox_location.setModel(new DefaultComboBoxModel(new String[] {"- Please Select -", "Shopee"}));
      comboBox_location.setBounds(180, 198, 232, 35);
      panel_1.add(comboBox_location);
   	
      JLabel lblNewLabel_7 = new JLabel("Address :");
      lblNewLabel_7.setHorizontalAlignment(SwingConstants.TRAILING);
      lblNewLabel_7.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
      lblNewLabel_7.setBounds(56, 152, 114, 35);
      panel_1.add(lblNewLabel_7);
   	
      JLabel lblNewLabel_8 = new JLabel("Online Shop");
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
   	
      JCheckBox chckbxDFHE = new JCheckBox("DKNY - For Her (RM 89)");
      chckbxDFHE.addActionListener(
         new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               if(chckbxDFHE.isSelected()){
                  textFieldDFHE.setEnabled(true);
                  textFieldDFHE.setText("");
                  textFieldDFHE.requestFocus();
               }
               else {
                  textFieldDFHE.setEnabled(false);
                  textFieldDFHE.setText("0");
               }
            }
         });
      chckbxDFHE.setBackground(new Color(255, 228, 225));
      chckbxDFHE.setBounds(20, 53, 286, 27);
      panel_2.add(chckbxDFHE);
      chckbxDFHE.setFont(new Font("Comic Sans MS", Font.PLAIN, 17));
   	
      JCheckBox chckbxDFHI = new JCheckBox("DKNY - For Him (RM 89)");
      chckbxDFHI.addActionListener(
         new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               if(chckbxDFHI.isSelected()){
                  textFieldDFHI.setEnabled(true);
                  textFieldDFHI.setText("");
                  textFieldDFHI.requestFocus();
               }
               else {
                  textFieldDFHI.setEnabled(false);
                  textFieldDFHI.setText("0");
               }
            }
         });
      chckbxDFHI.setBackground(new Color(255, 228, 225));
      chckbxDFHI.setFont(new Font("Comic Sans MS", Font.PLAIN, 17));
      chckbxDFHI.setBounds(20, 84, 286, 27);
      panel_2.add(chckbxDFHI);
   	
      JCheckBox chckbxCFHE = new JCheckBox("CK - For Her (RM 90)");
      chckbxCFHE.addActionListener(
         new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               if(chckbxCFHE.isSelected()){
                  textFieldCFHE.setEnabled(true);
                  textFieldCFHE.setText("");
                  textFieldCFHE.requestFocus();
               }
               else {
                  textFieldCFHE.setEnabled(false);
                  textFieldCFHE.setText("0");
               }
            }
         });
      chckbxCFHE.setBackground(new Color(255, 228, 225));
      chckbxCFHE.setFont(new Font("Comic Sans MS", Font.PLAIN, 17));
      chckbxCFHE.setBounds(20, 114, 286, 27);
      panel_2.add(chckbxCFHE);
   	
      JCheckBox chckbxVSFHE = new JCheckBox("Victoria Secret - For Her (RM 120)");
      chckbxVSFHE.addActionListener(
         new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               if(chckbxVSFHE.isSelected()){
                  textFieldVSFHE.setEnabled(true);
                  textFieldVSFHE.setText("");
                  textFieldVSFHE.requestFocus();
               }
               else {
                  textFieldVSFHE.setEnabled(false);
                  textFieldVSFHE.setText("0");
               }
            }
         });
      chckbxVSFHE.setBackground(new Color(255, 228, 225));
      chckbxVSFHE.setFont(new Font("Comic Sans MS", Font.PLAIN, 17));
      chckbxVSFHE.setBounds(20, 144, 311, 27);
      panel_2.add(chckbxVSFHE);
   	
      JCheckBox chckbxGFHE = new JCheckBox("Givenchy - For Her (RM 80)");
      chckbxGFHE.addActionListener(
         new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               if(chckbxGFHE.isSelected()){
                  textFieldGFHE.setEnabled(true);
                  textFieldGFHE.setText("");
                  textFieldGFHE.requestFocus();
               }
               else {
                  textFieldGFHE.setEnabled(false);
                  textFieldGFHE.setText("0");
               }
            }
         });
      chckbxGFHE.setBackground(new Color(255, 228, 225));
      chckbxGFHE.setFont(new Font("Comic Sans MS", Font.PLAIN, 17));
      chckbxGFHE.setBounds(20, 174, 286, 27);
      panel_2.add(chckbxGFHE);
   	
      JCheckBox chckbxBFHE = new JCheckBox("Bulgari - For Her (RM 130)");
      chckbxBFHE.addActionListener(
         new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               if(chckbxBFHE.isSelected()){
                  textFieldBFHE.setEnabled(true);
                  textFieldBFHE.setText("");
                  textFieldBFHE.requestFocus();
               }
               else {
                  textFieldBFHE.setEnabled(false);
                  textFieldBFHE.setText("0");
               }
            }
         });
      chckbxBFHE.setBackground(new Color(255, 228, 225));
      chckbxBFHE.setFont(new Font("Comic Sans MS", Font.PLAIN, 17));
      chckbxBFHE.setBounds(20, 204, 286, 27);
      panel_2.add(chckbxBFHE);
   	
      JCheckBox chckbxBFHI = new JCheckBox("Bulgari - For Him (RM 130)");
      chckbxBFHI.addActionListener(
         new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               if(chckbxBFHI.isSelected()){
                  textFieldBFHI.setEnabled(true);
                  textFieldBFHI.setText("");
                  textFieldBFHI.requestFocus();
               }
               else {
                  textFieldBFHI.setEnabled(false);
                  textFieldBFHI.setText("0");
               }
            }
         });
      chckbxBFHI.setBackground(new Color(255, 228, 225));
      chckbxBFHI.setFont(new Font("Comic Sans MS", Font.PLAIN, 17));
      chckbxBFHI.setBounds(20, 234, 286, 27);
      panel_2.add(chckbxBFHI);
   	
      JCheckBox chckbxHBFHI = new JCheckBox("Hugo Boss - For Him (RM 85)");
      chckbxHBFHI.addActionListener(
         new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               if(chckbxHBFHI.isSelected()){
                  textFieldHBFHI.setEnabled(true);
                  textFieldHBFHI.setText("");
                  textFieldHBFHI.requestFocus();
               }
               else {
                  textFieldHBFHI.setEnabled(false);
                  textFieldHBFHI.setText("0");
               }
            }
         });
      chckbxHBFHI.setBackground(new Color(255, 228, 225));
      chckbxHBFHI.setFont(new Font("Comic Sans MS", Font.PLAIN, 17));
      chckbxHBFHI.setBounds(20, 264, 286, 27);
      panel_2.add(chckbxHBFHI);
      
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
   	
      textFieldDFHE = new JTextField();
      textFieldDFHE.setHorizontalAlignment(SwingConstants.CENTER);
      textFieldDFHE.setText("0");
      textFieldDFHE.setBounds(365, 53, 156, 27);
      panel_2.add(textFieldDFHE);
      textFieldDFHE.setColumns(10);
   	
      textFieldDFHI = new JTextField();
      textFieldDFHI.setText("0");
      textFieldDFHI.setHorizontalAlignment(SwingConstants.CENTER);
      textFieldDFHI.setColumns(10);
      textFieldDFHI.setBounds(365, 84, 156, 27);
      panel_2.add(textFieldDFHI);
   	
      textFieldCFHE = new JTextField();
      textFieldCFHE.setHorizontalAlignment(SwingConstants.CENTER);
      textFieldCFHE.setText("0");
      textFieldCFHE.setColumns(10);
      textFieldCFHE.setBounds(365, 114, 156, 27);
      panel_2.add(textFieldCFHE);
   	
      textFieldVSFHE = new JTextField();
      textFieldVSFHE.setHorizontalAlignment(SwingConstants.CENTER);
      textFieldVSFHE.setText("0");
      textFieldVSFHE.setColumns(10);
      textFieldVSFHE.setBounds(365, 144, 156, 27);
      panel_2.add(textFieldVSFHE);
   	
      textFieldGFHE = new JTextField();
      textFieldGFHE.setHorizontalAlignment(SwingConstants.CENTER);
      textFieldGFHE.setText("0");
      textFieldGFHE.setColumns(10);
      textFieldGFHE.setBounds(365, 174, 156, 27);
      panel_2.add(textFieldGFHE);
   	
      textFieldBFHE = new JTextField();
      textFieldBFHE.setHorizontalAlignment(SwingConstants.CENTER);
      textFieldBFHE.setText("0");
      textFieldBFHE.setColumns(10);
      textFieldBFHE.setBounds(365, 204, 156, 27);
      panel_2.add(textFieldBFHE);
   	
      textFieldBFHI = new JTextField();
      textFieldBFHI.setHorizontalAlignment(SwingConstants.CENTER);
      textFieldBFHI.setText("0");
      textFieldBFHI.setColumns(10);
      textFieldBFHI.setBounds(365, 234, 156, 27);
      panel_2.add(textFieldBFHI);
   	
      textFieldHBFHI = new JTextField();
      textFieldHBFHI.setText("0");
      textFieldHBFHI.setHorizontalAlignment(SwingConstants.CENTER);
      textFieldHBFHI.setColumns(10);
      textFieldHBFHI.setBounds(365, 264, 156, 27);
      panel_2.add(textFieldHBFHI);
      
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
      btnNewButton.addActionListener(
         new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	//DECLARE EACH TEXTFIELD QUANTITY AND MULTIPLY TO THE PRICE
            	itemcost[0] = Integer.parseInt(textFieldDFHE.getText()) *89;
            	itemcost[1] = Integer.parseInt(textFieldDFHI.getText()) *89;
            	itemcost[2] = Integer.parseInt(textFieldCFHE.getText()) *90;
            	itemcost[3] = Integer.parseInt(textFieldVSFHE.getText()) *120;
            	itemcost[4] = Integer.parseInt(textFieldGFHE.getText()) *80;
            	itemcost[5] = Integer.parseInt(textFieldBFHE.getText()) *130;
            	itemcost[6] = Integer.parseInt(textFieldBFHI.getText()) *130;
            	itemcost[7] = Integer.parseInt(textFieldHBFHI.getText()) *85;
            	
            	//DIVIDE INTO 2 TO ADD ALL ITEM
            	itemcost[8] = itemcost[0] + itemcost[1] + itemcost[2] + itemcost[3];
            	itemcost[9] = itemcost[4] + itemcost[5] + itemcost[6] + itemcost[7];
            	
            	//ARRAY [10] IS A TOTAL FOR ALL 
            	itemcost[10] = itemcost[8] + itemcost[9];
            	
            	//PRINT FORMAT
            	iTotal = String.format("RM " + itemcost[10]);
            	
            	//CALL FOR OUTPUT
            	jtxtTotal.setText(iTotal);
            	
            }
         }); 
      btnNewButton.setFont(new Font("Comic Sans MS", Font.PLAIN, 23));
      btnNewButton.setBounds(41, 11, 166, 57);
      panel_3.add(btnNewButton);
   	
   	//PRINT RECEIPT CODE
      JButton btnPrint = new JButton("RECEIPT");
      btnPrint.addActionListener(
         new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               jtxtReceipt_1.append("\tCustomer Billing System\n" +
                  "\n===================================================\t" +
                  "\nName:" + textField_name.getText() +
                  "\nPhone Number:" + textField_phone.getText() +
                  "\nEmail:" + textField_email.getText() +
                  "\nAddress:" + textField_address.getText() +
                  "\nOnline shop select: " + comboBox_location.getSelectedItem() +
                  "\n===================================================\t" +
                  "\nDKNY-For Her\t\t\t" + textFieldDFHE.getText() +
                  "\nDKNY-For Him\t\t\t" + textFieldDFHI.getText() +
                  "\nCK-For Her\t\t\t" + textFieldCFHE.getText() +
                  "\nVictoria Secret-For Her\t\t" + textFieldVSFHE.getText() + 
                  
                  "\nGivenchy-For Her\t\t" + textFieldGFHE.getText() +
                  "\nBulgari-For Her\t\t\t" + textFieldBFHE.getText() +
                  "\nBulgari-For Him\t\t\t" + textFieldBFHI.getText() +
                  "\nHugo Boss-For Him\t\t" + textFieldHBFHI.getText() +
                  
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
      btnReset.addActionListener(
         new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            //RESET INFORMATION
               textField_name.setText(null);
               textField_phone.setText(null);
               textField_email.setText(null);
               textField_address.setText(null);
               comboBox_location.setSelectedIndex(0);
            
            //CHANGE ENABLE TO FALSE FOR TEXTFIELD QUANTITY
               textFieldDFHE.setEnabled(false);
               textFieldDFHI.setEnabled(false);
               textFieldCFHE.setEnabled(false);
               textFieldVSFHE.setEnabled(false);
               textFieldGFHE.setEnabled(false);
               textFieldBFHE.setEnabled(false);
               textFieldBFHI.setEnabled(false);
               textFieldHBFHI.setEnabled(false);
              
            
            //RESET QUANTITY
               textFieldDFHE.setText("0");
               textFieldDFHI.setText("0");
               textFieldCFHE.setText("0");
               textFieldVSFHE.setText("0");
               textFieldGFHE.setText("0");
               textFieldBFHE.setText("0");
               textFieldBFHI.setText("0");
               textFieldHBFHI.setText("0");
           
            //RESET CHECKBOX
               chckbxDFHE.setSelected(false);
               chckbxDFHI.setSelected(false);
               chckbxCFHE.setSelected(false);
               chckbxVSFHE.setSelected(false);
               chckbxGFHE.setSelected(false);
               chckbxBFHE.setSelected(false);
               chckbxBFHI.setSelected(false);
               chckbxHBFHI.setSelected(false);
             
            
            }
         });
      btnReset.setFont(new Font("Comic Sans MS", Font.PLAIN, 23));
      btnReset.setBounds(41, 79, 166, 57);
      panel_3.add(btnReset);
   	
   	//SAVE TO TXT FILE
      JButton btnSave = new JButton("SAVE");
      btnSave.addActionListener(
         new ActionListener() {
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
      btnExit.addActionListener(
         new ActionListener() {
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
