import org.testng.Assert;
import org.testng.annotations.Test;

public class KthLargestTest {
        /*
    Part 2 Algorithms
    13. Написать алгоритм KthLargest, который принимает на вход
    массив целых чисел и число k, и возвращает k-тый максимальный элемент.
Test Data:
({4, 3, 7, 13, 5, 2, 9, 4, 12}, 3) → 9
 (13 и 12 - первый и второй самые большие элементы, а метод возвращает 9, как третий самый большой элемент)
     */


    /*
      1. Positive testing Happy path
     if Array input {4, 3, 7, 13, 5, 2, 9, 4, 12}, 3)
     return 9;
     */

    @Test
    public void arrayBiggestKNumFindTest() {
        //AAA
        //arrange
        int[] array = {4, 3, 7, 13, 5, 2, 9, 4, 12};

        int k = 3;

        int expectedResult = 9;

        //actual
        int actualResult = new KthLargest().kthLargest(array,k);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

        /*
      2. Positive testing Happy path
     if Array input {-4, -9, 0, 13, 100, 70, -7, 5, 87, 9, 95, 12}, 5)
     return 9;
     */

    @Test
    public void arrayBiggestKNumFindTest2() {
        //AAA
        //arrange
        int[] array = {-4, -9, 0, 13, 100, 70, 0, 5, 87, 9, 95, 12};

        int k = 2;

        int expectedResult = 95;

        //actual
        int actualResult = new KthLargest().kthLargest(array,k);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }
      /*
      3. Negative testing Happy path
     if Array input {1,5,7,3}, -1)
     return 0;
     */

    @Test
    public void arrayBiggestKNumFindTestNegativeK() {
        //AAA
        //arrange
        int[] array = {1,5,7,3};

        int k = -1;

        int expectedResult = 0;

        //actual
        int actualResult = new KthLargest().kthLargest(array,k);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }
          /*
      4. Negative testing Happy path
     if Array input empty {}, 1)
     return 0;
     */

    @Test
    public void arrayBiggestKNumIsEmpty() {
        //AAA
        //arrange
        int[] array = {};

        int k = 1;

        int expectedResult = 0;

        //actual
        int actualResult = new KthLargest().kthLargest(array,k);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

}
