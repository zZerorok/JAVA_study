package lang.immutable.change;

public class MutableMain {
    public static void main(String[] args) {
        MutableObj obj = new MutableObj(10);
        obj.add(30);

        //계산 이후의 기존 값은 사라짐
        System.out.println("obj = " + obj.getValue());
    }
}
