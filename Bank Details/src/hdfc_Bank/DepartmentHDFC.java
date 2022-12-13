package hdfc_Bank;

public class DepartmentHDFC {
	
String nameofdept;
int NumOfEmployeesperdepartment;
int budgetPerDepartment;

//constructor
public DepartmentHDFC(String name,int numEmp,int budget) {
	this.budgetPerDepartment=budget;
	this.NumOfEmployeesperdepartment=numEmp;
	this.nameofdept=name;
}

}
