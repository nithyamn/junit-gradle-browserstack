import static org.junit.Assert.*;

import org.junit.Test;

public class LocalTest extends BrowserStackJunitTest {

    @Test
    public void test() throws Exception {
        driver.get("http://bs-local.com:45691/check");

        assertTrue(driver.getPageSource().contains("Up and running"));
    }
}