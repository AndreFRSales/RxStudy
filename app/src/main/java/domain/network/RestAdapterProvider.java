package domain.network;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by andrefernandes on 1/8/17.
 */

public class RestAdapterProvider {

    private static final RestAdapterProvider INSTANCE = new RestAdapterProvider();

    private final String BASE_URL = "http://swapi.co/api";

    Retrofit retrofit;

    private RestAdapterProvider() {
        retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .client(getClient())
                .build();
    }

    public static RestAdapterProvider instance() {
        return INSTANCE;
    }

    public Retrofit getAdapter() {
        return retrofit;
    }


    public OkHttpClient getClient() {

        OkHttpClient client = new OkHttpClient
                .Builder()
                .connectTimeout(90, TimeUnit.SECONDS)
                .writeTimeout(90, TimeUnit.SECONDS)
                .readTimeout(90, TimeUnit.SECONDS)
                .build();

        return client;
    }
}
