package blankthings.bs.ui.base;

import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

/**
 * Created by iosif on 9/27/17.
 */

public abstract class BaseView extends AppCompatActivity implements ViewContract {


    @Override
    public void showError(String error) {
        Toast.makeText(this, error, Toast.LENGTH_SHORT).show();
    }


    @Override
    public void showLoading() {
        // TODO: 9/27/17
    }


    @Override
    public void hideLoading() {
        // TODO: 9/27/17
    }


    @Override
    public void goBack() {
        onBackPressed();
    }


    @Override
    public void setTitle(String title) {
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle(title);
        }
    }


    @Override
    public void setTitle(int stringResource) {
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle(stringResource);
        }
    }
}
