package io.wesley.iadi;

class OperatiesBubble {

    public static void main(String[] args) {
        int n = 10;  // 10 elementen in een tabel
        System.out.println("het aantal elementen in de tabel is " + n);
        System.out.println("aantal verg operaties bij bubble-sort is " + aantalOpBubble(n));
    }

    private static int aantalOpBubble(int n) {
        if (n == 1)
            return (0);
        else
            return (aantalOpBubble(n - 1) + (n - 1));
    }

}