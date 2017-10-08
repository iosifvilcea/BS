package blankthings.bs.ui.views;

import blankthings.bs.data.models.Item;
import blankthings.bs.ui.base.BaseView;

/**
 * Created by iosif on 9/27/17.
 */

public interface MainView extends BaseView {

    void goToItemDetail(Item item);

}
