package enumeration.ex2;

public class ClassGrade {
    // 회원 등급별로 상수를 선언한고 각각의 상수마다 별도의 인스턴스를 생성해서 대입한다
    public static final ClassGrade BASIC = new ClassGrade(); // x001
    public static final ClassGrade GOLD = new ClassGrade(); // x002
    public static final ClassGrade DIAMOND = new ClassGrade(); // x003

    //private 생성자 추가
    private ClassGrade() {}
}
