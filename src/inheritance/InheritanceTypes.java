package inheritance;

class A 
{									//parent
	int a = 100;
	void display() 
	{
		System.out.println(a);
	}
}

class B extends A 				//child
{
	int b=200;
	void show() 
	{
		System.out.println(b);
	}
} 

class C extends B 				//grand child
{
	int c=300;
	void print()
	{
		System.out.println(c);
	}
}

public class InheritanceTypes {

	public static void main(String[] args) {	
		B bobj = new B();
		bobj.show();
		bobj.display();				//while using extend
		
		
		A aobj = new A();			//without using extend
		aobj.display();
		
		C cobj = new C();			//with using extend
		cobj.print();
		cobj.show();
		cobj.display();
	}

}
