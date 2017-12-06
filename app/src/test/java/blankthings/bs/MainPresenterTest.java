package blankthings.bs;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import blankthings.bs.ui.presenters.MainPresenterImpl;
import blankthings.bs.ui.views.MainView;


@RunWith(MockitoJUnitRunner.class)
public class MainPresenterTest extends BaseTest {

    @Mock
    MainView mainView;

    MainPresenterImpl mainPresenter;

    @Override
    public void setup() {
        super.setup();

        mainView = Mockito.mock(MainView.class);
        mainPresenter = new MainPresenterImpl(mainView);
    }

    @Test
    public void attachedPresenterTest() {
        Assert.assertNotNull(mainPresenter.hasView());
    }

    @Override
    public void teardown() {
        super.teardown();
    }
}
