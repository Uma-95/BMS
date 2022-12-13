package hdfc_Bank;
import Main.*;
//for HDFC BANK
public abstract class BankDetails_HDFC  implements BankHDFC{
	//declaring all required variables
	String name;
	String nickName;
	static int numOfAccounts; //same memory location kosam static teeskunam
	private int accountNumber; //andariki kanipinchalisna avasaram ledu
	String ifsc; 
	static final String BANK_NAME="HDFC";
	double balance; 

//	abstract  BankDetails_SBI(String name,String ifsc);
//	abstract  BankDetails_SBI(String name,String ifsc,String nickName);

  BankDetails_HDFC(String name,String ifsc) {
		this.balance=0.0;
		this.name=name;
		this.ifsc=ifsc;
		//account create chestunam kabbati no. of accounts ++ ayitadi
		numOfAccounts++;
		accountNumber=numOfAccounts;
	}
	
  BankDetails_HDFC(String name,String ifsc,String nickName) {
		this.balance=0.0;
		this.name=name;
		this.ifsc=ifsc;
		this.nickName=nickName;
		numOfAccounts++;
		accountNumber=numOfAccounts;
	}
	
	//to get account number
	public int getaccountNumber() {
		return this.accountNumber;
	} 
	
	//to add money
	public void addMoney(int submitAmount) {
		this.balance=this.balance+submitAmount;
	
	}
	
	//to check balance amount
	public double balanceAmount() {
		return this.balance;
	}
	
	//to get ifsc code
	public String getifsc() {
		return ifsc;
	}
	
	//to withdraw amount
	public void withdraw(double amount) {
		this.balance=this.balance-amount;
		
	
	}
}
