import org.testng.Assert;
import org.testng.annotations.Test;

public class StringMethodsTest {



        @Test
        public void betweenLettersTest() {
            /*
            1. Positive Test Data: “Abracadabra”, “b” → “bracadab”
            */

            String str = "Abracadabra";
            char letter = 'b';

            String expectedResult = "bracadab";

            String actualResult = new StringMethods().betweenLetters(str,letter);

            Assert.assertEquals(actualResult,expectedResult);
        }

        @Test
        public void betweenLettersTest2() {
            /*
            2. Positive Test Data: “Whippersnapper”, “p” → “ppersnapp”
            */

            String str = "Whippersnapper";
            char letter = 'p';

            String expectedResult = "ppersnapp";

            String actualResult = new StringMethods().betweenLetters(str,letter);

            Assert.assertEquals(actualResult,expectedResult);
        }

        @Test
        public void betweenLettersTestWithNoletterInTheWord() {
        /*
        3. Positive Test Data: "Whippersnapper", “u” → "There is no word or letter you are looking for"
        */
            String str = "Whippersnapper";
            char letter = 'u';

            String expectedResult = "There is no word or letter you are looking for";

            String actualResult = new StringMethods().betweenLetters(str,letter);

            Assert.assertEquals(actualResult,expectedResult);
        }

        @Test
        public void betweenLettersTest4() {
           /*
           4. Positive Test Data: “”, “u” →
           "There is no word or letter you are looking for"
           */
            String str = "";
            char letter = 'u';

            String expectedResult = "There is no word or letter you are looking for";

            String actualResult = new StringMethods().betweenLetters(str,letter);

            Assert.assertEquals(actualResult,expectedResult);

        }
    }


