package blankthings.bs.ui.views;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.TextView;

import blankthings.bs.R;
import blankthings.bs.data.local.BsDatabase;
import blankthings.bs.data.models.Post;
import blankthings.bs.ui.base.BaseFragment;
import blankthings.bs.ui.presenters.ListingDetailPresenter;
import blankthings.bs.ui.presenters.ListingDetailPresenterImpl;
import butterknife.BindView;

/**
 * Created by iosif on 10/13/17.
 */

public class ListingDetailFragment extends BaseFragment<ListingDetailPresenter>
        implements ListingDetailView {

    @BindView(R.id.post_title)
    protected TextView postTitleView;

    @BindView(R.id.post_body)
    protected TextView postBodyView;


    @Override
    public int getLayoutId() {
        return R.layout.view_listing_detail;
    }


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setupPresenter();
    }


    @Override
    public void onResume() {
        super.onResume();
        presenter.getPostDetail();
    }


    private void setupPresenter() {
        final BsDatabase bsDatabase = BsDatabase.getInstance(getActivity().getApplicationContext());
        presenter = new ListingDetailPresenterImpl(this, bsDatabase.postDao());
    }


    @Override
    public void showPost(Post post) {
        if (post != null) {
            postTitleView.setText(post.getTitle());
            postBodyView.setText(post.getBody());
        }
    }
}
