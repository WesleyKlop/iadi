package io.wesley.iadi.week2;

/**
 * @author wesley
 */
public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.addLast("1");
        list.addLast("2");
        list.addLast("3");
        list.addLast("4");
        list.addLast("5");
        list.addFirst("0");

        for(int i = 0; i < 6; i++) {
            System.out.println("Getting " + i);
            System.out.println(list.get(i));
        }
    }
}
