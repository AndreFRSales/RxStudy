package domain.api;

import domain.Models.Films;
import domain.Models.ResultsFilms;
import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by andrefernandes on 1/8/17.
 */

public interface FilmsApi {

    @GET("films")
    Call<Films> getAllFilms();

}
