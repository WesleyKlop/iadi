package io.wesley.iadi.week2;

/**
 * @author wesley
 */
public class LinkedList<T> {
    private Node<T> first = null;
    private Node<T> last = null;
    private int size = 0;

    public void addFirst(T item) {
        final Node<T> newNode = new Node<>(null, item, first);
        if (first != null) {
            first.setPrev(newNode);
        }
        if (last == null) {
            last = newNode;
        }
        size++;
        first = newNode;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public T get(int index) {
        return first.getNext(index).getValue();
    }

    public void addLast(T item) {
        Node<T> newNode = new Node<>(last, item, null);
        if (first == null) {
            first = newNode;
        }
        if (last != null) {
            last.setNext(newNode);
        }
        size++;
        last = newNode;
    }

    public T getLast() {
        return last.getValue();
    }

    public int size() {
        return size;
    }

    public void remove(int index) {
        final Node<T> nodeToRemove = first.getNext(index);

        // Set next on the prev node to the next node
        nodeToRemove.getPrev().setNext(nodeToRemove.getNext());
        // Set prev on the next node to the prev node
        nodeToRemove.getNext().setPrev(nodeToRemove.getPrev());
    }

    public void removeLast() {
        if (last == null) {
            return;
        }
        // Remove ref to last node from the previous one
        if (last.hasPrev()) {
            last.getPrev().setNext(null);
        }
        if (last == first) {
            first = null;
        }
        last = null;
        size--;
    }
}
