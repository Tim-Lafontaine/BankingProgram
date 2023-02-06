// Timothy Lafontaine ID : 261066866
// Assignment 4 

import java.util.Date;

	public class AndhraBankAccount {

	    private int accountNb;
	    private String f_name;
	    private String l_name;
	    private double balance;
	    private Date dateCreated;
	    private static int nextAccountNb = 300;
	    private static double annualInterestRate = 0.045;  // 4.5%

	    public AndhraBankAccount(int accountNb, String f_name, String l_name, double balance, Date dateCreated) {
	        this.accountNb = accountNb;
	        this.f_name = f_name;
	        this.l_name = l_name;
	        this.balance = balance;
	        this.dateCreated = dateCreated;
	        nextAccountNb += 1;
	    }

	    public int getAccountNb() {
	        return accountNb;
	    }

	    public void setAccountNb(int accountNb) {
	        this.accountNb = accountNb;
	    }

	    public String getF_name() {
	        return f_name;
	    }

	    public void setF_name(String f_name) {
	        this.f_name = f_name;
	    }

	    public String getL_name() {
	        return l_name;
	    }

	    public void setL_name(String l_name) {
	        this.l_name = l_name;
	    }

	    public double getBalance() {
	        return balance;
	    }

	    public void setBalance(double balance) {
	        if (balance > 0)
	            this.balance = balance;
	        else
	            System.out.println("You need to enter a valid value for balance.");
	    }

	    public Date getDateCreated() {
	        return dateCreated;
	    }

	    public void setDateCreated(Date dateCreated) {
	        this.dateCreated = dateCreated;
	    }

	    public double getMonthlyInterestRate() {
	        return annualInterestRate * balance/12;
	    }

	    public void withdraw(double moneyToWithdraw) {
	        if (moneyToWithdraw > 0)
	            this.balance -= moneyToWithdraw;
	        else
	            System.out.println("You need to enter a valid value for withdraw.");
	    }

	    public void deposit(double moneyToDeposit) {
	        if (moneyToDeposit > 0)
	            this.balance += moneyToDeposit;
	        else
	            System.out.println("You need to enter a valid value for deposit.");
	    }

	    public static double getAnnualInterestRate() {
	        return annualInterestRate;
	    }

	    public static void setAnnualInterestRate(double annualInterestRate) {
	        AndhraBankAccount.annualInterestRate = annualInterestRate;
	    }

	    public static int getNextAccountNb() {
	        return nextAccountNb;
	    }

	    public static void setNextAccountNb(int nextAccountNb) {
	        AndhraBankAccount.nextAccountNb = nextAccountNb;
	    }
	}

	// Thanks for reading my code 