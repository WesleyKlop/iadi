package io.wesley.iadi.week2;

/**
 * @author wesley
 */
public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.push("1");
        list.push("2");
        list.push("3");
        list.push("4");
        list.push("5");
        list.addFirst("0");

        for(int i = 0; i < 6; i++) {
            System.out.println("Getting " + i);
            System.out.println(list.get(i));
        }
    }
}
