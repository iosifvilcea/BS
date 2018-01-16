package blankthings.cryptocap.ui.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import blankthings.cryptocap.R;
import blankthings.cryptocap.data.models.Coin;
import butterknife.BindView;
import butterknife.ButterKnife;


public class CoinViewHolder extends RecyclerView.ViewHolder {

    @BindView(R.id.coin_name)
    TextView coinName;

    @BindView(R.id.coin_price)
    TextView coinPrice;


    public static CoinViewHolder inflateView(final ViewGroup parent) {
        final View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.viewholder_coin, parent, false);

        return new CoinViewHolder(view);
    }


    public CoinViewHolder(View itemView) {
        super(itemView);
        ButterKnife.bind(this, itemView);
    }


    public void onBind(final Coin coin) {
        coinName.setText(coin.getName());
        coinPrice.setText(coin.getPriceUsd());
    }
}
