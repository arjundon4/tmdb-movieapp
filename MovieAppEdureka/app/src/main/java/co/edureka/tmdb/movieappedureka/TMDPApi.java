package co.edureka.tmdb.movieappedureka;

import retrofit.Callback;
import retrofit.http.GET;

/**
 * Created by M1021381 on 08-Jan-17.
 */
public interface TMDPApi {
    @GET("/movie/now_playing")
    void getNowPlayingMovies(Callback<MovieResult> cb);
}
