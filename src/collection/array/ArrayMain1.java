package collection.array;

import java.util.Arrays;

public class ArrayMain1 {

    public static void main(String[] args) {
        int[] array = new int[5];
        System.out.println("== index 입력: 0(1) ==");
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        System.out.println(Arrays.toString(array));

        System.out.println("== index 변경: 0(1) ==");
        array[2] = 10;
        System.out.println(Arrays.toString(array));

        System.out.println("== index 조회: 0(1) ==");
        System.out.println("array[2]: " + array[2]);

        System.out.println("== 배열 검색: 0(n) ==");
        System.out.println(Arrays.toString(array));
        int value = 10;
        for (int i = 0; i < array.length; i++) {
            System.out.println("array[" + i + "] = " + array[i]);
            if (array[i] == value) {
                System.out.println(value + " 찾음");
                break;
            }
        }
    }
}
