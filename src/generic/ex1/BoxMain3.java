package generic.ex1;

public class BoxMain3 {

    public static void main(String[] args) {
        // 생성 시점에 T의 타입 결정
        GenericBox<Integer> integerBox = new GenericBox<Integer>();
//        integerBox.set("문자100"); // Integer 타입만 허용, 컴파일 오류
        integerBox.set(10);
        Integer integer = integerBox.get(); // Integer 타입 반환(캐스팅 X)
        System.out.println("integer = " + integer);

        GenericBox<String> stringBox = new GenericBox<String>();
        stringBox.set("hello");
        String string = stringBox.get();
        System.out.println("string = " + string);

        // 원하는 모든 타입 사용 가능
        GenericBox<Double> doubleBox = new GenericBox<Double>();
        doubleBox.set(10.5);
        Double doubleValue = doubleBox.get();
        System.out.println("doubleValue = " + doubleValue);

        // 타입 추론: 생성하는 제네릭 타입 생략 가능
        GenericBox<Integer> integerBox2 = new GenericBox<Integer>(); // 타입 직접 입력
        GenericBox<Integer> integerBox3 = new GenericBox<>(); // 타입 추론
    }
}
