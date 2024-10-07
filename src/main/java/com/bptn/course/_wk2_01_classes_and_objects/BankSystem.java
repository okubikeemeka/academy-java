package com.bptn.course._wk2_01_classes_and_objects;

public class BankSystem {

	public static void main(String[] args) {
		
		/*BankAccount testAccount = new BankAccount ("987654", 1200.00);
		testAccount.displayAccountInfo();
		
		BankAccount newTestAccount = new BankAccount ("123456", 600.00);
		newTestAccount.displayAccountInfo();  
		
		SavingsAccount myAccount = new SavingsAccount ("SAVINGS123", 500.00, 1.00);
		myAccount.applyInterest(); 
		myAccount.displayAccountInfo();     */
				
		ChequingAccount myChequingAccount = new ChequingAccount("1234", 500, 200);
		myChequingAccount.withdraw(300);	
		myChequingAccount.displayAccountInfo();
	}

}
