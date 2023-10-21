import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Pay2 extends Frame implements ActionListener
{ 
	Label l1;
	TextField t1;
	Button b1,b2,b3,b4;
	int seat,cal;
	String xx,yy,zz;
	public Pay2(String aa,String bb,String cc,int seats,int calc)
	{
	setLayout(new BorderLayout());
	JLabel background =new JLabel(new ImageIcon("44.jpg"));
	seat=seats;xx=aa;yy=bb;zz=cc;cal=calc;
	l1=new Label("ATM Pin.");
	t1=new TextField(4);
	b1=new Button("OK");
	b2=new Button("Logout");
	b3=new Button("Back");
	b4=new Button("Receipt");
	
	l1.setBounds(200,150,100,30);
	t1.setBounds(350,150,100,30);
	b1.setBounds(200,200,100,30);
	b2.setBounds(270,300,100,30);
	b3.setBounds(270,250,100,30);
	b4.setBounds(350,200,100,30);	
	
	setTitle("Pay");
	setSize(600,400);
	setLocation(400,200);
	setVisible(true);

	add(l1);
	add(t1);
	add(b1);
	add(b2);
	add(b3);
	add(b4);
	add(background);
	
	b1.addActionListener(this);
	b2.addActionListener(this);
	b3.addActionListener(this);
	b4.addActionListener(this);	
	
	}
	public void actionPerformed(ActionEvent ae)
	{
		String aa=t1.getText();
		int a=Integer.parseInt(t1.getText());
		if(ae.getSource()==b1)
		{
			if(a<10000)
			{
			JOptionPane.showMessageDialog(null,"Your Ticket is Book :)");
			//LoginFrame L=new LoginFrame();
			//setVisible(false);
			}
			else
			{
				JOptionPane.showMessageDialog(null,"PIN greater than 4 digit,plz enter valid PIN");
				t1.setText("");
			}
		}
		if(ae.getSource()==b2)
		{
			Login L=new Login();
			setVisible(false);
		}
		if(ae.getSource()==b3)
		{
			Form2 F2=new Form2();
			setVisible(false);
		}
		if(ae.getSource()==b4)
		{	
			suya2 S2=new suya2(xx,yy,zz,seat,cal);
			setVisible(false);
		}
		repaint();
	}
	/*public static void main(String args[])
	{
		Pay1 P1=new Pay1(String aa,String bb,String cc,int calc,int seats)
		{
			seat=seats;xx=aa;yy=bb;zz=cc;cal=calc;
		}
	}*/
}			