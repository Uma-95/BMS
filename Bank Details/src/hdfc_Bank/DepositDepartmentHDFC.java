package hdfc_Bank;


public class DepositDepartmentHDFC extends DepartmentHDFC{
	UserHDFC user; //has a user and user has bank account
	int amount_deposited;

	//constructor
	public DepositDepartmentHDFC(UserHDFC usr,int amount) {
		//ikkada we are invoking a department constructor with the name deposit department...
		//technically okka kotha department tayaru chesinnatu
		super("depositDepartment",5,1000000);
		this.user=usr;//linking the user and corresponding bank account to this deposit dept
		this.amount_deposited=amount;
		addMoney();
		
		//instead of creating a new method you can also seedha do this
	   //	user.b.addMoney(this.amount_deposited);
	}

	//
	public void addMoney(){
		user.b.addMoney(this.amount_deposited);
		//showing balance 
			System.out.println("Balance amount after adding :"+user.b.balanceAmount());
			
	}
}
