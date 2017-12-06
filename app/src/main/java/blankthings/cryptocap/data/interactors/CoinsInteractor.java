package blankthings.cryptocap.data.interactors;

import android.support.annotation.NonNull;

import blankthings.cryptocap.ui.presenters.CoinsPresenter;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

public final class CoinsInteractor extends BaseInteractor {

    private CoinsPresenter presenter;

    public CoinsInteractor(@NonNull final CoinsPresenter coinsPresenter) {
        this.presenter = coinsPresenter;
    }

    public void loadCoins() {
        apiService.getCoins()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(coins -> presenter.onCoinsLoaded(coins),
                        fail -> presenter.onCallFailed(fail));
    }

}
