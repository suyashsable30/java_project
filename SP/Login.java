import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Login extends Frame implements ActionListener
{ 
	
	Label l1,l2;
	TextField t1,t2;
	Button b1,b2;
	int count=0;
	public Login()
	{
	setLayout(null);
	l1=new Label("Username");
	l2=new Label("password");
	t1=new TextField(200);
	t2=new TextField(200);
	b1=new Button("Login");
	b2=new Button("Exit");
	t2.setEchoChar('*');
	JLabel background =new JLabel(new ImageIcon("2.jpg"));

	l1.setBounds(250,100,100,20);
	t1.setBounds(350,100,150,20);
	l2.setBounds(250,150,100,20);
	t2.setBounds(350,150,150,20);
	b1.setBounds(270,200,95,30);
	b2.setBounds(370,200,95,30);
	background.setBounds(0, 0, 250, 250);

	setTitle("Login Here");
	setSize(640,300);
	setLocation(400,200);
	setVisible(true);
	
	
	add(l1);
	add(t1);
	add(l2);
	add(t2);
	add(b1);
	add(b2);
	add(background);

	t1.addActionListener(this);
	t2.addActionListener(this);
	b1.addActionListener(this);
	b2.addActionListener(this);
	
	}
	public void actionPerformed(ActionEvent ae)
	{
		String aa=t1.getText();
		String bb=t2.getText();
		if(ae.getSource()==b1)
		{
			if(aa.equals("sp") && bb.equals("0000"))
			{		
				JOptionPane.showMessageDialog(null,"Logged In");
				setVisible(false);
				Movie T=new Movie();
				
			}
			else
			{
				try
				{
					if(count<3)
					{
						count=count+1;
						JOptionPane.showMessageDialog(null,"Invalid Attempt:"+count);
						t1.setText("");
						t2.setText("");	
					}
					else
					{ 
						throw new Invalid();
						
					}
				}	
				catch(Invalid a){}
		
			
		
			}
		
		}
		if(ae.getSource()==b2)
		{
			System.exit(0);	
		}
		repaint();
	}
	public static void main(String args[])
	{
		Login L=new Login();
		
	}
}
class Invalid extends Exception
{
	Invalid()
	{
		JOptionPane.showMessageDialog(null,"Logged out \nYou are attempts are over!!!");
		System.exit(0);
	}
}			