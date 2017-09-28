package blankthings.bs.ui.base;

/**
 * Created by iosif on 9/26/17.
 */

public interface PresenterContract<V> {

    void attach(V view);

    void detach();

    boolean hasView();

    V getView();

}
