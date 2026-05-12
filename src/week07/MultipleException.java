package week07;

import java.util.ArrayList;
import java.util.Scanner;

public class MultipleException {
    public static void main(String[] args) {
//        int capacity = 100;
        boolean hasValidInput = false;
        while(true) {
            try {
                System.out.println("Enter an initial capacity of the array:");
                Scanner sc = new Scanner(System.in);
                String userInput = sc.nextLine();
                int capacity = Integer.parseInt(userInput); // NumberFormatException
                ArrayList<Integer> list = new ArrayList<>(capacity); // IllegalArgumentException
                hasValidInput = true;
                if (hasValidInput){
                    break;
                }
            } catch (NumberFormatException exception) {
                System.err.println("Please a numerical value.");
            } catch (IllegalArgumentException exception) {
                System.err.println("Please enter a non-negative integer value.");
            } catch (Exception exception) {
                System.err.println("Please enter a valid capacity.");
            }


        }
    }
}
