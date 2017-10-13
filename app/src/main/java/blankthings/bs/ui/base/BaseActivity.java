package blankthings.bs.ui.base;

import android.support.annotation.StringRes;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

/**
 * Created by iosif on 10/3/17.
 */

public abstract class BaseActivity<P extends BasePresenter>
        extends AppCompatActivity
        implements BaseView {

    P presenter;

    @Override
    public void showError(String error) {
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
    public void setTitle(String title) {
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle(title);
        }
    }


    @Override
    public void setTitle(@StringRes int titleId) {
        setTitle(getString(titleId));
    }
}
