package Week06;

import week03.Account;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;
import java.util.TreeSet;

public class MapDemo {
    public static void main(String[] args) {
        HashMap<String, Double> scores = new HashMap<>();
        scores.put("s12234", 90.0);
        scores.put("s12235", 87.0);
        scores.put("s12236", 90.0);
        scores.put("s12237", 85.0);
        scores.put("s12238", 87.0);

        HashMap<String, Account> hashMap = new HashMap<>();
        hashMap.put("Charles Theva",
                new Account("Charles Theva", "s123", 100.0));
        hashMap.put("Bill Cooper",
                new Account("Bill Cooper", "S124",90.0));
        hashMap.put("Abraham Lincoln",
                new Account("Abraham Lincoln", "S126",220.0));
        hashMap.put("Bill Cooper",
                new Account("Bill Cooper", "S124",120.0));

        for(String key: hashMap.keySet()){
            System.out.println(key + "->" + hashMap.get(key));
        }


        // LinkedHashMap
        LinkedHashMap<String, Account> linkedHashMap = new LinkedHashMap<>(hashMap);
        for(String key: linkedHashMap.keySet()){
            System.out.println(key + "->" + linkedHashMap.get(key));
        }
        //TreeMap
        TreeMap<String, Account> treeMap = new TreeMap<>(hashMap);
        for(String key: treeMap.keySet()){
            System.out.println(key + "->" + treeMap.get(key));
        }

    }
}
