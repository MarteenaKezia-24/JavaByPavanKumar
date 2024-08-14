package methodConstructor;

public class Greetings {

	void NoParamNoReturn() {				//if not retun any value mention void 
		System.out.println("Hello");
	}
	
	String NoParamReturnValue() {
		return("hello");
	}
	
	void ParamNoReturn(String name) {
		System.out.println("Hello" +name);
	}
	
	String paramReturn(String name) {
		return("Hello" +name);
	}
}
