package Linear.Stack;

public class MyArrayStack<T> implements MyStack<T> {
    private static int DEFAULT_CAPACITY = 25;
    private T[] array;
    private int size;

    MyArrayStack(int size) {
        array = (T[]) new Object[size];
    }

    MyArrayStack() {
        this(DEFAULT_CAPACITY);
    }

    @Override
    public void push(T value) {
        if (value == null)
            return;
        if (isFull())
            duplicateCapacity();

        array[size] = value;
        size++;
    }

    @Override
    public T pop() {
        if (isEmpty())
            return null;

        return array[size--];
    }

    @Override
    public T peek() {
        return array[size];
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size() == capacity();
    }

    private int capacity() {
        return array.length;
    }

    public int size() {
        return size;
    }

    private void duplicateCapacity() {
        T[] newArr = (T[]) new Object[capacity() * 2];
        for (int i = 0; i < size; i++) {
            newArr[i] = array[i];
        }

        array = newArr;
    }

}
