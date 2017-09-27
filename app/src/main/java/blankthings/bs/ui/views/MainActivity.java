package blankthings.bs.ui.views;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.widget.Toast;

import blankthings.bs.R;
import blankthings.bs.ui.base.ViewContract;
import blankthings.bs.ui.presenters.MainPresenterImpl;
import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements ViewContract {

    @BindView(R.id.main_recycler)
    protected RecyclerView recyclerView;

    private MainPresenterImpl mainPresenter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
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
    public void showError(String string) {
        Toast.makeText(this, string, Toast.LENGTH_SHORT).show();
    }


    @Override
    public void showLoading() {
        // TODO: 9/26/17
    }


    @Override
    public void hideLoading() {
        // TODO: 9/26/17
    }
}
