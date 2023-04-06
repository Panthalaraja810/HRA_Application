package practisepackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class FetchDataFromDatabaseTest 
{

	public static void main(String[] args) throws SQLException
	{
		Connection con=null;
		int result = 0;
		try 
		{
		//Register the database
		Driver driver =new Driver();
		
		DriverManager.registerDriver(driver);
		
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/qspider", "root", "root");
		
		Statement state = con.createStatement();
		
		String query = "CREATE TABLE TAB_suresh (S_NO INT,S_NAME VARCHAR(20));";
		
	result = state.executeUpdate(query);
		}
		
		
	catch (Exception e) {
		// TODO: handle exception
	}
		
		
	finally
	{	
	if(result==1)
	{
		System.out.println("data updates");
	}
	else
	{
		System.err.println("not updated");
	}
	con.close();
	}
	}
}
