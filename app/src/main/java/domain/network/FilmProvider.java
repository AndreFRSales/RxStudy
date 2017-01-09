package domain.network;

import java.io.IOException;

import domain.Models.Films;
import domain.api.FilmsApi;
import retrofit2.Call;
import retrofit2.Retrofit;

/**
 * Created by andrefernandes on 1/8/17.
 */

public class FilmProvider implements FilmsRepository{

    private FilmsApi api;

    public FilmProvider(){
        Retrofit adapterProvider = RestAdapterProvider.instance().getAdapter();
        api = adapterProvider.create(FilmsApi.class);
    }

    @Override
    public Films getAllFilms() {
        Call<Films> call = api.getAllFilms();
        try {
            return call.execute().body();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }
}
