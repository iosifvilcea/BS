package blankthings.cryptocap.data.local.doa;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import java.util.List;

import blankthings.cryptocap.data.models.Coin;
import io.reactivex.Flowable;

/**
 * Created by iosif on 10/8/17.
 */

@Dao
public interface PostDao {

    @Query("SELECT * FROM posts")
    Flowable<List<Coin>> getAll();

    @Query("SELECT * FROM posts WHERE title LIKE :title")
    Flowable<Coin> getAllWithTitle(String title);

    @Insert
    void insertAll(List<Coin> coins);

    @Delete
    void delete(Coin coin);

}
