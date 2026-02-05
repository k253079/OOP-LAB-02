package Lab02Tasks;

import java.util.Scanner;
import java.util.Arrays;

public class Task05 {
    double balance = 50000;
    void  DepositMoney(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the amount you want to deposit:");
        balance+= scanner.nextDouble();
        System.out.println("Amount deposited successfully");
    }
    void WithdrawAmount(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the amount you want to withdraw:");
        balance-= scanner.nextDouble();
        System.out.println("Amount withdrawn successfully");
    }
    void AccountStatus(){
        System.out.println("Account Status:Active");
        System.out.println("Your balance is :"+balance);
    }
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Task05 account = new Task05();
        final String[] usernames = {"awaab", "ali", "arshad"};
        final String[] passwords = {"password", "password", "password"};
        boolean found = false;
        do {
            System.out.println("Enter your username:");
            String usersUsername = scanner.next();
            System.out.println("Enter your password:");
            String usersPassword = scanner.next();
            int index = -1;
            for (int i = 0; i < (usernames.length); i++) {
                if (usernames[i].equals(usersUsername)) {
                    index = i;
                    break;
                }
            }
            if (index != -1) {
                if (passwords[index].equals(usersPassword)) {
                    found = true;
                } else {
                    found = false;
                    System.out.println("Incorrect password or username");
                    System.out.println("Please try again....");
                }
            } else {
                found = false;
                System.out.println("Incorrect password or username");
            }
        } while (!found);
        String condition;
        if (found) {
            do {
                System.out.println("Main Menu:");
                System.out.println("-------------Welcome to Bank of Pakistan------------");
                System.out.println("1.Deposit Money");
                System.out.println("2.Withdraw Amount");
                System.out.println("3.Account Status");
                System.out.print("Select your choice");
                int n= scanner.nextInt();
                if(n==1){
                    account.DepositMoney();
                }
                else if (n==2) {
                    account.WithdrawAmount();
                }else if (n==3) {
                    account.AccountStatus();
                }
                else{
                    System.out.println("Invalid command");
                }
                System.out.println("Do you want to continue?y/n");
                condition = scanner.next();
            }while(condition.equals("y"));
        }
    }

}
