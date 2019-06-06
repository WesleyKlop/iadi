package io.wesley.iadi.week4;

import io.wesley.iadi.week2.LinkedList;

/**
 * @author wesley
 */
public class ListStack<T> implements Stack<T> {
    private LinkedList<T> list = new LinkedList<>();

    @Override
    public void push(T obj) {
        list.addFirst(obj);
    }

    @Override
    public T pop() {
        final T item = list.get(0);
        list.remove(0);
        return item;
    }

    @Override
    public T peek() {
        return list.get(0);
    }

    @Override
    public int size() {
        return list.size();
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }
}
