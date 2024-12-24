package collection.set;

import collection.set.member.Member;

public class JavaHashCodeMain {

    public static void main(String[] args) {
        // Object의 기본 hashCode는 객체의 참조값을 기반으로 생성
        Object object1 = new Object();
        Object object2 = new Object();

        System.out.println("object1.hashCode() = " + object1.hashCode());
        System.out.println("object2.hashCode() = " + object2.hashCode());

        // 각 클래스마다 hashCode를 이미 오버라이딩 해두었다.
        Integer integer = 10;
        Character chA = 'A';
        String strA = "A";
        String strB = "B";
        String strAB = "AB";

        System.out.println("integer.hashCode() = " + integer.hashCode());
        System.out.println("chA.hashCode() = " + chA.hashCode());
        System.out.println("strA.hashCode() = " + strA.hashCode());
        System.out.println("strB.hashCode() = " + strB.hashCode());
        System.out.println("strAB.hashCode() = " + strAB.hashCode());

        // hashCode는 마이너스 값이 들어올 수 있다.
        System.out.println("-1.hashCode() = " + Integer.valueOf(-1).hashCode());

        Member member1 = new Member("idA");
        Member member2 = new Member("idA");

        // equals, hashCode를 오버라이딩 하지 않은 경우와, 한 경우를 비교
        System.out.println("(member1 == member2) = " + (member1 == member2));
        System.out.println("(member1 equals member2) = " + (member1.equals(member2)));
        System.out.println("member1.hashCode() = " + member1.hashCode());
        System.out.println("member2.hashCode() = " + member2.hashCode());
    }
}
