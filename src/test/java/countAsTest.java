import org.testng.Assert;
import org.testng.annotations.Test;

public class countAsTest {
    /*
    Test Data:
    “Abracadabra” → “5, 6”
    “Homenum Revelio” → “0, 15”
    “3 tarAmasAlatA” → “6, 8”
    */


    /*
    1.Positive testing
    String input “Abracadabra” →  “5, 6”  where 5-"a", 6- other symbols
    */

    @Test
    public void countAsTest1(){
        String str = "Abracadabra";

        String expectedResult = "5, 6";

        String actualResult = new StringMethods().countAs(str);

        Assert.assertEquals(expectedResult,actualResult);
    }

   /*
   2.Positive testing
   String input “Homenum Revelio” → “0, 15”  where 0-"a", 15 - other symbols
   */

    @Test
    public void countAsTest2(){
        String str = "Homenum Revelio";

        String expectedResult = "0, 15";

        String actualResult = new StringMethods().countAs(str);

        Assert.assertEquals(expectedResult,actualResult);
    }

   /*
   3.Positive testing
   String input “3 tarAmasAlatA” → “6, 8”  where 6-"a", 8 - other symbols
   */

    @Test
    public void countAsTest3(){
        String str = "3 tarАmАsAlatA";

        String expectedResult = "6, 8";

        String actualResult = new StringMethods().countAs(str);

        Assert.assertEquals(expectedResult,actualResult);
    }

    /*
    4.Positive testing
    String input “” → “0, 0”  where 0-"a", 0 - other symbols
    */

    @Test
    public void countAsTest4(){
        String str = "";

        String expectedResult = "0, 0";

        String actualResult = new StringMethods().countAs(str);

        Assert.assertEquals(expectedResult,actualResult);
    }
}
