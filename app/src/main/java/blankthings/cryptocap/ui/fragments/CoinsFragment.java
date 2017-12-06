package blankthings.cryptocap.ui.fragments;

import android.support.annotation.NonNull;

import java.util.List;

import blankthings.cryptocap.data.models.Coin;
import blankthings.cryptocap.ui.base.BaseFragment;
import blankthings.cryptocap.ui.views.CoinsView;


public final class CoinsFragment extends BaseFragment
        implements CoinsView {

    @Override
    public int getLayoutId() {
        return 0;
    }


    @Override
    public void showCoins(@NonNull List<Coin> coins) {
        
    }
}
