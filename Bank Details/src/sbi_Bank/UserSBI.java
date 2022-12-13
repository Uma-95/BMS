 package sbi_Bank;

//User extending Person
public class UserSBI extends PersonSBI{
public BankDetails_SBI b; 
//has-a composition 
//user has a bank details obj

//passing bank details obj to user constructor
public UserSBI(BankDetails_SBI bd,String name,int age,String aadharNumber) {
	this.b=bd;
	this.name=name;
	this.age=age;
	this.aadharNo=aadharNumber;
}

void showData() {
	System.out.println("Name:"+ name);
	System.out.println("age:"+ age);
	System.out.println("aadharNo:"+ aadharNo);
	
}

}
