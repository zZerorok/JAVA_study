package lang.wrapper;

public class MyIntegerNullMain1 {

    public static void main(String[] args) {
        MyInteger[] intArray = {
                new MyInteger(-1),
                new MyInteger(0),
                new MyInteger(1),
        };
        System.out.println(findValue(intArray, -1));
        System.out.println(findValue(intArray, 0));
        System.out.println(findValue(intArray, 1));
        System.out.println(findValue(intArray, 100));
    }

    private static MyInteger findValue(MyInteger[] intArray, int target) {
        for (MyInteger myInteger : intArray) {
            if (myInteger.getValue() == target) {
                return myInteger;
            }
        }
        return null;
    }
}
