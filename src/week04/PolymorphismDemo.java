package week04;

import week03.Account;

import java.util.ArrayList;

public class PolymorphismDemo {
    public static void main(String[] args) {
        // Object initialization
        // Declaration type - Left
        // Actual data type - right
        Account myAccount1 = new SavingsAccount();
        Account myAccount2 = new Account();
        myAccount2 = new SavingsAccount();
        myAccount2 = myAccount1;
        // Below is not allowed
//        SavingsAccount myAccount2 = new Account();


        // Method calling
        myAccount1.withdraw(100);
        // Rule 1: The methods that you can call is defined by declaration type
        ((SavingsAccount)myAccount1).addInterest();

//        Account myAccount3 = new ChequeAccount();
//        ((SavingsAccount)myAccount3).addInterest();
        // Rule 2: The behaviour of methods is defined by actual data type
        System.out.println(myAccount1);

        ArrayList<Account> allMyAccounts = new ArrayList<>();
        allMyAccounts.add(new Account("1", "Amy", 200));
        allMyAccounts.add(new SavingsAccount("2", "Bob", 300));
        allMyAccounts.add(new ChequeAccount());

        for (Account account : allMyAccounts) {
            account.withdraw(100);
            System.out.println(account);
        }
    }
}
