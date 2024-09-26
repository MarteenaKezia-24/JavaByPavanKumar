package overRiding;

	class ABC {
		void m1(int a) {
			System.out.println(a);
		}
		
		void m2(int b) {
			System.out.println(b);
		}
	}
	
	class XYZ {
		void m1(int a) {
			System.out.println(a*a);	//overriding the method - changing the implementation //inheritance concept
		}
		
		void m2(int b) {
			System.out.println(b*b);	//overriding the method
		}
		
		void m2(int a, int b) {
			System.out.println(a+b);   //overloading - changing the declaration and implementation //polymorphism concept
		}
	}

public class OverLoadingVsOverRiding {

	public static void main(String[] args) {
		XYZ x = new XYZ();		//new implementation will executed
		x.m1(10);
		x.m2(20);
		x.m2(10, 20);
		
		System.out.println();
		
		ABC a = new ABC();		//old implementation will executed
		a.m1(10);
		a.m2(20);
	}

}
