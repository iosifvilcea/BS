package blankthings.bs.data;

import retrofit2.Retrofit;

/**
 * Created by iosif on 9/26/17.
 */

public class ApiBuilder {

    private static final String URL = "https://api.coinmarketcap.com";
    private final ApiService apiService;

    public ApiBuilder() {
        final Retrofit retrofit = new Retrofit.Builder().baseUrl(URL).build();
        apiService = retrofit.create(ApiService.class);
    }

    public ApiService getApiService() {
        return apiService;
    }
}
