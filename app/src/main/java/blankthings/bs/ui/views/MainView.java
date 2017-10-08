package blankthings.bs.ui.views;

import java.util.List;

import blankthings.bs.data.models.Post;
import blankthings.bs.ui.base.BaseView;

/**
 * Created by iosif on 9/27/17.
 */

public interface MainView extends BaseView {

    void populatePosts(List<Post> posts);

    void goToItemDetail(Post post);

}
