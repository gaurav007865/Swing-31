import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class UiwithDatabase {

	public static void main(String[] args) {
		JFrame frame=new JFrame("Gaurav");//Frame Created
		
		Database db=new Database();
		
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
		
		JLabel final_label=new JLabel("Result : ");
		final_label.setBounds(150, 150, 90, 20);
		
		JButton insert_button=new JButton("insert");
		insert_button.setBounds(20, 110, 90, 20);
		
		insert_button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//System.out.println("Insert Button Clicked");
				int id=Integer.parseInt(input_id.getText());
				String name=input_name.getText();
				int age=Integer.parseInt(input_age.getText());
				try {
					String output=db.insertd(id, name, age);
					final_label.setText(output);
				} catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		
		
		
		JButton update_button=new JButton("update");
		update_button.setBounds(130, 110, 90, 20);
		
		update_button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//System.out.println("Update Button Clicked");
				int id=Integer.parseInt(input_id.getText());
				String name=input_name.getText();
				int age=Integer.parseInt(input_age.getText());
				try {
					String output=db.updated(id, name, age);
					final_label.setText(output);
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		
		
		
		JButton delete_button=new JButton("delete");
		delete_button.setBounds(240, 110, 90, 20);
		
		delete_button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//System.out.println("Delete Button Clicked");
				int id=Integer.parseInt(input_id.getText());
				try {
					String output=db.deleted(id);
					final_label.setText(output);
				} catch (ClassNotFoundException | SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		
		
		JLabel description=new JLabel("Basic CRUD(Create,Read,Update,Delete) Operations");
		description.setBounds(40, 200, 1000, 20);
		
		frame.add(description);
		frame.add(final_label);
		frame.add(delete_button);
		frame.add(update_button);
		frame.add(insert_button);
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
