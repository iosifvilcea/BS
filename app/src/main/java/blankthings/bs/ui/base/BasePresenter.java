package blankthings.bs.ui.base;

/**
 * Created by iosif on 9/26/17.
 */

public interface BasePresenter<V> {

    void init();

    boolean hasView();

    V getView();

    void terminate();

}
