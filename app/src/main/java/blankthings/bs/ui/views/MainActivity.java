package blankthings.bs.ui.views;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import java.util.List;

import blankthings.bs.R;
import blankthings.bs.data.models.Post;
import blankthings.bs.ui.base.BaseActivity;
import blankthings.bs.ui.presenters.MainPresenterImpl;
import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends BaseActivity implements MainView {

    @BindView(R.id.main_recycler)
    protected RecyclerView recyclerView;

    @BindView(R.id.toolbar)
    protected Toolbar toolbar;

    private MainPresenterImpl mainPresenter;

    private MainListingsAdapter adapter;


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
            mainPresenter.getPosts();
        }
    }


    private void setupRecyclerView() {
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        adapter = new MainListingsAdapter();
        recyclerView.setAdapter(adapter);
    }


    private void setupPresenter() {
        mainPresenter = new MainPresenterImpl(this);
    }


    @Override
    public void populatePosts(List<Post> posts) {
        adapter.populateList(posts);
    }


    @Override
    public void goToItemDetail(Post post) {
        // TODO: 10/7/17
    }
}
