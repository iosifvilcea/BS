package blankthings.cryptocap.ui.views;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import blankthings.cryptocap.R;
import blankthings.cryptocap.ui.base.BaseActivity;
import blankthings.cryptocap.ui.presenters.CoinsPresenterImpl;
import butterknife.BindView;

public final class MainActivity extends BaseActivity implements CoinsView {

    @BindView(R.id.toolbar)
    protected Toolbar toolbar;

    private CoinsPresenterImpl mainPresenter;

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
        mainPresenter = new CoinsPresenterImpl(this);
    }


    @Override
    protected void onResume() {
        super.onResume();
        mainPresenter.init();
    }
}
