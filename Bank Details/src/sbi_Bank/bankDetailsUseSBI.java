package sbi_Bank;

//now i can create bank accounts...add money...check balance...get ifsc code...get account number...withdraw amount

public  class  bankDetailsUseSBI extends BankDetails_SBI{

bankDetailsUseSBI(String name, String ifsc, String nickName) {
		super(name, ifsc, nickName);
	}
bankDetailsUseSBI(String name, String ifsc) {
	super(name, ifsc);
}

public static void main(String[]args) {
	//creating b1 object
	bankDetailsUseSBI b1 =new bankDetailsUseSBI("Alex","SBI0058");//creating new bank account
			UserSBI u1=new UserSBI(b1,"Apoorva",19,"2244 5588 6677");//creating a user and passing that bank acc to the user's constructor
			System.out.println("Initial balance :"+ b1.balanceAmount());//checking balance of that user
			DepositDepartmentSBI d1 = new DepositDepartmentSBI(u1,500);//creating a new deposit department obj  and adding 500
			//ante user deposit department daggariki poyinattu ..same with withdrawal and update.
			WithdrawalDepartmentSBI w1=new WithdrawalDepartmentSBI(u1,100);//withdrawing 100 by creating a new withdrawal dept obj
			System.out.println();
			System.out.println("Before updating Details :");
			u1.showData();//user details original...user department nunchi choopistunam
			//ques:ippudu idi update ayyinatu kadu ah avna? rendu daggarla same etla choopinchali..both in user and update depts?
			System.out.println();
			UpdateUserBankDetailsSBI up1=new UpdateUserBankDetailsSBI(b1, "Ali",20, "2244 5588 6678");
			System.out.println();
			System.out.println("Updated Details :");
			up1.showData();//update ayyaka update department lo nunchi choopistunam
			System.out.println();
			
	 //creating p1 object
	 //printing details
			bankDetailsUseSBI p1 =new bankDetailsUseSBI("Uma","SBI0059");	
    System.out.println("Name : "+ p1.name);
    System.out.println("Name of Bank : "+ BankDetails_SBI.BANK_NAME);
	System.out.println("Account number: "+p1.getaccountNumber());
	System.out.println("IFSC Code :"+p1.getifsc());
	System.out.println("Total Number of SBI Bank accounts created: "+BankDetails_SBI.numOfAccounts);
	System.out.println();
	
	//creating p2 object
	//printing details
	bankDetailsUseSBI p2 =new bankDetailsUseSBI("Chikky","SBI0060","umesha");
	System.out.println("Name : "+ p2.name);
	System.out.println("Name of Bank : "+ BankDetails_SBI.BANK_NAME);
	System.out.println("Account number: "+p2.getaccountNumber());
	System.out.println("IFSC Code :"+p2.getifsc());
	System.out.println("Total Number of SBI Bank accounts created: "+BankDetails_SBI.numOfAccounts);
	System.out.println();
	
	//creating p3 object
	//printing details
	bankDetailsUseSBI p3 =new bankDetailsUseSBI("Chikki","SBI0061","chikky");	
	System.out.println("Name : "+ p3.name);
	System.out.println("Name of Bank : "+ BankDetails_SBI.BANK_NAME);
	System.out.println("Account number: "+p3.getaccountNumber());
	System.out.println("IFSC Code :"+p3.getifsc());
	System.out.println("Total Number of SBI Bank accounts created: "+BankDetails_SBI.numOfAccounts);
	System.out.println();
	
	//adding money to each account and checking before-after balance
	
	//p1
	System.out.println("p1 Current status:");
	System.out.println("Before adding money "+p1.balanceAmount());
	p1.addMoney(50);
	p1.addMoney(500);
	p1.addMoney(5000);
	System.out.println("After adding money "+ p1.balanceAmount());
	System.out.println();
	
	//p2
	System.out.println("p2 Current status:");
	System.out.println("Before adding money "+p2.balanceAmount());
	p2.addMoney(5000);
	System.out.println("After adding money "+p2.balanceAmount());
	System.out.println();
	
	//p3
	System.out.println("p3 Current status:");
	System.out.println("Before adding money "+p3.balanceAmount());
	p3.addMoney(500);
	System.out.println("Before withdrawing money "+p3.balanceAmount());
	p3.withdraw(50);
	System.out.println("Balance : "+p3.balanceAmount());
	System.out.println();
	
	//for employee....
	//setting the employee user and pw first..as in alloting these to the employee so that he/she can login
	AuthenticationDetailsSBI a1=new AuthenticationDetailsSBI("","");
//	creating a new employee obj
	EmployeeSBI e1= new EmployeeSBI ("Uma Lamba",21,"2244 5588 5959","MANAGER");
	//setting salary
	e1.setSalary(50000);
	//printing salary
	System.out.println("Salary : "+e1.getSalary());


}

}
