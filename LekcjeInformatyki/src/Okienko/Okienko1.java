package Okienko;
import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class Okienko1 {
	public static void main(String[] args) {
	JFrame okienko = new JFrame();

	okienko.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	okienko.setSize(400, 150);
	
	JLabel l = new JLabel("0");
	l.setFont(new Font("Serif", Font.PLAIN, 60));
	okienko.setLayout(null);
	        
	l.setBounds(40, 0, 1000, 100);

	okienko.add(l);  
	
	JButton b1 = new JButton("1");
	b1.setBounds(40, 120, 105, 105);
	b1.setFont(new Font("Arial", Font.PLAIN, 40));


	okienko.add(b1); 
	
	JButton b2 = new JButton("2");
	b2.setBounds(160, 120, 105, 105);
	b2.setFont(new Font("Arial", Font.PLAIN, 40));

	okienko.add(b2);
	
	JButton b3 = new JButton("3");
	b3.setBounds(280, 120, 105, 105);
	b3.setFont(new Font("Arial", Font.PLAIN, 40));

	okienko.add(b3);
	
	JButton bm = new JButton("*");
	bm.setBounds(400, 120, 105, 105);
	bm.setFont(new Font("Arial", Font.PLAIN, 40));

	okienko.add(bm);
	
	JButton b4 = new JButton("4");
	b4.setBounds(40, 240, 105, 105);
	b4.setFont(new Font("Arial", Font.PLAIN, 40));

	okienko.add(b4);
	
	JButton b5 = new JButton("5");
	b5.setBounds(160, 240, 105, 105);
	b5.setFont(new Font("Arial", Font.PLAIN, 40));

	okienko.add(b5);
	
	JButton b6 = new JButton("6");
	b6.setBounds(280, 240, 105, 105);
	b6.setFont(new Font("Arial", Font.PLAIN, 40));

	okienko.add(b6);
	
	JButton bdz = new JButton("/");
	bdz.setBounds(400, 240, 105, 105);
	bdz.setFont(new Font("Arial", Font.PLAIN, 40));

	okienko.add(bdz);
	
	JButton b7 = new JButton("7");
	b7.setBounds(40, 360, 105, 105);
	b7.setFont(new Font("Arial", Font.PLAIN, 40));

	okienko.add(b7);
	
	JButton b8 = new JButton("8");
	b8.setBounds(160, 360, 105, 105);
	b8.setFont(new Font("Arial", Font.PLAIN, 40));

	okienko.add(b8);
	
	JButton b9 = new JButton("9");
	b9.setBounds(280, 360, 105, 105);
	b9.setFont(new Font("Arial", Font.PLAIN, 40));

	okienko.add(b9);
	
	JButton bdod = new JButton("+");
	bdod.setBounds(400, 360, 105, 105);
	bdod.setFont(new Font("Arial", Font.PLAIN, 40));

	okienko.add(bdod);
	
	JButton bac = new JButton("AC");
	bac.setBounds(40, 480, 105, 105);
	bac.setFont(new Font("Arial", Font.PLAIN, 40));

	okienko.add(bac);
	
	JButton b0 = new JButton("0");
	b0.setBounds(160, 480, 105, 105);
	b0.setFont(new Font("Arial", Font.PLAIN, 40));

	okienko.add(b0);
	
	JButton bc = new JButton(",");
	bc.setBounds(280, 480, 105, 105);
	bc.setFont(new Font("Arial", Font.PLAIN, 40));

	okienko.add(bc);
	
	JButton bod = new JButton("-");
	bod.setBounds(400, 480, 105, 105);
	bod.setFont(new Font("Arial", Font.PLAIN, 40));

	okienko.add(bod);
	
	okienko.setVisible(true);

}}
