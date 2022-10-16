import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;

public class SumOfTwoTest {

    /* Part 2 Algorithms
    14.	Написать алгоритм SumOfTwo, который принимает на вход массив целых чисел,
    и число n. Алгоритм возвращает пары элементов, которые в сумме дают число n.

    Test Data:
    ({4, 3, 7, 12, 5, 2, 9, 4, 12}, 12)  → {{3, 9}, {7, 5}}
     */

   /*
   1. Positive test
   in array and num n -> {4, 3, 7, 12, 5, 2, 9, 4, 12}, 12)
   return → {{3, 9}, {7, 5}}
   */

    @Test
    public void SumOfTwoTest1() {
        int[] array = {4, 3, 7, 12, 5, 2, 9, 4, 12};
        int n = 12;
        int[][] result = {{3, 9}, {7, 5}};

        String expectedResult = Arrays.deepToString(result);

        //actual
       String actualResult = (new SumOfTwo().sumOfTwo(array,n));

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    /*
    2. Positive test
    in array and num n -> {3, 6, -7, 45, 6, 12, 5, 10, 9, 4, 12}, 15)
    return → {{12, 3}, {12, 3}, {9, 6}, {9, 6}, {10, 5}}
    */

    @Test
    public void SumOfTwoTest2() {
        int[] array = {3, 6, -7, 45, 6, 12, 5, 10, 9, 4, 12};
        int n = 15;
        int[][] result = {{3, 12}, {3, 12}, {6, 9}, {6, 9}, {5, 10}};

        String expectedResult = Arrays.deepToString(result);

        //actual
        String actualResult = (new SumOfTwo().sumOfTwo(array,n));

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    /*
    2. Negative test
    in array and num n -> {3, 6, -7, 45, 6, 12, 5, 10, 9, 4, 12}, 15)
    return → {{12, 3}, {12, 3}, {9, 6}, {9, 6}, {10, 5}}
    */

    @Test
    public void SumOfTwoEmptyArray() {
        int[] array = {};
        int n = 15;
        int[][] result = {};

        String expectedResult = Arrays.deepToString(result);

        //actual
        String actualResult = (new SumOfTwo().sumOfTwo(array,n));

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }
}
