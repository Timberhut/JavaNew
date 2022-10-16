import org.testng.Assert;
import org.testng.annotations.Test;

public class ThreeWordsTest {
    /*
    Test Data:
    “one”, “One”, “ONE”  → true
    “one”, “Один”, “ONE” → false
    */

    @Test

    public void threeWordsTest1() {
        String str1 = "one";
        String str2 = "One";
        String str3 = "ONE";

        Boolean expectedResult = true;

        Boolean actualResult = new StringMethods().threeWords(str1,str2,str3);

        Assert.assertEquals(actualResult,expectedResult);
    }

    public void threeWordsTest2() {
        String str1 = "one";
        String str2 = "Один";
        String str3 = "ONE";

        Boolean expectedResult = false;

        Boolean actualResult = new StringMethods().threeWords(str1,str2,str3);

        Assert.assertEquals(actualResult,expectedResult);
    }
}
