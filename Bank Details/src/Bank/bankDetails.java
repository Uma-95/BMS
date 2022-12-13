package Bank;

public class bankDetails {
	String name;
	String nickName;
	static int numOfAccounts;
	private int accountNumber;
	String ifsc;
	static final String BANK_NAME="SBI";
	double balance; 

	
	public bankDetails(String name,String ifsc) {
		this.balance=0.0;
		this.name=name;
		this.ifsc=ifsc;
		numOfAccounts++;
		accountNumber=numOfAccounts;
	}
	
	public bankDetails(String name,String ifsc,String nickName) {
		this.balance=0.0;
		this.name=name;
		this.ifsc=ifsc;
		this.nickName=nickName;
		numOfAccounts++;
		accountNumber=numOfAccounts;
	}
	
	public int getaccountNumber() {
		return this.accountNumber;
	} 
	
	
	public void addMoney(int submitAmount) {
		this.balance=this.balance+submitAmount;
	
	}
	public double balanceAmount() {
		return this.balance;
	}
	
	public String getifsc() {
		return ifsc;
	}
	public void withdraw(double amount) {
		this.balance=this.balance-amount;
	}
	}


