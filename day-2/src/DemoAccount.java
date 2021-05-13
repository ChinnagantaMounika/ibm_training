//need of init block
class Account{
	private int id;
	private String name;
	private double balance;
	private static String bankName="sbi";
	
	
	public static String getBankName() {
		return bankName;
	}

	//init block run for each objects
	
	{
		System.out.println("init block B");
	}
	
	{
		System.out.println("init block A");
	}
	
	//static init block?: run at the time of class loading
	//it dont run for creation of each object
	
	static {
		System.out.println("i am static init block");
	}
	
	static {
		System.out.println("i am static init block 2");
	}
	
	
	public Account() {
		System.out.println("default ctr");
	}
	
	public Account(int id, String name, double balance) {
		System.out.println("para ctr");
		this.id=id;
		this.name=name;
		this.balance=balance;
		System.out.println("this is a para ctr");
	}
	
	public Account(Account account) {
		this.id=account.id;
		this.name=account.name;
		this.balance=account.balance;
	}
	
	public void printAccountDetails() {
		System.out.println("account details is: id "+ id +" name : "+ name +" balance: "+ balance+" bank name: "+ bankName);
	}
	
}
public class DemoAccount {

	public static void main(String[] args) {
		
		Account account1=new Account();
		//Account account2=new Account(2,"sunita",800);
		
		
		
//		
//		Account account=new Account(2,"sunita",800);
//		System.out.println(account.getBankName());
//		
//		account.printAccountDetails();
//		
//		Account account2=new Account(29,"uma",900);
//		account2.printAccountDetails();
//		
//		Account account3=new Account(account2);
//		
//		Account account4=new Account();
//		
//		System.out.println(Account.getBankName());
	}
}
