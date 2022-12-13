package sbi_Bank;
import Main.*;

public abstract interface BankSBI extends Bank {

	
   default void callSBI() { 
	   System.out.println("Welcome to SBI Bank");
  }
}
