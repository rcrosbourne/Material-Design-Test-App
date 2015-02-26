package materialtest.vivz.slidenerd.events;

import java.util.ArrayList;

import materialtest.vivz.slidenerd.pojo.Movie;

/**
 * Created by smurf on 26/02/2015.
 */
public class MoviesLoadedEvent {
    public final ArrayList<Movie> mMovies;
    public MoviesLoadedEvent(ArrayList movies){
        this.mMovies = movies;
    }
}
