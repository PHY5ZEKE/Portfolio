package com.voter;
import java.awt.*;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import javax.swing.*;

public class SignUp extends JFrame implements ActionListener
{
	//GUI Variables
	JLabel stdNo,pass,lblIcon,lblConfirmPassword,lblCreateAcc;
	JTextField sN,LN;
	JPasswordField pS,cPass;
	JButton createAcc;
	JPanel p1,p2;
	String password;
	//Boolean Variable for Logic
	boolean exist=false;
	boolean filled = false;
	//Data Variable
	long studentID;

	public SignUp() 
	{
		//Frame Name
		super("ElectroVote");
		//Panels
		p1=new JPanel();
		p2=new JPanel();
		p2.setBackground(new Color(160,160,160));
		p2.setBounds(0, 0, 1024, 75);
		p1.setBackground(new Color(224,224,224));
		//Labels
		lblIcon = new JLabel("");
		lblIcon.setIcon(new ImageIcon("Logo.png"));
		lblIcon.setBounds(-55, -18, 490, 119);
		
		stdNo=new JLabel("Student Number: ");
		stdNo.setBounds(156, 186, 210, 32);
		stdNo.setFont(new Font("Microsoft JhengHei Light", Font.PLAIN, 20));
		
		lblConfirmPassword = new JLabel("Confirm Password: ");
		lblConfirmPassword.setFont(new Font("Microsoft JhengHei UI Light", Font.PLAIN, 20));
		lblConfirmPassword.setBounds(156, 334, 189, 32);
		
		pass=new JLabel("Password: ");
		pass.setBounds(156, 260, 121, 32);
		pass.setFont(new Font("Microsoft YaHei Light", Font.PLAIN, 20));
		
		lblCreateAcc= new JLabel("CREATE A NEW ACCOUNT");
		lblCreateAcc.setFont(new Font("Microsoft JhengHei Light", Font.PLAIN, 30));
		lblCreateAcc.setBounds(316, 96, 410, 60);
		//TextField and PasswordField
		sN=new JTextField();
		sN.setBounds(156, 217, 667, 32);

		pS=new JPasswordField();
		pS.setBounds(156, 288, 667, 32);
		
		cPass = new JPasswordField();
		cPass.setBounds(156, 365, 667, 32);
		//Buttons
		createAcc=new JButton("Create Account");
		createAcc.setBounds(338, 446, 314, 47);
		createAcc.setFont(new Font("Microsoft JhengHei Light", Font.PLAIN, 20));
		createAcc.setBackground(new Color(160,160,160));
		createAcc.addActionListener(this);
		//Panel Content
		p1.setLayout(null);
		p1.add(stdNo);p1.add(sN);
		p1.add(pass);
		p1.add(pS);p1.add(lblIcon);
		p1.add(createAcc);
		p1.add(lblCreateAcc);
		p1.add(p2);p1.add(cPass);
		p1.add(lblConfirmPassword);
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
	//Creates and Validates Account
		if(e.getSource()==createAcc)
		{
			try 
			{
				studentID=Long.parseLong(sN.getText());
				searchRecord(Long.parseLong(sN.getText()));
			}
			catch(NumberFormatException nfe)
			{
				JOptionPane.showMessageDialog(null,"Please input your student number", "Invalid Input", JOptionPane.ERROR_MESSAGE );
				sN.setText("");
			}
			if (!exist) 
			{

				if(String.valueOf(pS.getPassword()).equals("")||String.valueOf(cPass.getPassword()).equals(""))
				{
					 	JOptionPane.showMessageDialog(null,"Passwords must be filled in","No Password Input",JOptionPane.ERROR_MESSAGE );
					 	filled=true;
				}
				else if(String.valueOf(pS.getPassword()).equals(String.valueOf(cPass.getPassword())))
				{
					JOptionPane.showMessageDialog(null,"Passwords match.",null,JOptionPane.INFORMATION_MESSAGE );
					password=String.valueOf(pS.getPassword());
					JOptionPane.showMessageDialog(null,"Account has been created.",null,JOptionPane.INFORMATION_MESSAGE );
				}
				else
				{
					JOptionPane.showMessageDialog(null,"Passwords do not match",null,JOptionPane.ERROR_MESSAGE );
					pS.setText("");
					cPass.setText("");
					filled=true;
				}
				if(!filled)
				{
					try
					{
						writeToFile(studentID, password);
						dispose();
						LogIn gui=new LogIn();
					}
					catch(IOException err)
					{
						System.err.println(err.getMessage());
					}
				}
				else
				{
					dispose();
					SignUp gui=new SignUp();
				}
			
		}
			 
		}
	}
	//adds account into a csv file
	public void writeToFile(long studentID, String password  ) throws IOException
	{
		//Variables for Path and Path Creation
		String uHome = System.getProperty("user.home");
		String fSeparator = System.getProperty("file.separator");
		String path = uHome + fSeparator + "userInfo.csv";
		try 
		{
			PrintWriter pw = new PrintWriter(new FileWriter(path,true));
			pw.println(studentID+","+password);
			pw.close();
		}
		catch(IOException err)
		{
			System.err.println(err.getMessage());
		}
	}
	//determines if account is already created
	public void searchRecord(long StudentID)
	{
		String uHome = System.getProperty("user.home");
		String fSeparator = System.getProperty("file.separator");
		String path = uHome + fSeparator + "userInfo.csv";
		boolean found = false;
		
		long existingStudent=0; String password="";
		
		try 
		{
		 Scanner x = new Scanner(new File(path));
		 x.useDelimiter("[,\n]");
		 
		 	while(x.hasNext()&& !found)
		 	{
		 		existingStudent = x.nextLong();
		 		password = x.next();
		 		
		 		if(existingStudent==Long.parseLong(sN.getText()))
			 	{
			 		JOptionPane.showMessageDialog(null,"Account Already Exists.","ERROR",JOptionPane.ERROR_MESSAGE );
			 		exist=true;
			 		found=true;
			 		dispose();
			 		SignUp gui=new SignUp();
			 	}
		 	}
		}
		catch(IOException err)
		{
			System.err.print("File not Found!");
		}

	}
}