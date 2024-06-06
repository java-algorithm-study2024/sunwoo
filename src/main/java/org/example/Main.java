package org.example;




import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Deque<Integer> a = new ArrayDeque<>();
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        a.add(5);
        a.add(6);
        a.add(7);
        Iterator<Integer> iterator = a.descendingIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

}