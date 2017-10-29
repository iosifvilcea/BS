package blankthings.bs;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

/**
 * Created by iosif on 9/27/17.
 */

@RunWith(MockitoJUnitRunner.class)
public class BaseTest {

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }


    @After
    public void teardown() {
    }


    @Test
    public void initTest() {
    }
}
