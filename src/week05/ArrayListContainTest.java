package week05;

import java.util.ArrayList;

public class ArrayListContainTest {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < 6; i++){
            list.add(i);
        }

        // Search for 100
        boolean found = false;
        for(int i=0; i<list.size(); i++){
            if(list.get(i) == 1){
                System.out.println("Found it!");
                found = true;
                break;
            }
        }
        if(!found){
            System.out.println("Cannot find it!");
        }


        // solution 2
        if(list.indexOf(1) == -1){
            System.out.println("Cannot find it!");
        }else{
            System.out.println("Found it!");
        }

        // solution 3
        if(list.contains(1)){
            System.out.println("Found it!");

        }else{
            System.out.println("Cannot find it!");
        }

        // solution 4
        Integer myTarget = 1;
        if(list.remove(myTarget)){
            System.out.println("Found it and Removed it!");
        }else{
            System.out.println("Cannot find it!");
        }
    }
}