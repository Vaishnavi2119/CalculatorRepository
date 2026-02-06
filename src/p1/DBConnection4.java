package p1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBConnection4 {

	public static void main(String[] args) throws SQLException, FileNotFoundException {
		// TODO Auto-generated method stub
		//inserting into database
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee_db","root","root");
		
//		String insertQuery = "insert into employees(empId, empName, age, summary) values (?,?,?,?)";
//		
//		PreparedStatement ps1 = con.prepareStatement(insertQuery);
//		ps1.setInt(1,105);
//		ps1.setString(2, "Adhi");
//		ps1.setInt(3, 24);
//		
//		FileReader reader = new FileReader("summary.txt");
//		
//		ps1.setCharacterStream(4, reader);
//		
//		int rc = ps1.executeUpdate();
//		System.out.println("no of rows updates: "+rc);
		
		//reading from database
		String readQuery = "select * from employees1 where empId = ?";
		
		PreparedStatement ps2 = con.prepareStatement(readQuery);
		ps2.setInt(1,105);
		
		ResultSet rs1 = ps2.executeQuery();
		
		while(rs1.next()) {
			int id = rs1.getInt(1);
			int age = rs1.getInt(3);
			String name = rs1.getString(2);
			
//			File f = new File("output2.jpg");
//			FileOutputStream fos = new FileOutputStream(f);
//			
//			InputStream readBinaryData = rs.getBinaryStream("profilepic");
			
			System.out.println(id+" "+name+" "+age);
		
	}

}}
