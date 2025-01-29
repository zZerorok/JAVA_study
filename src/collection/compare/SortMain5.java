package collection.compare;

import com.sun.source.tree.Tree;

import java.util.TreeSet;

public class SortMain5 {

    public static void main(String[] args) {
        MyUser myUser1 = new MyUser("a", 30);
        MyUser myUser2 = new MyUser("b", 20);
        MyUser myUser3 = new MyUser("c", 10);

        TreeSet<MyUser> treeSet1 = new TreeSet<>();
        treeSet1.add(myUser1);
        treeSet1.add(myUser2);
        treeSet1.add(myUser3);
        System.out.println("Comparable 기본 정렬");
        System.out.println(treeSet1);

        TreeSet<MyUser> treeSet2 = new TreeSet<>(new IdComparator());
        treeSet2.add(myUser1);
        treeSet2.add(myUser2);
        treeSet2.add(myUser3);
        System.out.println("IdComparator 정렬");
        System.out.println(treeSet2);

        TreeSet<MyUser> treeSet3 = new TreeSet<>(new IdComparator().reversed());
        treeSet3.add(myUser1);
        treeSet3.add(myUser2);
        treeSet3.add(myUser3);
        System.out.println("IdComparator.reversed 정렬");
        System.out.println(treeSet3);
    }
}
