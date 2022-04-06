package Okienko;
import java.awt.Font;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Kalkulatorv2 {
	static  boolean hasCommaBeenUsed = false;
	static double a = 0;
	static double b = 0;
	static String action = "";
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
	dodajPrzyciskNormalny(b1,l,okienko,40,120, "1");
	JButton b2 = new JButton("2");
	dodajPrzyciskNormalny(b2,l,okienko,160, 120, "2");
	JButton b3 = new JButton("3");
	dodajPrzyciskNormalny(b3,l,okienko,280,120, "3");
	JButton b4 = new JButton("4");
	dodajPrzyciskNormalny(b4,l,okienko,40,240, "4");
	JButton b5 = new JButton("5");
	dodajPrzyciskNormalny(b5,l,okienko,160,240, "5");
	JButton b6 = new JButton("6");
	dodajPrzyciskNormalny(b6,l,okienko,280,240, "6");
	JButton b7 = new JButton("7");
	dodajPrzyciskNormalny(b7,l,okienko,40,360, "7");
	JButton b8 = new JButton("8");
	dodajPrzyciskNormalny(b8,l,okienko,160,360, "8");
	JButton b9 = new JButton("9");
	dodajPrzyciskNormalny(b9,l,okienko,280,360, "9");
	JButton b0 = new JButton("0");
	dodajPrzyciskNormalny(b0,l,okienko,160, 480, "0");
	JButton bcomma = new JButton(".");
	dodajPrzyciskSpecjalny(bcomma,l,okienko,40, 480, ".");
	JButton bAC = new JButton("AC");
	dodajPrzyciskSpecjalny(bAC,l,okienko,520, 120, "AC");
	JButton bC = new JButton("C");
	dodajPrzyciskSpecjalny(bC,l,okienko,520, 240, "C");
	JButton bR = new JButton("=");
	dodajPrzyciskSpecjalny(bR,l,okienko,280, 480, "=");
	JButton bMn = new JButton("*");
	dodajPrzyciskSpecjalny(bMn,l,okienko,400, 120, "*");
	JButton bDzi = new JButton("/");
	dodajPrzyciskSpecjalny(bDzi,l,okienko,400, 240, "/");
	JButton bDod = new JButton("+");
	dodajPrzyciskSpecjalny(bDod,l,okienko,400, 360, "+");
	JButton bOd = new JButton("-");
	dodajPrzyciskSpecjalny(bOd,l,okienko,400, 480, "-");
	JButton bPro = new JButton("%");
	dodajPrzyciskSpecjalny(bPro,l,okienko,520, 360, "%");
	JButton bRe = new JButton("ꟻ");
	dodajPrzyciskSpecjalny(bRe,l,okienko,520, 480, "ꟻ");




	okienko.setVisible(true);

	}
	private static void dodajPrzyciskNormalny(JButton przycisk, JLabel l,JFrame okienko, int x, int y, String number) {
	przycisk.setBounds(x,y,105, 105);
	przycisk.setFont(new Font("Arial", Font.PLAIN, 40));
	przycisk.addActionListener(new ActionListener()        
	{
	 
	   public void actionPerformed(ActionEvent arg0)
	         
	  {
	   if (l.getText() == "0"){//|| l.getText() == 0) {
	   l.setText("");
	   }
	      l.setText(l.getText() + number);    
	      String text = l.getText();
	    if (text.charAt(0) == '0' && text.charAt(1) != '.') {
	    l.setText(number);
	    }
	  }    
	});
	okienko.add(przycisk);


	}
	private static void dodajPrzyciskSpecjalny(JButton przycisk, JLabel l,JFrame okienko, int x, int y, String number) {
	przycisk.setBounds(x,y,105, 105);
	przycisk.setFont(new Font("Arial", Font.PLAIN, 40));
	przycisk.addActionListener(new ActionListener()        
	{
	 
	   public void actionPerformed(ActionEvent arg0)
	         
	  {
	   if (number == ".") {
	   if (!hasCommaBeenUsed) {
	   l.setText(l.getText() + ".");
	   hasCommaBeenUsed = true;
	   } else {
	   return;
	   }
	   }
	 
	   else if (number == "AC"){
	   l.setText("0");
	   hasCommaBeenUsed = false;
	   action = "";
	   a = 0;
	   b = 0;
	   return;
	   }
	   else if (number == "C"){
	    String text = l.getText();
	    StringBuffer sb= new StringBuffer(text);  
	    sb.deleteCharAt(sb.length()-1);  
	   l.setText(sb.toString());
	    if (sb.length() < 1) {
	    l.setText("0");
	    }
	   hasCommaBeenUsed = false;
	   action = "";
	   a = 0;
	   b = 0;
	   return;
	   }
	   else if (number == "*") {
	   if (action != "") {
	   Oblicz();
	   }
	   hasCommaBeenUsed = false;
	   a = Double.parseDouble(l.getText());
	   l.setText("0");
	   action = "*";
	   }
	   else if (number == "/") {
	   if (action != "") {
	   Oblicz();
	   }
	   hasCommaBeenUsed = false;
	   a = Double.parseDouble(l.getText());
	   l.setText("0");
	   action = "/";
	   }
	   else if (number == "+") {
	   if (action != "") {
	   Oblicz();
	   }
	   hasCommaBeenUsed = false;
	   a = Double.parseDouble(l.getText());
	   l.setText("0");
	   action = "+";
	   }
	   else if (number == "-") {
	   if (action != "") {
	   Oblicz();
	   }
	   hasCommaBeenUsed = false;
	   a = Double.parseDouble(l.getText());
	   l.setText("0");
	   action = "-";
	   }
	   else if (number == "%") {
	    a =0;
	    b=0;
	    action = "";
	   hasCommaBeenUsed = true;
	   a = Double.parseDouble(l.getText());
	   l.setText(Double.toString(a/100));
	}
	   else if (number == "ꟻ") {
	    String string=l.getText();
	    String reverse = new StringBuffer(string).reverse().toString();
	    System.out.println(reverse);
	    l.setText(reverse);
	   }
	  else if (number == "=") {
	   Oblicz();
	   }}
	 
	  private void Oblicz() {
	   hasCommaBeenUsed = false;
	   b = Double.parseDouble(l.getText());
	   if (action == "*") {
	   l.setText(Double.toString(a*b));
	   }
	   else if (action == "/")
	   {
	   l.setText(Double.toString(a/b));
	   }else if (action == "+")
	   {
	   l.setText(Double.toString(a+b));
	   }else if (action == "-")
	   {
	   l.setText(Double.toString(a-b));
	   }
	   action = "";
	  }
	});
	okienko.add(przycisk);

	}
	}

		
