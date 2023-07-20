package com.rsq;
import com.rsq.FactorialSequence;
import com.rsq.FactorialSequence;
import com.rsq.FibonacciSequence;
import com.rsq.FibonacciSequence;
import com.rsq.LucasSequence;
import com.rsq.LucasSequence;
import com.rsq.SquareSequence;
import com.rsq.SquareSequence;
import com.rsq.TriangularSequence;
import com.rsq.TriangularSequence;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class RecursiveCalculator extends JFrame implements ActionListener
{
	JLabel lblTitle,lblIcon,lblInstruction;
	JButton btnFibonacci, btnLucas, btnTriangular, btnSquare, btnFactorial;
	JPanel panelOne;
	

	public RecursiveCalculator() 
	{
		super("Recursive Sequence Calcuator");
		getContentPane().setLayout(null);
		
		panelOne = new JPanel();
		panelOne.setBounds(123,100,888,109);
		panelOne.setBackground(new Color(255,128,0));
		
		lblTitle = new JLabel("Recursive Sequences");
		lblTitle.setFont(new Font("Dialog",Font.BOLD,70));
		lblTitle.setForeground(new Color(50,48,42));
		lblTitle.setBounds(159,0,840,265);
		Icon icon = new ImageIcon("process.png");
		lblIcon = new JLabel(icon);
		lblInstruction = new JLabel("Choose a Recursive Sequence:");
		lblInstruction.setFont(new Font("Dialog",Font.BOLD,40));
		lblInstruction.setForeground(new Color(255,128,0));
		lblInstruction.setBounds(274,174,600,200);
		btnFibonacci  = new JButton("Fibonacci Sequence");
		btnFibonacci.setFont(new Font("Dialog",Font.BOLD,40));
		btnFibonacci.setBackground(new Color(255,153,51));;
		btnFibonacci.setBounds(260,350,600,80);
		btnFibonacci.addActionListener(this);
		
		btnLucas  = new JButton("Lucas Sequence");
		btnLucas.setFont(new Font("Dialog",Font.BOLD,40));
		btnLucas.setBackground(new Color(255,153,51));;
		btnLucas.setBounds(260,450,600,80);
		btnLucas.addActionListener(this);
		
		btnTriangular = new JButton("Triangular Sequence");
		btnTriangular.setFont(new Font("Dialog",Font.BOLD,40));
		btnTriangular.setBackground(new Color(255,153,51));;
		btnTriangular.setBounds(260,550,600,80);
		btnTriangular.addActionListener(this);
		
		btnSquare = new JButton("Square Sequence");
		btnSquare.setFont(new Font("Dialog",Font.BOLD,40));
		btnSquare.setBackground(new Color(255,153,51));;
		btnSquare.setBounds(260,650,600,80);
		btnSquare.addActionListener(this);
		
		btnFactorial = new JButton("Factorial Sequence");
		btnFactorial.setFont(new Font("Dialog",Font.BOLD,40));
		btnFactorial.setBackground(new Color(255,153,51));;
		btnFactorial.setBounds(260,750,600,80);
		btnFactorial.addActionListener(this);
			
		getContentPane().add(panelOne);
	    panelOne.add(lblTitle);panelOne.add(lblIcon);
		getContentPane().add(lblInstruction);
		getContentPane().add(btnFibonacci); getContentPane().add(btnLucas);getContentPane().add(btnTriangular);getContentPane().add(btnSquare);getContentPane().add(btnFactorial );
		setBounds(500,20,1100,950);
		getContentPane().setBackground(new Color(50,48,42));
		setVisible(true);
	}
	public static void main(String [] args)
	{
		RecursiveCalculator rc = new RecursiveCalculator();
		rc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource()==btnFibonacci)
		{
			dispose();
			FibonacciSequence fs = new FibonacciSequence();
		}
		else if(e.getSource()==btnLucas)
		{
			dispose();
			LucasSequence ls = new LucasSequence();
		}
		else if(e.getSource()==btnTriangular)
		{
			dispose();
			TriangularSequence hs = new TriangularSequence();
		}
		else if(e.getSource()==btnSquare)
		{
			dispose();
			SquareSequence sq = new SquareSequence();
		}
		else if(e.getSource()==btnFactorial)
		{
			dispose();
			FactorialSequence fs = new FactorialSequence();
		}
		
	}
}
