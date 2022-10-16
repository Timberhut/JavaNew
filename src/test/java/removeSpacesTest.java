import org.testng.Assert;
import org.testng.annotations.Test;

public class removeSpacesTest {

    /*
    Test Data:
            “    Red Rover School   “ → “Лишние пробелы удалены”
            “Red Rover School“ → “Пробелов не было”
            “” → “Строка пустая”
    */

    /*
    1. Positive test
    String contain spaces in string above sides of text
     */

    @Test
    public void String () {
        String str = "    Red Rover School   ";

        String actualResult = new StringMethods().removeSpaces(str);

        String expectedResult = "Extra spaces removed";

        Assert.assertEquals(actualResult,expectedResult);
    }

        /*
    2. Positive test
    String not contain spaces in string above sides of text
     */

    @Test
    public void String2 () {
        String str = "Red Rover School";

        String actualResult = new StringMethods().removeSpaces(str);

        String expectedResult = "String not contain any spaces";

        Assert.assertEquals(actualResult,expectedResult);
    }

            /*
    3. Positive test
    String is empty
     */

    @Test
    public void String3 () {
        String str = "";

        String actualResult = new StringMethods().removeSpaces(str);

        String expectedResult = "String is empty";

        Assert.assertEquals(actualResult,expectedResult);
    }
}
