package blankthings.bs.ui.views;

import blankthings.bs.data.models.Post;
import blankthings.bs.ui.base.BaseView;

/**
 * Created by iosif on 10/13/17.
 */

public interface ListingDetailView extends BaseView {

    void showPost(Post post);

}
