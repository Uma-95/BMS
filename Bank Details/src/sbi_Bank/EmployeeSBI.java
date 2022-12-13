package sbi_Bank;

public class EmployeeSBI  extends PersonSBI  {

private int employeeId;
String designation;
DepartmentSBI department; //has-a 
private int Salary;
AuthenticationDetailsSBI auth;
String Usernamee;
String Passwordd;



//constructor
EmployeeSBI(String unm,String pw){
	this.Usernamee=unm;
	this.Passwordd=pw;
   auth.authdetails(Usernamee,Passwordd);
}

 EmployeeSBI(String name,int age,String aadharNumber,String desg){
	this.name=name;
	this.age=age;
	this.aadharNo=aadharNumber;
   this.designation=desg;
   
}

//salary
public int getSalary() {
	return Salary;
}

public void setSalary(int salary) {
	Salary = salary;
}

//employee id
public void setemployeeId(int empId) {
	employeeId=empId;
}

public int getemployeeId() {
	return employeeId;
}


}
