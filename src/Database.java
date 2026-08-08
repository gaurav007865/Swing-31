import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class Database {
	String insertd(int id,String name,int age)throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		//System.out.println("Step 1 Completed");
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cod","root","abc123");
		//System.out.println("Connected");
		
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
	String updated(int id,String name,int age)throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		//System.out.println("Step 1 Completed");
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cod","root","abc123");
		//System.out.println("Connected");
		
		//Statement st=con.createStatement();
		PreparedStatement ps=con.prepareStatement("update stu set name=?,age=? where id=?");
		
		ps.setInt(3, id);
		ps.setString(1, name);
		ps.setInt(2, age);
		int h=ps.executeUpdate();
		ps.close();
		con.close();
		if(h>0)
		{
			return "Updated";
		}
		else
		{
			return "not update";
		}
	}
	
	String deleted(int id) throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		//System.out.println("Step 1 Completed");
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cod","root","abc123");
		//System.out.println("Connected");
		
		//Statement st=con.createStatement();
		PreparedStatement ps=con.prepareStatement("delete from stu where id=?");
		
		ps.setInt(1, id);
	
		int h=ps.executeUpdate();
		ps.close();
		con.close();
		if(h>0)
		{
			return "Deleted";
		}
		else
		{
			return "not delete";
		}
	}
	
}
