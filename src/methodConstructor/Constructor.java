package methodConstructor;

public class Constructor {
int x,y;
	Constructor() {		//default
		x=100;
		y=200;
	}
	
	Constructor(int a, int b) {	//parameterized
		x=a;
		y=b;
	}
	
	void sum() {				//sum of 2 numbers
		System.out.println(x+y);
	}
	public static void main(String[] args) {
		Constructor c = new Constructor();		//object created without parameters so it calls default
		c.sum();

		Constructor c1 = new Constructor(200,300);	//object created with parameters so it calls parameterized | add dynamically u can call parameterized
		c1.sum();
	}

}
