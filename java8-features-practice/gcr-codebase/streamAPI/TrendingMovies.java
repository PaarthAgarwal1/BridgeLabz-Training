
import java.util.Arrays;
import java.util.List;

class Movie{
    String name;
    double rating;
    int releaseYear;

    Movie(String name, double rating, int releaseYear){
        this.name = name;
        this.rating = rating;
        this.releaseYear = releaseYear;
    }
    @Override
    public String toString(){
        return "Movie{name='" + name + "', rating=" + rating + ", releaseYear=" + releaseYear + "}";
    }
}

public class TrendingMovies {
    public static void main(String[] args) {
        List<Movie> movies = Arrays.asList(
                new Movie("Inception", 8.8, 2010),
                new Movie("The Dark Knight", 9.0, 2008),
                new Movie("Interstellar", 8.6, 2014),
                new Movie("The Matrix", 8.7, 1999),
                new Movie("Avengers: Endgame", 8.4, 2019),
                new Movie("Parasite", 8.6, 2019)
        );

        // Filter movies released after 2010 with rating above 8.5
        List<Movie> topFiveMovies=movies.stream().filter(movie->movie.releaseYear>2010).sorted((m1,m2)->Double.compare(m2.rating,m1.rating)).limit(5).toList();

        // Print trending movies
        topFiveMovies.forEach(System.out::println);
    }
    
}
