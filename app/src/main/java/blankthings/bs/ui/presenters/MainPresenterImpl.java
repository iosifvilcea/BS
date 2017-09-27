package blankthings.bs.ui.presenters;

import blankthings.bs.data.interactors.TickerInteractor;
import blankthings.bs.ui.base.BasePresenter;
import blankthings.bs.ui.base.ViewContract;

/**
 * Created by iosif on 9/26/17.
 */

public class MainPresenterImpl extends BasePresenter implements MainPresenter {

    public MainPresenterImpl(ViewContract view) {
        super(view);
    }

    @Override
    public void getTracker() {
        final TickerInteractor interactor = new TickerInteractor();
        interactor.getTicker();
    }
}
