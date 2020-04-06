package com.jethro.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class CollectionDemo {
    public static void show() {
        Collection<String> collection = new ArrayList<>();
        Collections.addAll(collection, "a", "b", "c");;
        Collection<String> other = new ArrayList<>();
        other.addAll(collection);
        System.out.println(collection == other);
        System.out.println(collection.equals(other));

//        var objectArray = collection.toArray();
//        var stringArray = collection.toArray(new String[0]);

//        Collections.addAll(collection, "a", "b", "c");
//        collection.add("a");
//        collection.add("b");
//        collection.add("c");
//        System.out.println(collection);
//        collection.remove("a"); // remove individual element
//        var containsB = collection.contains("b");
//        System.out.println(containsB);
//        collection.clear(); // removes all elements
//        System.out.println(collection.isEmpty()); // returns boolean value for if collection is empty
//
//        System.out.println(collection);
//        for (var item : collection)
//            System.out.println(item);

    }
}
