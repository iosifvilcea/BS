package blankthings.bs.data.models;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

import com.google.gson.annotations.SerializedName;

/**
 * Created by iosif on 9/26/17.
 */

@Entity
public class Post {

    @PrimaryKey
    @SerializedName("post_id")
    private String id;

    @ColumnInfo(name = "post_userId")
    @SerializedName("userId")
    private String userId;

    @ColumnInfo(name = "post_title")
    @SerializedName("title")
    private String title;

    @ColumnInfo(name = "post_body")
    @SerializedName("body")
    private String body;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}
