package co.edureka.tmdb.movieappedureka;

import java.util.List;

/**
 * Created by M1021381 on 08-Jan-17.
 */
public class MovieResult {
    List<Movie> results;

    public List<Movie> getMovies() {
        return results;
    }

    public void setMovies(List<Movie> movies) {
        this.results = movies;
    }
}
