import org.testng.Assert;
import org.testng.annotations.Test;

public class OddIndicesTest {


    /*1. Positive testing Happy path
     if (int[] array) is Input = {-45, 590, 234, 985, 12, 68}
     return [590, 985, 68];
     */

    @Test
    public void testIntArrayReturnOddIndexNumbers_HappyPath() {
        //AAA
        //arrange
        int[] array = {-45, 590, 234, 985, 12, 68};

        int[] expectedResult = {590, 985, 68};

        //actual
        int[] actualResult = new OddIndices().oddIndices(array);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }


    //2. Positive testing Happy path
    // if (int[] array) is empty = {}
    // return null;

    @Test
    public void testIntEmptyArrayReturnNull_HappyPath() {
        //AAA
        //arrange
        int[] array = {};

        int[] expectedResult = null;

        //actual
        int[] actualResult = new OddIndices().oddIndices(array);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }
}
