package lang.wrapper;

public class MyIntegerNullMain0 {

    public static void main(String[] args) {
        int[] intArray = {-1, 0, 1, 2, 3};
        System.out.println(findValue(intArray, -1));
        System.out.println(findValue(intArray, 0));
        System.out.println(findValue(intArray, 1));
        System.out.println(findValue(intArray, 100));
    }

    private static int findValue(int[] intArray, int target) {
        for (int value : intArray) {
            if (value == target) {
                return value;
            }
        }
        return -1;
    }
}
