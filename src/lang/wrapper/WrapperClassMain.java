package lang.wrapper;

public class WrapperClassMain {

    public static void main(String[] args) {
        Integer newInteger = new Integer(10);   // 미래에 삭제 예정, 대신 valueOf()를 사용
//        Integer newInteger = Integer.valueOf(10);
        Integer integerObject = Integer.valueOf(10);    // -128 ~ 127 자주 사용하는 숫자 값 재사, 불변
        Long longObject = Long.valueOf(100);
        Double doubleObject = Double.valueOf(10.5);

        System.out.println("newInteger = " + newInteger);
        System.out.println("integerObject = " + integerObject);
        System.out.println("longObject = " + longObject);
        System.out.println("doubleObject = " + doubleObject);

        System.out.println("내부 값 읽기");
        int intValue = integerObject.intValue();
        System.out.println("intValue = " + intValue);
        long longValue = longObject.longValue();
        System.out.println("longValue = " + longValue);

        System.out.println("비교");
        System.out.println("==: " + (newInteger == integerObject));
        System.out.println("equals: " + (newInteger.equals(integerObject)));
    }
}
