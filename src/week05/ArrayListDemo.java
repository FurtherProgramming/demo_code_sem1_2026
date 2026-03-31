package week05;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
//        int[] myArray = new int[10];
//        for (int i = 0; i < 10; i++) {
//            myArray[i] = i;
//            System.out.println(myArray[i]);
//        }
        //Integer (class / object data type)
        // int (primitive data type/ non-object data type)
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("Now you have " + list.size() + " items in the array");
        list.add(0);
        list.add(1);
        for(int i = 2; i < 6; i++){
            list.add(i);
        }
        System.out.println("Now you have " + list.size() + " items in the array");
        list.remove(0);
        System.out.println(list);
        System.out.println("Now you have " + list.size() + " items in the array");
//        list.remove(0);
        Integer myInteger = 6;
        System.out.println(list.remove(myInteger));
        System.out.println(list);
        System.out.println("Now you have " + list.size() + " items in the array");

        System.out.println("Object 5 is at the index of " + list.indexOf(5));
        System.out.println("Object 100 is at the index of " + list.indexOf(100));
        if(list.indexOf(100) == -1){
            System.out.println("The number you are searching for is not in the list.");
        }

    }
}
