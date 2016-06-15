package factory;


import java.util.HashMap;
import java.util.Map;

public class MovieFactory {
    private static Map<MovieType, Movie> movies = new HashMap<>();

    static {
        movies.put(MovieType.ACTION, new ActionMovie());
        movies.put(MovieType.ADVENTURES, new AdventuresMovie());
        movies.put(MovieType.DRAMA, new DramaMovie());
        movies.put(MovieType.TERROR, new TerrorMovie());
    }


    public Movie get(MovieType movieType) {
        return movies.get(movieType);
    }
}
