package week07;

import java.util.Scanner;

public class ThrowExceptionDemo {
    public static void methodThatThrowsException() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String userInput = in.nextLine();
        int number = Integer.parseInt(userInput);
    }

    public static void method2(){
        methodThatThrowsException();
    }

    public static void main(String[] args) {
        method2();
        try {
            methodThatThrowsException();
        }catch(NumberFormatException exception) {
            System.err.println("Please enter an integer value.");
        }

    }
}
