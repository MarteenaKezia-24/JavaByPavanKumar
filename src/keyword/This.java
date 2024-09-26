package keyword;

public class This {

	/*	int x,y;	//class variables

	This(int a, int b) {	//local variables
		x=a;
		y=b;		
	}

	void display() {
		System.out.println(x);
		System.out.println(y);
	}

	public static void main (String[] args) {
		This t = new This(100,200);
		t.display();
	} */


	int x,y;	//class variables

	This(int x, int y) {	//class variables
		this.x=x;					//when we assign x=x will get confuse which x is class or which x is local //this represents the class
		this.y=y;		
	}

	void display() {
		System.out.println(x);
		System.out.println(y);
	}

	public static void main (String[] args) {
		This t = new This(100,200);
		t.display();
	}
}