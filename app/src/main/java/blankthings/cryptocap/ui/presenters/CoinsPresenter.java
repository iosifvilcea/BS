package blankthings.cryptocap.ui.presenters;

import java.util.List;

import blankthings.cryptocap.data.models.Coin;

public interface CoinsPresenter {

    void loadCoins();

    void onCoinsLoaded(List<Coin> coins);

    void onCallFailed(Throwable throwable);

}
