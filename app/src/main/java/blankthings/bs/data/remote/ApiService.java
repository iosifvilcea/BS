package blankthings.bs.data.remote;

import java.util.List;

import blankthings.bs.data.models.Post;
import io.reactivex.Single;
import retrofit2.http.GET;

/**
 * Created by iosif on 9/26/17.
 */

public interface ApiService {

    @GET("/posts/")
    Single<List<Post>> posts();

}
