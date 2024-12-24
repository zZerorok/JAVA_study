package collection.set.member;

import collection.set.MyHashSetV2;

public class HashAndEqualsMain1 {

    public static void main(String[] args) {
        // 중복 등록
        MyHashSetV2 set = new MyHashSetV2(10);
        MemberNoHashNoEquals member1 = new MemberNoHashNoEquals("A");
        MemberNoHashNoEquals member2 = new MemberNoHashNoEquals("A");

        System.out.println("member1.hashCode() = " + member1.hashCode());
        System.out.println("member2.hashCode() = " + member2.hashCode());
        System.out.println("member1.equals(member2) = " + member1.equals(member2));

        set.add(member1);
        set.add(member2);
        System.out.println(set);

        // 검색 실패
        MemberNoHashNoEquals searchValue = new MemberNoHashNoEquals("A");
        System.out.println("searchValue.hashCode() = " + searchValue.hashCode());
        boolean contains = set.contains(searchValue);
        System.out.println("contains = " + contains);
    }
}
