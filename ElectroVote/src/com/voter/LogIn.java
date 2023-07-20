package com.voter;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.Scanner;

import javax.swing.*;

public class LogIn extends JFrame implements ActionListener
{
	//GUI Variables
	JLabel lblHome,stdN,pass,lblIcon;
	JTextField sN;
	JPasswordField pS;
	JButton logIn,signUp;
	JPanel p1,p2;
	//Boolean Variables for Logic
	boolean hasVoted = true;
	//Private Static Date Variables
	private static long studentIDInput;
	private static String passwordInput;
//Constructor that sets the GUI
	public LogIn() 
	{
		//Frame Name
		super("ElectroVote");
		//Panel
		p1=new JPanel();
		p1.setBackground(new Color(224,224,224));
		p2=new JPanel();
		p2.setBackground(new Color(160,160,160));
		p2.setBounds(0, 0, 1024, 75);
		//Labels
		lblIcon = new JLabel("");
		lblIcon.setIcon(new ImageIcon("Logo.png"));
		lblIcon.setBounds(-55, -18, 490, 119);
		
		lblHome=new JLabel("HOME PAGE");
		lblHome.setBounds(419, 131, 211, 43);
		lblHome.setFont(new Font("Microsoft JhengHei Light", Font.PLAIN, 30));
		
		stdN=new JLabel("Student Number: ");
		stdN.setBounds(167, 190, 173, 32);
		stdN.setFont(new Font("Microsoft JhengHei Light", Font.PLAIN, 20));
		
		pass=new JLabel("Password: ");
		pass.setBounds(167, 251, 121, 32);
		pass.setFont(new Font("Microsoft JhengHei Light", Font.PLAIN, 20));
		//TextField and PasswordField
		sN=new JTextField();
		sN.setBounds(166, 218, 638, 32);
		pS=new JPasswordField();
		pS.setBounds(167, 281, 637, 32);
		//Buttons
		logIn=new JButton("Login");
		logIn.addActionListener(this);
		logIn.setBounds(339, 376, 314, 47);
		logIn.setFont(new Font("Microsoft JhengHei Light", Font.PLAIN, 20));
		logIn.setBackground(new Color(160,160,160));
		
		signUp=new JButton("Sign Up");
		signUp.addActionListener(this);
		signUp.setBounds(339, 451, 314, 47);
		signUp.setFont(new Font("Microsoft JhengHei Light", Font.PLAIN, 20));
		signUp.setBackground(new Color(160,160,160));
		//Panel Content
		p1.setLayout(null);
		p1.add(lblHome);
		p1.add(stdN);p1.add(sN);
		p1.add(pass);
		p1.add(pS);p1.add(lblIcon);
		p1.add(logIn);p1.add(signUp);
		//Frame Content
		getContentPane().add(p1);p1.add(p2);
		//Frame Characteristics	
		setSize(1024,576);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	//This method searches the csv for the account and validates the credentials
	public void searchRecordandLogIn(long StudentID,String Password, String delimiter)
	{
		//Path
		String uHome = System.getProperty("user.home");
		String fSeparator = System.getProperty("file.separator");
		String path = uHome + fSeparator + "userInfo.csv";
		//Validation
		String currentLine;
		String data[];
		boolean wrongPass = true;
		try 
		{
			FileReader fr = new FileReader(path);
			BufferedReader br = new BufferedReader(fr);

			while((currentLine = br.readLine())!=null)
			{
			  data = currentLine.split(delimiter);
				 if(data[0].equals(String.valueOf(StudentID)) && data[1].equals(Password))
				{
					JOptionPane.showMessageDialog(null,"Login Successful.",null,JOptionPane.INFORMATION_MESSAGE );
					wrongPass = false;
					dispose();
					WelcomePage gui=new WelcomePage();
				}
				
			}
		}
		catch(Exception e)
		{
			System.out.print(e);
		}
		if(wrongPass)
		{
			JOptionPane.showMessageDialog(null,"Invalid Credentials.",null,JOptionPane.ERROR_MESSAGE );
			pS.setText("");
			sN.setText("");
		}
	}
	//validates if voters are finished 
	public void validateFinishedVoters(long StudentID,String Password, String delimiter)
	{
		//Path
		String uHome = System.getProperty("user.home");
		String fSeparator = System.getProperty("file.separator");
		String path = uHome + fSeparator + "finishedVoters.csv";
		//Validation
		String currentLine;
		String data[];
		try 
		{
			FileReader fr = new FileReader(path);
			BufferedReader br = new BufferedReader(fr);

			while((currentLine = br.readLine())!=null)
			{
			  data = currentLine.split(delimiter);
				 if(data[0].equals(String.valueOf(StudentID)) && data[1].equals(Password))
				{
					JOptionPane.showMessageDialog(null,"You have already voted.",null,0 );
					pS.setText("");
					sN.setText("");
					hasVoted = true;
				
				}
				else
				{
					 hasVoted=false;
				}
				
			}
		}
		catch(Exception e)
		{
			System.out.print(e);
		}
	}
	//Actions for the Buttons
	public void actionPerformed(ActionEvent e) 
	{
	//Calls Sign Up Class
	  if(e.getSource()==signUp)
	  {
		  dispose();
		  SignUp gui=new SignUp();
	  }
	//activates method for validation
	  if(e.getSource()==logIn)	  
	  {
		  passwordInput = pS.getText();
		  studentIDInput = Long.parseLong(sN.getText());
		  if(hasVoted)
			  validateFinishedVoters(studentIDInput,passwordInput, ",");
		  else if(!hasVoted)
			  searchRecordandLogIn(studentIDInput,passwordInput, ",");
	  }
	}
	//main method
	public static void main(String[] args) 
	{
		//creates the csv file for finished voters with null values
		try
		{
		String uHome = System.getProperty("user.home");
		String fSeparator = System.getProperty("file.separator");
		String path = uHome + fSeparator + "finishedVoters.csv";
		PrintWriter pw = new PrintWriter(new FileWriter(path,true));
		pw.println(null+","+null);
		pw.close();
		}
		catch(IOException err)
		{
			System.err.println(err.getMessage());
		}
		//Class Instantiation, Opens the GUI
		LogIn gui=new LogIn();
		gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	//getters to pass the data
	protected long getStudentID()
	{
		return studentIDInput;
	}
	protected String getPasswordInput()
	{
		return passwordInput;
	}
}