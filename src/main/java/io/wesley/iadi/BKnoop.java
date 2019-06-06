package io.wesley.iadi;

// Klasse voor een knoop voor een binaire boom
public class BKnoop<E> {
    private static final int LEFT = 0;
    private static final int RIGHT = 1;
    private BKnoop<E> parent, leftChild, rightChild;
    private final E userObject;

    // Constructors
    public BKnoop() {
        this(null);
    }

    public BKnoop(E userObject) {
        parent = null;
        leftChild = null;
        rightChild = null;
        this.userObject = userObject;
    }

    // Methoden
    public void add(BKnoop<E> newChild) {
        if (leftChild == null)
            insert(newChild, LEFT);
        else if (rightChild == null)
            insert(newChild, RIGHT);
        else
            throw new IllegalArgumentException(
                "Meer dan 2 kinderen");
    }

    private void insert(BKnoop<E> newChild, int childIndex) {
        if (isAncestor(newChild))
            throw new IllegalArgumentException(
                "Nieuw kind is voorouder");
        if (childIndex != LEFT &&
            childIndex != RIGHT)
            throw new IllegalArgumentException(
                "Index moet 0 of 1 zijn");

        if (newChild != null) {
            BKnoop<E> oldParent = newChild.getParent();
            if (oldParent != null)
                oldParent.remove(newChild);
        }

        newChild.parent = this;
        if (childIndex == LEFT)
            leftChild = newChild;
        else
            rightChild = newChild;
    }

    private boolean isAncestor(BKnoop<E> aNode) {
        BKnoop<E> ancestor = this;
        while (ancestor != null && ancestor != aNode)
            ancestor = ancestor.getParent();
        return ancestor != null;
    }

    BKnoop<E> getParent() {
        return parent;
    }

    void remove(BKnoop<E> aChild) {
        if (aChild == null)
            throw new IllegalArgumentException(
                "Argument is null");

        if (!isChild(aChild))
            throw new IllegalArgumentException(
                "Argument is geen kind");

        if (aChild == leftChild) {
            leftChild.parent = null;
            leftChild = null;
        } else {
            rightChild.parent = null;
            rightChild = null;
        }
    }

    private boolean isChild(BKnoop<E> aNode) {
        return aNode != null && aNode.getParent() == this;
    }

    public E get() {
        return userObject;
    }

    public BKnoop<E> getLeftChild() {
        return leftChild;
    }

    public BKnoop<E> getRightChild() {
        return rightChild;
    }

    public String toString() {
        return userObject.toString();
    }

    public void printPreOrder(BKnoop<E> aap) {
        // TODO
    }

    public void printPostOrder(BKnoop<E> aap) {
        // TODO
    }

    public void printInOrder(BKnoop<E> aap) {
        // TODO
    }

    public E aantalKnopen() {
        // TODO
        return null;
    }

    public E aantalLeafs() {
        // TODO
        return null;
    }
}
