package week03;

public class Main {
    public static void main(String[] args) {
        String myString = "";

//        Account myAccount = new Account();
        Account myAccount2 = new Account("s123", "Amy", 100);
        System.out.println(myAccount2);

        myAccount2.deposit(500);
        System.out.println(myAccount2);

//        myAccount2.setBalance(-100);

//        System.out.println(myAccount);
//        while(myAccount2.withdraw(100)) {
//            System.out.println(myAccount2);
//        }
        Account david = new Account("s2334", "David");
        myAccount2.transfer(david, 100);
        System.out.println(myAccount2);
        System.out.println(david);



        // The below declaration is also fine.
        // var myAccount2 = new Account();
        // Direct access of attributes should be forbidden
//        myAccount.balance = -100;

    }
}
