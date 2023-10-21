import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Book2 extends Frame implements ActionListener
{ 
	Label l1,l2,l3;
	TextField t1,t2,t3;
	Button b1,b2,b3;
	public Book2()
	{
	setLayout(new BorderLayout());
	JLabel background =new JLabel(new ImageIcon("dj1.jpg"));

	l1=new Label("Seat Number");
	l2=new Label("Time.");
	l3=new Label("Avai.Seat");
	t1=new TextField(30);
	t2=new TextField(30);
	t3=new TextField(30);
	b1=new Button("Book Ticket");
	b2=new Button("Back");
	b3=new Button("LogOut");
	//b4=new Button("");
    	
	l1.setBounds(400,80,100,30);
	t1.setBounds(600,80,100,30);
	l2.setBounds(400,140,100,30);
	t2.setBounds(600,140,100,30);
	l3.setBounds(400,200,100,30);
	t3.setBounds(600,200,100,30);
	b1.setBounds(500,260,150,30);
	b2.setBounds(500,320,150,30);
	b3.setBounds(500,380,150,30);
	//b4.setBounds(50,400,150,30);

	t1.setText("30");
	t2.setText("16:00");
	t3.setText("20");

	setTitle("Dj Tilu");
	setSize(800,450);
	setLocation(400,200);
	setVisible(true);

	add(l1);
	add(t1);
	add(l2);
	add(t2);
	add(l3);
	add(t3);
	add(b1);
	add(b2);
	add(b3);
	add(background);
	
	b1.addActionListener(this);
	b2.addActionListener(this);
	b3.addActionListener(this);
	
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b1)
		{
			Form3 F3=new Form3();
			setVisible(false);	
		}
		if(ae.getSource()==b2)
		{
			Movie T=new Movie();
			setVisible(false);	
		}
		if(ae.getSource()==b3)
		{
			Login L=new Login();
			setVisible(false);	
		}
		repaint();
	}
	public static void main(String args[])
	{
		Book2 b2=new Book2();
	}
}			