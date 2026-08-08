import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class UiwithDatabase {

	public static void main(String[] args) {
		JFrame frame=new JFrame("Gaurav");//Frame Created
		
		//Name Label
		JLabel label1=new JLabel("Name : ");
		label1.setBounds(10, 20, 100, 20);
		
		//Input Field
		JTextField input_name=new JTextField();
		input_name.setBounds(60, 20, 110, 20);
		
		//ID Label
		JLabel label2=new JLabel("ID : ");
		label2.setBounds(20, 50, 110, 20);
		
		//id input
		JTextField input_id=new JTextField();
		input_id.setBounds(60, 50, 110, 20);
		
		//Age Label
		JLabel label3=new JLabel("age : ");
		label3.setBounds(20, 80, 110, 20);
		
		
		JTextField input_age=new JTextField();
		input_age.setBounds(60, 80, 110, 20);
		
		
		frame.add(label1);
		frame.add(label2);
		frame.add(label3);
		frame.add(input_id);
		frame.add(input_name);
		frame.add(input_age);
		
		
		
		
		
		frame.setSize(400,500);
		frame.setLayout(null);
		frame.setVisible(true);
		frame.setLocale(null);
		frame.setLocationRelativeTo(null);
		
	}

}
