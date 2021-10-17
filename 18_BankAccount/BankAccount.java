/*
TNPG: NAW Fam |Roster: Alif Rahman, Nakib Abedin
APCS
HW 18 -- CPA-One
2021-10-17
DISCOVERIES:
1) From our experiences, you can not have instance variables as parameters when you call them in a static method.
2) When you apply methods that change certain attributes for an object, those changes will remain from that point onwards.
3) It is useful to have a line denoting "<METHODNAME> TESTING" when you call multiple methods inside of your main method.
QCC:
1) Why did the printAll method work only after we applied it to an object. When we tried to call it without an object, it returned an error.
Team NAW Fam's Latest and Greatest Q2 Response:
We know that java has a default constructor because we were able to create a new instance of a class without using the "new" KEYWORD without creating any constructors for HW12.
Team NAW Fam's Latest and Greatest Q3 Response:
One test could be to use the toString() method. It's literal pupose is to return the string representation of an object.
Ex.
public String toString() {
      return fullName
}
*/

public class BankAccount {
	String fullName;
	String password;
	int pin;
	int accountNumber;
	double accountBalance;
	
	// Created the instance variables

	public BankAccount() {
		
	}

	// Default Constructor created

	public BankAccount(String FullName, String Password, int Pin, int AccountNumber, double AccountBalance){
		fullName = FullName;
        	password = Password;
        	pin = Pin;
        	accountNumber = AccountNumber;
        	accountBalance = AccountBalance;
	}
	
	// Overloaded Constructor created. We decided to use the default constructor and use the set<variable> methods to achieve the same functionality.
	
	public void setName(String name) {
		fullName = name;
	}
	public void setPassword(String pass) {
		password = pass;
	}
	public void setPin(int pinNo) {
		pin = pinNo;
	}
	public void setAccountNumber(int actno) {
		accountNumber = actno;
	}
	public void setAccountBalance(double bal) {
		accountBalance = bal;
	}

	// Method list full of methods that assign values to each of the instance variables that we created.

	public void deposit(double amount){
		double oldAccountBalance = accountBalance;
		accountBalance += amount;
		double newAccountBalance = accountBalance;
		System.out.println("DEPOSIT METHOD TEST:");
		System.out.println("Old balance = " + oldAccountBalance);
		System.out.println("New balance = " + newAccountBalance);
	}
	
	public void withdraw(double amount){
                double oldAccountBalance = accountBalance;
                accountBalance -= amount;
                double newAccountBalance = accountBalance;
                System.out.println("WITHDRAW METHOD TEST:");
                System.out.println("Old balance = " + oldAccountBalance);
                System.out.println("New balance = " + newAccountBalance);
        }
	
	// For the withdraw and deposit functions, we tested them by storing their initial values in a variable and then storing their new values in a different variable. We printed these variables to see if the balance of the bank account changed accordingly.
	
	public void printAll(){
		System.out.println("printAll METHOD TEST");
                System.out.println(fullName);
                System.out.println(password);
                System.out.println(pin);
                System.out.println(accountNumber);
                System.out.println(accountBalance);
        }

	// The printAll function just prints all of the variables.
	
	public static void main (String[] args){
		BankAccount nakib = new BankAccount();
		nakib.setName("nakib");
		nakib.setPassword("NotPassword");
		nakib.setPin(4562);
		nakib.setAccountNumber(1234567890);
		nakib.setAccountBalance(10.00);
		nakib.printAll();
		nakib.deposit(100.00);
		nakib.withdraw(5.00);
		System.out.println(nakib);
	}
}
