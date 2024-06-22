import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Java_page3 extends Java_page1 {
	

	public void answer() {		
			btn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(Radiobutton_group1.isSelected(null) || Radiobutton_group2.isSelected(null)) {
					warning();
				}
				else{
				if(r3.isSelected() == true) {
					marks++;
					if(r6.isSelected() == true) {
						marks++;
					}
				}
				else if(r3.isSelected() == true) {
					marks++;
				}
				else if(r6.isSelected() == true) {
					marks++;
				}
				Java_page4 Java_Q4 = new Java_page4();
				Java_Q4.logo();
				Java_Q4.frame(600,550,360,120);
				Java_Q4.Q1("7. On which platforms Java runs");
				Java_Q4.option1("Windows" , "Mac OS" , "UNIX", "All of these");
				Java_Q4.Q2("8. Number of primitive data types in Java are");
				Java_Q4.option2("6","7", "8", "9");
				Java_Q4.submit_button();
				Java_Q4.answer();
				dispose();
			}
			}
		});
}
}
