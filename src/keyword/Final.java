package keyword;

	class A {
		final int x=100;		//we cannot change the value
	}
	
public class Final {
	public static void main(String[] args) {
		A a = new A();
//		a.x=200;				//if we remove final beforre variable then only we can change the value
		System.out.println(a.x);
	}

}
