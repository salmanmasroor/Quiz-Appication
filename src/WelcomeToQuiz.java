import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.security.auth.Subject;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.WindowConstants;
import javax.swing.border.EmptyBorder;

public class WelcomeToQuiz extends LoginForm {
	// DATA MEMBERS 
	JLabel header,subject_HL,subject_DLD,subject_OS,subject_MATH;
	JButton HL,DLD,OS,Mathematics;
	JPanel p1,p2;
	JLabel logo_label;
	ImageIcon logopic;
	JButton logout_btn;
	
	//MEMEORY ALLOCATION
	WelcomeToQuiz(){
		header = new JLabel();
		HL = new JButton();
		DLD = new JButton();
		OS = new JButton();
		Mathematics = new JButton();
		subject_HL = new JLabel();
		subject_DLD = new JLabel();
		subject_OS = new JLabel();
		subject_MATH = new JLabel();
		p1 = new JPanel();
		p2 = new JPanel();
		logo_label = new JLabel();
		logout_btn = new JButton("Log out");
		logopic = new ImageIcon("D:\\Quiz Management System\\picture\\pic1.png");
}
	
	// welcome to quiz where you select your subject
	public  void  open() {
		
		add(p1);
		p1.setBounds(0,0,70,70);
		p1.setLayout(null);
		p1.add(logo_label);
		logo_label.setIcon(logopic);
		logo_label.setBounds(0, 0, 70, 70);
		
		add(p2);
		p2.setBounds(440,460,100,30);
		p2.setBackground(null);
		p2.setLayout(null);
		p2.add(logout_btn);
		logout_btn.setBounds(0,0,100,30);
		
		header.setText("Welcome to Quiz");
		header.setBounds(170, 5, 300, 100);
		header.setFont(new Font("Arial",Font.BOLD,30));
		add(header);
		
		ImageIcon jave_icon = new ImageIcon("D:\\Quiz Management System\\picture\\Java-icon.png");
		HL.setIcon(jave_icon);
		HL.setBounds(140,120,120,120);
		add(HL);
		
		subject_HL.setText("JAVA");
		subject_HL.setBounds(165,235,50,50);
		subject_HL.setFont(new Font("Arial",Font.BOLD,20));
		add(subject_HL);
		
		
		ImageIcon dld_icon = new ImageIcon("D:\\Quiz Management System\\picture\\dld.png");
		DLD.setIcon(dld_icon);
		DLD.setBackground(Color.white);
		DLD.setBounds(330,120,120,120);
		add(DLD);
		 
	
		subject_DLD.setText("DLD");
		subject_DLD.setBounds(365,235,50,50);
		subject_DLD.setFont(new Font("Arial",Font.BOLD,20));
		add(subject_DLD);
		
		ImageIcon OS_icon = new ImageIcon("D:\\Quiz Management System\\picture\\window.png");
		OS.setIcon(OS_icon);
		OS.setBounds(140,300,120,120);
		add(OS);
        
		subject_OS.setText("OS");
		subject_OS.setBounds(170,415,50,50);
		subject_OS.setFont(new Font("Arial",Font.BOLD,20));
		add(subject_OS);
		
		ImageIcon Math_icon = new ImageIcon("D:\\Quiz Management System\\picture\\math.png");
		Mathematics.setIcon(Math_icon);
		Mathematics.setBounds(330,300,120,120);
		add(Mathematics);
		Mathematics.setBackground(Color.white);
		
		subject_MATH.setText("Math");
		subject_MATH.setBounds(365,415,50,50);
		subject_MATH.setFont(new Font("Arial",Font.BOLD,20));
		add(subject_MATH);
	}
	
	//Action perform after choosing
	public void HLaction() {
		HL.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Java_page1 Java_Q1 = new Java_page1();
				Java_Q1.frame(600,550,360,120);
				Java_Q1.logo();
				Java_Q1.Q1("1. Who invented Java Programming?");
				Java_Q1.option1("Guido van Rossum", "James Gosling", "Dennis Ritchie", "Bjarne Stroustrup");
				Java_Q1.Q2("2. Which one of the following is not an access modifier");
				Java_Q1.option2("Protected", "Void","Public","Private");
				Java_Q1.submit_button();
				Java_Q1.answer();
				
			
			}
		});
	}
	public void DLDaction() {
		DLD.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				DLD_Page1 dldpage_1 = new DLD_Page1();
				dldpage_1.frame(600,550,360,120);
				dldpage_1.logo();
				dldpage_1.Q1("1. BCD to 7 segment is");
				dldpage_1.option1("Decoder", "Encoder", "Multiplexer", "Demultiplexer");
				dldpage_1.Q2("2. One that is a universal gate");
				dldpage_1.option2("AND", "NAND","OR","NOT");
				dldpage_1.submit_button();
				dldpage_1.answer();
				
				
			
			}
		});
	}
	public void OSaction() {
		OS.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JOptionPane.showMessageDialog(null,"No Question Availabe Right Now", "OS",JOptionPane.INFORMATION_MESSAGE);
			}
		});
	}
		public void Mathaction() {
			Mathematics.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					JOptionPane.showMessageDialog(null,"No Question Availabe Right Now", "Math",JOptionPane.INFORMATION_MESSAGE);
				}
			});
		}
		public void Logout() {
			logout_btn.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					LoginForm login = new LoginForm();
					login.frame(500,400,400,150);
					login.Desgin();
					login.button();
					dispose();
				}
			});
		}
}
