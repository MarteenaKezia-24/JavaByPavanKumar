package polymorphism;

public class Adder {

	int a=10, b=20;
	
	void sum() {				//no parameters	1
		System.out.println(a+b);
	}
	
	void sum(int x, int y) {	//parameterized	2
		System.out.println(x+y);
	}
	
	void sum(int z, double m) {	//parameters same, data type is different	3
		System.out.println(z+m);
	}
	
	void sum(double m, int z) {	//parameters same, data type is same - we can change order of parameters	3
		System.out.println(z+m);
	}
	
	void sum(int a, int b, int c) {
		System.out.println(a+b+c);
	}
}
