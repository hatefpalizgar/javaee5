package com.lecture.review;

import java.util.Scanner;


/*E10_07
  Use the Account class created previously to simulate an
  ATM machine. Create ten accounts in an array with id 0, 1, ..., 9, and
  initial balance $100. The system prompts the user to enter an id. If the id
  is entered incorrectly, ask the user to enter a correct id. Once an id is
  accepted, the main menu is displayed as shown in the sample run. You can
  enter a choice 1 for viewing the current balance, 2 for withdrawing money,
  3 for depositing money, and 4 for exiting the main menu. Once you exit, the
  system will prompt for an id again. Thus, once the system starts, it will
  not stop.
*/
public class Ex08 {
    static Scanner input = new Scanner(System.in);  // it is shared across the class
    static Account[] accounts = new Account[10];
    
    // Google: pass-by-value  | pass-by-reference
    public static void main(String[] args) {
        initializeAccounts(accounts);
        runATM(accounts, getIdFromUserInput(input, accounts));
    }
    
    private static void runATM(Account[] accounts, int id) {
        while (true) {
            // display the main menu
            displayMainMenu();
            getChosenMenu(accounts, input, id);
        }
    }
    
    private static void initializeAccounts(Account[] accounts) {
        for (int i = 0; i < accounts.length; i++) {
            accounts[i] = new Account(i, 100);
        }
    }
    
    private static int getIdFromUserInput(Scanner input, Account[] accounts) {
        // ? where to show incorrect id message
        int id;
        do {
            System.out.println("Enter an id: ");
            id = input.nextInt();
        }
        while (isOutOfRange(id));
        return id;
    }
    
    private static void displayMainMenu() {
        System.out.println("Main Menu");
        System.out.println("1: check balance");
        System.out.println("2: withdraw");
        System.out.println("3: deposit");
        System.out.println("4: exit menu");
        System.out.print("> ");
    }
    
    private static void getChosenMenu(Account[] accounts, Scanner input, int id) {
        int choice = input.nextInt();
        switch (choice) {
            case 1:
                System.out.println(accounts[id].getBalance());
                break;
            case 2:
                enterWithdrawalAmount(accounts[id], input);
                break;
            case 3:
                enterDepositAmount(accounts[id], input);
                break;
            case 4:
                getIdFromUserInput(input,accounts);
                break;
            default:
                displayError();
        }
    }
    
    private static void enterDepositAmount(Account account, Scanner input) {
        System.out.println("How much to deposit: ");
        // ? what if user wants to deposit negative amount
        double amountToDeposit = input.nextDouble();
        account.deposit(amountToDeposit);
    }
    
    private static void enterWithdrawalAmount(Account account, Scanner input) {
        System.out.println("How much to withdraw: ");
        // ? what if user wants to withdraw more than current balance
        // ? what if user wants to withdraw negative amount
        double amountToWithdraw = input.nextDouble();
        account.withdraw(amountToWithdraw);
    }
    
    private static void displayError() {
        System.out.println("Incorrect option number. please choose 1/2/3/4");
    }
    
    private static boolean isOutOfRange(int id) {
        return id < 0 || id > 9;
    }
}
