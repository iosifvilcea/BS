package blankthings.bs.data.local;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;

import blankthings.bs.data.models.Post;


@Database(entities = {Post.class}, version = 1)
public abstract class BsDatabase extends RoomDatabase {

    private static final String DB_NAME = "bs_database";
    private static BsDatabase INSTANCE;

    public static BsDatabase getInstance(final Context context) {
        if (INSTANCE == null) {
            synchronized (BsDatabase.class) {
                INSTANCE = Room.databaseBuilder(context, BsDatabase.class, DB_NAME)
                        .build();
            }
        }

        return INSTANCE;
    }

}
