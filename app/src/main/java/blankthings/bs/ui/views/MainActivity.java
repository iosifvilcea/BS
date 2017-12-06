package blankthings.bs.ui.views;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import blankthings.bs.R;
import blankthings.bs.ui.base.BaseActivity;
import blankthings.bs.ui.presenters.MainPresenterImpl;
import butterknife.BindView;

public final class MainActivity extends BaseActivity implements MainView {

    @BindView(R.id.toolbar)
    protected Toolbar toolbar;

    private MainPresenterImpl mainPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setSupportActionBar(toolbar);
        setupPresenter();
    }

    @Override
    public int getLayoutId() {
        return R.layout.activity_main;
    }


    private void setupPresenter() {
        mainPresenter = new MainPresenterImpl(this);
    }


    @Override
    protected void onResume() {
        super.onResume();
        mainPresenter.init();
    }
}
