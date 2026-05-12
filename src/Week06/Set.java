package Week06;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Set {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("A");
        set.add("A");
        set.add("A");
        set.add("A");
        set.add("A");
        System.out.println(set);

        ArrayList<String> set2 = new ArrayList<>();
        set2.add("A");
        set2.add("B");
        set2.add("C");
        set2.add("A");
        set2.add("C");
        System.out.println(set2);

        HashSet<String> setWithoutDuplicates = new HashSet<>(set2);
        System.out.println(setWithoutDuplicates);

        //HashSet
        HashSet<String> hs = new HashSet<>();
        hs.add("Estrid");
        hs.add("Amy");
        hs.add("Bob");
        hs.add("zack");
        hs.add("Ahmed");
        System.out.println(hs);

        //LinkedHashSet
        LinkedHashSet<String> lsh = new LinkedHashSet<>();
        lsh.add("Estrid");
        lsh.add("Amy");
        lsh.add("Bob");
        lsh.add("zack");
        lsh.add("Ahmed");
        lsh.remove("Estrid");
        lsh.add("Estrid");
        System.out.println(lsh);


        //TreeSet
        TreeSet<String> ts = new TreeSet<>();
        ts.add("Estrid");
        ts.add("Amy");
        ts.add("Bob");
        ts.add("zack");
        ts.add("Ahmed");
        ts.remove("Estrid");
        ts.add("Estrid");
        System.out.println(ts);

    }
}
