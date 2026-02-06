package p1;

interface Database{
	
	//all are abstract by default as they are declared inside an interface database
	public void connect();
	public void insertOne();
	public void insertMany();
	public void deleteOne();
}

class Oracle implements Database{

	// overrides and gives implementation for all the methods of interface
	@Override
	public void connect() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void insertOne() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void insertMany() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteOne() {
		// TODO Auto-generated method stub
		
	}
}

class Sybase implements Database{

	@Override
	public void connect() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void insertOne() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void insertMany() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteOne() {
		// TODO Auto-generated method stub
		
	}
	
}
public class InterfaceEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

// a class cannot inherit multiple classes but it can inherit multiple interfaces using 'implements'
// an interface can inherit multiple interfaces using 'extends'
