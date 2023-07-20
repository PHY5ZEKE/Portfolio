package com.voter;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class WelcomePage extends JFrame implements ActionListener
{
	//GUI Variables
	JLabel lblWelcome,lblVote,lblIcon;
	JTextField LN;
	JButton proceedVote;
	JPanel p1,p2;
	JTextPane txtInstructions;
	public WelcomePage() 
	{
		//Frame Name
		super("ElectroVote");
		//Panel
		p1=new JPanel();
		p2=new JPanel();
		p1.setLayout(null);
		p2.setBackground(new Color (192,192,192));
		p2.setBounds(0, 0, 1024, 75);
		p1.setBackground(new Color(224,224,224));
		//Labels
		lblIcon = new JLabel("");
		lblIcon.setIcon(new ImageIcon("Logo.png"));
		lblIcon.setBounds(-55, -18, 490, 119);
		
		lblWelcome=new JLabel("WELCOME !");
		lblWelcome.setBounds(413, 99, 189, 55);
		lblWelcome.setFont(new Font("Microsoft JhengHei Light", Font.PLAIN, 32));
		
		lblVote=new JLabel("HOW TO VOTE");
		lblVote.setBounds(425, 192, 165, 32);
		lblVote.setFont(new Font("Microsoft JhengHei UI", Font.PLAIN, 20));
		//Button
		proceedVote=new JButton("Proceed to voting");
		proceedVote.addActionListener(this);
		proceedVote.setBounds(339, 451, 314, 47);
		proceedVote.setFont(new Font("Courier New", Font.PLAIN, 20));
		proceedVote.setBackground(new Color(160,160,160));
		//TextField
		txtInstructions = new JTextPane();
		txtInstructions.setFont(new Font("Microsoft JhengHei Light", Font.PLAIN, 20));
		txtInstructions.setBounds(307, 248, 396, 147);
		txtInstructions.setText("PRESS THE BUTTON OF THE CANDIDATE THAT  YOU WANT  TO VOTE  AND CLICK NEXT IN THE LOWER PORTION OF THE  SCREEN.  YOU MAY ABSTAIN OR UNDERVOTE.\r\n\r\n                                   ");
		txtInstructions.setBackground(new Color(224,224,224));
		txtInstructions.setEditable(false);
		//Panel Content
		p1.add(lblWelcome);p1.add(lblVote);p1.add(lblIcon);
		p1.add(proceedVote);p1.add(p2);p1.add(txtInstructions);
		//Frame Content
		getContentPane().add(p1);
		//Frame Characteristics
		setSize(1024,576);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	//Action for Buttons
	public void actionPerformed(ActionEvent e) 
	{
	 //Proceeds to Voting
	 if(e.getSource()==proceedVote)
	 {
		 dispose();
		 PresidentVoting gui=new PresidentVoting();
	 }
	}
	
}