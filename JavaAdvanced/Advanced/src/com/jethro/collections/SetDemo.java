package com.jethro.collections;

import java.util.*;

public class SetDemo {
    public static void show() {
        Set<String> set1 = new HashSet<>(Arrays.asList("a", "b", "c"));
        Set<String> set2 = new HashSet<>(Arrays.asList("b", "c", "d"));

        // Union which the combination of two sets
//        set1.addAll(set2);
//        System.out.println(set1);

        // Intersection which will give us the items that are common in both sets
//        set1.retainAll(set2);
//        System.out.println(set1);

        // Difference
        set1.removeAll(set2);
        System.out.println(set1);



//        Collection<String> collection = new ArrayList<>();
//        Collections.addAll(collection, "a", "b", "c", "c");
//        Set<String> set = new HashSet<>(collection); // removes duplicate
//        System.out.println(set);

//        Set<String> set = new HashSet<>();
//        set.add("sky");
//        set.add("is");
//        set.add("blue");
//        set.add("blue");
        // Set interface does not guarantee the order of the items. Set only guarantees uniqueness.
//        System.out.println(set);
    }
}
