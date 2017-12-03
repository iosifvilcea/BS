package blankthings.bs.ui.presenters;

import blankthings.bs.data.interactors.PostInteractor;
import blankthings.bs.data.local.doa.PostDao;
import blankthings.bs.ui.views.MainView;


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

}
