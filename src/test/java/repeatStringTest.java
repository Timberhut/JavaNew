import org.testng.Assert;
import org.testng.annotations.Test;

public class repeatStringTest {
    @Test
    public void repeatStringTest() {

        String str = "one";
        int repeat = 5;

        String expectedResult = "oneoneoneoneone";

        String actualResult = new StringMethods().repeatStringNtimes(str,repeat);

        Assert.assertEquals(actualResult,expectedResult);
    }
}
