import org.testng.Assert;
import org.testng.annotations.Test;

public class ReverseArrayTest {
    /*
Part 2 Algorithms Task 11.Написать алгоритм ReverseArray,
который принимает на вход массив целых чисел, и возвращает “перевернутый” массив.
Test Data:
{2, 7, 3, 10} → {10, 3, 7, 2}
 */

    /*
   1. Positive testing Happy path
   if (int[] array) is Input = {2, 7, 3, 10}
   return {10, 3, 7, 2};
   */
@Test
public void testArrayReverse_HappyPath() {
    //AAA
    //arrange
    int[] array = {2, 7, 3, 10};

    int[] expectedResult = {10, 3, 7, 2};

    //actual
    int [] actualResult = new ReverseArray().reverseArray(array);

    //Assert
    Assert.assertEquals(actualResult, expectedResult);
}
   /*2. Positive testing Happy path
   if (int[] array) is Input = {2, 7, 3, 10}
   return {10, 3, 7, 2};
   */
    @Test
    public void testArrayReverseWithNegativeDigits_HappyPath() {
        //AAA
        //arrange
        int[] array = {-9,-7,65,4556,54};

        int[] expectedResult = {54,4556,65,-7,-9};

        //actual
        int [] actualResult = new ReverseArray().reverseArray(array);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);

    }
    /*3. Negative testing Happy path
   if (int[] array) is empty Input = {}
   return {};
   */
    @Test
    public void testArrayReverseEmptyArray_HappyPath() {
        //AAA
        //arrange
        int[] array = {};

        int[] expectedResult = {};

        //actual
        int [] actualResult = new ReverseArray().reverseArray(array);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);

    }
}
