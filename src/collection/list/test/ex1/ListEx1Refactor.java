package collection.list.test.ex1;

import java.util.Arrays;
import java.util.List;

public class ListEx1Refactor {

    public static void main(String[] args) {
        // 1. List.of() 사용
//        List<Integer> students = List.of(90, 80, 70, 60, 50);

        // 2. Arrays.asList() 사용
        List<Integer> students = Arrays.asList(90, 80, 70, 60, 50);

        int total = 0;
        for (Integer student : students) {
            total += student;
        }

        double average = (double) total / students.size();
        System.out.println("점수 총합: " + total);
        System.out.println("점수 평균: " + average);
    }
}
