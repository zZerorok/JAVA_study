package generic.ex1;

public class BoxMain2 {

    public static void main(String[] args) {
        // Object -> Integer 캐스팅
        ObjectBox integerBox = new ObjectBox();
        integerBox.set(10);
        Object object = integerBox.get();
        Integer integer = (Integer) object;
        System.out.println("integer = " + integer);

        // 한 줄로 가능
        // Integer integerValue = (Integer) integerBox.get();

        // Object -> String 캐스팅
        ObjectBox stringBox = new ObjectBox();
        stringBox.set("hello");
        String string = (String) stringBox.get();
        System.out.println("string = " + string);

        // 잘못된 타입의 인수 전달
        integerBox.set("문자100");
        // String -> Integer 캐스팅 예외
        Integer result = (Integer) integerBox.get();
        System.out.println("result = " + result);
    }
}
