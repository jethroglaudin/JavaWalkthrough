package com.jethro.lambdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Stream;

public class CreatingStreamsDemo {
    public static void show(){
        var stream = Stream.generate(() -> Math.random());
        stream
                .limit(3)
                .forEach(n -> System.out.println(n));
        Stream.iterate(1, n -> n + 1)
                .limit(10)
                .forEach(n -> System.out.println(n));
        Stream.of(1, 2, 3, 4);

//        Collection<Interger> x;
//        x.stream();
//        var list = new ArrayList<>();
//        list.stream();
        int[] numbers = {1, 2, 3, 4};
        Arrays.stream(numbers)
                .forEach(n -> System.out.println(n));
    }
}
