import org.testng.Assert;
import org.testng.annotations.Test;

public class betweenLettersTest {

    /*
    1. Positive Test Data: “Abracadabra”, “b” → “bracadab”
   */
    @Test
    public void betweenLettersTest() {
        String str = "Abracadabra";
        char letter = 'b';

        String expectedResult = "bracadab";

        String actualResult = new StringMethods().betweenLetters(str,letter);

        Assert.assertEquals(actualResult,expectedResult);
    }

   /*
   2. Positive Test Data: “Whippersnapper”, “p” → “ppersnapp”
   */

    @Test
    public void betweenLettersTest2() {
        String str = "Whippersnapper";
        char letter = 'p';

        String expectedResult = "ppersnapp";

        String actualResult = new StringMethods().betweenLetters(str,letter);

        Assert.assertEquals(actualResult,expectedResult);
    }

    /*
    3. Positive Test Data: "Whippersnapper", “u” → "There is no word or letter you are looking for"
    */

    @Test
    public void betweenLettersTestWithNoletterInTheWord() {
        String str = "Whippersnapper";
        char letter = 'u';

        String expectedResult = "There is no word or letter you are looking for";

        String actualResult = new StringMethods().betweenLetters(str,letter);

        Assert.assertEquals(actualResult,expectedResult);
    }

    /*
    4. Positive Test Data: “”, “u” → "There is no word or letter you are looking for"
    */

    @Test
    public void betweenLettersTest4() {
        String str = "";
        char letter = 'u';

        String expectedResult = "There is no word or letter you are looking for";

        String actualResult = new StringMethods().betweenLetters(str,letter);

        Assert.assertEquals(actualResult,expectedResult);
    }

}
