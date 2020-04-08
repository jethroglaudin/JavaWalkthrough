package com.jethro.collections;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueDemo {
    public static void show(){
        Queue<String> queue = new ArrayDeque<>();
        queue.add("c");
        queue.add("a");
        queue.add("b");
        queue.offer("d");
        // d -> b -> a -> c
        // in some cases where queue has limited size the add method throws exception and the offer method throws false. (less aggressive)

        var front = queue.peek();
        System.out.println(front);

    }

}
