package blankthings.bs.ui.base;

/**
 * Created by iosif on 9/26/17.
 */

public abstract class BasePresenter<T extends ViewContract>
        implements PresenterContract<T> {

    private T view;

    public BasePresenter(T view) {
        attach(view);
    }

    @Override
    public void attach(T view) {
        this.view = view;
    }

    @Override
    public void detach() {
        view = null;
    }

    @Override
    public boolean hasView() {
        return view != null;
    }

    @Override
    public T getView() {
        return view;
    }

}
