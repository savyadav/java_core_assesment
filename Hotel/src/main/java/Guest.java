import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Guest {
	Connection myConn = null;
	Statement myStmt = null;
	ResultSet myRs = null;
		public Connection connect() {
	   try {
		   
			// 1. Get a connection to database
			myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "root" , "DataGuard432$");
			
			System.out.println("Database connection successful!\n");
			
			// 2. Create a statement
			myStmt = myConn.createStatement();
			
			return myConn;
			
		}
		catch (Exception exc) {
			exc.printStackTrace();
		}
	return myConn;
		
		}
		
public void getAllGuests()
{
	try {
		myStmt = myConn.createStatement();
		myRs = myStmt.executeQuery("select * from guests");
		
		// 4. Process the result set
		while (myRs.next()) {
			System.out.println(myRs.getString("Id") + ", " + myRs.getString("name")+ ", " + myRs.getString("city"));
		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
public void getGuestsByName(String name)
{
	try {
		myStmt = myConn.createStatement();
		String data ="";
		 ResultSet rs=myStmt.executeQuery("select * from guests where name='"+name+"'");
	        while(rs.next())
	        {
	            data = ":" + rs.getString("Id") + ": " + rs.getString("name");
	        }
	        
	        System.out.println(data);
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}



	public static void main(String[] args) throws SQLException {
		Guest guest =new Guest();
		guest.connect();
		guest.getAllGuests();
		Scanner sc=new Scanner(System.in);
		String name=sc.next();
		guest.getGuestsByName(name);

		
	}

}