package com.voter;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class VicePresidentVoting extends JFrame implements ActionListener
{
	JLabel lbl1,lblPres, lblVPIcon1,lblVPIcon2,lblVPIcon3,lblVPIcon4,lblVPIcon5,lblVPIcon6,lblVPIcon7,lblVPIcon8,lblVPIcon9,lblIcon;
	JButton btnNext;
	JPanel p1,p2;
	JRadioButton vPres1,vPres2,vPres3,vPres4,vPres5,vPres6,vPres7,vPres8,vPres9,abstain;
	ButtonGroup vPres;
	private static String chosenVicePresident;
	boolean hasSelected = false;

	public VicePresidentVoting() 
	{
		//Frame Name
		super("ElectroVote");
		//Panel
		p1=new JPanel();
		p1.setLayout(null);
		p2=new JPanel();
		p2.setBackground(new Color (160,160,160));
		p2.setBounds(0, 0, 1024, 75);
		p1.setBackground(new Color(224,224,224));
		//Labels
		lblIcon = new JLabel("");
		lblIcon.setIcon(new ImageIcon("Logo.png"));
		lblIcon.setBounds(-55, -18, 490, 119);
		
		lbl1=new JLabel("Vice Presidents (Choose 1)");
		lbl1.setBounds(402, 86, 321, 43);
		lbl1.setFont(new Font("Microsoft JhengHei Light", Font.PLAIN, 20));
		
		lblVPIcon1 = new JLabel("");
		lblVPIcon1.setIcon(new ImageIcon("1. Atienza, Lito.png"));
		lblVPIcon1.setBounds(0, 135, 180, 126);
		
		lblVPIcon2 = new JLabel("");
		lblVPIcon2.setIcon(new ImageIcon("2. Bello, Walden.png"));
		lblVPIcon2.setBounds(198, 129, 174, 132);
		
		lblVPIcon3 = new JLabel("");
		lblVPIcon3.setIcon(new ImageIcon("3. David, Rizalito.png"));
		lblVPIcon3.setBounds(412, 129, 188, 132);
		
		lblVPIcon4 = new JLabel("");
		lblVPIcon4.setIcon(new ImageIcon("4. Duterte, Sara.png"));
		lblVPIcon4.setBounds(596, 117, 174, 144);
	
		lblVPIcon5 = new JLabel("");
		lblVPIcon5.setIcon(new ImageIcon("5. Lopez, Manny SD.png"));
		lblVPIcon5.setBounds(789, 117, 211, 158);
		
		lblVPIcon6 = new JLabel("");
		lblVPIcon6.setIcon(new ImageIcon("6. Ong, Doc Willie.png"));
		lblVPIcon6.setBounds(86, 318, 166, 134);
		
		lblVPIcon7 = new JLabel("");
		lblVPIcon7.setIcon(new ImageIcon("7. Pangilinan, Kiko.png"));
		lblVPIcon7.setBounds(311, 296, 180, 158);
		
		lblVPIcon8 = new JLabel("");
		lblVPIcon8.setIcon(new ImageIcon("8. Serapio, Carlos.png"));
		lblVPIcon8.setBounds(562, 303, 184, 149);
		
		lblVPIcon9 = new JLabel("");
		lblVPIcon9.setIcon(new ImageIcon("9. Sotto, Vicente Tito.png"));
		lblVPIcon9.setBounds(749, 296, 180, 146);
		//RadioButton
		vPres1 = new JRadioButton("Lito Atienza");
		vPres1.setFont(new Font("Microsoft JhengHei Light", Font.PLAIN, 15));
		vPres1.setBounds(48, 267, 109, 23);
		vPres1.setBackground(new Color(224,224,224));
		
		vPres2 = new JRadioButton("Walden Bello");
		vPres2.setFont(new Font("Microsoft JhengHei Light", Font.PLAIN, 15));
		vPres2.setBounds(238, 267, 132, 23);
		vPres2.setBackground(new Color(224,224,224));
		
		vPres3 = new JRadioButton("Rizalito David");
		vPres3.setFont(new Font("Microsoft JhengHei Light", Font.PLAIN, 15));
		vPres3.setBounds(459, 267, 141, 23);
		vPres3.setBackground(new Color(224,224,224));
		
		vPres4 = new JRadioButton("Sara Duterte");
		vPres4.setFont(new Font("Microsoft JhengHei Light", Font.PLAIN, 15));
		vPres4.setBounds(647, 267, 123, 23);
		vPres4.setBackground(new Color(224,224,224));
		
		vPres5 = new JRadioButton("Manny SD Lopez");
		vPres5.setFont(new Font("Microsoft JhengHei Light", Font.PLAIN, 15));
		vPres5.setBounds(827, 267, 154, 23);
		vPres5.setBackground(new Color(224,224,224));
		
		vPres6 = new JRadioButton("Doc Willie Ong");
		vPres6.setFont(new Font("Microsoft JhengHei Light", Font.PLAIN, 15));
		vPres6.setBounds(135, 452, 141, 23);
		vPres6.setBackground(new Color(224,224,224));
		
		vPres7 = new JRadioButton("Kiko Pangilinan");
		vPres7.setFont(new Font("Microsoft JhengHei Light", Font.PLAIN, 15));
		vPres7.setBounds(346, 452, 180, 23);
		vPres7.setBackground(new Color(224,224,224));
		
		vPres8 = new JRadioButton("Carlos Serapio");
		vPres8.setFont(new Font("Microsoft JhengHei Light", Font.PLAIN, 15));
		vPres8.setBounds(585, 452, 161, 23);
		vPres8.setBackground(new Color(224,224,224));
		
		vPres9 = new JRadioButton("Vicento Tito Sotto");
		vPres9.setFont(new Font("Microsoft JhengHei Light", Font.PLAIN, 15));
		vPres9.setBounds(779, 452, 154, 23);
		vPres9.setBackground(new Color(224,224,224));
		
		abstain = new JRadioButton("ABSTAIN");
		abstain.setFont(new Font("Microsoft JhengHei Light", Font.PLAIN, 15));
		abstain.setBounds(475, 496, 109, 23);
		abstain.setBackground(new Color(224,224,224));
		//Button
		btnNext = new JButton("Next");
		btnNext.setFont(new Font("Microsoft JhengHei Light", Font.PLAIN, 20));
		btnNext.setBounds(837, 483, 161, 43);
		btnNext.addActionListener(this);
		btnNext.setBackground(new Color(160,160,160));
		//Button Group
		vPres= new ButtonGroup();
		vPres.add(vPres1);vPres.add(vPres2);vPres.add(vPres3);vPres.add(vPres4);vPres.add(vPres5);
		vPres.add(vPres6);vPres.add(vPres7);vPres.add(vPres8);vPres.add(vPres9);vPres.add(abstain);
		//Panel Content
		p1.add(lblVPIcon1);p1.add(lblIcon);p1.add(p2);
		p1.add(lbl1);p1.add(vPres1);p1.add(lblVPIcon2);
		p1.add(vPres2);p1.add(lblVPIcon3);p1.add(vPres3);
		p1.add(lblVPIcon4);p1.add(vPres5);p1.add(lblVPIcon5);
		p1.add(vPres4);p1.add(lblVPIcon6);p1.add(vPres6);
		p1.add(lblVPIcon7);p1.add(vPres7);p1.add(lblVPIcon8);
		p1.add(vPres8);p1.add(lblVPIcon9);p1.add(vPres9);
		p1.add(btnNext);p1.add(abstain);
		//Frame Content
		getContentPane().add(p1);
		//Frame Characteristics
		setSize(1024,576);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	//Actions for JButton
	public void actionPerformed(ActionEvent e) 
	{
		//assigns value of chosenVicePresident
		if(vPres1.isSelected())
		{
			chosenVicePresident=vPres1.getText();
			hasSelected=true;
		}
		if(vPres2.isSelected())
		{
			chosenVicePresident=vPres2.getText();
			hasSelected=true;
		}
		if(vPres3.isSelected())
		{
			chosenVicePresident=vPres3.getText();
			hasSelected=true;
		}
		if(vPres4.isSelected())
		{
			chosenVicePresident=vPres4.getText();
			hasSelected=true;
		}
		if(vPres5.isSelected())
		{
			chosenVicePresident=vPres5.getText();
			hasSelected=true;
		}
		if(vPres6.isSelected())
		{
			chosenVicePresident=vPres6.getText();
			hasSelected=true;
		}
		if(vPres7.isSelected())
		{
			chosenVicePresident=vPres7.getText();
			hasSelected=true;
		}
		if(vPres8.isSelected())
		{
			chosenVicePresident=vPres8.getText();
			hasSelected=true;
		}
		if(vPres9.isSelected())
		{
			chosenVicePresident=vPres9.getText();
			hasSelected=true;
		}
		if(abstain.isSelected())
		{
			chosenVicePresident=abstain.getText();
			hasSelected=true;
		}
		//Validates if you have selected an option or not
		 if(!hasSelected)
		 {
					JOptionPane.showMessageDialog(null, "You have not selected an option" ,"Error",0);
		 }
		
		 if(hasSelected)
		{
		dispose();
		SenatorsVoting gui=new SenatorsVoting();
		}
	}
	//getter for chosenVicePresident
	protected String getChosenVicePresident()
	{
		return chosenVicePresident;
	}
}