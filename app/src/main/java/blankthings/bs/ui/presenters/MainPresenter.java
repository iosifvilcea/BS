package blankthings.bs.ui.presenters;

import blankthings.bs.data.models.Item;

/**
 * Created by iosif on 9/26/17.
 */

public interface MainPresenter {

    void getTracker();

    void itemSelected(Item item);

}
