import java.util.*;

class Account {
	private int id;
	private double balance;
	private static double annualInterestRate;
	private Date dateCreated;
	
	Account() {}
	Account(int id, double balance) {
		this.id = id;
		this.balance = balance;
	}
	
	int getId() {return this.id;}
	double getBalance() {return this.balance;}
	double getAnnualInterestRate() {return this.annualInterestRate;}
	Date getDateCreated() {return this.dateCreated;}
	
	void setId(int id) {this.id = id;}
	void setBalance(double balance) {this.balance = balance;}
	static void setAnnualInterestRate(double aIR) {
		Account.annualInterestRate = aIR;
	}
	
	double getMonthlyInterestRate() {
		return this.annualInterestRate / 12 / 100;
	}
	double getMonthlyInterest() {
		return this.balance * getMonthlyInterestRate();
	}
	void withdraw(double price) {
		if(price > this.balance) return;
		else this.balance -= price;
	}
	void deposit(double price) {
		this.balance += price;
	}
	
}


public class AccountApp {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        Account account = new Account(sc.nextInt(), sc.nextInt());
        Account.setAnnualInterestRate(sc.nextDouble());

        System.out.printf("Balance : %.2f\n", account.getBalance());
        System.out.printf("Monthly interest : %.2f\n", account.getMonthlyInterest());

        account.withdraw(sc.nextDouble());

        System.out.printf("Balance : %.2f\n", account.getBalance());
        System.out.printf("Monthly interest : %.2f\n", account.getMonthlyInterest());

        account.deposit(sc.nextDouble());

        System.out.printf("Balance : %.2f\n", account.getBalance());
        System.out.printf("Monthly interest : %.2f\n", account.getMonthlyInterest());
    }
}