package blankthings.cryptocap;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import blankthings.cryptocap.ui.presenters.CoinsPresenterImpl;
import blankthings.cryptocap.ui.views.CoinsView;


@RunWith(MockitoJUnitRunner.class)
public class CoinsPresenterTest extends BaseTest {

    @Mock
    CoinsView coinsView;

    CoinsPresenterImpl mainPresenter;

    @Override
    public void setup() {
        super.setup();

        coinsView = Mockito.mock(CoinsView.class);
        mainPresenter = new CoinsPresenterImpl(coinsView);
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
