package icici_Bank;


public class UpdateUserBankDetailsICICI extends UserICICI{
	UserICICI user;

	public UpdateUserBankDetailsICICI(BankDetails_ICICI bd, String nm, int age, String aadharNumber) {
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
