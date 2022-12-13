package hdfc_Bank;
;

public class EmployeeHDFC extends PersonHDFC {
	private int employeeId;
	String designation;
	DepartmentHDFC department; //has-a 
	private int Salary;
	AuthenticationDetailsHDFC auth;
	String Usernamee;
	String Passwordd;



//	constructor
	EmployeeHDFC(String unm,String pw){
		this.Usernamee=unm;
		this.Passwordd=pw;
	   auth.authdetails(Usernamee,Passwordd);
	}

	 EmployeeHDFC(String name,int age,String aadharNumber,String desg){
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
