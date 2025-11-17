package Student_Grade_Tracker;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
public class StudView  extends JFrame{
  
	JLabel l1,l2,l3;
	JTextField t1,t2,t3;
	JButton b1,b2,b3,b4,b5;
	
	{
		setLayout(new FlowLayout());
		
		l1=new JLabel ("Rollno");
		l2=new JLabel ("name");
		l3=new JLabel ("marks");
		
		t1=new JTextField(30);
		t2=new JTextField(30);
		t3=new JTextField(30);
		
		b1=new JButton("save");
		b2=new JButton("updata");
		b3=new JButton("Delete");
		b4=new JButton("search");
		b5=new JButton("clear");
		
		b1.addActionListener(new StudController(this) );
		b2.addActionListener(new StudController(this) );
		b3.addActionListener(new StudController (this) );
		b4.addActionListener(new StudController (this) );
		b5.addActionListener(new StudController (this) );
		
		add(l1);
		add(t1);
		add(l2);
		add(t2);
		add(l3);
		add(t3);
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);
		
		setSize(400,500);
		setVisible(true);
		
		}
	public static void main(String[] args) {
		StudView fr =new StudView();
	}
}
