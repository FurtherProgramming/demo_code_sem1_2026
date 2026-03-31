package week02;

import java.util.Scanner;

public class SwitchDemo {
    public static void main(String[] args) {
        int month;
        Scanner sc = new Scanner(System.in);
        month = sc.nextInt();

        switch (month) {
            case 1:
            case 2:
            case 3: System.out.println("First Quarter");
                break;
            case 4:
            case 5:
            case 6: System.out.println("Second Quarter");
                break;
            case 7:
            case 8:
            case 9: System.out.println("Third Quarter");
                break;
            case 10:
            case 11:
            case 12: System.out.println("Fourth Quarter");
                break;
            default: System.out.println("Invalid input");
                break;
        }

    }
}
