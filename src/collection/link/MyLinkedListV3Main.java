package collection.link;

public class MyLinkedListV3Main {

    public static void main(String[] args) {
        MyLinkedListV3<String> stringList = new MyLinkedListV3<>();
        stringList.add("a");
        stringList.add("b");
        stringList.add("c");
        String string = stringList.get(0);
        System.out.println("string = " + string);

        MyLinkedListV3<Integer> integerList = new MyLinkedListV3<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        Integer integer = integerList.get(0);
        System.out.println("integer = " + integer);

        MyLinkedListV3<Node> nodeList = new MyLinkedListV3<>();
        nodeList.add(new Node("A"));
        nodeList.add(new Node("B"));
        nodeList.add(new Node("C"));
        Node node = nodeList.get(0);
        node.next = nodeList.get(1);
        System.out.println("node = " + node);
    }
}
