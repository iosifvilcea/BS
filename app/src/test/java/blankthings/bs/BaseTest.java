package blankthings.bs;

import org.junit.runner.RunWith;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;


@RunWith(MockitoJUnitRunner.class)
public abstract class BaseTest {

    public void setup() {
        MockitoAnnotations.initMocks(this);
    }


    public void teardown() {
    }

}
