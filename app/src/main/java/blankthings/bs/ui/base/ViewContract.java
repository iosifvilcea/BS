package blankthings.bs.ui.base;

import android.support.annotation.StringRes;

/**
 * Created by iosif on 9/26/17.
 */

public interface ViewContract {

    void showError(String error);

    void showLoading();

    void hideLoading();

    void goBack();

    void setTitle(String title);

    void setTitle(@StringRes int stringResource);

}
