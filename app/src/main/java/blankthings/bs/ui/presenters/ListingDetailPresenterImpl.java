package blankthings.bs.ui.presenters;

import blankthings.bs.data.interactors.PostDetailInteractor;
import blankthings.bs.data.local.doa.PostDao;
import blankthings.bs.data.models.Post;
import blankthings.bs.ui.views.ListingDetailView;

/**
 * Created by iosif on 10/13/17.
 */

public class ListingDetailPresenterImpl
        implements ListingDetailPresenter<ListingDetailView> {

    public static final String TAG = ListingDetailPresenterImpl.class.getSimpleName();

    private ListingDetailView view;
    private PostDetailInteractor postInteractor;


    public ListingDetailPresenterImpl(ListingDetailView view, PostDao postDao) {
        this.view = view;
        postInteractor = new PostDetailInteractor(this, postDao);
    }


    @Override
    public void init() {
    }


    @Override
    public boolean hasView() {
        return view != null;
    }


    @Override
    public ListingDetailView getView() {
        return view;
    }


    @Override
    public void terminate() {
        postInteractor.cleanup();
    }


    @Override
    public void getPostDetail() {
        postInteractor.getPost();
    }


    @Override
    public void setPostDetail(Post post) {
        view.showPost(post);
    }
}
