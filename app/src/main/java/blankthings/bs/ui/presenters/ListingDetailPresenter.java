package blankthings.bs.ui.presenters;

import blankthings.bs.data.models.Post;
import blankthings.bs.ui.base.BasePresenter;
import blankthings.bs.ui.views.ListingDetailView;

/**
 * Created by iosif on 10/13/17.
 */

public interface ListingDetailPresenter<V extends ListingDetailView>
        extends BasePresenter<V> {

    void getPostDetail();

    void setPostDetail(Post post);

}
