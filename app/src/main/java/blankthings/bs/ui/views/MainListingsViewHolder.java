package blankthings.bs.ui.views;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import blankthings.bs.R;
import blankthings.bs.data.models.Post;
import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by iosif on 9/12/17.
 */

public class MainListingsViewHolder extends RecyclerView.ViewHolder {

    public static View inflate(ViewGroup parent) {
        return LayoutInflater
                .from(parent.getContext())
                .inflate(R.layout.main_listing_card_item, parent, false);
    }

    @BindView(R.id.text_header)
    protected TextView textHeader;

    @BindView(R.id.text_body)
    protected TextView textBody;

    public MainListingsViewHolder(View itemView) {
        super(itemView);
        ButterKnife.bind(this, itemView);
    }

    public void onBind(Post post) {
        textHeader.setText(post.getTitle());
        textBody.setText(post.getBody());
    }

}
