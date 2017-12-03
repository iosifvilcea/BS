package blankthings.bs.ui.base;


public interface BasePresenter<V> {

    void init();

    boolean hasView();

    V getView();

    void terminate();

}
