package com.jethro.streams;

import java.util.List;

public class StreamsDemo {
    public static void show(){
        List<Movie> movies = List.of(
                new Movie("A Quiet Place", 10),
                new Movie("Casablanca", 15),
                new Movie("The GodFather", 20)
        );

        int count = 0;
        // This is an example of imperative programming. Statements that specify how somthing should be done
        // These statements determine how many movies have likes greater than 10.
        for (var movie : movies) {
            if (movie.getLikes() > 10)
                count++;
        }
        // Stream is a way to get data out of a collection.
        // Declarative (Functional) Programming
       var count2 =  movies.stream()
                .filter(movie -> movie.getLikes() > 10)
                .count();

    }

}
