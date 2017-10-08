package blankthings.bs.data.models;

import com.google.gson.annotations.SerializedName;

/**
 * Created by iosif on 9/26/17.
 */

public class Post {

    @SerializedName("userId")
    private String userId;

    @SerializedName("d")
    private String id;

    @SerializedName("title")
    private String title;

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
