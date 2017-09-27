package blankthings.bs.ui.base;

/**
 * Created by iosif on 9/26/17.
 */

public interface PresenterContract<V extends ViewContract> {

    void attach(V view);

    void detach();

}
