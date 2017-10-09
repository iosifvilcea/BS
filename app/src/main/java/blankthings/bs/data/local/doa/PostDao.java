package blankthings.bs.data.local.doa;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import java.util.List;

import blankthings.bs.data.models.Post;
import io.reactivex.Flowable;

/**
 * Created by iosif on 10/8/17.
 */

@Dao
public interface PostDao {

    @Query("SELECT * FROM posts")
    Flowable<List<Post>> getAll();

    @Query("SELECT * FROM posts WHERE title LIKE :title")
    Flowable<Post> getAllWithTitle(String title);

    @Insert
    void insertAll(List<Post> posts);

    @Delete
    void delete(Post post);

}
