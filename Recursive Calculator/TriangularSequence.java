package com.rsq;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class TriangularSequence extends JFrame implements ActionListener
{
	JPanel panelOne;
	JLabel lblTriangular,  lblN, lblSum, lblSequence,lblIcon;
	JTextField txtN,txtSum;
	JTextArea txtSequence;
	JButton btnCompute, btnClear, btnBack;
	int numberOfValues;
	
	public TriangularSequence()
	{
		super("Triangular Sequence");
		getContentPane().setLayout(null);
		
		panelOne = new JPanel();
		panelOne.setBounds(123,100,888,109);
		panelOne.setBackground(new Color(255,128,0));
		
		lblTriangular = new JLabel("Triangular Sequence");
		lblTriangular.setFont(new Font("Dialog",Font.BOLD,70));
		lblTriangular.setForeground(new Color(50,48,42));
		lblTriangular.setBounds(159,0,840,265);
		Icon icon = new ImageIcon("process.png");
		lblIcon = new JLabel(icon);
		
		lblN = new JLabel("Input Number of Values in the Sequence:");
		lblN.setFont(new Font("Dialog",Font.BOLD,20));
		lblN.setForeground(new Color(255,128,0));
		lblN.setBounds(380,220,424,50);
		
		txtN = new JTextField("");
		txtN.setBackground(new Color(192,192,192));
		txtN.setFont(new Font("Dialog", Font.BOLD, 30));
		txtN.setHorizontalAlignment(JTextField.CENTER);
		txtN.setBounds(302,270,553,57);
		
		btnCompute = new JButton("Compute");
		btnCompute.setFont(new Font("Dialog",Font.BOLD,40));
		btnCompute.setBackground(new Color(255,153,51));;
		btnCompute.setBounds(302,350,270,50);
		btnCompute.addActionListener(this);
		
		btnClear = new JButton("Clear");
		btnClear.setFont(new Font("Dialog",Font.BOLD,40));
		btnClear.setBackground(new Color(255,153,51));;
		btnClear.setBounds(585,350,270,50);
		btnClear.addActionListener(this);
		
		lblSum = new JLabel("Sum:");
		lblSum.setFont(new Font("Dialog",Font.BOLD,20));
		lblSum.setForeground(new Color(255,128,0));
		lblSum.setBounds(552,389,89,73);
		
		txtSum= new JTextField("");
		txtSum.setBounds(302,450,553,57);
		txtSum.setBackground(new Color(192,192,192));
		txtSum.setFont(new Font("Dialog", Font.BOLD, 30));
		txtSum.setHorizontalAlignment(JTextField.CENTER);
		txtSum.setEditable(false);
		
		lblSequence = new JLabel("Sequence:");
		lblSequence.setFont(new Font("Dialog",Font.BOLD,20));
		lblSequence.setForeground(new Color(255,128,0));
		lblSequence.setBounds(528,509,327,57);
		
		txtSequence= new JTextArea(10,10);
		txtSequence.setBounds(135,577,888,280);
		txtSequence.setBackground(new Color(192,192,192));
		txtSequence.setFont(new Font("Dialog", Font.BOLD, 20));
		txtSequence.setLineWrap(true);
		txtSequence.setEditable(false);
		
		btnBack = new JButton("Back");
		btnBack.setFont(new Font("Dialog",Font.BOLD,30));
		btnBack.setBackground(new Color(128,128,128));;
		btnBack.setBounds(846,883,165,39);
		btnBack.addActionListener(this);
		
		panelOne.add(lblTriangular); panelOne.add(lblIcon);
		getContentPane().add(panelOne);
		getContentPane().add(lblN);getContentPane().add(txtN);
		getContentPane().add(btnCompute);getContentPane().add(btnClear);
		getContentPane().add(lblSum);getContentPane().add(txtSum);
		getContentPane().add(lblSequence);getContentPane().add(txtSequence);
		getContentPane().add(btnBack);
		
		setBounds(500,20,1100,1000);
		getContentPane().setBackground(new Color(50,48,42));
		setVisible(true);
		
	}
	
	
	public void actionPerformed(ActionEvent e) 
	{
		
		if(e.getSource()==btnBack)
		{
			dispose();
			RecursiveCalculator rc = new RecursiveCalculator();
		}
		else if(e.getSource()==btnClear)
		{
			txtN.setText("");
			txtSum.setText("");
			txtSequence.setText("");
		}
		else if(e.getSource()==btnCompute)
		{
			try
			{
			String sequence="";  int i; double sum;
			numberOfValues=Integer.parseInt(txtN.getText());
			for(i = 1, sum = 0 ; i <=numberOfValues; i++)
			{
				if(i!=numberOfValues)
				{
				 sequence+=triangularRecursion(i)+",";
				}
				if(i==numberOfValues)
				{
					 sequence+=triangularRecursion(i);
				}
				 sum+=triangularRecursion(i);
			}
			txtSequence.setText(sequence);
			txtSum.setText(String.valueOf(sum));
			}
			catch(NumberFormatException nfe)
			{
				JOptionPane.showMessageDialog(null,"Invalid Input. Please input a whole number", "Invalid Input", JOptionPane.ERROR_MESSAGE );
				txtN.setText("");
			}
		}
			
		}
	public static int triangularRecursion(int n)
	{
		if(n==1)
		{
			return 1;
		}
		else
		{
		return (n+triangularRecursion(n-1));
		}
	}
		
}


