import org.testng.Assert;
import org.testng.annotations.Test;

public class cityNameTest {
    @Test
    public void cityNameTest(){
        /*
        1. Positive test
        Test Data: “ЧикаГО” → “Чикаго”
        */

        String city = "ЧикаГО";

        String expectedResult = "Чикаго";

        String actualResult = new StringMethods().cityName(city);

        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void cityNameTest1(){
        /*
        2. Positive test
        Test Data: “ташкент” → “Ташкент”
        */

        String city = "ташкент";

        String expectedResult = "Ташкент";

        String actualResult = new StringMethods().cityName(city);

        Assert.assertEquals(actualResult,expectedResult);
    }
}
