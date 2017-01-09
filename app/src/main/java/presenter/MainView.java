package presenter;

import java.util.ArrayList;

import domain.Models.Films;
import domain.Models.ResultsFilms;

/**
 * Created by andrefernandes on 1/8/17.
 */

public interface MainView {

    void resume();
    void showFilms(Films films);

}
