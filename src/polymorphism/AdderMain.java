package polymorphism;

public class AdderMain {

	public static void main(String[] args) {
		
	Adder obj = new Adder();
	obj.sum();	// 1 method invoked
	obj.sum(100, 200);
	obj.sum(100, 10.3);
	obj.sum(10.3, 103);
	obj.sum(10,20,10);
	}

}
