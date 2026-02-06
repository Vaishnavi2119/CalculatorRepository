package p1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBConnection3 {

	public static void main(String[] args) throws SQLException, IOException  {
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee_db","root","root");

		String readQuery = "select * from employees1 where empId = ?";
		
		PreparedStatement ps1 = con.prepareStatement(readQuery);
		ps1.setInt(1,103);
		
		ResultSet rs = ps1.executeQuery();
		
		while(rs.next()) {
			int id = rs.getInt(1);
			int age = rs.getInt(3);
			String name = rs.getString(2);
			
			File f = new File("output2.jpg");
			FileOutputStream fos = new FileOutputStream(f);
			
			InputStream readBinaryData = rs.getBinaryStream("profilepic");
			
			//reading 2000 bytes one by one bcoz read() reads
//			int data = readBinaryData.read();
//			while(data != -1) {
//				fos.write(data);
//				data = readBinaryData.read();
//			}
			
			byte b[] = new byte[1024];
			int data = readBinaryData.read(b);
			while(data != -1) {
				fos.write(data);
				data = readBinaryData.read(b);
			}
			
			System.out.println(id+" "+name+" "+age);
			
		}
		
		
	}

}
