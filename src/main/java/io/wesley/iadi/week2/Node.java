package io.wesley.iadi.week2;

/**
 * @author wesley
 */
public class Node<T> {
    private final T value;
    private Node<T> child;

    public Node(T value) {
        this.value = value;
    }

    public void attach(Node child) {
        this.child = child;
    }

    public Node<T> getChild(int i) {
        if (i == 0) {
            return this;
        }
        System.out.println("Next: " + (i - 1));
        return child.getChild(i - 1);
    }

    public Node<T> getChild() {
        return child;
    }

    public T get() {
        return value;
    }

    public boolean hasChild() {
        return child != null;
    }
}
