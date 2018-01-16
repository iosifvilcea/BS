package blankthings.cryptocap.ui.fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.List;

import blankthings.cryptocap.R;
import blankthings.cryptocap.data.models.Coin;
import blankthings.cryptocap.ui.adapters.CoinsAdapter;
import blankthings.cryptocap.ui.base.BaseFragment;
import blankthings.cryptocap.ui.presenters.CoinsPresenterImpl;
import blankthings.cryptocap.ui.views.CoinsView;
import butterknife.BindView;


public final class CoinsFragment extends BaseFragment
        implements CoinsView {

    public static final String TAG = CoinsFragment.class.getSimpleName();

    public static CoinsFragment newInstance() {
        return new CoinsFragment();
    }

    @BindView(R.id.coins_recycler_view)
    RecyclerView recyclerView;

    private CoinsAdapter coinsAdapter;

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        coinsAdapter = new CoinsAdapter();
        recyclerView.setAdapter(coinsAdapter);

        final LinearLayoutManager linearLayoutManager = new LinearLayoutManager(
                getContext(), LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(linearLayoutManager);
    }


    @Override
    public void showCoins(@NonNull List<Coin> coins) {
        coinsAdapter.addCoins(coins);
    }


    @Override
    protected CoinsPresenterImpl createPresenter() {
        return new CoinsPresenterImpl(this);
    }


    @Override
    public int getLayoutId() {
        return R.layout.layout_coins;
    }
}
