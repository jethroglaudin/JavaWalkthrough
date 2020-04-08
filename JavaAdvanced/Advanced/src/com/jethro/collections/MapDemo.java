package com.jethro.collections;


import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void show() {
        var c1 = new Customer("jethro", "test@test.com");
        var c2 = new Customer("Williams", "test1@test.com");

        Map<String, Customer> map = new HashMap<>();
        map.put(c1.getEmail(), c1);
        map.put(c2.getEmail(), c2);

//        var customer = map.get("test@test.com");
        var unknown = new Customer("Unknown", "");
        var customer = map.getOrDefault("e10", unknown); // look for object with the key 'e10' if not return unknown customer
        var exists = map.containsKey("e10"); // returns boolean
        // maps are not iterable here are way to find objects within a map
        for (var key : map.keySet()) // returns list of keys within set. each iteration we get a key
            System.out.println(key);

        for (var entry : map.entrySet()) // returns Set of key & value. iteration gives an entry. We can access entryKey() and entryValue()
            System.out.println(entry);

        for (var cust : map.values())
            System.out.println(cust);

        map.replace("jethro", new Customer("Glaudin", "test3@test.com"));
        System.out.println(map);
        System.out.println(customer);
        System.out.println(exists);

    }
}
