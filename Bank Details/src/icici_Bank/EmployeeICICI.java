package icici_Bank;


public class EmployeeICICI extends PersonICICI{

private int employeeId;
String designation;
DepartmentICICI department; //has-a 
private int Salary;
AuthenticationDetailsICICI auth;
String Usernamee;
String Passwordd;



//constructor
EmployeeICICI(String unm,String pw){
	this.Usernamee=unm;
	this.Passwordd=pw;
   auth.authdetails(Usernamee,Passwordd);
}

 EmployeeICICI(String name,int age,String aadharNumber,String desg){
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
