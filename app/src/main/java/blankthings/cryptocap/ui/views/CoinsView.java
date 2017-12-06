package blankthings.cryptocap.ui.views;

import android.support.annotation.NonNull;

import java.util.List;

import blankthings.cryptocap.data.models.Coin;
import blankthings.cryptocap.ui.base.BaseView;


public interface CoinsView extends BaseView {

    void showCoins(@NonNull List<Coin> coins);

}
