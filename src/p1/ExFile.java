package p1;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

public class ExFile {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		File f = new File("res.txt");
		f.createNewFile();
		
		PrintWriter pw = new PrintWriter("res.txt");
		
		BufferedReader bw = new BufferedReader(new FileReader("abc"));
		
		String data = bw.readLine();
		while(data != null) {
			pw.println(data);
			data = bw.readLine();
		}
		
		pw.flush();
		
		
	}

}
