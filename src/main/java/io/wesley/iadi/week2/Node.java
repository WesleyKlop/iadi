package io.wesley.iadi.week2;

/**
 * @author wesley
 */
public class Node<T> {
    private final T value;
    private Node<T> prev;
    private Node<T> next;

    public Node(Node<T> prev, T value, Node<T> next) {
        this.prev = prev;
        this.value = value;
        this.next = next;
    }

    public Node<T> getPrev() {
        return prev;
    }

    public void setPrev(Node<T> prev) {
        this.prev = prev;
    }

    public Node<T> getNext(int i) {
        if (i == 0) {
            return this;
        }
        return next.getNext(i - 1);
    }

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

    public T getValue() {
        return value;
    }

    public boolean hasNext() {
        return next != null;
    }

    public boolean hasPrev() {
        return prev != null;
    }
}
