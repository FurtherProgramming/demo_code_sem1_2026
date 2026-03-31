package week05;

import week03.Account;

public class ArrayDemo {
    public static void main(String[] args) {
        // Limitation 1 - Capacity control
        // Limitation 2 - You will need track the number of valid items
        int[] myArray = new int[10];
        for (int i = 0; i < 10; i++) {
            myArray[i] = i;
            System.out.println(myArray[i]);
        }

        Account[] myAccounts = new Account[10];
        myAccounts[0]= new Account("s123", "Amy", 100.0);
        for (int i = 0; i < 10; i++) {
            System.out.println(myAccounts[i]);
        }
    }
}
