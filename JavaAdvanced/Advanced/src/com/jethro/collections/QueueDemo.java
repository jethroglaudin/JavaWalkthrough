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
        // in some cases where queue has limited size, the add method throws exception and the offer method throws false. (less aggressive)

//        var front = queue.peek();
        var front = queue.remove(); // removes item at front of the queue and return it
//        var front = queue.poll(); // similar to remove but poll() returns null if queue is empty while remove() throws an exception
//        var front = queue.element();
        // peek returns null if the queue is empty. element() throws an exception.
        System.out.println(front);
        System.out.println(queue);

    }

}
