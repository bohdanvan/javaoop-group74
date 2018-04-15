package com.bvan.oop.lessons9_10.java8;

import java.util.ArrayList;
import java.util.List;

import static com.bvan.oop.lessons9_10.java8.Genre.*;
import static java.util.Arrays.asList;

/**
 * @author bvanchuhov
 */
public class MoviesFactory {

    public static List<Movie> createMovies() {
        List<Movie> movies = new ArrayList<>();
        movies.add(new Movie("Pulp Fiction", 1994, asList(((THRILLER)), COMEDY, CRIME), 8.51));
        movies.add(new Movie("Her", 2013, asList(ROMANCE, DRAMA, SCI_FI), 7.754));
        movies.add(new Movie("Captain Fantastic", 2016, asList(DRAMA, ROMANCE, COMEDY), 7.86));
        movies.add(new Movie("The Matrix", 1999, asList(SCI_FI, ACTION), 8.3));
        movies.add(new Movie("Interstellar", 2014, asList(SCI_FI, DRAMA, ADVENTURE), 8.7));
        movies.add(new Movie("Mulholland Dr.", 2001, asList(THRILLER, DRAMA, DETECTIVE), 7.35));
        return movies;
    }
}
