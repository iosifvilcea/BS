package blankthings.bs.ui.base;


public abstract class BasePresenter<V> {

    protected V view = null;

    public void init() {
    }


    boolean hasView() {
        return view != null;
    }

    V getView() {
        return view;
    }

    public void terminate() {
        view = null;
    }

}
