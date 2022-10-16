import org.testng.Assert;
import org.testng.annotations.Test;

public class removeAllAsTest {
    /*
     Test Data: “    Red Rover School   “ →  “Red Rover School“
               “panda   “ → “pnd”
               “taramasalata” → “trmslt”
     */

     /*
     1.Positive testing
     String input “    Red Rover School   “ →  “Red Rover School“
     */
    @Test
    public void removeAllAsTest1 () {
        String str = "    Red Rover School   ";

        String expectedResult = "Red Rover School";

        String actualResult = new StringMethods().removeAllAs(str);

        Assert.assertEquals(actualResult,expectedResult);
    }

         /*
     2.Positive testing
     String input “panda   “ → “pnd”
     */

    @Test
    public void removeAllAsTest2 () {
        String str = "panda   ";

        String expectedResult = "pnd";

        String actualResult = new StringMethods().removeAllAs(str);

        Assert.assertEquals(actualResult,expectedResult);
    }

           /*
     3.Positive testing
     String input “taramasalata” → “trmslt”
     */

    @Test
    public void removeAllAsTest3 () {
        String str = "taramasalata";

        String expectedResult = "trmslt";

        String actualResult = new StringMethods().removeAllAs(str);

        Assert.assertEquals(actualResult,expectedResult);
    }

               /*
     4.Positive testing
     String input “” → “String is empty”
     */

    @Test
    public void removeAllAsTest4 () {
        String str = "";

        String expectedResult = "String is empty";

        String actualResult = new StringMethods().removeAllAs(str);

        Assert.assertEquals(actualResult,expectedResult);
    }
}
