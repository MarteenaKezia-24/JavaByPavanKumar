package typeCasting;
	class parent {
		String s = "John";
		void m1()
		{
			System.out.println(s);
		}
	}
	
	class child extends parent {
		int i =100;
		void m2() {
			System.out.println(i);
		}
	}
	
	public class Objects {
	public static void main(String[] args) {
		child c = new child();// child object
		c.m1();	//parent
		c.m2(); //child
		
		parent p = new child();	//upcasting //object is child and variable is parent
		p.m1();	//reference variable is parent so we can access
//		p.m2(); //reference variable is parent so we cannot access
		
		parent p1 = new parent();	//downcasting
		child c1 = (child) p1;		//typecasting parent to child 
		c1.m1();					//we can access parent
		c1.m2();					//we can access child
	}

}
