package Week06;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.remove("B");
        list.remove(0);
        System.out.println(list.indexOf("X"));

        System.out.println(list);
    }

}
