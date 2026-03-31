package week01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int i; // allocating 4 bytes to i
        i = 1;
        String name = "Amy";

        // Below is fine with Python
//         i = 0;
//         i = 0.5;
        System.out.println(i);
        System.out.print(i);
        System.out.print(i);
        System.out.print(i);
        System.out.print(i + "\n");
        System.out.printf("|%-10s|%10s|%12s|\n", "Number", "Name", "Grade");
        System.out.printf("|%-10d|%10s|%12.2f|\n", i, name, 95.5);
        System.out.println("Please enter a student name:");
        Scanner sc = new Scanner(System.in);
        name = sc.nextLine();
        System.out.println("Please enter the student's grade:");
        double grade = sc.nextDouble();
        System.out.printf("|%-10d|%10s|%12.2f|\n", i + 1, name, grade);

    }

}
