import io.appium.java_client.android.AndroidDriver;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.net.MalformedURLException;

public class AndroidTest {

    private AndroidDriver driver;
    private DriverFactory driverFactory;

    @Before
    public void setDriver() throws MalformedURLException {
        driverFactory = new DriverFactory();
        driver = driverFactory.setUp();
    }


    @Test
    public void test() throws InterruptedException {
        Thread.sleep(Long.parseLong("5000"));
    }

    @After
    public void tearDown() {

        driver.quit();
    }

}
