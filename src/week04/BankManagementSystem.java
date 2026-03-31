package week04;

import week03.Account;

public class BankManagementSystem {

    public static void resetAccount(Account account){
        account.setBalance(0);
        account.setAccountName(null);
        account.setAccountID(null);
    }

    public static void resetAccount(SavingsAccount account){
        account.setBalance(0);
        account.setAccountName(null);
        account.setAccountID(null);
        account.addInterest();
    }

    public static void main(String[] args) {
        // user walk in
        Account account = new Account("s123", "Amy", 100);
        // The program goes on
        resetAccount(account);

        // 2nd customer
        SavingsAccount savingsAccount = new SavingsAccount("s111", "Bob", 1000);
        resetAccount(savingsAccount);


    }
}
