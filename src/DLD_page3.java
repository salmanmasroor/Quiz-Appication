
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class DLD_page3 extends DLD_Page1{

	public void answer() {		
	
		btn1.setBounds(0,0,100,30);
			btn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(Radiobutton_group1.isSelected(null) || Radiobutton_group2.isSelected(null)) {
					warning();
				}
				else{
				{
				if(r1.isSelected() == true) {
					marks++;
					if(r8.isSelected() == true) {
						marks++;
					}
				}
				else if(r1.isSelected() == true) {
					marks++;
				}
				else if(r8.isSelected() == true) {
					marks++;
				}
				DLD_page4 dldpage_4 = new DLD_page4();
				dldpage_4.logo();
				dldpage_4.frame(600,550,360,120);
				dldpage_4.Q1("7. A positive OR gate is also a negative");
				dldpage_4.option1("NAND Gate"  ,"OR Gate","NOR Gate" , "AND Gate");
				dldpage_4.Q2("8. Each gate take time for delay ______________");
				dldpage_4.option2("2 to 10 ns" ,"3 to 10 ns","1 to 5 ns","3 to 5 ns");
				dldpage_4.submit_button();
				dldpage_4.answer();
				dispose();
			}
			}
			}
		});

}
}
