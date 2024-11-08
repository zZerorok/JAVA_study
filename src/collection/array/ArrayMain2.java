package collection.array;

import java.util.Arrays;

public class ArrayMain2 {

    public static void main(String[] args) {
        int[] array = new int[5];
        array[0] = 1;
        array[1] = 2;
        System.out.println(Arrays.toString(array));

        // 배열의 첫 번째 위치에 추가
        // 기본 배열의 데이터를 한 칸씩 뒤로 밀고 배열의 첫 번째 위치에 추가
        System.out.println("배열의 첫 번째 위치에 3 추가 0(n)");
        int newValue = 3;
        addFirst(array, newValue);
        System.out.println(Arrays.toString(array));

        // 배열의 index 위치에 추가
        // 기본 배열의 데이터를 한 칸씩 뒤로 밀고 배열의 index 위치에 추가
        System.out.println("배열의 index(2) 위치에 4 추가 0(n)");
        int index = 2;
        int value = 4;
        addAtIndex(array, index, value);
        System.out.println(Arrays.toString(array));

        System.out.println("배열의 마지막 위치에 5 추가 0(1)");
        addLast(array, 5);
        System.out.println(Arrays.toString(array));
    }

    private static void addLast(int[] array, int newValue) {
        array[array.length - 1] = newValue;
    }

    private static void addAtIndex(int[] array, int index, int newValue) {
        for (int i = array.length - 1; i > index; i--) {
            array[i] = array[i - 1];
        }
        array[index] = newValue;
    }

    private static void addFirst(int[] array, int newValue) {
        for (int i = array.length - 1; i > 0; i--) {
            array[i] = array[i - 1];
        }
        array[0] = newValue;
    }
}
