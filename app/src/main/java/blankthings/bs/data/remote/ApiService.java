package blankthings.bs.data.remote;

import java.util.List;

import blankthings.bs.data.models.Post;
import io.reactivex.Single;
import retrofit2.http.GET;


public interface ApiService {

    @GET("/posts/")
    Single<List<Post>> posts();

}
