/*
*/

public class Teller {
	public static void main(String[] args) {
		BankAccount cjb = new BankAccount("Lawrence Parker", 123456789, 3579, "password", -42.0);
		cjb.printInfo();

		cjb.setName("Can Josiah Beautify?");
		cjb.setAccountNum(226238705);
		cjb.setPin(8191);
		cjb.setPassword("hackme");
		cjb.setBalance(4200.0);
		cjb.printInfo();

		cjb.deposit(58.0);
		cjb.printInfo();

		cjb.withdraw(100.01);
		cjb.printInfo();

		cjb.setAccountNum(-1);
		cjb.setAccountNum(2000000000);
		cjb.setPin(-1);
		cjb.setPin(99999);
		cjb.printInfo();
		//System.out.println(cjb);
		//System.out.print(cjb + " hello");
		//System.out.println(cjb.toString());
	}






}
