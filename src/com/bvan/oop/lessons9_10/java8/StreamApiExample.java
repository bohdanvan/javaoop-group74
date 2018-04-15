package com.bvan.oop.lessons9_10.java8;

import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * @author bvanchuhov
 */
public class StreamApiExample {

    public static void main(String[] args) {
        List<Movie> movies = MoviesFactory.createMovies();

        // Imperative
        for (Movie movie : movies) {
            if (movie.getReleaseYear() > 2000) {
                String name = movie.getName();
                System.out.println(name);
            }
        }
        System.out.println();

        // Declarative
        // Stream API
        Predicate<Movie> p = m -> m.getReleaseYear() > 2000;
        Function<Movie, String> mapFun = m -> m.getName();

        movies.parallelStream()
                .filter(p)
                .map(mapFun)
                .forEach(m -> System.out.println(m));
    }
}
