package coreJava;

public class constructDemo {
	
	//Default constructor
	public constructDemo()
	{
		System.out.println("I am in the constructor");
		System.out.println("i usually define variables here");
	}
		
	//Parameterized constructor
	public constructDemo(int a, int b)
	{
		int c= a+b;
		System.out.println("I am in the parameterized constructor " + c);
	}

	public constructDemo(String str)
	{
		System.out.println("I am in the parameterized string constructor " + str+ ", "+ str);
	}
	
	
	public void getData()
	
	{
		System.out.println("I am in the method"
				+ "");

	}
	
	
	public static void main (String[] args) {
	
		constructDemo cd = new constructDemo();			//whenever you create an object, constructor is called
		constructDemo cdp = new constructDemo(6, 8);	
		constructDemo cds = new constructDemo("hoi ghos");	
	}
	

}
