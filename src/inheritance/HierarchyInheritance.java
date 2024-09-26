package inheritance;

class parent1
	{
	void display(int a) 
		{
		System.out.println(a);
		}
	}

class child_1 extends parent1
	{
	void show1(int b) 
		{
		System.out.println(b);
		}
	}

class child_2 extends parent1
{
void show2(int c) 
	{
	System.out.println(c);
	}
}

public class HierarchyInheritance {

public static void main(String[] args) {

	child_1 c1 = new child_1();		//child 1 object
	c1.display(100);
	c1.show1(200);
	
	System.out.println();			//child 2 object
	
	child_2 c2 = new child_2();
	c2.display(100);
	c2.show2(200);
	}

}
