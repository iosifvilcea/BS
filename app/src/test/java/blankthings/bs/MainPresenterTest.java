package blankthings.bs;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import blankthings.bs.ui.presenters.MainPresenterImpl;
import blankthings.bs.ui.views.MainView;

/**
 * Created by iosif on 9/27/17.
 */

@RunWith(MockitoJUnitRunner.class)
public class MainPresenterTest extends BaseTest {

    @Mock
    MainView mainView;

    MainPresenterImpl mainPresenter;

    @Override
    public void setup() {
        super.setup();
        mainPresenter = new MainPresenterImpl(mainView);
    }

    @Test
    public void isPresenterAttached() {
        Assert.assertNotNull(mainPresenter.hasView());
    }


    @Override
    public void teardown() {
        super.teardown();
    }
}
