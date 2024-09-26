package dataAbstraction;

interface shape {
	int length=18;	//final & static
	int width=20;	//final & static

	//it allow abstract, default, static methods
	//default method
	default void square() {
		System.out.println("This is square - default method");
	}

	static void rectangle() {
		System.out.println("This is rectangle - static method");
	}

	void circle();   //abstract method - implement methods not allowed only declaration methods allowed
}

public class InterfaceDemo implements shape{

	public void circle() {
		System.out.println("This is implemented circle method - abstract method");
	}
	
	void triangle() {
		System.out.println("This is trangle");
	}
	
	int x=100;
	
	public static void main(String[] args) {
//scenario-1  >> object is created for class and variable is also class
		InterfaceDemo i = new InterfaceDemo();
		i.circle();	//abstract method
		i.square();	//default method
		//static method can directly access from interface
		shape.rectangle(); //it is not directly created in this class, we get it from shape interface
		i.triangle(); //we can access only through object of class

//scenario - 2 >> object is created for class and variable is interface
		shape s = new InterfaceDemo();  //object of class can hold variable of interface // object we cannot create for interface
		s.circle();	//abstract method
		s.square(); //default method
		shape.rectangle(); //static method can directly access from interface
//		s.triangle(); //we cannot access, because we are not declared in shape interface 
		
		System.out.println(shape.length * shape.width);	//accessing static variables directly
//		System.out.println(shape.x);	//we cannot access - class we cannot but interface we can
	}
}