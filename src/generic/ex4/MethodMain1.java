package generic.ex4;

public class MethodMain1 {

    public static void main(String[] args) {
        Integer value = 10;
        Object object = GenericMethod.objectMethod(value);

        // 타입 인자(Type Argument) 명시적 전달
        System.out.println("명시적 타입 인자 전달");
        Integer integer = GenericMethod.<Integer>genericMethod(value);
        Integer integerValue = GenericMethod.<Integer>numberMethod(10);
        Double doubleValue = GenericMethod.<Double>numberMethod(20.0);
        // Number의 자식 클래스만 입력 가능 (Integer,Long, Double 등)
//        GenericMethod.<String>numberMethod("hello"); // 컴파일 오류

        // 타입 추론, 타입 인자 생략
        System.out.println("타입 추론");
        Integer integer2 = GenericMethod.genericMethod(value);
        Integer integerValue2 = GenericMethod.numberMethod(10);
        Double doubleValue2 = GenericMethod.numberMethod(20.0);
    }
}
