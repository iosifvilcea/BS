package blankthings.bs.ui.base;

import android.support.annotation.LayoutRes;
import android.support.annotation.Nullable;
import android.support.annotation.StringRes;


public interface BaseView {

    void showError(@Nullable String error);

    void showLoading();

    void hideLoading();

    void setTitle(@Nullable String title);

    void setTitle(@StringRes int stringResource);

    @LayoutRes
    int getLayoutId();

}
