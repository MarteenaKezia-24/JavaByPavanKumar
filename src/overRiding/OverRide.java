package overRiding;
	class Bank {	
	double roi() {	//declaration
		return 0;	//implementation //created in parent class
		}
	}

	class ICICI extends Bank{
	double roi() {
		return 10.5;		//re-created in child class
		}
	}

	class SBI extends Bank{
	double roi() {
		return 11.5;		//re-created in child class
		}
	}
	public class OverRide {

	public static void main(String[] args) {
		Bank b = new Bank();			//invoke bank class
		System.out.println(b.roi());
		
		ICICI i = new ICICI();			//invoke icici class
		System.out.println(i.roi());
		
		SBI s = new SBI();			//invoke sbi class
		System.out.println(s.roi());
	}

}
