package day14.oops;

import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {
        Account account = null ;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter your Account Type:");
        String accountType = input.next();
        switch(accountType){
            case "Saving":
                account = new SavingAccount();
               // account.openAccount();
                break;
            case "Current":
                account = new CurrentAccount();
                //account.openAccount();
                break;
            default:
                System.out.println("Invalid account type ");
           }
           if(account != null){
               open(account);
        }
    }
    public static void open(Account account){
        account.openAccount();
    }
}
