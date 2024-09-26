package keyword;

public class Static {

	static int a=10;
	int b=10;

	static	void m1() {
		System.out.println("static method");
	}
	void m2() {
		System.out.println("Non static method");
	}
	
	void m() { //we can directly access non static but we cannot access static
		System.out.println(a);
		System.out.println(b);
		m1();
		m2();
	}

	public static void main(String[] args) {
//		1) static method can directly revoke without object
		System.out.println(a);
		m1();

//		2)	m2 can not access because it is non static
		Static s = new Static();
		System.out.println(s.b);
		s.m2();
		
//		3) we can directly access non static but we cannot access static
		s.m();
	}	
}


