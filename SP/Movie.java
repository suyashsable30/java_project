import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Movie extends Frame implements ActionListener
{ 
	Label l1,l2,l3,l4,l5,l6;
	TextField t1;
	Button b1,b2;
	public Movie()
	{
	setLayout(null);
	 setBackground(new Color(173, 216, 230));
	l1=new Label("MOVIE NAME");
	l2=new Label("Show");
	l3=new Label("Bhramstre");
	l4=new Label("Drishym 2");
	l5=new Label("Dj Tilu");
	l6=new Label("OMG");
	t1=new TextField(30);
	b1=new Button("Number and time");
	b2=new Button("Logout");
	

	l2.setBounds(50,50,100,30);
	l3.setBounds(200,50,100,30);
	l4.setBounds(200,100,100,30);
	l5.setBounds(200,150,100,30);
	l6.setBounds(200,200,100,30);
	l1.setBounds(50,250,100,30);
	t1.setBounds(200,250,150,30);
	b1.setBounds(100,300,150,30);
	b2.setBounds(300,300,150,30);

	setTitle("welcome");
	setSize(600,400);
	setLocation(400,200);
	setVisible(true);
        JLabel background =new JLabel(new ImageIcon("b1.jpg"));

	add(l1);
	add(l2);
	add(l3);
	add(l4);
	add(l5);
	add(l6);
	add(t1);
	add(b1);
	add(b2);

	t1.addActionListener(this);
	b1.addActionListener(this);
	b2.addActionListener(this);
	
	}
	public void actionPerformed(ActionEvent ae)
	{
		String aa=t1.getText();
		if(ae.getSource()==b1)
		{
			if(aa.equals("Bhramstre"))
			{
				Book b=new Book();
				setVisible(false);
			}
			else if(aa.equals("Drishym 2"))
			{
				Book1 b1=new Book1();
				setVisible(false);
			}
			else if(aa.equals("Dj Tilu"))
			{
				Book2 b2=new Book2();
				setVisible(false);
			}
			else if(aa.equals("OMG"))
			{
				Book3 b3=new Book3();
				setVisible(false);
			}
			else
			{
				JOptionPane.showMessageDialog(null,"Enter available Movie name");
			}
		}
		if(ae.getSource()==b2)
		{
			Login L=new Login();
			setVisible(false);
		}
		repaint();
	}
	public static void main(String args[])
	{
		Movie T=new Movie();
	}
}			