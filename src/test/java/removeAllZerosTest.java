import org.testng.Assert;
import org.testng.annotations.Test;

public class removeAllZerosTest {

    /*
    Test Data:
            “3504209706040000 “ →  “35429764“
            “0000000111“ → “111”
    */

    @Test
    public void removeAllZeros1 () {
    /*
    1. Positive test
    String “3504209706040000 “ →  “35429764“
     */
        String str = "3504209706040000 ";

        String actualResult = new StringMethods().removeAllZeros(str);
        String expectedResult = "35429764";

        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void removeAllZeros2 () {
    /*
    2. Positive test
    String  “0000000111“ → “111”
     */
        String str = "0000000111";

        String actualResult = new StringMethods().removeAllZeros(str);
        String expectedResult = "111";

        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void removeAllZeros3 () {
    /*
    3. Negative Validation test
    String  contain letter “00000Y00 111 “ → “111”
     */
        String str = "00000Y00 111 ";

        String actualResult = new StringMethods().removeAllZeros(str);
        String expectedResult = "String is contain some letter or symbol";

        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void removeAllZeros4 () {
    /*
    3. Negative Validation test
    String  contain lover case letter “00000$00 111 “ → “111”
     */
        String str = "00000Y00 111 ";

        String actualResult = new StringMethods().removeAllZeros(str);
        String expectedResult = "String is contain some letter or symbol";

        Assert.assertEquals(actualResult,expectedResult);
    }
}
