package com.jethro.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class CollectionDemo {
    public static void show() {
        Collection<String> collection = new ArrayList<>();
        Collections.addAll(collection, "a", "b", "c");
//        collection.add("a");
//        collection.add("b");
//        collection.add("c");
//        System.out.println(collection);
        collection.remove("a");
        System.out.println(collection);
//        for (var item : collection)
//            System.out.println(item);

    }
}
