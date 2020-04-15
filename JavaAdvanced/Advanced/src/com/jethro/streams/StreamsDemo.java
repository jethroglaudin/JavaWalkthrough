package com.jethro.streams;

import org.w3c.dom.ls.LSOutput;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamsDemo {
    public static void show(){
        List<Movie> movies = List.of(
                new Movie("A Quiet Place", 10),
                new Movie("Casablanca", 20),
                new Movie("The GodFather", 30)
        );

        // after map operation we'll have a stream like [10, 20, 30]
        // then [30, 30]
        // followed by [60]
        Integer sum = movies.stream()
                .map(movie -> movie.getLikes())
                .reduce(0,Integer::sum);

        System.out.println(sum);

//        var result = movies.stream()
//                .max(Comparator.comparing(Movie::getLikes)) // Pass Comparator
//                .findFirst() // Return first element in the stream. Optional class is good to prevent nullpointer exceptions
//                .findAny(); // will find any elements in the stream.
//                .get(); // get the object
//                .noneMatch(movie -> movie.getLikes() > 20); // returns boolean for if none of the elements match this condition
//                .allMatch(movie -> movie.getLikes() > 20); // checks if all elements match the condition
//                .anyMatch(movie -> movie.getLikes() > 20); // pass a Predicate to see if any elements in the stream matches the Predicate - returns boolean
//                .count() // returns the nomber of elements in the stream as a primitive long value
//        System.out.println(result.getTitle());



        // peek is a great way to troubleshoot our stream.
        // peek will allow us to get a output after each query
        // intermediate operation
//        movies.stream()
//                .filter(movie -> movie.getLikes() > 10)
//                .peek(movie -> System.out.println("filtered: " + movie.getTitle()))
//                .map(Movie::getTitle)
//                .peek(title -> System.out.println("mapped: " + title))
//                .forEach(System.out::println);


//        movies.stream()
//                .map(Movie::getLikes)
//                .distinct() // get unique elements
//                .forEach(System.out::println);
//        movies.stream()
//                .sorted(Comparator.comparing(Movie::getTitle).reversed()) // Sorted in descending order
//                .forEach(movie -> System.out.println(movie.getTitle()));

//        movies.stream()
////                .limit(2)
////                .skip(2)
////                .takeWhile(movie -> movie.getLikes() < 30)
//                .dropWhile(movie -> movie.getLikes() < 30)
//                .forEach(movie -> System.out.println(movie.getTitle()));
        // this will stop the moment it get to 30. Filter iterates the entire data source. takeWhile will stop the moment the predicate is false
        // opposite of takeWhile escapes all the elements that matches the predicate
//        Predicate<Movie> isPopular = movie -> movie.getLikes() > 10;
//        movies.stream()
//                .filter(isPopular) // returns a new stream of movies
//                .forEach(movie -> System.out.println(movie.getTitle()));
//        movies.stream()
////                .mapToInt(movie -> movie.getLikes())
//                .map(movie -> movie.getTitle())
//                .forEach(name -> System.out.println(name));

//        var stream = Stream.of(List.of(1,2,3), List.of(4, 5, 6));
//        stream
//                .flatMap(list -> list.stream()) // convert each list into a stream and flatten it.
//                .forEach(num -> System.out.println(num));
//        int count = 0;
//        // This is an example of imperative programming. Statements that specify how somthing should be done
//        // These statements determine how many movies have likes greater than 10.
//        for (var movie : movies) {
//            if (movie.getLikes() > 10)
//                count++;
//        }
//        // Stream is a way to get data out of a collection.
//        // Declarative (Functional) Programming
//       var count2 =  movies.stream()
//                .filter(movie -> movie.getLikes() > 10)
//                .count();
//
//        System.out.println(count2);
    }

//    private static String apply(Movie movie) {
//        return movie.getTitle();
//    }
}
