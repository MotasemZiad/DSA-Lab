package Linear.LinkedList;

import Linear.MyList;

public class MyLinkedList<T> implements MyList<T> {
    private Node<T> head;
    private Node<T> tail;
    private int size;

    public MyLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    private boolean checkIndex(int index) {
        return index >= 0 && index < size();
    }

    private Node<T> getNode(int index) {
        if (!checkIndex(index))
            return null;

        Node<T> current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current;
    }

    public void moveToEnd(int index) {
        if (!checkIndex(index))
            return;

        T removedItem = remove(index);
        add(removedItem);
    }

    @Override
    public void add(T item) {
        if (item == null)
            return;
        Node<T> newNode = new Node<>(item);
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            tail.setNext(newNode);
            tail = newNode;
        }
        size++;
    }

    @Override
    public void add(int index, T item) {
        if (item == null)
            return;
        if (!checkIndex(index))
            return;
        Node<T> newNode = new Node<>(item);
        if (index == 0) {
            newNode.setNext(head);
            head = newNode;
        } else {
            Node<T> prevNode = getNode(index - 1);
            newNode.setNext(prevNode.getNext());
            prevNode.setNext(newNode);
        }
        size++;
    }

    @Override
    public T remove(int index) {
        if (!checkIndex(index))
            return null;
        T item;
        if (index == 0) {
            item = head.getElement();
            head = head.getNext();
        } else {
            Node<T> prevNode = getNode(index - 1);
            item = prevNode.getNext().getElement();
            prevNode.setNext(prevNode.getNext().getNext());
        }
        size--;
        return item;
    }

    @Override
    public void clear() {
        head = null;
        tail = null;
        size = 0;
    }

    @Override
    public int indexOf(T item) {
        if (item == null)
            return -1;
        Node<T> currentNode = head;
        int index = 0;
        while (currentNode != null) {
            if (currentNode.getElement().equals(item))
                return index;
            currentNode = currentNode.getNext();
            index++;
        }
        return -1;
    }

    @Override
    public void replace(int index, T item) {
        if (item == null)
            return;
        if (!checkIndex(index))
            return;
        Node<T> currentNode = getNode(index);
        currentNode.setElement(item);
    }

    public void removeDuplicates() {
        if (this.isEmpty()) {
            return;
        }
        Node<T> current = this.head;
        while (current.next != null) {
            if (current.element == current.next.element) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
    }

    @Override
    public T get(int index) {
        if (!checkIndex(index))
            return null;
        return getNode(index).getElement();
    }

    @Override
    public boolean contains(T item) {
        return indexOf(item) != -1;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    private class Node<T> {
        private T element;
        private Node<T> next;

        public Node(T element) {
            this.element = element;
            this.next = null;
        }

        public Node(T element, Node<T> next) {
            this.element = element;
            this.next = next;
        }

        public T getElement() {
            return element;
        }

        public void setElement(T element) {
            this.element = element;
        }

        public Node<T> getNext() {
            return next;
        }

        public void setNext(Node<T> next) {
            this.next = next;
        }
    }
}
