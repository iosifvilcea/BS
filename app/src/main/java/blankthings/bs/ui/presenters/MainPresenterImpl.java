package blankthings.bs.ui.presenters;

import blankthings.bs.ui.base.BasePresenter;
import blankthings.bs.ui.views.MainView;
import io.reactivex.annotations.NonNull;


public class MainPresenterImpl extends BasePresenter<MainView> implements MainPresenter {

    public MainPresenterImpl(@NonNull final MainView view) {
        this.view = view;
    }


    @Override
    public void init() {
        super.init();
    }


    @Override
    public void terminate() {
        super.terminate();
    }
}
