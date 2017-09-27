package blankthings.bs.data;

import java.util.List;

import blankthings.bs.data.models.Item;
import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by iosif on 9/26/17.
 */

public interface ApiService {

    @GET("/v1/ticker/")
    Call<List<Item>> tickers();

}
