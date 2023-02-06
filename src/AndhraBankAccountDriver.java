//Timothy Lafontaine ID : 261066866
//Assignment 4 

	import java.util.Date;
	import java.util.Scanner;

	public class AndhraBankAccountDriver {

	    public static void main(String[] args) {

	        double initialBalance = 100;
	        int accountNumber =  AndhraBankAccount.getNextAccountNb();
	        Date date = new Date();


	        System.out.println("Welcome to ANDRHA Bank");
	        System.out.print("\n\n");
	        System.out.println("Today's Interest Rate is = " + AndhraBankAccount.getAnnualInterestRate() * 100 + "%");   //
	        System.out.print("\n\n");

	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter first name: ");
	        String f_name = scanner.next();
	        System.out.print("Enter last name: ");
	        String l_name = scanner.next();
	        System.out.print("\n\n");

	        AndhraBankAccount myAccount1 = new AndhraBankAccount(accountNumber, f_name, l_name, initialBalance, date);

	        System.out.println("Your account details are: ");
	        System.out.println("Name is: " + myAccount1.getF_name() + " " + myAccount1.getL_name());
	        System.out.println("Account number is " + myAccount1.getAccountNb());
	        System.out.println("Current balance is $" + myAccount1.getBalance());
	        System.out.println("Interest Rate is = " + myAccount1.getAnnualInterestRate() * 100 + "%");
	        System.out.println("Monthly interest for this balance $" + myAccount1.getMonthlyInterestRate());
	        System.out.println(("This account was created on " + myAccount1.getDateCreated()));
	        System.out.print("\n\n");

	        boolean quitAccount = false;
	        Scanner scannerInt = new Scanner(System.in);





	        do {

	            boolean correctChoice = false;
	            int choiceInt;

	            do {
	                System.out.print("Enter your choice (0: deposit, 1: withdraw, 2: quit: ");
	                choiceInt = scannerInt.nextInt();

	                if (choiceInt != 0 && choiceInt != 1 && choiceInt!= 2){
	                    System.out.println("You need to select a correct choice");
	                }else
	                    correctChoice = true;

	            }while (!correctChoice);

	            Scanner scannerDepositWithdraw = new Scanner(System.in);
	            double depositWithdrawInt;

	            if (choiceInt == 0){
	                System.out.print("Enter the amount in $");
	                depositWithdrawInt = scannerDepositWithdraw.nextDouble();
	                myAccount1.deposit(depositWithdrawInt);
	                System.out.print("\n\n");
	            }else if (choiceInt == 1) {
	                System.out.print("Enter the amount in $");
	                depositWithdrawInt = scannerDepositWithdraw.nextDouble();
	                myAccount1.withdraw(depositWithdrawInt);
	                System.out.print("\n\n");
	            }else
	                quitAccount = true;

	        }while (!quitAccount);

	        System.out.print("\n\n");
	        System.out.println("New balance is $" + myAccount1.getBalance() + "\n");
	        System.out.print("Good-Bye!");
	    }
	}


// Thanks for reading my code 