package presenter;

import java.util.ArrayList;
import java.util.concurrent.Callable;

import domain.Models.Films;
import domain.Models.ResultsFilms;
import domain.network.FilmProvider;
import rx.Observable;
import rx.Observer;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by andrefernandes on 1/8/17.
 */

public class MainPresenter implements MainView {

    private MainView view;
    FilmProvider filmProvider;

    public MainPresenter(MainView view){
        this.view = view;
        filmProvider = new FilmProvider();
    }

    @Override
    public void resume() {
        Observable<Films> filmsObservable = Observable.fromCallable(() -> filmProvider.getAllFilms());
        filmsObservable.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(this::showFilms);
    }

    @Override
    public void showFilms(Films films) {
        view.showFilms(films);
    }



}
