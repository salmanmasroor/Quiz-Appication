import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Java_page4 extends Java_page1 {

	public void answer() {		
		
			btn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(Radiobutton_group1.isSelected(null) || Radiobutton_group2.isSelected(null)) {
					warning();
				}
				else {
				if(r4.isSelected() == true) {
					marks++;
					if(r7.isSelected() == true) {
						marks++;
					}
				}
				else if(r4.isSelected() == true) {
					marks++;
				}
				else if(r7.isSelected() == true) {
					marks++;
				}
				Java_page5 Java_Q5 = new Java_page5();
				Java_Q5.frame(600,550,360,120);
				Java_Q5.logo();
				Java_Q5.frame(600,550,360,120);
				Java_Q5.Q1("9. Which of these have highest precedence");
				Java_Q5.option1("()", "++", "*", ">>");
				Java_Q5.Q2("10. Java language was initially called as ________");
				Java_Q5.option2("Oak", "Sumatra","J++", "Pine");
				Java_Q5.submit_button();
				Java_Q5.answer();			
				dispose();
			}
			}
		});

}
}
