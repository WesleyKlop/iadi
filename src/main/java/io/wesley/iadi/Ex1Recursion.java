package io.wesley.iadi;

/**
 * @author
 * @version 1.00 2007/10/10
 * @(#)Ex1Recursion.java
 */

class Ex1Recursion {

    public static void main(String[] args) {
        doeIets(3);
    }

    private static void doeIets(int w) {
        System.out.println(w);
        if (w < 5)
            doeIets(w + 1);

        System.out.println(w);
    }
}
