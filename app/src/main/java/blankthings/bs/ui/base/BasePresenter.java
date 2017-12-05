package blankthings.bs.ui.base;


public abstract class BasePresenter<V> {

    protected V view = null;

    public void init() {}

    public boolean hasView() {
        return view != null;
    }

    public V getView() {
        return view;
    }

    public void terminate() {
        view = null;
    }

}
