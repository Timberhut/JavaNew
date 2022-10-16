import org.testng.Assert;
import org.testng.annotations.Test;

public class MinMaxAveTest {
        /* Part . Task 8.
     1. Positive testing Happy path
     if Array = {1, 2, 3, 4, 5, 6, 7, 8}; and  indexA = 2 < indexB = 6,
     return {3, 7, 5};
     */

    @Test
    public void MinMaxAveTestIfIndexALessThanIndexB_HappyPath() {
        //AAA
        //arrange
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8};

        int indexA = 2;
        int indexB = 6;

        int[] expectedResult = {3, 7, 5};

        //actual
        int[] actualResult = new MinMaxAve().minMaxAve(array,indexA,indexB);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);

    }

        /*
     2. Positive testing Happy path
     if Array = {8,7,6,5,4,3,2,1}; and  indexA = 6 > indexB = 2,
     return {2, 6, 4};
     */

    @Test
    public void MinMaxAveTestIfIndexAMoreThanIndexB_HappyPath() {
        //AAA
        //arrange
        int[] array = {8,7,6,5,4,3,2,1};

        int indexA = 6;
        int indexB = 2;

        int[] expectedResult = {2, 6, 4};

        //actual
        int[] actualResult = new MinMaxAve().minMaxAve(array,indexA,indexB);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);

    }

     /*
     3. Positive testing Happy path
     if (int[] array, indexA = 2,indexB = 2);) is Input = {8,7,6,5,4,3,2,1};
     return {6, 6, 6};;
     */

    @Test
    public void MinMaxAveTestIfIndexAEqualIndexB_HappyPath() {
        //AAA
        //arrange
        int[] array = {8,7,6,5,4,3,2,1};

        int indexA = 2;
        int indexB = 2;

        int[] expectedResult = {6, 6, 6};

        //actual
        int[] actualResult = new MinMaxAve().minMaxAve(array,indexA,indexB);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);

    }

       /*
     4. Positive testing Happy path
     if (int[] array, indexA = 2,indexB = 2);) is Input = {8,7,6,5,4,3,2,1};
     return {6, 6, 6};;
     */

    @Test
    public void MinMaxAveTestWithNegativeNumInArray_HappyPath() {
        //AAA
        //arrange
        int[] array = {-8,7,-6,-8,12,0,5,3,4,-1};

        int indexA = 5;
        int indexB = 0;

        int[] expectedResult = {-8, 12, 0};

        //actual
        int[] actualResult = new MinMaxAve().minMaxAve(array,indexA,indexB);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);

    }

        /* 5. Negative testing
     if array  = {1, 2, 3, 4, 5, 6, 7, 8}; indexA = -5,indexB = 0);)
     return null;;
     */

    @Test
    public void MinMaxAveTestArrayWithNegativeIndexA_HappyPath() {
        //AAA
        //arrange
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8};

        int indexA = -5;
        int indexB = 0;

        int[] expectedResult = null;

        //actual
        int[] actualResult = new MinMaxAve().minMaxAve(array,indexA,indexB);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);

    }
    /* 6. Negative testing
     if array  = {1, 2, 3, 4, 5, 6, 7, 8}; indexA = 3,indexB = -1);)
     return null;;
     */

    @Test
    public void MinMaxAveTestArrayWithNegativeIndexB_HappyPath() {
        //AAA
        //arrange
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8};

        int indexA = 3;
        int indexB = -1;

        int[] expectedResult = null;

        //actual
        int[] actualResult = new MinMaxAve().minMaxAve(array,indexA,indexB);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);

    }
     /* 7. Negative testing
     if array  = {}; indexA = 3,indexB = 0);)
     return null;;
     */

    @Test
    public void MinMaxAveTestWithEmptyArray_HappyPath() {
        //AAA
        //arrange
        int[] array = {};

        int indexA = 3;
        int indexB = 0;

        int[] expectedResult = null;

        //actual
        int[] actualResult = new MinMaxAve().minMaxAve(array,indexA,indexB);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);

    }
}
