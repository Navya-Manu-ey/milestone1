package milestone;

public class Test {

	public static void main(String[] args) {
		ConsumerAccount con1=new ConsumerAccount(101,"money market",5000);
		System.out.println("consumer account");
		con1.displayBalance();
		
		try {
			con1.deposit(1000);
			con1.withdraw(600);
			con1.getBalance();
		} catch(AccountException e) {
			System.out.println(e.getMessage());
		}
		
		CommercialAccount com1=new CommercialAccount(200,"certificateofdeposit",10000);
		System.out.println("commercial account");
		com1.displayBalance();
		
		try {
			com1.deposit(3500);
			com1.withdraw(1700);
			com1.getBalance();
		} catch(AccountException e) {
			System.out.println(e.getMessage());
		}
		

	}

}
