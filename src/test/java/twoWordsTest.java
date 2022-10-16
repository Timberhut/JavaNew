import org.testng.Assert;
import org.testng.annotations.Test;

public class twoWordsTest {
    /*
    1. Positive  Test Data:  “Red Rover” → “Rover”
     */
    @Test
    public void twoWordsTest_Happy_Pass() {
        String str = "Red Rover";

        String expectedResult = "Rover";

        String actualResult = new StringMethods().twoWords(str);

        Assert.assertEquals(actualResult, expectedResult);
    }

    /*
    2. Positive  Test Data:  “ asd fgh jkl” →  “jkl”
    */

    @Test
    public void twoWordsTest2_Happy_Pass() {
        String str = " asd fgh jkl";

        String expectedResult = "jkl";

        String actualResult = new StringMethods().twoWords(str);

        Assert.assertEquals(actualResult, expectedResult);
    }

   /*
   3. Positive  Test Data: “” → “String not contain any words”
   */

    @Test
    public void twoWordsTest3_Happy_Pass() {
        String str = "";

        String expectedResult = "String not contain any words";

        String actualResult = new StringMethods().twoWords(str);

        Assert.assertEquals(actualResult, expectedResult);
    }

    /*
    4. Positive Test Data: “   Hello   ” → “String contain 1 word or only spaces”
    */

    @Test
    public void twoWordsTest4_Happy_Pass() {
        String str = "    Hello     ";

        String expectedResult = "String contain 1 word or only spaces";

        String actualResult = new StringMethods().twoWords(str);

        Assert.assertEquals(actualResult, expectedResult);
    }
}
