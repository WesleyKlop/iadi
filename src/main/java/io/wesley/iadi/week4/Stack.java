package io.wesley.iadi.week4;

/**
 * @author wesley
 */
public interface Stack<T> {
    void push(T obj);

    T pop();

    T peek();

    int size();

    boolean isEmpty();

}
