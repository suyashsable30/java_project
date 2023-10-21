import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class suya4 extends Frame implements ActionListener
{

Button b1,b2;
Label l1,l2,l3,l4,l5;
TextField t1,t2,t3,t4,t5,t6;
public suya4(String xx,String yy,String zz,int seat,int cal)
{	

b1=new Button("Print");
b2=new Button("Exit");
l1=new Label("Name");
l2=new Label("EmailID");
l3=new Label("Mob.No");
l4=new Label("No of seats.");
//l6=new Label("");
l5=new Label("Amount");
setBackground(new Color(173, 216, 230));

t1=new TextField(20);
t2=new TextField(20);
t3=new TextField(20);
t4=new TextField(20);
t5=new TextField(20);
t6=new TextField(20);


t1.setText(xx);
t2.setText(yy);
t3.setText(zz);
t4.setText(Integer.toString(seat));
t5.setText(Integer.toString(cal));

l1.setBounds(200,50,100,30);
l2.setBounds(200,100,100,30);
l3.setBounds(200,150,100,30);
l4.setBounds(200,200,100,30);
//l6.setBounds(20,25,10,30);
l5.setBounds(200,250,100,30);

t1.setBounds(300,50,100,30);
t2.setBounds(300,100,100,30);
t3.setBounds(300,150,100,30);
t4.setBounds(300,200,100,30);
t5.setBounds(300,250,100,30);
t6.setBounds(200,250,100,30);

b1.setBounds(200,300,100,30);
b2.setBounds(300,300,100,30);

setTitle("Receipt");
setLayout(new BorderLayout());
setSize(600,400);
setLocation(400,200);
setVisible(true);

add(b1);
add(b2);
add(t1);
add(t2);
add(t3);
add(t4);
add(t5);
add(l1);
add(l2);
add(l3);
add(l4);
//add(l6);
add(l5);
add(t6);

b1.addActionListener(this);
b2.addActionListener(this);

}


public void actionPerformed(ActionEvent ae)
{

	if(ae.getSource()==b1)
	{
	JOptionPane.showMessageDialog(null,"Take Your Print :)");
	}

	if(ae.getSource()==b2)
	{
		Login L=new Login();
		setVisible(false);
	}
	
repaint();
}


}