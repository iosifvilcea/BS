package blankthings.bs;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import blankthings.bs.data.local.doa.PostDao;
import blankthings.bs.ui.presenters.MainPresenterImpl;
import blankthings.bs.ui.views.MainView;


@RunWith(MockitoJUnitRunner.class)
public class MainPresenterTest extends BaseTest {

    @Mock
    MainView mainView;

    @Mock
    PostDao postDao;

    MainPresenterImpl mainPresenter;

    @Override
    public void setup() {
        super.setup();

        mainView = Mockito.mock(MainView.class);
        postDao = Mockito.mock(PostDao.class);
        mainPresenter = new MainPresenterImpl(mainView, postDao);
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
