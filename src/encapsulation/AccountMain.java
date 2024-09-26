package encapsulation;

public class AccountMain {

	public static void main(String[] args) {
	
		Account act = new Account();
		act.setAccountNumb(127);
		System.out.println(act.getAccountNumb());
		act.setAccountName("Marteena");
		System.out.println(act.getAccountName());
		act.setAmount(10000);
		System.out.println(act.getAmount());
		
	}

}
