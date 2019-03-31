//Created by Ayan Shymyrbay   16/02/2018 
//Account and testing it

public class TestAccount {
	public static void main(String [] args) {
	// Object account with ID = 1122, balance=$20 000
	Account account = new Account(1122, 20000);
	account.setAnnualInterestRate(4.5);
	account.withdraw(2500);
	account.deposit(3000);
	System.out.println("Balance in account: $" + account.getBalance());
	System.out.println("Monthly Interest:   $" + account.getMonthlyInterest());
	System.out.println("Date created:       " + account.getDateCreated());
}
}//end class TestAccount

class Account{
	
	private int id;
	private double balance;
	private double annualInterestRate;
	private java.util.Date dateCreated;
	
	//no-arg constructor
	Account(){
		dateCreated = new java.util.Date();
	}
	//parameterized constructor 
	Account(int id, double balance){
		this();
		this.id = id;
		this.balance = balance;
	}
	//Get private data: ID,Balance,Annual Interest Rate
	public int getId() {
		return id;
	}
	public double getBalance() {
		return balance;
	}
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}
	
	//Set private data: ID, Balance, Annual Interest Rate
	public void setId(int id) {
		this.id = id;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}
	
	// return the Date in form of string
	public String getDateCreated() {
		return this.dateCreated.toString();
	}
	//Monthly Interest and its rate
	public double getMonthlyInterestRate() {
		return (annualInterestRate/100)/12;
	}
	public double getMonthlyInterest() {
		return balance*getMonthlyInterestRate();
	}
	//withdraw/deposit from/in the balance
	public void withdraw(double amount) {
		 this.balance-=amount;
	}
	public void deposit(double amount) {
		this.balance+=amount;
	}
}// end of class Account