package com.voter;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class PartylistVoting extends JFrame implements ActionListener
{
	//GUI Variables
	JLabel lbl1,lblIcon;
	JPanel p1,p2;
	JButton btnNext;
	ButtonGroup pList;
	JRadioButton party1,party2,party3,party4,party5,party6,party7,party8,party9,party10,abstain;
	JRadioButton party11,party12,party13,party14,party15,party16,party17,party18,party19,party20;
	//Class Instantiation 
	PresidentVoting pv = new PresidentVoting();
	VicePresidentVoting vp = new VicePresidentVoting();
	SenatorsVoting sv = new SenatorsVoting();
	LogIn ln = new LogIn();
	//Private Static Data Variables
	private static String chosenPartylist;
	//Boolean Variable for Logic
	boolean hasSelected = false;
	
	public PartylistVoting() 
	{
		//Frame Name
		super("ElectroVote");
		//Disposes Other Class Frames
		pv.setVisible(false);
		pv.dispose();
		vp.setVisible(false);
		vp.dispose();
		sv.setVisible(false);
		sv.dispose();
		ln.setVisible(false);
		ln.dispose();
		//Panel
		p1=new JPanel();
		p2=new JPanel();
		p2.setBackground(Color.GRAY);
		p2.setBounds(0, 0, 1024, 75);
		p1.setBackground(new Color(224,224,224));
		p1.setLayout(null);
		//Labels
		lblIcon = new JLabel("");
		lblIcon.setIcon(new ImageIcon("Logo.png"));
		lblIcon.setBounds(-55, -18, 490, 119);
		
		lbl1=new JLabel("Partylist (Choose 1)");
		lbl1.setBounds(426, 86, 254, 43);
		lbl1.setFont(new Font("Microsoft JhengHei Light", Font.PLAIN, 20));
		//RadioButton
		party1 = new JRadioButton("KAMALAYAN");
		party1.setFont(new Font("Microsoft JhengHei Light", Font.PLAIN, 15));
		party1.setBackground(new Color(224,224,224));
		party1.setBounds(155, 180, 189, 23);
	
		party2 = new JRadioButton("KM NGAYON NA");
		party2.setFont(new Font("Microsoft JhengHei Light", Font.PLAIN, 15));
		party2.setBackground(new Color(224,224,224));
		party2.setBounds(155, 218, 189, 23);
		
		party3 = new JRadioButton("PSIS");
		party3.setFont(new Font("Microsoft JhengHei Light", Font.PLAIN, 15));
		party3.setBackground(new Color(224,224,224));
		party3.setBounds(155, 255, 189, 23);
		
		party4 = new JRadioButton("AGAP");
		party4.setFont(new Font("Microsoft JhengHei Light", Font.PLAIN, 15));
		party4.setBackground(new Color(224,224,224));
		party4.setBounds(155, 293, 189, 23);
		
		party5 = new JRadioButton("KABAYAN");
		party5.setFont(new Font("Microsoft JhengHei Light", Font.PLAIN, 15));
		party5.setBackground(new Color(224,224,224));
		party5.setBounds(155, 331, 189, 23);
		
		party6 = new JRadioButton("HOME OWNER");
		party6.setFont(new Font("Microsoft JhengHei Light", Font.PLAIN, 15));
		party6.setBackground(new Color(224,224,224));
		party6.setBounds(155, 368, 189, 23);
		
		party7 = new JRadioButton("KAPUSO PM");
		party7.setFont(new Font("Microsoft JhengHei Light", Font.PLAIN, 15));
		party7.setBackground(new Color(224,224,224));
		party7.setBounds(155, 407, 189, 23);
		
		party8 = new JRadioButton("PDP CARES");
		party8.setFont(new Font("Microsoft JhengHei Light", Font.PLAIN, 15));
		party8.setBackground(new Color(224,224,224));
		party8.setBounds(414, 180, 189, 23);
		
		party9 = new JRadioButton("AKO OFW");
		party9.setFont(new Font("Microsoft JhengHei Light", Font.PLAIN, 15));
		party9.setBackground(new Color(224,224,224));
		party9.setBounds(414, 218, 189, 23);
		
		party10 = new JRadioButton("UNITED SENIOR CITIZEN");
		party10.setFont(new Font("Microsoft JhengHei Light", Font.PLAIN, 15));
		party10.setBackground(new Color(224,224,224));
		party10.setBounds(414, 255, 189, 23);
		
		party11 = new JRadioButton("WOW PILIPINAS");
		party11.setFont(new Font("Microsoft JhengHei Light", Font.PLAIN, 15));
		party11.setBackground(new Color(224,224,224));
		party11.setBounds(414, 293, 189, 23);
		
		party12 = new JRadioButton("ALTERNATIBA");
		party12.setFont(new Font("Microsoft JhengHei Light", Font.PLAIN, 15));
		party12.setBackground(new Color(224,224,224));
		party12.setBounds(414, 331, 189, 23);
		
		party13 = new JRadioButton("ABP");
		party13.setFont(new Font("Microsoft JhengHei Light", Font.PLAIN, 15));
		party13.setBackground(new Color(224,224,224));
		party13.setBounds(414, 368, 189, 23);
		
		party14 = new JRadioButton("AKO MUSIKERO");
		party14.setFont(new Font("Microsoft JhengHei Light", Font.PLAIN, 15));
		party14.setBackground(new Color(224,224,224));
		party14.setBounds(414, 407, 189, 23);
		
		party15 = new JRadioButton("AKO BICOL");
		party15.setFont(new Font("Microsoft JhengHei Light", Font.PLAIN, 15));
		party15.setBackground(new Color(224,224,224));
		party15.setBounds(664, 180, 189, 23);
		
		party16 = new JRadioButton("PRAT");
		party16.setFont(new Font("Microsoft JhengHei Light", Font.PLAIN, 15));
		party16.setBackground(new Color(224,224,224));
		party16.setBounds(664, 218, 189, 23);
		
		party17 = new JRadioButton("4PS");
		party17.setFont(new Font("Microsoft JhengHei Light", Font.PLAIN, 15));
		party17.setBackground(new Color(224,224,224));
		party17.setBounds(664, 255, 189, 23);
		
		party18 = new JRadioButton("TGP");
		party18.setFont(new Font("Microsoft JhengHei Light", Font.PLAIN, 15));
		party18.setBackground(new Color(224,224,224));
		party18.setBounds(664, 293, 189, 23);
		
		party19 = new JRadioButton("ABANTE PINAS");
		party19.setFont(new Font("Microsoft JhengHei Light", Font.PLAIN, 15));
		party19.setBackground(new Color(224,224,224));
		party19.setBounds(664, 331, 189, 23);
		
		party20 = new JRadioButton("YACAP");
		party20.setFont(new Font("Microsoft JhengHei Light", Font.PLAIN, 15));
		party20.setBackground(new Color(224,224,224));
		party20.setBounds(664, 368, 189, 23);
		
		abstain = new JRadioButton("ABSTAIN");
		abstain.setFont(new Font("Microsoft JhengHei Light", Font.PLAIN, 11));
		abstain.setBounds(458, 482, 109, 23);
		abstain.setBackground(new Color(224,224,224));
		//Button Group
		pList= new ButtonGroup();
		pList.add(party1);pList.add(party2);pList.add(party3);pList.add(party4);pList.add(party5);
		pList.add(party6);pList.add(party7);pList.add(party8);pList.add(party9);pList.add(party10);
		pList.add(party11);pList.add(party12);pList.add(party13);pList.add(party14);pList.add(party15);
		pList.add(party16);pList.add(party17);pList.add(party18);pList.add(party19);pList.add(party20);
		pList.add(abstain);
		//Button
		btnNext = new JButton("Next");
		btnNext.setFont(new Font("Microsoft JhengHei Light", Font.PLAIN, 20));
		btnNext.setBounds(809, 469, 161, 43);
		btnNext.addActionListener(this);
		btnNext.setBackground(new Color(160,160,160));
		//Panel Content
		p1.add(lbl1);p1.add(lblIcon);p1.add(p2);
		p1.add(party1);p1.add(party2);p1.add(party3);
		p1.add(party4);p1.add(party5);p1.add(party6);
		p1.add(party7);p1.add(party8);p1.add(party9);
		p1.add(party10);p1.add(party11);p1.add(party12);
		p1.add(party13);p1.add(party14);p1.add(party15);
		p1.add(party16);p1.add(party17);p1.add(party18);
		p1.add(party19);p1.add(party20);p1.add(btnNext);
		p1.add(abstain);
		//Frame Content
		getContentPane().add(p1);
	    //Frame Characteristics
		setSize(1024,576);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	//Action Commands for Button
	public void actionPerformed(ActionEvent e) 
	{
		//Assigns value of chosenPartylist
		if(party1.isSelected())
		{
			chosenPartylist=party1.getText();
			hasSelected=true;
		}
		if(party2.isSelected())
		{
			chosenPartylist=party2.getText();
			hasSelected=true;
		}
		if(party3.isSelected())
		{
			chosenPartylist=party3.getText();
			hasSelected=true;
		}
		if(party4.isSelected())
		{
			chosenPartylist=party4.getText();
			hasSelected=true;
		}
		if(party5.isSelected())
		{
			chosenPartylist=party5.getText();
			hasSelected=true;
		}
		if(party6.isSelected())
		{
			chosenPartylist=party6.getText();
			hasSelected=true;
		}
		if(party7.isSelected())
		{
			chosenPartylist=party7.getText();
			hasSelected=true;
		}
		if(party8.isSelected())
		{
			chosenPartylist=party8.getText();
			hasSelected=true;
		}
		if(party9.isSelected())
		{
			chosenPartylist=party9.getText();
			hasSelected=true;
		}
		if(party10.isSelected())
		{
			chosenPartylist=party10.getText();
			hasSelected=true;
		}
		if(party11.isSelected())
		{
			chosenPartylist=party11.getText();
			hasSelected=true;
		}
		if(party12.isSelected())
		{
			chosenPartylist=party12.getText();
			hasSelected=true;
		}
		if(party13.isSelected())
		{
			chosenPartylist=party13.getText();
			hasSelected=true;
		}
		if(party14.isSelected())
		{
			chosenPartylist=party14.getText();
			hasSelected=true;
		}
		if(party15.isSelected())
		{
			chosenPartylist=party15.getText();
			hasSelected=true;
		}
		if(party16.isSelected())
		{
			chosenPartylist=party16.getText();
			hasSelected=true;
		}
		if(party17.isSelected())
		{
			chosenPartylist=party17.getText();
			hasSelected=true;
		}
		if(party18.isSelected())
		{
			chosenPartylist=party18.getText();
			hasSelected=true;
		}
		if(party19.isSelected())
		{
			chosenPartylist=party19.getText();
			hasSelected=true;
		}
		if(party20.isSelected())
		{
			chosenPartylist=party20.getText();
			hasSelected=true;
		}
		if(abstain.isSelected())
		{
			chosenPartylist=abstain.getText();
			hasSelected=true;
		}
		 //Validates if you have selection an option or not
		if(!hasSelected)
		 {
					JOptionPane.showMessageDialog(null, "You have not selected an option" ,"Error",0);
		 }
		
		if(hasSelected)
		{
		dispose();
		VotingReceipt vr = new VotingReceipt(pv.getChosenPresident(),vp.getChosenVicePresident(),sv.getChosenSenators(),getChosenPartylist());
		vr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
	}
	//getter for chosenPartylist
	protected String getChosenPartylist()
	{
		return chosenPartylist;
	}
}