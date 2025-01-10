package collection.set.test;

import java.util.*;

public class UniqueNamesTest1 {

    public static void main(String[] args) {
        Integer[] inputArray = {30, 20, 20, 10, 10};
        Set<Integer> set = new HashSet<>(List.of(inputArray));

        for (Integer num : set) {
            System.out.println(num);
        }
    }
}
