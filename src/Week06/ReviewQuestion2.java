package Week06;
import java.util.*;

public class ReviewQuestion2 {
    public static void main(String[] args) {
        LinkedHashSet<String> set = new LinkedHashSet<>();

        set.add("London");
        set.add("Paris");
        set.add("New York");
        set.add("San Francisco");
        set.add("Beijing");
        set.add("New York");

        System.out.println(set);

        TreeSet<String> treeSet = new TreeSet<String>(set);
        System.out.println(treeSet);
    }
}
