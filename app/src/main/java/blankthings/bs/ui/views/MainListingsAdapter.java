package blankthings.bs.ui.views;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import blankthings.bs.data.models.Item;

/**
 * Created by iosif on 9/12/17.
 */

public class MainListingsAdapter extends RecyclerView.Adapter<MainListingsViewHolder> {

    private List<Item> listings;

    MainListingsAdapter() {
        listings = new ArrayList<>();
        listings.add(new Item("item number one"));
        listings.add(new Item("some other item"));
        listings.add(new Item("item number three"));
        listings.add(new Item("abc def"));
        listings.add(new Item("test test test"));
        listings.add(new Item("meh"));
    }


    @Override
    public MainListingsViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new MainListingsViewHolder(MainListingsViewHolder.inflate(parent));
    }

    @Override
    public void onBindViewHolder(MainListingsViewHolder holder, int position) {
        holder.onBind(listings.get(position));
    }

    @Override
    public int getItemCount() {
        return listings.size();
    }

}
