package blankthings.cryptocap.data.remote;

import java.util.List;

import blankthings.cryptocap.data.models.Coin;
import io.reactivex.Single;
import retrofit2.http.GET;


public interface ApiService {

    @GET("/v1/ticker")
    Single<List<Coin>> getCoins();

}
