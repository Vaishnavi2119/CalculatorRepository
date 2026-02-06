package p1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBConnection1 {
	//using PREPARED STATEMENT OBJECT
	// 	this compiles the query once in db, and returns it to java
	//compilation happens only once and execution happens multiple times
	public static void main(String[] args) throws SQLException {
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee_db","root","root");
		
		
		
		
		/*UPDATION 
		String updateQuery = "update employees set age = ? , empName = ? where empId = ?";
		PreparedStatement ps = con.prepareStatement(updateQuery);
		ps.setInt(1, 22);
		ps.setString(2,"Arjun");
		ps.setInt(3, 102);
		
		int rc = ps.executeUpdate();
		System.out.println("updation done"+" rows updated: "+rc);
		//System.out.println(((ResultSet) ps).getInt(1)+" "+ ((ResultSet) ps).getString(2)+" "+((ResultSet) ps).getInt(3));
		

		
		//PRINTING
		String readQuery = "select * from employees where empId = ?";
		
		PreparedStatement ps1 = con.prepareStatement(readQuery);
		ps1.setInt(1, 102); // setting value for empId 
		
		ResultSet rs1 = ps1.executeQuery();
		//object is created which has all three values of 1st record, object is of resultset type 
		while(rs1.next()) {
			int id = rs1.getInt(1);
			String name = rs1.getString(2);
			int age = rs1.getInt(3);
			System.out.println(id+" "+name+" "+age);
			
		}
		
		*/
		
		
		/*  INSERTION 
		String insertQuery = "insert into employees(empId, empName, age) values (?, ?,?)";
		
		PreparedStatement ps = con.prepareStatement(insertQuery);
		//ps is the received compiled query from db
		ps.setInt(1, 102);
		ps.setString(2, "John");
		ps.setInt(3, 22);
		
		int rc = ps.executeUpdate();
		//rc stores no. of rows affected by this update
		System.out.
		println("insertion done"+"no of rows updated: "+rc);
		*/
		
		
		
		//delete
		String deleteQuery = "delete from employees where empId = ?";
		PreparedStatement ps2 = con.prepareStatement(deleteQuery);
		ps2.setInt(1, 101);
		
		int rc1 = ps2.executeUpdate();
		System.out.println("deletion done."+" no of rows updated: "+rc1);
		
		//print
		String readQuery2 = "select * from employees where empId = ?";
		
		PreparedStatement ps3 = con.prepareStatement(readQuery2);
		ps3.setInt(1, 102); // setting value for empId 
		
		ResultSet rs2 = ps3.executeQuery();
		//object is created which has all three values of 1st record, object is of resultset type 
		while(rs2.next()) {
			int id = rs2.getInt(1);
			String name = rs2.getString(2);
			int age = rs2.getInt(3);
			System.out.println(id+" "+name+" "+age);
			
		}

		
	}

}
