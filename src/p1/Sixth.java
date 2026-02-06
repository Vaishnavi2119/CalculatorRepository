package p1;
import java.util.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Login implements Serializable{
	String email;
	String pwd;
	
	public Login(String email, String pwd) {
		super();
		this.email = email;
		this.pwd = pwd;
	}
}

public class Sixth {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		Login l1 = new Login("abc@gmail.com","abc123");
		 
		//Serializable ==> it is an interface
		// converts object to byte stream using ObjectOutputStream
		//and then, put byte stream into file using FileOutputStream
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("data.ser"));
		oos.writeObject(l1);
		
		//Deserializable ==> 
		//converts file to byte stream using FileInputStream
		//and then, converts byte stream into a object using ObjectInputStream
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("data.ser"));
		Login receivedObj = (Login)ois.readObject();
		System.out.println(receivedObj.email);
		System.out.println(receivedObj.pwd);
		
		
		//4 classes are used here
	}

}
