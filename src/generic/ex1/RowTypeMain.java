package generic.ex1;

public class RowTypeMain {

    public static void main(String[] args) {
        // GenericBox<Object> genericBox = new GenericBox<>(); // 권장
        GenericBox integerBox = new GenericBox();
        integerBox.set(10);
        Integer result = (Integer) integerBox.get();
        System.out.println("result = " + result);
    }
}
