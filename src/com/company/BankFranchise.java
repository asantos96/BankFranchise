package com.company;
import java.util.Scanner;

public class BankFranchise {

    public static void main(String[] args) {
        // Create a new project in IntelliJ named BankFranchise
        // Rename your Main file to BankFranchise(right-click -> Refactor -> Rename…)
        //Create a new Java class file (File -> New -> Java Class) named Bank
        //Give bank 2 properties: name and cashInVault
        //Create accessor methods for both properties
        //Create a method in Bank called Deposit
        //Deposit should take a parameter for amount to be deposited
        //Deposit should add the amount passed through its parameter to the property cashInVault
        //Deposit should print to the console stating the branch name, amount deposited, and current cash in the vault
        //Create a method in Bank called Withdrawal
        //Withdrawal should take a parameter for the amount to be withdrawn.
        //Withdrawal should subtract the amount passed through its parameter from the property cashInVault
        //Withdrawal should print to the console stating the branch name, amount withdrawn, and current cash in the vault
        //In BankFranchise instantiate 2 instances of Bank.
        //Give each bank a name using accessor methods
        //Give each bank a starting cashInVault value of 100,000 using accessor methods
        //Call the deposit and withdraw methods twice for each bank instance.

        Scanner myScanner = new Scanner(System.in);

        System.out.println("Please select 1 for Andrea or 2 for John.");
        int userInput = myScanner.nextInt();
        if (userInput == 1) {


            //Calling for bank class
            Bank andreasBank = new Bank();

            //Setting values
            andreasBank.setName("Andrea");
            andreasBank.setCashInVault(100000);


            //Console prints
            System.out.println("Hello " + andreasBank.getName());
            System.out.println("Current Balance is $ " + andreasBank.getCashInVault());

            System.out.println("Enter Deposit amount.");
            double userDeposit = myScanner.nextDouble();

            andreasBank.deposit(userDeposit);


            System.out.println("Enter Withdrawl amount.");
            double userWithdrawl = myScanner.nextDouble();

            andreasBank.withdrawl(userWithdrawl);
        }

        //SECOND BANK

        else {

            Bank johnsBank = new Bank();

            johnsBank.setName("John");
            johnsBank.setCashInVault(100000);

            System.out.println("Hello " + johnsBank.getName());
            System.out.println("Current Balance is $ " + johnsBank.getCashInVault());

            System.out.println("Enter Deposit amount.");
            double secondUserDeposit = myScanner.nextDouble();

            johnsBank.deposit(secondUserDeposit);


            System.out.println("Enter Withdrawl amount.");
            double secondUserWithdrawl = myScanner.nextDouble();

            johnsBank.withdrawl(secondUserWithdrawl);
        }
    }
}
