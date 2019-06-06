package io.wesley.iadi;

class TowersHanoi {
    public static void main(String[] args) {
        hanoi(3, 1, 2, 3);
    }


    private static void hanoi(int n, int a, int b, int c) {
        if (n > 0) {
            hanoi(n - 1, a, c, b);
            System.out.println(" schijf van " + a + " naar " + b);
            hanoi(n - 1, c, b, a);
        }
    }
}
