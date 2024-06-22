import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Scrollbar;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollBar;
import javax.swing.border.Border;

public class Java_page1 extends LoginForm{
	//Data Member of Quiz
	JPanel p1,p2,p3,p4;
	JButton btn1;
	JLabel label_Q1,label_Q2,Label_icon;
	JRadioButton r1,r2,r3,r4,r5,r6,r7,r8;
	ButtonGroup Radiobutton_group1,Radiobutton_group2;
	static int marks = 0;

	Java_page1(){
		p1 = new JPanel();
		p2 = new JPanel();
		p3 = new JPanel();
		p4 = new JPanel();
		
		btn1 = new JButton("Submit");
		
		
		label_Q1 = new JLabel();
		label_Q2 = new JLabel();
		Label_icon = new JLabel();
		
		
		r1= new JRadioButton();
		r2= new JRadioButton()
				;
		r3= new JRadioButton();
		r4= new JRadioButton();
		r5= new JRadioButton();
		r6= new JRadioButton();
		r7= new JRadioButton();
		r8= new JRadioButton();
		
		Radiobutton_group1 = new ButtonGroup();
		Radiobutton_group2 = new ButtonGroup();
		
	}
	public void logo() {
		add(p4);
		p4.setBounds(250,0, 70, 70);
		ImageIcon icon_javaquiz = new ImageIcon("C:\\Users\\samsung\\Downloads\\javaIcon.png");
		Label_icon.setIcon(icon_javaquiz);
		p4.add(Label_icon);
	}
	public void Q1(String Question1) {
		add(p1);
		p1.setBackground(null);
		p1.setLayout(null);
		p1.setBounds(0, 50,450, 200);
		p1.add(label_Q1);
		label_Q1.setText(Question1);
		label_Q1.setBounds(20,40,440,30);
	
}
	public void option1(String op1,String op2,String op3,String op4) {
		r1.setText(op1);
		r2.setText(op2);
		r3.setText(op3);
		r4.setText(op4);
		
		p1.add(r1);
		p1.add(r2);
		p1.add(r3);
		p1.add(r4);
		r1.setBounds(30,70, 160, 40);
		r2.setBounds(30,100, 160, 40);
		r3.setBounds(30,130, 160, 40);
		r4.setBounds(30,160, 160, 40);
		
		Radiobutton_group1.add(r1);
		Radiobutton_group1.add(r2);
		Radiobutton_group1.add(r3);
		Radiobutton_group1.add(r4);
		
	}
	public void Q2(String Question2) {
		
		
		add(p2); 
		p2.setBackground(null);
		p2.setLayout(null);
		p2.setBounds(0, 251,450, 200);
		p2.add(label_Q2);
		label_Q2.setText(Question2);
		label_Q2.setBounds(20,40,400,30);
		
}
	public void option2(String op1,String op2,String op3,String op4) {
		r5.setText(op1);
		r6.setText(op2);
		r7.setText(op3);
		r8.setText(op4);
		
		p2.add(r5);
		p2.add(r6);
		p2.add(r7);
		p2.add(r8);
		r5.setBounds(30,70, 150, 40);
		r6.setBounds(30,100, 150, 40);
		r7.setBounds(30,130, 150, 40);
		r8.setBounds(30,160, 150, 40);
		
		Radiobutton_group2.add(r5);
		Radiobutton_group2.add(r6);
		Radiobutton_group2.add(r7);
		Radiobutton_group2.add(r8);
		
	}
	public void submit_button() {
		add(p3);
		p3.setBackground(null);
		p3.setLayout(null);
		p3.setBounds(410,470,100,30);
		p3.add(btn1);
		btn1.setBounds(0,0,100,30);
	}
	public void warning() {
		JOptionPane.showMessageDialog(null,"select radiobutton", "title",JOptionPane.INFORMATION_MESSAGE);
	}
	public void answer() {
		
		btn1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(Radiobutton_group1.isSelected(null) || Radiobutton_group2.isSelected(null)) {
					warning();
				}
				else {
				if(r2.isSelected() == true) {
					marks++;
					if(r6.isSelected() == true) {
						marks++;
					}
				}
				else if(r2.isSelected() == true) {
					marks++;
				}
				else if(r6.isSelected() == true) {
					marks++;
				}
				Java_page2 Java_Q2 = new Java_page2();
				Java_Q2.frame(600,550,360,120);
				
				Java_Q2.logo();
				Java_Q2.Q1("3. Which exception is thrown when java is out of memory" );
				Java_Q2.option1("MemoryError", "OutOfMemoryError", "MemoryOutOfBoundsException","MemoryFullException");
				Java_Q2.Q2("4. What is the extension of compiled java classes");
				Java_Q2.option2(".txt" ,".js",".class", ".java");
				Java_Q2.submit_button();
				Java_Q2.answer();
				dispose();
			}
			}
		});
	}
		
}
	
    
