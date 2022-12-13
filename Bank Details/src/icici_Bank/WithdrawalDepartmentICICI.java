package icici_Bank;

public class WithdrawalDepartmentICICI extends DepartmentICICI{

	UserICICI user;//has a user who has a bank account
	int amount_withdrawed;

	public WithdrawalDepartmentICICI(UserICICI usr,int amount) {
		super("WithdrawalDepartment", 5, 9000000);//creating a withdrawal dept
		this.user=usr;//linking the user and  corresponding bank account to this deposit dept
		this.amount_withdrawed=amount;
		withdrawMoney();
	}



	public void withdrawMoney() {
		user.b.withdraw(amount_withdrawed);
		//showing balance 
		System.out.println("Balance amount after withdrawing :"+ user.b.balanceAmount());
		

	}

}
