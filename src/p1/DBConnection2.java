package p1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DBConnection2 {

	public static void main(String[] args) throws SQLException, FileNotFoundException {

		String imgPath = "C:\\Users\\guvaishn\\Downloads\\empImg2";
		//"C:\Users\guvaishn\Downloads\empImg2"
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee_db","root","root");
		
		String insertQuery = "insert into employees1(empId, empName, age, profilepic) values (?,?,?,?)";
		
		PreparedStatement ps = con.prepareStatement(insertQuery);
		ps.setInt(1,103);
		ps.setString(2, "Nandu");
		ps.setInt(3, 24);
		
		File f = new File(imgPath);
		FileInputStream fis = new FileInputStream(f);
		ps.setBinaryStream(4, fis);
		
		int rc = ps.executeUpdate();
		System.out.println("no of rows updates: "+rc);
		
	}

}
