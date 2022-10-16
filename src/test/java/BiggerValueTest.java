import org.testng.Assert;
import org.testng.annotations.Test;

public class BiggerValueTest {
    /* Task 4.
    Test Data: 3333, 9999
     1. Positive testing Happy path
     if (int numA < numB ) numA = 3333, numB = 9999
     return 9999;
     */

    @Test
    public void testNumALessThanNumB_HappyPath() {
        //AAA
        //arrange
        int numA = 3333;
        int numB = 9999;

        int expectedResult = 9999;

        //actual
        int actualResult = new BiggerValue().biggerValue(numA, numB);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);

    }

        /*
     Test Data: 9999, 3333
     2. Positive testing Happy path
     if (int numA > numB ) numA = 9999, numB = 3333
     return 9999;
     */

    @Test
    public void testNumAMoreThanNumB_HappyPath() {
        //AAA
        //arrange
        int numA = 9999;
        int numB = 3333;

        int expectedResult = 9999;

        //actual
        int actualResult = new BiggerValue().biggerValue(numA, numB);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);

    }

    /* Test Data: 3333, 3333
    3. Positive testing Happy path
     if (int numA = numB ) numA = 3333, numB = 3333
            return 3333;
     */

    @Test
    public void testNumAEqualNumB_HappyPath() {
        //AAA
        //arrange
        int numA = 3333;
        int numB = 3333;

        int expectedResult = 3333;

        //actual
        int actualResult = new BiggerValue().biggerValue(numA, numB);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);

    }

        /* 3.
        4. Positive testing Happy path
     if (int numA = numB ) numA = -3333, numB = -22
            return -22;
     */

    @Test
    public void testMinusNumALessThenNumB_HappyPath() {
        //AAA
        //arrange
        int numA = -3333;
        int numB = -22;

        int expectedResult = -22;

        //actual
        int actualResult = new BiggerValue().biggerValue(numA, numB);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);

    }
}
