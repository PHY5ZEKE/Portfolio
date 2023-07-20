package com.voter;
import java.awt.*;
import java.awt.event.*;
import java.util.Stack;

import javax.swing.*;

public class SenatorsVoting extends JFrame implements ActionListener,ItemListener
{
	//GUI Variables
	JLabel lbl1,lblIcon;
	JPanel p1,p2;
	JRadioButton sen1,sen2,sen3,sen4,sen5,sen6,sen7,sen8,sen9,sen10;
	JRadioButton sen11,sen12,sen13,sen14,sen15,sen16,sen17,sen18,sen19,sen20,abstain;
	JButton btnNext;
	//limit
	int senatorLimit=0;
	//Private Static Data Variable
	private static Stack<String> chosenSenators = new Stack<>();
	
	public SenatorsVoting() 
	{
		//Frame Name
		super("ElectroVote");
		//Pane
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
		
		lbl1=new JLabel("Senators (Choose at most 12)");
		lbl1.setBounds(348, 97, 376, 43);
		lbl1.setFont(new Font("Microsoft JhengHei Light", Font.PLAIN, 20));
		//RadioButton
		sen1 = new JRadioButton("Herbert Bistek Bautista");
		sen1.setFont(new Font("Microsoft JhengHei Light", Font.PLAIN, 15));
		sen1.setBounds(155, 180, 189, 23);
		sen1.addItemListener(this);
		sen1.setBackground(new Color (224,224,224));
		
		sen2 = new JRadioButton("Jejomar Binay");
		sen2.setFont(new Font("Microsoft JhengHei Light", Font.PLAIN, 15));
		sen2.setBounds(155, 218, 189, 23);
		sen2.addItemListener(this);
		sen2.setBackground(new Color (224,224,224));
		
		sen3 = new JRadioButton("Alan Peter Cayetano");
		sen3.setFont(new Font("Microsoft JhengHei Light", Font.PLAIN, 15));
		sen3.setBounds(155, 255, 189, 23);
		sen3.setBackground(new Color (224,224,224));
		sen3.addItemListener(this);
		
		sen4 = new JRadioButton("Neri Colminares");
		sen4.setFont(new Font("Microsoft JhengHei Light", Font.PLAIN, 15));
		sen4.setBounds(155, 293, 189, 23);
		sen4.setBackground(new Color (224,224,224));
		sen4.addItemListener(this);
		
		sen5 = new JRadioButton("Leila De Lima");
		sen5.setFont(new Font("Microsoft JhengHei Light", Font.PLAIN, 15));
		sen5.setBounds(155, 331, 189, 23);
		sen5.setBackground(new Color (224,224,224));
		sen5.addItemListener(this);
		
		sen6 = new JRadioButton("Chel Diokno");
		sen6.setFont(new Font("Microsoft JhengHei Light", Font.PLAIN, 15));
		sen6.setBounds(155, 368, 189, 23);
		sen6.setBackground(new Color (224,224,224));
		sen6.addItemListener(this);
		
		sen7 = new JRadioButton("JV Ejercito");
		sen7.setFont(new Font("Microsoft JhengHei Light", Font.PLAIN, 15));
		sen7.setBackground(new Color (224,224,224));
		sen7.setBounds(155, 407, 189, 23);
		sen7.addItemListener(this);
		
		sen8 = new JRadioButton("Chiz Escudero");
		sen8.setFont(new Font("Microsoft JhengHei Light", Font.PLAIN, 15));
		sen8.setBackground(new Color (224,224,224));
		sen8.setBounds(414, 180, 189, 23);
		sen8.addItemListener(this);
		
		sen9 = new JRadioButton("Luke Espiritu");
		sen9.setFont(new Font("Microsoft JhengHei Light", Font.PLAIN, 15));
		sen9.setBounds(414, 218, 189, 23);
		sen9.setBackground(new Color (224,224,224));
		sen9.addItemListener(this);
		
		sen10 = new JRadioButton("Jinggoy Estrada");
		sen10.setFont(new Font("Microsoft JhengHei Light", Font.PLAIN, 15));
		sen10.setBounds(414, 255, 189, 23);
		sen10.setBackground(new Color (224,224,224));
		sen10.addItemListener(this);
		
		sen11 = new JRadioButton("Larry Gadon");
		sen11.setFont(new Font("Microsoft JhengHei Light", Font.PLAIN, 15));
		sen11.setBackground(new Color (224,224,224));
		sen11.setBounds(414, 293, 189, 23);
		sen11.addItemListener(this);
		
		sen12 = new JRadioButton("Win Gatchallian");
		sen12.setFont(new Font("Microsoft JhengHei Light", Font.PLAIN, 15));
		sen12.setBounds(414, 331, 189, 23);
		sen12.setBackground(new Color (224,224,224));
		sen12.addItemListener(this);
		
		sen13 = new JRadioButton("Wow Dick Gordon");
		sen13.setFont(new Font("Microsoft JhengHei Light", Font.PLAIN, 15));
		sen13.setBounds(414, 368, 189, 23);
		sen13.setBackground(new Color (224,224,224));
		sen13.addItemListener(this);
		
		sen14 = new JRadioButton("Risa Hontiveros");
		sen14.setFont(new Font("Microsoft JhengHei Light", Font.PLAIN, 15));
		sen14.setBounds(414, 407, 189, 23);
		sen14.setBackground(new Color (224,224,224));
		sen14.addItemListener(this);
		
		sen15 = new JRadioButton("Loren Legarda");
		sen15.setFont(new Font("Microsoft JhengHei Light", Font.PLAIN, 15));
		sen15.setBounds(650, 180, 189, 23);
		sen15.setBackground(new Color (224,224,224));
		sen15.addItemListener(this);
		
		sen16 = new JRadioButton("Robin Padilla");
		sen16.setFont(new Font("Microsoft JhengHei Light", Font.PLAIN, 15));
		sen16.setBounds(650, 218, 189, 23);
		sen16.setBackground(new Color (224,224,224));
		sen16.addItemListener(this);
		
		sen17 = new JRadioButton("Idol Raffy Tulfo");
		sen17.setFont(new Font("Microsoft JhengHei Light", Font.PLAIN, 15));
		sen17.setBounds(650, 255, 189, 23);
		sen17.setBackground(new Color (224,224,224));
		sen17.addItemListener(this);
		
		sen18 = new JRadioButton("Joel TesdaMan Villanueva");
		sen18.setFont(new Font("Microsoft JhengHei Light", Font.PLAIN, 15));
		sen18.setBounds(650, 293, 189, 23);
		sen18.setBackground(new Color (224,224,224));
		sen18.addItemListener(this);
		
		sen19 = new JRadioButton("Mark Villar");
		sen19.setFont(new Font("Microsoft JhengHei Light", Font.PLAIN, 15));
		sen19.setBackground(new Color (224,224,224));
		sen19.setBounds(650, 331, 189, 23);
		sen19.addItemListener(this);
		
		sen20 = new JRadioButton("Migz Zubiri");
		sen20.setFont(new Font("Microsoft JhengHei Light", Font.PLAIN, 15));
		sen20.setBounds(650, 368, 189, 23);
		sen20.setBackground(new Color (224,224,224));
		sen20.addItemListener(this);
		//Button
		btnNext = new JButton("Next");
		btnNext.setFont(new Font("Microsoft JhengHei Light", Font.PLAIN, 20));
		btnNext.setBounds(809, 469, 161, 43);
		btnNext.addActionListener(this);
		btnNext.setBackground(new Color(160,160,160));
		//Panel Content
		p1.add(lbl1);p1.add(lblIcon);p1.add(p2);
		p1.add(sen1);p1.add(sen2);p1.add(sen3);
		p1.add(sen4);p1.add(sen5);p1.add(sen6);
		p1.add(sen7);p1.add(sen8);p1.add(sen9);
		p1.add(sen10);p1.add(sen11);p1.add(sen12);
		p1.add(sen13);p1.add(sen14);p1.add(sen15);
		p1.add(sen16);p1.add(sen17);p1.add(sen18);
		p1.add(sen19);p1.add(sen20);p1.add(btnNext);
		//Frame Content
		getContentPane().add(p1);
		setSize(1024,576);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	//Action for Buttons
	public void actionPerformed(ActionEvent e) 
	{
		//Next Button Goes to Partylist
		if(e.getSource()== btnNext)
		{
			//Enables undervoting
			while(senatorLimit!=12)
			{
				chosenSenators.push("UNDERVOTE/ABSTAIN");
				++senatorLimit;
			}
			
				dispose();
				PartylistVoting pv = new PartylistVoting();
		}
	}
	//Limits Number of Senators to 12
	public void itemStateChanged(ItemEvent e) 
	{
		//adds 1 to senatorLimit 
		if(e.getStateChange()==1)
		{
			String senator = String.valueOf(((JRadioButton) e.getItemSelectable()).getText());
			chosenSenators.push(senator);
			++senatorLimit;
		}
		//decreases 1 to senatorLimit 
		if(e.getStateChange()==2)
		{
			String senator = String.valueOf(((JRadioButton) e.getItemSelectable()).getText());
			--senatorLimit;
			chosenSenators.remove(senator);
		}
		//Error message if limit passes 12
		if(senatorLimit>12)
		{
			JOptionPane.showMessageDialog(null, "You cannot select over 12 senators","Warning",0);
		}
	//getter for chosenSenator
	}
	protected Stack<String> getChosenSenators()
	{
		return chosenSenators;
	}
}