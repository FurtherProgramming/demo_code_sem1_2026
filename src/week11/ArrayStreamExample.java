package week11;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayStreamExample {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(-2, -1, -100, 0, 1, 5, 10));
        numbers.stream().map(xy -> {
            xy = xy+1;
            return xy;
        }).forEach(System.out::println);

    }
}
