import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.security.PublicKey;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Java_page2 extends Java_page1 {
	
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
					if(r8.isSelected() == true) {
						marks++;
					}
				}
				else if(r2.isSelected() == true) {
					marks++;
				}
				else if(r8.isSelected() == true) {
					marks++;
				}
				Java_page3 Java_Q3 = new Java_page3();
				Java_Q3.frame(600,550,360,120);
				Java_Q3.logo();
				Java_Q3.Q1("5. Which component is used to compile, debug and execute the java programs");
				Java_Q3.option1("JRE",  "JIT",  "JDK", "JVM");
				Java_Q3.Q2("6.  Which one of the following is not a Java feature");
				Java_Q3.option2("Object-oriented", "Use of pointers","Portable","Dynamic and Extensible");
				Java_Q3.submit_button();
				Java_Q3.answer();
				dispose();
				}
			}
		});
	}

}
