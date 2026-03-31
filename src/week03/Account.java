package week03;

import week05.Printable;

public class Account implements Printable {
    // attributes - private
    private String accountID;
    private String accountName;
    private double balance;

    // constructors
    public Account() {
        this.accountID = "XXX";
        this.accountName = "test";
        this.balance = 0.0;
        this.accountName = "test account";

    }
    public Account(String accountID, String accountName, double balance) {
        this(accountID, accountName);
        if(balance < 0) {
            throw new IllegalArgumentException("Balance cannot be negative");
        }else {
            this.balance = balance;
        }
    }
    public Account(String accountID, String accountName) {
        this.accountID = accountID;
        this.accountName = accountName;
        this.balance = 0.0;
    }

    public Account(String accountName, double accountID){

    }

    public Account(double balance, String accountName){

    }

    public String getAccountID(){
        return this.accountID;
    }

    public String getAccountName(){
        return this.accountName;
    }

    public void setAccountName(String accountName){
        this.accountName = accountName;
    }

    public void setAccountID(String newID){
        this.accountID = newID;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if(balance < 0) {
            throw new IllegalArgumentException("Balance cannot be negative");
        }
        this.balance = balance;
    }

    // methods
    public String toString(){
        return this.accountID + "|" + this.accountName + "|" + this.balance;
    }

    public void deposit (double amountToDeposit){
        this.balance += amountToDeposit;
    }

    public void deposit (double X, String message){

    }

    public boolean withdraw(double amountToWithdraw){
        if(this.balance < amountToWithdraw){
            return false;
        }
        this.balance -= amountToWithdraw;
        return true;
    }

    public boolean transfer(Account destination, double amountToTransfer){
        if(!this.withdraw(amountToTransfer)){
            return false;
        }
        destination.deposit(amountToTransfer);
        return true;
    }

    @Override
    public void print() {

    }
}
