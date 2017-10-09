package blankthings.bs.data.local;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

import blankthings.bs.data.local.doa.PostDao;
import blankthings.bs.data.models.Post;

/**
 * Created by iosif on 10/8/17.
 */

@Database(entities = {Post.class}, version = 1)
public abstract class BsDatabase extends RoomDatabase {

    public abstract PostDao postDao();

}
