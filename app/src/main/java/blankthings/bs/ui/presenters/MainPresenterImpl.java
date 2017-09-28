package blankthings.bs.ui.presenters;

import blankthings.bs.data.interactors.TickerInteractor;
import blankthings.bs.data.models.Item;
import blankthings.bs.ui.base.BasePresenter;
import blankthings.bs.ui.views.MainActivity;

/**
 * Created by iosif on 9/26/17.
 */

public class MainPresenterImpl extends BasePresenter<MainActivity> implements MainPresenter {

    public MainPresenterImpl(MainActivity view) {
        super(view);
    }

    @Override
    public void getTracker() {
        final TickerInteractor interactor = new TickerInteractor();
        interactor.getTicker();
    }

    @Override
    public void itemSelected(Item item) {
        getView().goToItemDetail(item);
    }

}
