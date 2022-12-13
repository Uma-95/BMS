package hdfc_Bank;


public class UpdateUserBankDetailsHDFC extends UserHDFC{
	UserHDFC user;

	public UpdateUserBankDetailsHDFC(BankDetails_HDFC bd, String nm, int age, String aadharNumber) {
			super(bd, nm, age, aadharNumber);
			this.b=bd;
			this.name=nm;
			this.age=age;
			this.aadharNo=aadharNumber;
			// TODO Auto-generated constructor stub
		}



	void showData() {
		System.out.println("Updated name:"+this.name);
		System.out.println("Updated age:"+this.age);
		System.out.println("Updated aadhar:"+aadharNo);
	}
}
