import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
class LimitOver extends Exception
{
	public LimitOver(String n) {
		super(n);
	}
}
public class Ui2 {

	public static void main(String[] args){
		JFrame frame=new JFrame("Codeline ai");
		
		JLabel label=new JLabel("Enter Name : ");
		label.setBounds(10,20, 80, 20);
		frame.add(label);
		
		JTextField name=new JTextField();
		name.setBounds(90,20, 120, 20);
		frame.add(name);
		
		JButton button=new JButton("click");
		button.setBounds(90,50, 120, 20);
		frame.add(button);
		JLabel name2show=new JLabel("Welcome : ");
		name2show.setBounds(20,60, 220, 50);
		frame.add(name2show);
		button.addActionListener(new ActionListener() {
			int i=1;
			@Override
			public void actionPerformed(ActionEvent e) {
				String name1=name.getText();
				if(i<=7)
				name2show.setText("welcome : "+name1);
				else
				{
					//name2show.setText("Limit Over");
					try {
						throw new LimitOver("Your Button Clicking Limit is Over\n\t   Restart your Application");
					} catch (LimitOver e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
				System.out.println("Button Clicked "+i+" time");
				i++;
			}
		});
		
		
		frame.setSize(400,500);
		frame.setLayout(null);
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
		
	}

}
