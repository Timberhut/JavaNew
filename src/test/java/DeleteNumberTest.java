import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;

public class DeleteNumberTest {
    /*
    Написать метод deleteNumber, который принимает на вход массив
    целых чисел и число number. Удалите все вхождения числа number
    из массива (пропусков быть не должно).
    ({0,1,2,2,3,0,4,2}, 2) -> {0, 1, 3, 0, 4}
     */

      /*
     1. Positive testing Happy path
     if (int[] array) is Input = {0,1,2,2,3,0,4,2}, 2)
     return {0, 1, 3, 0, 4}
     */

    @Test
    public void CreateArrayTest1() {
        //AAA
        //arrange
        int[] array = {0,1,2,2,3,0,4,2};
        int n = 2;



        int[] expectedResult = {0, 1, 3, 0, 4};

        //actual
        int[] actualResult = new DeleteNumber().deleteNumber(array,n);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }
         /*
     2. Positive testing Happy path
     if (int[] array) is Input = {0,0,0,2,3,-5,4,-5,9,56,-5}, -5)
     return {0,0,0,2,3,4,9,56}
     */

    @Test
    public void CreateArrayTest2() {
        //AAA
        //arrange
        int[] array = {0,0,0,2,3,-5,4,-5,9,56,-5};
        int n = -5;

        int[] expectedResult = {0,0,0,2,3,4,9,56};

        int[] actualResult = new DeleteNumber().deleteNumber(array,n);

        Assert.assertEquals(actualResult, expectedResult);
    }

   /*
         3. Negative testing Happy path
     if (int[] array) is Input = {}, 2)
            return {}
     */

    @Test
    public void CreateArrayTest3() {
        //AAA
        //arrange
        int[] array = {};
        int n = 2;

        int[] expectedResult = {};

        //actual
        int[] actualResult = new DeleteNumber().deleteNumber(array,n);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

             /*
         4. Positive testing Happy path
     if (int[] array) is Input = {1,2,3}, 40)
            return {1,2,3}
     */

    @Test
    public void CreateArrayTest4() {
        //AAA
        //arrange
        int[] array = {1,2,3};
        int n = 40;

        int[] expectedResult = {1,2,3};

        //actual
        int[] actualResult = new DeleteNumber().deleteNumber(array,n);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }
}
