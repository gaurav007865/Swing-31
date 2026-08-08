import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class Database {
	String insertd(int id,String name,int age)throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Step 1 Completed");
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cod","root","abc123");
		System.out.println("Connected");
		
		//Statement st=con.createStatement();
		PreparedStatement ps=con.prepareStatement("insert into stu value(?,?,?)");
		
		ps.setInt(1, id);
		ps.setString(2, name);
		ps.setInt(3, age);
		int h=ps.executeUpdate();
		ps.close();
		con.close();
		if(h>0)
		{
			return "Inserted";
		}
		else
		{
			return "not inserted";
		}
		

	}
	
	
}
