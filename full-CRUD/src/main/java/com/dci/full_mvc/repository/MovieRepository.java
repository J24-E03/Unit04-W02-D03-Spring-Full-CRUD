package com.dci.full_mvc.repository;


import com.dci.full_mvc.model.Movie;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

@Repository
public class MovieRepository {

    private static Long movieId = 10L;
    List<Movie> movies = new ArrayList<>(Arrays.asList(
            new Movie(1L, "The Shawshank Redemption", 1994, 142, "Drama", "Frank Darabont", "English", true),
            new Movie(2L, "Pulp Fiction", 1994, 154, "Crime", "Quentin Tarantino", "English", true),
            new Movie(3L, "Parasite", 2019, 132, "Drama", "Bong Joon-ho", "Korean", true),
            new Movie(4L, "Inception", 2010, 148, "Sci-Fi", "Christopher Nolan", "English", true),
            new Movie(5L, "Life Is Beautiful", 1997, 116, "Comedy-Drama", "Roberto Benigni", "Italian", true),
            new Movie(6L, "The Matrix", 1999, 136, "Sci-Fi", "Lana and Lilly Wachowski", "English", true),
            new Movie(7L, "Amélie", 2001, 122, "Romance", "Jean-Pierre Jeunet", "French", false),
            new Movie(8L, "Run Lola Run", 1998, 81, "Thriller", "Tom Tykwer", "German", false),
            new Movie(9L, "Seven Samurai", 1954, 207, "Action", "Akira Kurosawa", "Japanese", false),
            new Movie(10L, "City of God", 2002, 130, "Crime", "Fernando Meirelles", "Portuguese", false)
    ));


    public List<Movie> findAll(){
        return movies;
    }

    public Movie findById(Long id){
        return movies.stream().filter(movie-> Objects.equals(movie.getId(), id)).findFirst()
                .orElseThrow(()->new RuntimeException(String.format("Movie with id: %d not found",id)));

    }

    public Movie save(Movie movie){
        movie.setId(++movieId);
        movies.add(movie);
        return movie;
    }


    public Movie update(Movie movie){
         Movie foundMovie = movies.stream()
                 .filter((oneMovie)->oneMovie.getId() == movie.getId())
                 .findFirst()
                 .orElseThrow(()->new RuntimeException("movie Not found"));

         
         foundMovie.setDirector(movie.getDirector());
        foundMovie.setDuration(movie.getDuration());
        foundMovie.setGenre(movie.getGenre());
        foundMovie.setLanguage(movie.getLanguage());
        foundMovie.setTitle(movie.getTitle());
        foundMovie.setReleaseYear(movie.getReleaseYear());
        foundMovie.setWonOscars(movie.isWonOscars());

         return foundMovie;
    }
}
