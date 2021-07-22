package ugm.dteti.se.eplat.rest;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by eplat on 31/08/17.
 */

public class ApiClient {
    public static final String BASE_URL = "http://10.42.10.211:5000/"; // for raspi
    private static Retrofit retrofit = null;


    public static Retrofit getClient(String url) {
        if (retrofit==null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(url)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
}
