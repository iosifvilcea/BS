package blankthings.cryptocap.ui.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.annotation.StringRes;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import butterknife.ButterKnife;


public abstract class BaseFragment<P extends BasePresenter>
        extends Fragment
        implements BaseView {

    protected P presenter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        final View view = inflater.inflate(getLayoutId(), container, true);
        ButterKnife.bind(view);
        return view;
    }


    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        presenter.init();
    }


    @Override
    public void showError(@Nullable String error) {
        if (!(getActivity() instanceof BaseActivity)) {
            throw new IllegalStateException("Parent Activity does not implement BaseActivity.");
        }

        ((BaseActivity)getActivity()).showError(error);
    }


    @Override
    public void showLoading() {
        if (!(getActivity() instanceof BaseActivity)) {
            throw new IllegalStateException("Parent Activity does not extend BaseActivity.");
        }

        ((BaseActivity)getActivity()).showLoading();
    }


    @Override
    public void hideLoading() {
        if (!(getActivity() instanceof BaseActivity)) {
            throw new IllegalStateException("Parent Activity does not extend BaseActivity.");
        }

        ((BaseActivity)getActivity()).hideLoading();
    }


    @Override
    public void setTitle(@Nullable String title) {
        if (getActivity() instanceof AppCompatActivity
                && ((AppCompatActivity) getActivity()).getSupportActionBar() != null) {
            ((AppCompatActivity) getActivity()).getSupportActionBar().setTitle(title);
        }
    }


    @Override
    public void setTitle(@StringRes int stringResource) {
        setTitle(getString(stringResource));
    }

}
