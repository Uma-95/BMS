package Bank;
//ippudu i can create bank accounts...add money...check balance...get ifsc code...get account number...withdraw amount
public class bankDetailsUse {
public static void main(String[]args) {
	
	//creaking p1 object
	bankDetails p1 =new bankDetails("Uma","SBI0059");
//printing details
	System.out.println(bankDetails.BANK_NAME);
	System.out.println(bankDetails.numOfAccounts);
	System.out.println(p1.getaccountNumber());
	System.out.println(p1.getifsc());
	
	//creating p2 object
	bankDetails p2 =new bankDetails("Chikky","SBI0060","umesha");
//printing details
	System.out.println(bankDetails.BANK_NAME);
	System.out.println(bankDetails.numOfAccounts);
	System.out.println(p2.getaccountNumber());
	System.out.println(p2.getifsc());
	
	//creating p3 object
	bankDetails p3 =new bankDetails("Chikki","SBI0061","chikky");
	//printing details
	System.out.println(bankDetails.BANK_NAME);
	System.out.println(bankDetails.numOfAccounts);
	System.out.println(p3.getaccountNumber());
	System.out.println(p3.getifsc());
	
	//adding money to each account and checking before-after balance
	
	//p1
	System.out.println("p1 details:");
	System.out.println(p1.balanceAmount());
	p1.addMoney(50);
	p1.addMoney(500);
	p1.addMoney(5000);
	System.out.println(p1.balanceAmount());
	
	
	//p2
	System.out.println("p2 details:");
	System.out.println(p2.balanceAmount());
	p2.addMoney(5000);
	System.out.println(p2.balanceAmount());
	
	//p3
	System.out.println("p3 details:");
	System.out.println(p3.balanceAmount());
	p3.addMoney(500);
	System.out.println(p3.balanceAmount());
	p3.withdraw(50);
	System.out.println(p3.balanceAmount());
}

}
