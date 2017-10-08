package blankthings.bs.ui.presenters;

import java.util.List;

import blankthings.bs.data.models.Post;
import blankthings.bs.ui.base.BasePresenter;
import blankthings.bs.ui.views.MainView;

/**
 * Created by iosif on 9/26/17.
 */

public interface MainPresenter<V extends MainView> extends BasePresenter {

    V getView();

    void getPosts();

    void setPosts(List<Post> posts);

    void itemSelected(Post post);

    void handleError(Throwable t);

}
