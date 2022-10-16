import org.testng.Assert;
import org.testng.annotations.Test;

public class sameLastAndFirstLetterTest {

/*
Test Data:
	“Abracadabra” → true
 */

    @Test
    public void sameLastAndFirstLetterTest() {
        String str = "Abracadabra";

       Boolean expectedResult = true;

       Boolean actualResult = new StringMethods().sameLastAndFirstLetter(str);

        Assert.assertEquals(actualResult,expectedResult);
    }

    /*
    Test Data:
	“Whippersnapper” → false
	*/

    @Test
    public void sameLastAndFirstLetterTest2() {
        String str = "Whippersnapper";

        Boolean expectedResult = false;

        Boolean actualResult = new StringMethods().sameLastAndFirstLetter(str);

        Assert.assertEquals(actualResult,expectedResult);
    }
}
