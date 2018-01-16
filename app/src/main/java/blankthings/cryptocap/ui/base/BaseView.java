package blankthings.cryptocap.ui.base;

import android.support.annotation.LayoutRes;
import android.support.annotation.Nullable;
import android.support.annotation.StringRes;

import blankthings.cryptocap.managers.NavigationManager;


public interface BaseView {

    void showError(@Nullable String error);

    void showLoading();

    void hideLoading();

    void setTitle(@Nullable String title);

    void setTitle(@StringRes int stringResource);

    @LayoutRes
    int getLayoutId();

    NavigationManager getNavigationManager();

}
