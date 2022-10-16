import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateUniqueArrayTest {
    /*
    В классе CreateArray написать метод createUniqueArray(), который принимает массив
     целых положительных чисел больше 0, и возвращает массив уникальных чисел.
Например, createUniqueArray({1, 2, 1, 5, 23, 90, 3, 43, 23, 1})
 ->{1, 2, -1, 5, 23, 90, 3, 43, -1, -1})
{1, 2, 5, 23, 90, 3, 43}

     */

     /*
      1. Positive testing Happy path
     if Array input {1, 2, 1, 5, 23, 90, 3, 43, 23, 1}
     return {1, 2, 5, 23, 90, 3, 43};
     */

    @Test
    public void arrayReturnUniqueNums() {
        //AAA
        //arrange
        int[] array = {1, 2, 1, 5, 23, 90, 3, 43, 23, 1};

        int[] expectedResult = {1, 2, 5, 23, 90, 3, 43};

        //actual
        int[] actualResult = new CreateUniqueArray().createUniqueArray(array);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);

    }

          /*
      2. Positive testing Happy path
     if Array input {1,5,7,3,5,7}
     return {1,5,7,3};
     */

    @Test
    public void arrayReturnUniqueNums2() {
        //AAA
        //arrange
        int[] array = {1,5,7,3,5,7};

        int[] expectedResult = {1, 5, 7, 3};

        //actual
        int[] actualResult = new CreateUniqueArray().createUniqueArray(array);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);

    }

              /*
      3. Negative testing Happy path
     if Array input empty {},
     return 0;
     */
              @Test
              public void arrayEmpty() {
                  //AAA
                  //arrange
                  int[] array = {};

                  int[] expectedResult = {0};

                  //actual
                  int[] actualResult = new CreateUniqueArray().createUniqueArray(array);

                  //Assert
                  Assert.assertEquals(actualResult, expectedResult);

              }


              /*
      4. Negative testing Happy path
     if in Array input negative num)
     return 0;
     */

    @Test
    public void arrayWithNegativeNum() {
        //AAA
        //arrange
        int[] array = {1,5,-7,3,5,7};;

        int[] expectedResult = {0};

        //actual
        int[] actualResult = new CreateUniqueArray().createUniqueArray(array);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);

    }


}
