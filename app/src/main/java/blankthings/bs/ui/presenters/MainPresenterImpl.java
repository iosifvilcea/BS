package blankthings.bs.ui.presenters;

import blankthings.bs.data.models.Item;
import blankthings.bs.ui.views.MainView;

/**
 * Created by iosif on 9/26/17.
 */

public class MainPresenterImpl implements MainPresenter<MainView> {

    private MainView mainView;

    public MainPresenterImpl(MainView view) {
        this.mainView = view;
    }


    @Override
    public void init() {

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
    public void getTracker() {

    }


    @Override
    public void itemSelected(Item item) {

    }

}
