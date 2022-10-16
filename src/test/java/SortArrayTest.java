import org.testng.Assert;
import org.testng.annotations.Test;

public class SortArrayTest {
        /* Part 2 Algorithms
    Task 12.	Написать алгоритм SortArray, который принимает на вход
    массив целых чисел, и сортирует элементы массива в порядке возрастания.

Test Data:
{4, 3, 7, 12, 5, 2, 9, 4, 12} → {2, 3, 4, 4, 5, 7, 9, 12, 12}
     */

    /*
      /*
     1. Positive testing Happy path
     if (int[] array) is Input = {4, 3, 7, 12, 5, 2, 9, 4, 12}
     return {2, 3, 4, 4, 5, 7, 9, 12, 12};
     */

    @Test
    public void SortArrayTest() {
        //AAA
        //arrange
        int[] array = {4, 3, 7, 12, 5, 2, 9, 4, 12};


        int[] expectedResult = {2, 3, 4, 4, 5, 7, 9, 12, 12};

        //actual
        int[] actualResult = new SortArray().sortArray(array);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);

    }

          /*
     2. Positive testing Happy path
     if (int[] array) is Input = {4, -12, 0, 7, -6, 3, 1, 54, -100, 100}
     return {-100, -12, -6, 0, 1, 3, 4, 7, 54, 100};
     */

    @Test
    public void SortArrayTest2() {
        //AAA
        //arrange
        int[] array = {4, -12, 0, 7, -6, 3, 1, 54, -100, 100};


        int[] expectedResult = {-100, -12, -6, 0, 1, 3, 4, 7, 54, 100};

        //actual
        int[] actualResult = new SortArray().sortArray(array);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);

    }

            /*
      3. Negative testing
     if Array input {};
     return {0};
     */

    @Test
    public void ArrayEmpty() {
        //AAA
        //arrange
        int[] array = {};

        int[] expectedResult = {0};

        //actual
        int[] actualResult = new SortArray().sortArray(array);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);

    }
}