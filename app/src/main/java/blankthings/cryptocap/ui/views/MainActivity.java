package blankthings.cryptocap.ui.views;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import blankthings.cryptocap.R;
import blankthings.cryptocap.ui.base.BaseActivity;
import butterknife.BindView;

public final class MainActivity extends BaseActivity {

    @BindView(R.id.toolbar)
    protected Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setSupportActionBar(toolbar);
        navigationManager.goToCoins();
    }


    @Override
    public int getLayoutId() {
        return R.layout.activity_main;
    }
}
