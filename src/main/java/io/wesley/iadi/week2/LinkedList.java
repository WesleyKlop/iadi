package io.wesley.iadi.week2;

/**
 * @author wesley
 */
public class LinkedList<T> {
    private Node<T> header = null;

    public void addFirst(T item) {
        Node<T> newNode = new Node<>(item);
        if (!this.isEmpty()) {
            newNode.attach(header);
        }
        header = newNode;
    }

    public boolean isEmpty() {
        return header == null;
    }

    public T get(int index) {
        return header.getChild(index).get();
    }

    public void addLast(T item) {
        Node<T> node = header;
        if (this.isEmpty()) {
            header = new Node<>(item);
            return;
        }
        while (node.hasChild()) {
            node = node.getChild();
        }
        node.attach(new Node<>(item));
    }

    public int size() {
        if (this.isEmpty()) {
            return 0;
        }

        int size = 1;
        Node<T> node = header;
        while (node.hasChild()) {
            size++;
            node = node.getChild();
        }
        return size;
    }

    public void remove(int index) {
        assert index >= 0;
        if (index == 0) {
            if (this.header.hasChild()) {
                this.header = this.header.getChild();
            } else {
                this.header = null;
            }
            return;
        }

        // Parent of node to remove
        final Node<T> node = this.header.getChild(index - 1);
        if (node.getChild().hasChild()) {
            // Set the child of the parent node to it's grandchild
            node.attach(node.getChild().getChild());
        } else {
            node.attach(null);
        }
    }
}
