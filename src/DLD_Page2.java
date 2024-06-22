
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class DLD_Page2 extends DLD_Page1 {
	public void answer() {		
	
			btn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(Radiobutton_group1.isSelected(null) || Radiobutton_group2.isSelected(null)) {
					warning();
				}
				else{
				{
				if(r2.isSelected() == true) {
					marks++;
					if(r5.isSelected() == true) {
						marks++;
					}
				}
				else if(r3.isSelected() == true) {
					marks++;
				}
				else if(r2.isSelected() == true) {
					marks++;
				}
				
				
				DLD_page3  dldpage_3= new DLD_page3();
				dldpage_3.logo();
				dldpage_3.frame(600,550,360,120);
				dldpage_3.Q1("5. Transition table include ________________");
				dldpage_3.option1("Squares",  "Oval", "Rectangles", "Circles");
				dldpage_3.Q2("6. Stack is an acronym for _______________");
				dldpage_3.option2("Flash Memory",  "Bust Flash Memory", "FIFO memory",  "LIFO memory");
				dldpage_3.submit_button();
				dldpage_3.answer();
				dispose();
			}
			}
				
			}
		});

}

}
