package com.voter;
import java.awt.*;
import java.awt.event.*;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Stack;

import javax.swing.*;

public class VotingReceipt extends JFrame implements ActionListener
{
	//GUI Variables
	JLabel lbl1,lblIcon;
	JButton exit;
	JPanel p1,p2;
	JTextField presi,vPresi,sen1,sen2,sen3,sen4,sen5,sen6,sen7,sen8,sen9,sen10,sen11,sen12,partyList;
	JLabel lblVicepresident,lblSenators,lblPartylist,lblVotingReceipt,lblNewLabel;
	String cSen1,cSen2,cSen3,cSen4,cSen5,cSen6,cSen7,cSen8,cSen9,cSen10, cSen11, cSen12;
	//Class Instantiation
	PresidentVoting pv = new PresidentVoting();
	VicePresidentVoting vp = new VicePresidentVoting();
	SenatorsVoting sv = new SenatorsVoting();
	PartylistVoting plv = new PartylistVoting();
	LogIn ln = new LogIn();
	public VotingReceipt(String President, String VicePresident, Stack<String> chosenSenators, String chosenPartylist)
	{
		//Frame Name
		super("ElectroVote");
		//Disposes of Other Class Frames
		pv.setVisible(false);
		pv.dispose();
		vp.setVisible(false);
		vp.dispose();
		sv.setVisible(false);
		sv.dispose();
		plv.setVisible(false);
		plv.dispose();
		ln.setVisible(false);
		ln.dispose();
		//Panel
		p1=new JPanel();
		p2=new JPanel();
		p1.setLayout(null);
		p2.setBackground(new Color(160,160,160));
		p2.setBounds(0, 0, 1024, 75);
		p1.setBackground(new Color(224,224,224));
		//Labels
		lblIcon = new JLabel("");
		lblIcon.setIcon(new ImageIcon("Logo.png"));
		lblIcon.setBounds(-55, -18, 490, 119);
		
		lbl1=new JLabel("Thank you for voting!");
		lbl1.setBounds(394, 86, 242, 43);
		lbl1.setFont(new Font("Microsoft JhengHei Light", Font.PLAIN, 20));
		
		lblNewLabel = new JLabel("PRESIDENT");
		lblNewLabel.setFont(new Font("Microsoft JhengHei Light", Font.PLAIN, 15));
		lblNewLabel.setBounds(87, 194, 83, 20);
		
		lblVicepresident = new JLabel("VICE-PRESIDENT");
		lblVicepresident.setFont(new Font("Microsoft JhengHei Light", Font.PLAIN, 15));
		lblVicepresident.setBounds(375, 194, 130, 20);
		
		lblSenators = new JLabel("SENATORS");
		lblSenators.setFont(new Font("Microsoft JhengHei Light", Font.PLAIN, 15));
		lblSenators.setBounds(87, 258, 83, 20);
		
		lblPartylist = new JLabel("PARTYLIST");
		lblPartylist.setFont(new Font("Corbel Light", Font.PLAIN, 15));
		lblPartylist.setBounds(87, 414, 83, 20);
		
		lblVotingReceipt = new JLabel("Voting Receipt");
		lblVotingReceipt.setFont(new Font("Microsoft JhengHei Light", Font.PLAIN, 20));
		lblVotingReceipt.setBounds(422, 131, 137, 37);
		//TextField
		presi = new JTextField(President);
		presi.setFont(new Font("Microsoft JhengHei Light", Font.PLAIN, 15));
		presi.setBounds(124, 225, 230, 27);
		presi.setEditable(false);
		
		vPresi = new JTextField(VicePresident);
		vPresi.setFont(new Font("Microsoft JhengHei Light", Font.PLAIN, 15));
		vPresi.setColumns(10);
		vPresi.setBounds(413, 225, 230, 27);
		vPresi.setEditable(false);
		
		sen12 = new JTextField(chosenSenators.peek());
		sen12.setFont(new Font("Microsoft JhengHei Light", Font.PLAIN, 15));
		cSen12 = chosenSenators.peek();
		chosenSenators.pop();
		sen12.setColumns(10);
		sen12.setBounds(695, 381, 230, 27);
		sen12.setEditable(false);
		
		sen11 = new JTextField(chosenSenators.peek());
		sen11.setFont(new Font("Microsoft JhengHei Light", Font.PLAIN, 15));
		cSen11 = chosenSenators.peek();
		chosenSenators.pop();
		sen11.setColumns(10);
		sen11.setBounds(695, 351, 230, 27);
		sen11.setEditable(false);
		
		sen10 = new JTextField(chosenSenators.peek());
		sen10.setFont(new Font("Microsoft JhengHei Light", Font.PLAIN, 15));
		cSen10 = chosenSenators.peek();
		chosenSenators.pop();
		sen10.setColumns(10);
		sen10.setBounds(695, 320, 230, 27);
		sen10.setEditable(false);
		
		sen9 = new JTextField(chosenSenators.peek());
		sen9.setFont(new Font("Microsoft JhengHei Light", Font.PLAIN, 15));
		cSen9 = chosenSenators.peek();
		chosenSenators.pop();
		sen9.setColumns(10);
		sen9.setBounds(695, 289, 230, 27);
		sen9.setEditable(false);
		
		sen8 = new JTextField(chosenSenators.peek());
		sen8.setFont(new Font("Microsoft JhengHei Light", Font.PLAIN, 15));
		cSen8 = chosenSenators.peek();
		chosenSenators.pop();
		sen8.setColumns(10);
		sen8.setBounds(413, 381, 230, 27);
		sen8.setEditable(false);
		
		sen7 = new JTextField(chosenSenators.peek());
		sen7.setFont(new Font("Microsoft JhengHei Light", Font.PLAIN, 15));
		cSen7 = chosenSenators.peek();
		chosenSenators.pop();
		sen7.setColumns(10);
		sen7.setBounds(412, 351, 230, 27);
		sen7.setEditable(false);
		
		sen6 = new JTextField(chosenSenators.peek());
		sen6.setFont(new Font("Microsoft JhengHei Light", Font.PLAIN, 15));
		cSen6 = chosenSenators.peek();
		chosenSenators.pop();
		sen6.setColumns(10);
		sen6.setBounds(412, 320, 230, 27);
		sen6.setEditable(false);
		
		sen5 = new JTextField(chosenSenators.peek());
		sen5.setFont(new Font("Microsoft JhengHei Light", Font.PLAIN, 15));
		cSen5 = chosenSenators.peek();
		chosenSenators.pop();
		sen5.setColumns(10);
		sen5.setBounds(412, 289, 230, 27);
		sen5.setEditable(false);
		
		sen4 = new JTextField(chosenSenators.peek());
		sen4.setFont(new Font("Microsoft JhengHei Light", Font.PLAIN, 15));
		cSen4 = chosenSenators.peek();
		chosenSenators.pop();
		sen4.setColumns(10);
		sen4.setBounds(124, 381, 230, 27);
		sen4.setEditable(false);
		
		sen3 = new JTextField(chosenSenators.peek());
		sen3.setFont(new Font("Microsoft JhengHei Light", Font.PLAIN, 15));
		cSen3 = chosenSenators.peek();
		chosenSenators.pop();
		sen3.setColumns(10);
		sen3.setBounds(124, 351, 230, 27);
		sen3.setEditable(false);
		
		sen2 = new JTextField(chosenSenators.peek());
		sen2.setFont(new Font("Microsoft JhengHei Light", Font.PLAIN, 15));
		cSen2 = chosenSenators.peek();
		chosenSenators.pop();
		sen2.setColumns(10);
		sen2.setBounds(124, 320, 230, 27);
		sen2.setEditable(false);
		
		sen1 = new JTextField(chosenSenators.peek());
		sen1.setFont(new Font("Microsoft JhengHei Light", Font.PLAIN, 15));
		cSen1 = chosenSenators.peek();
		chosenSenators.pop();
		sen1.setColumns(10);
		sen1.setBounds(124, 289, 230, 27);
		sen1.setEditable(false);
		
		partyList = new JTextField(chosenPartylist);
		partyList.setFont(new Font("Microsoft JhengHei Light", Font.PLAIN, 15));
		partyList.setColumns(10);
		partyList.setBounds(124, 439, 230, 27);
		partyList.setEditable(false);
		//Button
		exit=new JButton("Done");
		exit.addActionListener
		(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{}
		}
		);
		exit.setBounds(745, 479, 236, 47);
		exit.setFont(new Font("Microsoft JhengHei Light", Font.PLAIN, 20));
		exit.setBackground(new Color(160,160,160));
		exit.addActionListener(this);
		//Panel Content
		p1.add(lbl1);p1.add(lblIcon);p1.add(exit);
		p1.add(p2);p1.add(presi);p1.add(lblNewLabel);
		p1.add(lblVicepresident);p1.add(lblSenators);p1.add(vPresi);
		p1.add(sen12);p1.add(sen11);p1.add(sen10);
		p1.add(sen9);p1.add(sen8);p1.add(sen7);
		p1.add(sen6);p1.add(sen5);p1.add(sen4);
		p1.add(sen3);p1.add(sen2);p1.add(sen1);
		p1.add(lblPartylist);p1.add(partyList);p1.add(lblVotingReceipt);
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
		//Action when done is pressed
		try 
		{
			writeToFile(pv.getChosenPresident(),vp.getChosenVicePresident(),cSen1,cSen2,cSen3,cSen4,cSen5,cSen6,cSen7,cSen8,cSen9,cSen10,cSen11,cSen12,plv.getChosenPartylist());
			voterDone(ln.getStudentID(),ln.getPasswordInput());
			dispose();
			LogIn ln = new LogIn();
			ln.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		} 
		catch (IOException e1) 
		{
			e1.printStackTrace();
		}
	}
	//Stores Votes in a CSV FILE
	public void writeToFile(String President, String VicePresident, String cSen1, String cSen2, String cSen3, String cSen4, String cSen5, String cSen6, String cSen7, String cSen8, String cSen9, String cSen10, String cSen11,String cSen12, String chosenPartylist ) throws IOException
	{
		//Variables for Path and Path Creation
		String uHome = System.getProperty("user.home");
		String fSeparator = System.getProperty("file.separator");
		String path = uHome + fSeparator + "Votes.csv";
		try 
		{
			PrintWriter pw = new PrintWriter(new FileWriter(path,true));
			pw.println("President,"+ President);
			pw.println("Vice President,"+ VicePresident);
			pw.println("Senator");
			pw.println(cSen1);
			pw.println(cSen2);
			pw.println(cSen3);
			pw.println(cSen4);
			pw.println(cSen5);
			pw.println(cSen6);
			pw.println(cSen7);
			pw.println(cSen8);
			pw.println(cSen9);
			pw.println(cSen10);
			pw.println(cSen11);
			pw.println(cSen12);
			pw.println("Partylist,"+ chosenPartylist);
			pw.close();
		}
		catch(IOException err)
		{
			System.err.println(err.getMessage());
		}
	}
	//Stores Finished Voters in a CSV File
	public void voterDone(long studentIDInput,String passwordInput) throws IOException
	{
		try
		{
		String uHome = System.getProperty("user.home");
		String fSeparator = System.getProperty("file.separator");
		String path = uHome + fSeparator + "finishedVoters.csv";
		
		PrintWriter pw = new PrintWriter(new FileWriter(path,true));
		pw.println(studentIDInput+","+passwordInput);
		pw.close();
		}
		catch(IOException err)
		{
			System.err.println(err.getMessage());
		}
		
	}
	
}