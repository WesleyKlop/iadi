package io.wesley.iadi.week4;

import io.wesley.iadi.week2.LinkedList;

/**
 * @author wesley
 */
public class ListQueue<T> implements Queue<T> {
    private LinkedList<T> list = new LinkedList<>();

    @Override
    public void enqueue(T item) {
        list.addLast(item);
    }

    @Override
    public T dequeue() {
        final T item = list.getLast();
        list.removeLast();
        return item;
    }

    @Override
    public T front() {
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
