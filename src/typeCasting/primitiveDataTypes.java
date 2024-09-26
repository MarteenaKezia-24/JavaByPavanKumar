package typeCasting;

public class primitiveDataTypes {
	public static void main(String[] args) {
//Upcasting - converting from smaller --> higher
	//int--->long
	//automatic process
		int intvalue=100;
		long longvalue=intvalue;
		System.out.println(longvalue);
		
		float floatvalue=10.5F;
		double doublevalue=floatvalue;
		System.out.println(doublevalue);
		
//downCasting - converting from higher --> lower
	//double-->float
	//manually we need to do
		long longvalue1=1000;
		int intvalue1 = (int) longvalue1;
		System.out.println(intvalue1);
		
		double doublevalue1=125.55;
		float floatvalue1=(float) doublevalue1;
		System.out.println(floatvalue1);		
	}
}
