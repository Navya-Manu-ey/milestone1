package milestone;

class AccountException extends Exception{
	public AccountException(String m) {
		super(m);
	}
}

interface Transaction{
	void deposit(double amount);
	void withdraw(double amount) throws AccountException;
	double getBalance();
}

public class Account {
	
	protected int accountNumber;
	protected String accountType;
	protected double balance;
	
	public Account(int accountNumber,String accountType,double balance) {
		this.accountNumber=accountNumber;
		this.accountType=accountType;
		this.balance=balance;
	}
	
	public void displayBalance() {
		System.out.println("Account number:" +accountNumber);
		System.out.println("type is "+accountType);
		System.out.println("balance: "+balance);
	}

}
class ConsumerAccount extends Account implements Transaction{
	private static final double withdrawal_limit=750;
	
	public ConsumerAccount(int accountNumber,String accountType,double balance) {
		super(accountNumber,accountType,balance);
	}
	public void deposit(double amount) {
		balance=balance+amount;
		System.out.println("deposited : "+amount);
	}
	
	public void withdraw(double amount) throws AccountException{
		if(amount>withdrawal_limit) {
			throw new AccountException("limit is exceeded");
		}
		balance=balance-amount;
		System.out.println("the amount withdrawn is: "+amount);
	}
	
	public double getBalance() {
		return balance;
	}
}


class CommercialAccount extends Account implements Transaction{
	private static final double withdrawal_limit=1500;
	
	public CommercialAccount(int accountNumber,String accountType,double balance) {
		super(accountNumber,accountType,balance);
	}
	public void deposit(double amount) {
		balance=balance+amount;
		System.out.println("deposited : "+amount);
	}
	
	public void withdraw(double amount) throws AccountException{
		if(amount>withdrawal_limit) {
			throw new AccountException("limit is exceeded");
		}
		balance=balance-amount;
		System.out.println("the amount withdrawn is: "+amount);
	}
	
	public double getBalance() {
		return balance;
	}
}
