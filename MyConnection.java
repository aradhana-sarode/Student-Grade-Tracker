package Student_Grade_Tracker;

import java.sql.Connection;
import java.sql.DriverManager;

public class MyConnection {
   Connection con;
	public MyConnection() {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Student7?useSSL=false\" ,\"root\",\"Root@123");
		
		}catch(Exception e) {
			System.out.println(e);
		}
	}

	
	

}