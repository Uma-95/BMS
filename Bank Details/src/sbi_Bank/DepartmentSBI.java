package sbi_Bank;

public class DepartmentSBI {
	
String nameofdept;
int NumOfEmployeesperdepartment;
int budgetPerDepartment;

//constructor
public DepartmentSBI(String name,int numEmp,int budget) {
	this.budgetPerDepartment=budget;
	this.NumOfEmployeesperdepartment=numEmp;
	this.nameofdept=name;
}

}
