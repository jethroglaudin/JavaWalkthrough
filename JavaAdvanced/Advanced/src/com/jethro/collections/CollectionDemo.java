package com.jethro.collections;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo {
    public static void show() {
        Collection<String> collection = new ArrayList<>();
        collection.add("a");
        collection.add("b");
        collection.add("c");
        System.out.println(collection);
        for (var item : collection)
            System.out.println(item);

    }
}
