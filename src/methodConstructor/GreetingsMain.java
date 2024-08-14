package methodConstructor;

public class GreetingsMain {

	public static void main(String[] args) {
		Greetings g = new Greetings();
		g.NoParamNoReturn();
		
		String s = g.NoParamReturnValue();
		System.out.println(s);
		
		g.ParamNoReturn(" " + "Marteena");
		
		String s1 = g.paramReturn(" " +"Marteena");
		System.out.println(s1);
	}

}
