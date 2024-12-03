package collection.list.test.ex1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListEx2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();

        System.out.println("n개의 정수를 입력하세요 (종료 0)");
        while (true) {
            int input = scanner.nextInt();

            if (input == 0) {
                break;
            }

            numbers.add(input);
        }

        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < numbers.size(); i++) {
            if (i != numbers.size() - 1) {
                builder.append(numbers.get(i)).append(", ");
            } else {
                builder.append(numbers.get(i));
            }
        }
        System.out.println("출력" + System.lineSeparator() + builder);
    }
}
