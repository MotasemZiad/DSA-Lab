package Linear;

public interface MyList<T> {

    void add(T item);

    void add(int index, T item);

    T remove(int index);

    void clear();

    int indexOf(T item);

    void replace(int index, T item);

    T get(int index);

    boolean contains(T item);

    int size();

    boolean isEmpty();
}
