package io.wesley.iadi.week2;

/**
 * @author wesley
 */
public class LinkedList<T> {
    private Node<T> header = null;

    public void addFirst(T item) {
        Node<T> newNode = new Node<>(item);
        if (header != null) {
            newNode.attach(header);
        }
        header = newNode;
    }

    public void push(T item) {
        Node<T> node = header;
        if(node == null) {
            header = new Node<>(item);
            return;
        }
        while(node.hasChild()) {
            node = node.getChild();
        }
        node.attach(new Node<>(item));
    }

    public T get(int index) {
        return header.getChild(index).get();
    }
}
