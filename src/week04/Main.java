package week04;

import week03.Account;

public class Main {
    public static void main(String[] args) {
        Account myAccount = new Account("s123", "Amy", 100);
        SavingsAccount mySavingsAccount = new SavingsAccount("s2345", "Bob", 0);
        SavingsAccount testAccount = new SavingsAccount();
        System.out.println(testAccount);
        mySavingsAccount.setAccountID("s2345");
        mySavingsAccount.setBalance(500);
        mySavingsAccount.setAccountName("Dad");

        System.out.println(myAccount);
        System.out.println(mySavingsAccount);
        mySavingsAccount.transfer(myAccount, 100);
        System.out.println("===After transfer===");
        System.out.println(myAccount);
        System.out.println(mySavingsAccount);

        mySavingsAccount.addInterest();
        System.out.println("===After interest accumulation===");
        System.out.println(mySavingsAccount);
    }
}
