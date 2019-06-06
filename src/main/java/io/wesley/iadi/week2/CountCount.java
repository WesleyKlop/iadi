package io.wesley.iadi.week2;

/**
 * @author wesley
 */
public class CountCount {
    public static void main(String[] args) {
        countDown(10);
    }

    private static void countDown(int n) {
        if(n <= 0) {
            return;
        }
        countDown(n - 1);
        System.out.println(n);
    }
}
