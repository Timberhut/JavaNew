import org.testng.Assert;
import org.testng.annotations.Test;

public class insertQuotesTest {
    /*
    Test Data:
“Abracadabra” →  ““Abracadabra””
     */

    @Test
    public void insertQuotes() {
        String str = "Abracadabra";

        String expectedResult = "\"Abracadabra\"";

        String actualResult = new StringMethods().insertQuotes(str);

        Assert.assertEquals(expectedResult,actualResult);
    }
}
