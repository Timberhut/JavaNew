import org.testng.Assert;
import org.testng.annotations.Test;

public class removeAllSpacesTest {
    /*
    Test Data:
    “    R e d     Ro ve    r Sc   h ool   “ →  “RedRoverSchool“
    “p a     n   d a   “ → “panda”
    */


    /*
    1.Positive testing
    String input “    R e d     Ro ve    r Sc   h ool   “ →  “RedRoverSchool“
    */

    @Test
    public void removeAllSpacesTest1() {
        String str = "    R e d     Ro ve    r Sc   h ool   ";

        String expectedResult = "RedRoverSchool";

        String actualResult = new StringMethods().removeAllSpaces(str);

        Assert.assertEquals(expectedResult,actualResult);
    }

        /*
        2.Positive testing
        String input “p a     n   d a   “ → “panda”
        */

    @Test
    public void removeAllSpacesTest2() {
        String str = "p a     n   d a   ";

        String expectedResult = "panda";

        String actualResult = new StringMethods().removeAllSpaces(str);

        Assert.assertEquals(expectedResult,actualResult);
    }

   /*
   2.Positive testing
   String input ““ → “String is empty”
   */

    @Test
    public void removeAllSpacesTest3() {
        String str = "";

        String expectedResult = "String is empty";

        String actualResult = new StringMethods().removeAllSpaces(str);

        Assert.assertEquals(expectedResult,actualResult);
    }
}
