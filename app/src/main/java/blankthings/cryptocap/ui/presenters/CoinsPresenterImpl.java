package blankthings.cryptocap.ui.presenters;

import java.util.List;

import blankthings.cryptocap.data.interactors.CoinsInteractor;
import blankthings.cryptocap.data.models.Coin;
import blankthings.cryptocap.ui.base.BasePresenter;
import blankthings.cryptocap.ui.views.CoinsView;
import io.reactivex.annotations.NonNull;


public class CoinsPresenterImpl extends BasePresenter<CoinsView> implements CoinsPresenter {

    private CoinsInteractor interactor;

    public CoinsPresenterImpl(@NonNull final CoinsView view) {
        this.view = view;
        interactor = new CoinsInteractor(this);
    }


    @Override
    public void init() {
        super.init();
        loadCoins();
    }


    @Override
    public void loadCoins() {
        interactor.loadCoins();
    }


    @Override
    public void onCoinsLoaded(List<Coin> coins) {
        if (!hasView()) {
            return;
        }

        view.showCoins(coins);
    }


    @Override
    public void onCallFailed(Throwable throwable) {
        if (!hasView()) {
            return;
        }

        view.showError(throwable.getLocalizedMessage());
    }


    @Override
    public void terminate() {
        super.terminate();
        interactor = null;
    }
}
