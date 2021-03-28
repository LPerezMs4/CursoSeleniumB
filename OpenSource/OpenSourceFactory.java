package OpenSource;

import org.testng.annotations.Factory;

public class OpenSourceFactory {

    @Factory
    public Object[] OrangeOSFactory() {
        return new Object[] {
                new OpenSourceTest(),
        };
    }
}
