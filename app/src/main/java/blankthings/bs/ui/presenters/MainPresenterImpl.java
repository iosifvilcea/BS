package blankthings.bs.ui.presenters;

import android.util.Log;

import java.util.List;

import blankthings.bs.data.interactors.PostInteractor;
import blankthings.bs.data.local.doa.PostDao;
import blankthings.bs.data.models.Post;
import blankthings.bs.ui.views.MainView;

/**
 * Created by iosif on 9/26/17.
 */

public class MainPresenterImpl implements MainPresenter<MainView> {

    public static final String TAG = MainPresenterImpl.class.getSimpleName();

    private MainView mainView;

    private PostInteractor postInteractor;

    public MainPresenterImpl(MainView view, PostDao postDao) {
        this.mainView = view;
        postInteractor = new PostInteractor(this, postDao);
    }


    @Override
    public void init() {
    }


    @Override
    public void terminate() {
        postInteractor.cleanup();
    }


    @Override
    public boolean hasView() {
        return mainView != null;
    }


    @Override
    public MainView getView() {
        return mainView;
    }


    @Override
    public void getPosts() {
        postInteractor.getPosts();
    }


    @Override
    public void setPosts(List<Post> posts) {
        getView().populatePosts(posts);
    }


    @Override
    public void itemSelected(Post post) {
        // TODO: 10/7/17
        getView().showError("Not yet implemented.");
    }


    @Override
    public void handleError(Throwable t) {
        Log.e(TAG, "Error", t);
        getView().showError("Oops! Something went wrong.");
    }
}
