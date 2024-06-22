import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.mysql.cj.jdbc.exceptions.CommunicationsException;

public class DLD_page5 extends DLD_Page1 {
	public void answer() {		
			btn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				ImageIcon ic  =new ImageIcon();
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
				else if(r2.isSelected() == true) {
					marks++;
				}
				else if(r5.isSelected() == true) {
					marks++;
				}
				String Value = "";
				if(marks <=10 && marks>=8) {
					Value = "(Excellent)";
					ic = new ImageIcon("C:\\Users\\samsung\\Downloads\\icons8-exam-64.png");
				}
				else if(marks<=7 && marks>=5) {
					Value = "(Good)";
					ic = new ImageIcon("C:\\Users\\samsung\\Downloads\\icons8-ok-48.png");
				}
				else {
					Value = "(BAD)";
					ic = new ImageIcon("C:\\Users\\samsung\\Downloads\\icons8-emoji-64.png");
				}

				JOptionPane.showMessageDialog(null,"you got "+marks+" marks", "DLD",JOptionPane.INFORMATION_MESSAGE,ic);
				database();
				query();
				marks = 0;
				dispose();
			}
			}
			}
		});
			
			
}
	public void query() {
		
		try {
		
			PreparedStatement st = con.prepareStatement("Update students Set DLD_Marks = ? where Username = ?");
			st.setInt(1, marks);
			st.setString(2, DBusername);			
			if(st.executeUpdate() == 1) {
				System.out.println("Update record successfully");
			}else {
				System.out.println("Failed Query");
			}
		}catch (SQLException ex) {
            System.out.println("Error" + ex);
        }
	}
}
