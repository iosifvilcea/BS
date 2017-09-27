package blankthings.bs.ui.base;

/**
 * Created by iosif on 9/26/17.
 */

public abstract class BasePresenter implements PresenterContract<ViewContract> {

    private ViewContract view;

    public BasePresenter(ViewContract view) {
        attach(view);
    }

    @Override
    public void attach(ViewContract view) {
        this.view = view;
    }

    @Override
    public void detach() {
        view = null;
    }

    public boolean hasView() {
        return view != null;
    }

    public ViewContract getView() {
        return view;
    }
}
