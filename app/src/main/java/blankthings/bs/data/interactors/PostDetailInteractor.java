package blankthings.bs.data.interactors;

import blankthings.bs.data.local.doa.PostDao;
import blankthings.bs.data.models.Post;
import blankthings.bs.ui.presenters.ListingDetailPresenter;


public class PostDetailInteractor extends BaseInteractor {

    public static final String TAG = PostDetailInteractor.class.getSimpleName();

    private ListingDetailPresenter presenter;
    private PostDao postDao;


    public PostDetailInteractor(ListingDetailPresenter presenter, PostDao postDao) {
        this.presenter = presenter;
        this.postDao = postDao;
    }


    public void getPost() {
        // TODO: 10/13/17
        presenter.setPostDetail(new Post() {{ setId("1"); setTitle("This is title"); setBody("Body here."); }});
    }

}

