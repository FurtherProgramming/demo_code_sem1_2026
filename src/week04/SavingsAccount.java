package week04;

import week03.Account;
import week05.Printable;

public class SavingsAccount extends Account {
    private double interestRate;

    public SavingsAccount(String accountID, String accountName,
                          double balance, double interestRate) {
        super(accountID, accountName, balance);
        this.interestRate = interestRate;
    }
    public SavingsAccount(String accountID, String accountName, double balance) {
        super(accountID, accountName, balance);
        this.interestRate = 0.01; //default
    }

    public SavingsAccount() {
        super();
        // The accountName attribute is private
//        this.accountName = "test";
        this.setAccountName("test savings account");
        this.interestRate = 0.01;
    }

    // new method
    public void addInterest(){
        this.setBalance(this.getBalance() + this.interestRate * this.getBalance());
    }

    // not new method, but new behaviour - overriding
    public String toString() {
        String result = super.toString();
        return result + "|" + this.interestRate;
    }

}
