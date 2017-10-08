package blankthings.bs.data;

import blankthings.bs.BuildConfig;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by iosif on 9/26/17.
 */

public class ApiBuilder {

    private static final String URL = "https://jsonplaceholder.typicode.com";

    private final ApiService apiService;

    public ApiBuilder() {
        final OkHttpClient okHttpClient = generateClient();

        final Retrofit retrofit = new Retrofit.Builder()
                .client(okHttpClient)
                .baseUrl(URL)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();

        apiService = retrofit.create(ApiService.class);
    }


    private OkHttpClient generateClient() {
        final OkHttpClient.Builder client = new OkHttpClient.Builder();

        if (BuildConfig.DEBUG) {
            final HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
            interceptor.setLevel(HttpLoggingInterceptor.Level.BASIC);
            client.addInterceptor(interceptor);
        }

        return client.build();
    }

    public ApiService getApiService() {
        return apiService;
    }
}
