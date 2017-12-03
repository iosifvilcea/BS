package blankthings.bs.ui.views;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.widget.TextView;

import blankthings.bs.R;
import blankthings.bs.ui.base.BaseActivity;
import blankthings.bs.ui.presenters.MainPresenterImpl;
import butterknife.BindView;

public class MainActivity extends BaseActivity implements MainView {

//    @BindView(R.id.main_recycler)
//    protected RecyclerView recyclerView;

    @BindView(R.id.block_hash)
    protected TextView textView;

    @BindView(R.id.toolbar)
    protected Toolbar toolbar;

    private MainPresenterImpl mainPresenter;

//    private MainListingsAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setSupportActionBar(toolbar);
//        setupRecyclerView();
        setupPresenter();
    }

    @Override
    public int getLayoutId() {
        return R.layout.activity_main;
    }


//    private void setupRecyclerView() {
//        recyclerView.setHasFixedSize(true);
//        recyclerView.setLayoutManager(new LinearLayoutManager(this));
//
//        adapter = new MainListingsAdapter();
//        recyclerView.setAdapter(adapter);
//    }


    private void setupPresenter() {
        mainPresenter = new MainPresenterImpl(this);
    }


    @Override
    protected void onResume() {
        super.onResume();
        mainPresenter.init();
    }


    @Override
    public void showLatestTransaction(String blockHash) {
        Log.e(MainActivity.class.getSimpleName(), "Block: " + blockHash);
        textView.setText(blockHash);
    }
}
