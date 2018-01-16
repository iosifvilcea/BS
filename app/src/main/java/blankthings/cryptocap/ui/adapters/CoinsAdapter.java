package blankthings.cryptocap.ui.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import blankthings.cryptocap.data.models.Coin;


public final class CoinsAdapter extends RecyclerView.Adapter<CoinViewHolder> {

    private List<Coin> coins;

    public CoinsAdapter() {
        coins = new ArrayList<>();
    }


    public void addCoins(final List<Coin> coins) {
        if (coins == null || coins.isEmpty()) {
            return;
        }

        this.coins.clear();
        this.coins.addAll(coins);
        notifyDataSetChanged();
    }


    @Override
    public CoinViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return CoinViewHolder.inflateView(parent);
    }


    @Override
    public void onBindViewHolder(CoinViewHolder holder, int position) {
        holder.onBind(coins.get(position));
    }


    @Override
    public int getItemCount() {
        return coins.size();
    }

}
