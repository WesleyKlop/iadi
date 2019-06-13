package io.wesley.iadi.week4;

/**
 * @author wesley
 */
public interface Queue<T> {
    void enqueue(T o);

    T dequeue();

    T front();

    int size();

    boolean isEmpty();
}
