package blankthings.bs.ui.base;

import android.support.annotation.LayoutRes;
import android.support.annotation.StringRes;

/**
 * Created by iosif on 9/27/17.
 */

public interface BaseView {

    void showError(String error);

    void showLoading();

    void hideLoading();

    void setTitle(String title);

    void setTitle(@StringRes int stringResource);

    @LayoutRes
    int getLayoutId();

}
