import org.testng.Assert;
import org.testng.annotations.Test;

public class SumArrayTest {

     /* Task 3.
     1. Positive testing Happy path
     if (int[] array) is Input = {0, 1, 2, 3, 4, 5}
     return 15;
     */

    @Test
    public void testIntArraySumNumbers_HappyPath() {
        //AAA
        //arrange
        int[] array = {0, 1, 2, 3, 4, 5};

        int expectedResult = 15;

        //actual
        int actualResult = new SumArray().sumArray(array);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);

    }


     /* 2. Positive testing Happy path
     if (int[] array) is Input = {-7, -3}
     return -10;
     */

    @Test
    public void testIntArraySumNegativeNumbers_HappyPath() {
        //AAA
        //arrange
        int[] array = {-7, -3};

        int expectedResult = -10;

        //actual
        int actualResult = new SumArray().sumArray(array);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }
}
