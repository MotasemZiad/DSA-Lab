package Generics;

public class MyList<T> {
    private T[] arr;
    private static int DEFAULT_CAPACITY = 25;

    public MyList(int size) {
        arr = (T[]) new Object[size];
    }

    public MyList() {
        this(DEFAULT_CAPACITY);
    }

    public T getFirst() {
        return arr[0];
    }

    public T getLast() {
        return arr[arr.length - 1];
    }

}