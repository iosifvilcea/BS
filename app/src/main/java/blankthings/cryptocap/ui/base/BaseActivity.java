package blankthings.cryptocap.ui.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.annotation.StringRes;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.widget.Toast;

import blankthings.cryptocap.R;
import blankthings.cryptocap.managers.NavigationManager;
import butterknife.ButterKnife;


public abstract class BaseActivity<P extends BasePresenter>
        extends AppCompatActivity
        implements BaseView {

    protected P presenter;

    protected NavigationManager navigationManager;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutId());
        ButterKnife.bind(this);
        navigationManager = new NavigationManager(this);
    }

    @Override
    public void showError(@Nullable String error) {
        if (TextUtils.isEmpty(error)) {
            error = getString(R.string.generic_error);
        }

        Toast.makeText(this, error, Toast.LENGTH_SHORT).show();
    }


    @Override
    public void showLoading() {
        // TODO: 10/3/17
    }


    @Override
    public void hideLoading() {
        // TODO: 10/3/17
    }


    @Override
    public void setTitle(@Nullable String title) {
        if (getSupportActionBar() != null && !TextUtils.isEmpty(title)) {
            getSupportActionBar().setTitle(title);
        }
    }


    @Override
    public void setTitle(@StringRes int titleId) {
        setTitle(getString(titleId));
    }


    @Override
    public NavigationManager getNavigationManager() {
        return navigationManager;
    }
}
