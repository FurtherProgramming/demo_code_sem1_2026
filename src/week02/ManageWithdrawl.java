package week02;

import java.util.Scanner;

public class ManageWithdrawl {
    public static void main(String[] args) {
        // Read inputt
        // 1. Read balance
        // 2. Read withdrawl amount
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter the balance of the bank account:");
        double balance = myScanner.nextDouble();

        System.out.println("Enter the amount that you want to withdraw:");
        double amount = myScanner.nextDouble();

        // Do computation
        // If-else
        if (Double.compare(balance, amount)<0){
            double newBalance = balance - amount;
            // Display result
            System.out.println("Your balance is now " + newBalance);
        }else {
            // Display result
            System.out.println("Your balance is less than " + amount);
        }
    }
}
