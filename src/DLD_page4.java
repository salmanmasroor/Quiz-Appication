
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class DLD_page4 extends DLD_Page1 {
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
				if(r4.isSelected() == true) {
					marks++;
					if(r6.isSelected() == true) {
						marks++;
					}
				}
				else if(r5.isSelected() == true) {
					marks++;
				}
				else if(r5.isSelected() == true) {
					marks++;
				}
				DLD_page5 dldpage_5 = new DLD_page5();
				dldpage_5.logo();
				dldpage_5.frame(600,550,360,120);
				dldpage_5.Q1("9. ____________adders are needed to construct an m-bit parallel adder");
				dldpage_5.option1("m+1", "m-1", "m", "m/2");
				dldpage_5.Q2("10. Select the universal gate");
				dldpage_5.option2("NAND", "AND", "OR", "NOT");
				dldpage_5.submit_button();
				dldpage_5.answer();
				dispose();
			}
			}
			}
		});

}
}
