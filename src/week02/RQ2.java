package week02;

public class RQ2 {
    public static void main(String[] args) {
        String s1 = "abraham"; // 97
        String s2 = "abraz"; // 74
        if (s1.length() > s2.length())
            System.out.println(s1 + " is greater");
        else if (s1.length() == s2.length())
            System.out.println(s1 + " same as " + s2);
        else
            System.out.println(s2 + " is greater");


        int x = 1;
        int y = 2;
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        int z = x + y;
        System.out.println("x + y = " + z);

        System.out.println("x is " + (x % 2 == 0? "even" : "odd"));
        System.out.println("y is " + (y % 2 == 0? "even" : "odd"));

    }
}
