package br.com.afrsales.rxstudy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;

import domain.Models.Films;
import domain.Models.ResultsFilms;
import presenter.MainPresenter;
import presenter.MainView;

public class MainActivity extends AppCompatActivity implements MainView{

    MainPresenter mainPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mainPresenter = new MainPresenter(this);
    }

    @Override
    public void resume() {
        mainPresenter.resume();
    }

    @Override
    public void showFilms(Films films) {
        Toast.makeText(this, films.getCount().toString(), Toast.LENGTH_LONG).show();
    }
}
