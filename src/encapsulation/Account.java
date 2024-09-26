package encapsulation;

public class Account {

	private int accountNumb;
	private String accountName;
	private double amount;
	

	public void setAccountNumb(int accountNumb) {
		this.accountNumb = accountNumb;
	}
	
	public int getAccountNumb() {
		return accountNumb;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}
	
}
