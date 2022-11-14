package Linear.ArrayList;

import java.util.Arrays;

import Linear.MyList;

public class MyArrayList<T> implements MyList<T> {

    private static int DEFAULT_CAPACITY = 25;

    private T[] arr;

    private int newItemIndex = 0;

    public MyArrayList(int size) {
        arr = (T[]) new Object[size];
    }

    public MyArrayList() {
        this(DEFAULT_CAPACITY);
    }

    private int capacity() {
        return arr.length;
    }

    @Override
    public int size() {
        return newItemIndex;
    }

    public boolean isFull() {
        return size() == capacity();
    }

    @Override
    public boolean isEmpty() {
        return size() == 0;
    }

    private boolean checkIndex(int index) {
        return index >= 0 && index < size();
    }

    private boolean checkIndexForNewItem(int index) {
        return index >= 0 && index <= size();
    }

    private void duplicateCapacity() {
        T[] newArr = (T[]) new Object[capacity() * 2];
        for (int i = 0; i < newItemIndex; i++) {
            newArr[i] = arr[i];
        }

        arr = newArr;
    }

    @Override
    public void add(int index, T item) {
        if (item == null)
            return;
        if (!checkIndexForNewItem(index))
            return;
        if (isFull()) {
            duplicateCapacity();
        }

        for (int i = size(); i > index; i--) {
            arr[i] = arr[i - 1];
        }
        arr[index] = item;
        newItemIndex++;
    }

    @Override
    public void add(T item) {
        add(newItemIndex, item);
    }

    @Override
    public void replace(int index, T item) {
        if (item == null) {
            return;
        }
        if (!checkIndex(index)) {
            return;
        }

        arr[index] = item;
    }

    @Override
    public T get(int index) {
        if (!checkIndex(index)) {
            return null;
        }
        return arr[index];
    }

    @Override
    public T remove(int index) {
        if (!checkIndex(index)) {
            return null;
        }
        T result = get(index);

        for (int i = index; i < size() - 1; i++) {
            arr[i] = arr[i + 1];
        }
        this.newItemIndex--;
        arr[this.newItemIndex] = null;
        return result;
    }

    @Override
    public void clear() {
        arr = (T[]) new Object[arr.length];
        newItemIndex = 0;
    }

    @Override
    public int indexOf(T item) {
        if (item == null) {
            return -1;
        }
        for (int i = 0; i < size(); i++) {
            if (arr[i].equals(item)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public boolean contains(T item) {
        if (item == null) {
            return false;
        }
        for (int i = 0; i < newItemIndex; i++) {
            if (arr[i].equals(item)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return Arrays.toString(arr);
    }

}
