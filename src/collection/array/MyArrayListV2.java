package collection.array;

import java.util.Arrays;

public class MyArrayListV2 {
    private static final int DEFAULT_CAPACITY = 5;

    private Object[] elementData;
    private int size = 0;

    public MyArrayListV2() {
        elementData = new Object[DEFAULT_CAPACITY];
    }

    public MyArrayListV2(int initialCapacity) {
        elementData = new Object[initialCapacity];
    }

    public int size() {
        return size;
    }

    public void add(Object o) {
        // 코드 추가
        if (size == elementData.length) {
            grow();
        }
        elementData[size] = o;
        size++;
    }

    // 코드 추가
    private void grow() {
        int oldCapacity = elementData.length;
        int newCapacity = oldCapacity * 2;
        // 배열을 새로 만들고, 기존 배열을 새로운 배열에 복사
//        Object[] newArray = new Object[newCapacity];
//        for (int i = 0; i < elementData.length; i++) {
//            newArray[i] = elementData[i];
//        }
//        elementData = newArray;

        // 위의 복사 과정을 간단하게 한 줄로 구현
        elementData = Arrays.copyOf(elementData, newCapacity);
    }

    public Object get(int index) {
        return elementData[index];
    }

    public Object set(int index, Object element) {
        Object oldValue = get(index);
        elementData[index] = element;
        return oldValue;
    }

    public int indexOf(Object o) {
        for (int index = 0; index < size; index++) {
            if (o.equals(elementData[index])) {
                return index;
            }
        }
        return -1;
    }

    public String toString() {
        return Arrays.toString(Arrays.copyOf(elementData, size))
                + " size = " + size + ", capacity = " + elementData.length;
    }
}
