import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Form1 extends Frame implements ActionListener
{

Button b1,b2,b3,b4;
Label l1,l2,l3,l4,l5,l6;
TextField t1,t2,t3,t4,t5,t6;
int seats,calc=0,amt;
public Form1()
{	
setLayout(new BorderLayout());
JLabel background =new JLabel(new ImageIcon("44.jpg"));
b1=new Button("Calculate");
b2=new Button("Pay");
b3=new Button("Back");
b4=new Button("Logout");
l1=new Label("Name");
l2=new Label("EmailID");
l3=new Label("Mob.No");
l4=new Label("No.of sits");
l5=new Label("Amount");
l6=new Label("Total Amt.");

t1=new TextField(20);
t2=new TextField(20);
t3=new TextField(20);
t4=new TextField(20);
t5=new TextField(20);
t6=new TextField(20);

l1.setBounds(200,50,100,30);
l2.setBounds(200,100,100,30);
l3.setBounds(200,150,100,30);
l4.setBounds(200,200,100,30);
l5.setBounds(200,250,100,30);
l6.setBounds(200,300,100,30);
t1.setBounds(350,50,100,30);
t2.setBounds(350,100,100,30);
t3.setBounds(350,150,100,30);
t4.setBounds(350,200,100,30);
t5.setBounds(350,250,100,30);
t6.setBounds(350,300,100,30);
b1.setBounds(230,350,100,30);
b2.setBounds(320,350,100,30);
b3.setBounds(230,400,100,30);
b4.setBounds(320,400,100,30);
setTitle("Register Here");
setSize(650,500);
setLocation(400,100);
t5.setText("500");
setVisible(true);

add(b1);
add(b2);
add(b3);
add(b4);
add(t1);
add(t2);
add(t3);
add(t4);
add(t5);
add(t6);
add(l1);
add(l2);
add(l3);
add(l4);
add(l5);
add(l6);
add(background);

b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);
t6.addActionListener(this);
}


public void actionPerformed(ActionEvent ae)
{
	String aa=t1.getText();
	String bb=t2.getText();
	String cc=t3.getText();
	seats=Integer.parseInt(t4.getText());
	amt=Integer.parseInt(t5.getText());
	
	if(ae.getSource()==b1)
	{
		
		 calc=seats*amt;
		t6.setText(""+calc);
		
	}

	if(ae.getSource()==b2)
	{
		Pay1 P1=new Pay1(aa,bb,cc,seats,calc);
		setVisible(false);
		
		
	}
	if(ae.getSource()==b3)
	{
		Book b=new Book();
	}
	if(ae.getSource()==b4)
	{
		System.exit(0);
		
	}
repaint();
}

public static void main(String args[])
	{
	Form1 F1=new Form1();

	}
}