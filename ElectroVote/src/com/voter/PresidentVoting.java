package com.voter;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class PresidentVoting extends JFrame implements ActionListener
	{
		//GUI Variables
		JLabel lblChoose,lblPres,lblIcon;
		JButton createAcc,signUp,btnNext;
		JPanel p1,p2;
		JRadioButton pres1,pres2,pres3,pres4,pres5,pres6,pres7,pres8,pres9,pres10,abstain;
		JLabel iconPres1,iconPres2,iconPres3,iconPres4,iconPres5,iconPres6,iconPres7,iconPres8,iconPres9,iconPres10;
		ButtonGroup presiBtn;
		//Private Static Data Variables
		private static String chosenPresident;
		//Boolean Variable for Logic
		boolean hasSelected = false;
		public PresidentVoting() 
		{
			//Frame Name
			super("ElectroVote");
			//Panel
			p1=new JPanel();
			p2=new JPanel();
			p2.setBackground(new Color(160,160,160));
			p2.setBounds(0, 0, 1024, 75);
			p1.setBackground(new Color(224,224,224));
			p1.setLayout(null);
			
			//Labels
			lblIcon = new JLabel("");
			lblIcon.setIcon(new ImageIcon("Logo.png"));
			lblIcon.setBounds(-55, -18, 490, 119);
			
			lblChoose=new JLabel("Presidents (Choose 1)");
			lblChoose.setBounds(424, 74, 269, 43);
			lblChoose.setFont(new Font("Microsoft JhengHei Light", Font.PLAIN, 20));
			
			iconPres1 = new JLabel("");
			iconPres1.setBounds(10, 125, 200, 136);
			iconPres1.setIcon(new ImageIcon("1. Abella, Ernie.png"));
			
			iconPres2 = new JLabel("");
			iconPres2.setBounds(219, 111, 176, 149);
			iconPres2.setIcon(new ImageIcon("2. De Guzman, Leody.png"));
			
			iconPres3 = new JLabel("");
			iconPres3.setBounds(436, 125, 204, 136);
			iconPres3.setIcon(new ImageIcon("3. Domagoso, Isko Moreno.png"));
			
			iconPres4 = new JLabel("");
			iconPres4.setBounds(617, 129, 200, 132);
			iconPres4.setIcon(new ImageIcon("4. Gonzales, Norberto.png"));
			
			iconPres5 = new JLabel("");
			iconPres5.setBounds(793, 111, 176, 158);
			iconPres5.setIcon(new ImageIcon("5. Lacson, Ping.png"));
			
			iconPres6 = new JLabel("");
			iconPres6.setBounds(10, 312, 190, 128);
			iconPres6.setIcon(new ImageIcon("6. Mangondato, Faisal.png"));
			
			iconPres7 = new JLabel("");
			iconPres7.setBounds(210, 311, 187, 141);
			iconPres7.setIcon(new ImageIcon("7. Marcos, Bongbong.png"));
			
			iconPres8 = new JLabel("");
			iconPres8.setBounds(425, 304, 187, 136);
			iconPres8.setIcon(new ImageIcon("8. Montemayor, Jose.png"));
			
			iconPres9 = new JLabel("");
			iconPres9.setBounds(617, 294, 187, 158);
			iconPres9.setIcon(new ImageIcon("9. Pacquiao, Manny Pacman.png"));
			
			iconPres10 = new JLabel("");
			iconPres10.setBounds(798, 298, 200, 141);
			iconPres10.setIcon(new ImageIcon("10. Robredo, Leni.png"));
			//RadioButton
			pres1 = new JRadioButton("Ernie Abella");
			pres1.setFont(new Font("Microsoft JhengHei Light", Font.PLAIN, 15));
			pres1.setBackground(new Color(224,224,224));
			pres1.setBounds(36, 267, 109, 23);
			
			pres2 = new JRadioButton("Leody De Guzman");
			pres2.setFont(new Font("Microsoft JhengHei Light", Font.PLAIN, 15));
			pres2.setBackground(new Color(224,224,224));
			pres2.setBounds(235, 267, 190, 23);
			
			pres3 = new JRadioButton("Isko Moreno Domagoso");
			pres3.setFont(new Font("Microsoft JhengHei Light", Font.PLAIN, 15));
			pres3.setBackground(new Color(224,224,224));
			pres3.setBounds(434, 268, 206, 23);
			
			pres4 = new JRadioButton("Norberto Gonzalez");
			pres4.setFont(new Font("Microsoft JhengHei Light", Font.PLAIN, 15));
			pres4.setBackground(new Color(224,224,224));
			pres4.setBounds(660, 268, 162, 23);
			
			pres5 = new JRadioButton("Ping Lacson");
			pres5.setFont(new Font("Microsoft JhengHei Light", Font.PLAIN, 15));
			pres5.setBackground(new Color(224,224,224));
			pres5.setBounds(845, 268, 124, 23);
			
			pres6 = new JRadioButton("Fiscal Mangondata");
			pres6.setFont(new Font("Microsoft JhengHei Light", Font.PLAIN, 15));
			pres6.setBackground(new Color(224,224,224));
			pres6.setBounds(36, 446, 176, 23);
		
			pres7 = new JRadioButton("Bongbong Marcos");
			pres7.setFont(new Font("Microsoft JhengHei Light", Font.PLAIN, 15));
			pres7.setBackground(new Color(224,224,224));
			pres7.setBounds(235, 446, 160, 23);
			
			pres8 = new JRadioButton("Jose Montemayor Jr.");
			pres8.setFont(new Font("Microsoft JhengHei Light", Font.PLAIN, 15));
			pres8.setBackground(new Color(224,224,224));
			pres8.setBounds(434, 446, 170, 23);
			
			pres9 = new JRadioButton("Manny Pacquiao");
			pres9.setFont(new Font("Microsoft JhengHei Light", Font.PLAIN, 15));
			pres9.setBackground(new Color(224,224,224));
			pres9.setBounds(660, 446, 176, 23);
			
			pres10 = new JRadioButton("Leni Robredo");
			pres10.setFont(new Font("Microsoft JhengHei Light", Font.PLAIN, 15));
			pres10.setBackground(new Color(224,224,224));
			pres10.setBounds(845, 446, 132, 23);
			//Buttons
			btnNext = new JButton("Next");
			btnNext.setBackground(new Color(160,160,160));
			btnNext.setFont(new Font("Microsoft JhengHei Light", Font.PLAIN, 20));
			btnNext.setBounds(837, 483, 161, 43);
			btnNext.addActionListener(this);
			
			abstain = new JRadioButton("ABSTAIN");
			abstain.setBackground(new Color(224,224,224));
			abstain.setFont(new Font("Microsoft JhengHei Light", Font.PLAIN, 15));
			abstain.setBounds(447, 496, 109, 23);
			//ButtonGroup
			presiBtn =new ButtonGroup();
			presiBtn.add(pres1);presiBtn.add(pres2);presiBtn.add(pres3);presiBtn.add(pres4);presiBtn.add(pres5);
			presiBtn.add(pres6);presiBtn.add(pres7);presiBtn.add(pres8);presiBtn.add(pres9);presiBtn.add(pres10);
			presiBtn.add(abstain);
			//Panel Contents
			p1.add(lblIcon);p1.add(lblChoose);p1.add(p2);
			p1.add(iconPres1);p1.add(pres1);p1.add(iconPres2);
			p1.add(pres2);p1.add(iconPres3);p1.add(pres3);
			p1.add(iconPres4);p1.add(pres4);p1.add(pres5);
			p1.add(iconPres5);p1.add(iconPres6);p1.add(pres6);
			p1.add(iconPres7);p1.add(pres7);p1.add(iconPres8);
			p1.add(pres8);p1.add(iconPres9);p1.add(pres9);
			p1.add(pres10);p1.add(iconPres10);p1.add(btnNext);
			p1.add(abstain);
			//Frame Content
			getContentPane().add(p1);
			//Frame Characteristics
			setSize(1024,576);
			setLocationRelativeTo(null);
			setVisible(true);
		}
		//Actions for Buttons
		public void actionPerformed(ActionEvent e) 
		{
		//Determines choice and assigns to variable that will be passed
		 if(pres1.isSelected())
		 {
			 chosenPresident=pres1.getText();
			 hasSelected=true;
		 }
		 if(pres2.isSelected())
		 {
			 chosenPresident=pres2.getText();
			 hasSelected=true;
		 }
		 if(pres3.isSelected())
		 {
			 chosenPresident=pres3.getText();
			 hasSelected=true;
		 }
		 if(pres4.isSelected())
		 {
			 chosenPresident=pres4.getText();
			 hasSelected=true;
		 }
		 if(pres5.isSelected())
		 {
			 chosenPresident=pres5.getText();
			 hasSelected=true;
		 }
		 if(pres6.isSelected())
		 {
			 chosenPresident=pres6.getText(); 
			 hasSelected=true;
		 }
		 if(pres7.isSelected())
		 {
			 chosenPresident=pres7.getText();
			 hasSelected=true;
		 }
		 if(pres8.isSelected())
		 {
			 chosenPresident=pres8.getText();
			 hasSelected=true;
		 }
		 if(pres9.isSelected())
		 {
			 chosenPresident=pres9.getText();
			 hasSelected=true;
		 }
		 if(pres10.isSelected())
		 {
			 chosenPresident=pres10.getText();
			 hasSelected=true;
		 }
		 if(abstain.isSelected())
		 {
			 chosenPresident = abstain.getText();
			 hasSelected=true;
		 }
		 //determines if user selected an option or not
		 if(!hasSelected)
		 {
				JOptionPane.showMessageDialog(null, "You have not selected an option" ,"Error",0);
		 }
		 if(hasSelected)
		 {
		 dispose();
		 VicePresidentVoting vp = new VicePresidentVoting();
		 }
		
		}
		//getter to pass the data  to another class
		 protected String getChosenPresident()
			{
				return chosenPresident;
			}
		
		}