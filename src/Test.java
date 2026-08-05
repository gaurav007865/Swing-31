import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Test {

	public static void main(String[] args) {
		
		JFrame frame=new JFrame("Codeline ai");
		JLabel label=new JLabel("Enter Name : ");
		label.setBounds(10, 10, 80, 30);
		
		JTextField text=new JTextField();
		text.setBounds(90, 15, 110, 20);
		
		JButton button=new JButton("click");
		button.setBounds(70, 60, 80, 20);
		
		JLabel showname=new JLabel("welcome : ");
		showname.setBounds(20, 80, 1110, 20);
		
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//System.out.println("button clicked");
				String name=text.getText();
				showname.setText("welcome : "+name);
			}
		});
		frame.add(showname);
		frame.add(button);
		frame.add(text);
		frame.add(label);
		frame.setSize(300,400);
		frame.setLayout(null);
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
		
		
		
		
		
		
		
		
		
		}

}
/*
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Test {

	public static void main(String[] args) {
		JFrame f=new JFrame("Codeline Ai");//creating instance of JFrame    
		
		JTextField txtname=new JTextField();
		txtname.setBounds(100, 20, 100, 20);
		
		JLabel lb=new JLabel("Name : ");
		lb.setBounds(30, 20, 70, 20);
		
		JButton btn =new JButton("Click");
		btn.setBounds(80, 60, 70, 30);
		
		JLabel lb1=new JLabel("Welcome : ");
		lb1.setBounds(30, 110, 100, 20);
		
		
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				String name = txtname.getText();
				 
				lb1.setText("Welcome : "+name);
				
			}
		});
		
		f.add(btn);
		f.add(txtname);
		f.add(lb);
		f.add(lb1);
		
		f.setSize(250,220);//400 width and 500 height    
		f.setLayout(null);//using no layout managers  
		f.setLocationRelativeTo(null);
		f.setVisible(true);//making the frame visible    

	}
}
*/