package week02;

public class SelectionBlocks {
    public static void main(String[] args) {
        int x = 1;
        int y = -1;
        if(x < y) {
            System.out.println("x < y");
        }
            // after this point, we are not in if anymore!
            x += 1;
            System.out.println(x);

//        else
//            System.out.println("x <= y");

        int mark = 57;
        if (mark >= 50) {
            System.out.println("You passed");
            ///
        }

    }
}
