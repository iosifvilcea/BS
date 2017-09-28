package blankthings.bs.ui.views;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import blankthings.bs.R;
import blankthings.bs.data.models.Item;
import blankthings.bs.ui.base.BaseView;
import blankthings.bs.ui.presenters.MainPresenterImpl;
import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends BaseView implements MainView {

    @BindView(R.id.main_recycler)
    protected RecyclerView recyclerView;

    @BindView(R.id.toolbar)
    protected Toolbar toolbar;

    private MainPresenterImpl mainPresenter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        setSupportActionBar(toolbar);
        setupRecyclerView();
        setupPresenter();
    }


    @Override
    protected void onResume() {
        super.onResume();
        if (mainPresenter != null) {
            mainPresenter.getTracker();
        }
    }


    private void setupRecyclerView() {
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        final MainListingsAdapter adapter = new MainListingsAdapter();
        recyclerView.setAdapter(adapter);
    }


    private void setupPresenter() {
        mainPresenter = new MainPresenterImpl(this);
    }


    @Override
    public void goToItemDetail(Item item) {
        // TODO: 9/27/17 - GO TO ITEM DETAIL PAGE.
    }

}
