package p1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.cj.xdevapi.Statement;

public class DbConnection {

	public static void main(String[] args) throws SQLException {
	
		//
		Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/employee_db",
									"root","root");
		
		String insert = "insert into employees values(101, 'Raju', 24)";
		
		java.sql.Statement s = con.createStatement();
		
		int rowCount = s.executeUpdate(insert);
		
		System.out.println("insertion done!. row count: "+rowCount);

	}

}
