package blankthings.bs.ui.views;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import blankthings.bs.data.models.Post;

/**
 * Created by iosif on 9/12/17.
 */

public class MainListingsAdapter extends RecyclerView.Adapter<MainListingsViewHolder> {

    private List<Post> listings;

    MainListingsAdapter() {
        listings = new ArrayList<>();
    }


    @Override
    public MainListingsViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new MainListingsViewHolder(MainListingsViewHolder.inflate(parent));
    }


    @Override
    public void onBindViewHolder(MainListingsViewHolder holder, int position) {
        holder.onBind(listings.get(position));
    }


    public void populateList(List<Post> posts) {
        listings.addAll(posts);
        notifyDataSetChanged();
    }


    @Override
    public int getItemCount() {
        return listings.size();
    }

}
