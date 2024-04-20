
import io.appium.java_client.ios.IOSDriver;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.net.MalformedURLException;

public class IosTest {

    private IOSDriver driver;
    private IosDriverFactory driverFactory;

    @Before
    public void setDriver() throws MalformedURLException {
        driverFactory = new IosDriverFactory();
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
