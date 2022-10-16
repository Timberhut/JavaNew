import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;

public class CreateArrayTest {

   /*
    В классе CreateArray написать метод getPhoneNumberAndCountry(),
    который принимает массив из 11 целых положительных чисел от 0 до 9,
    и возвращает массив, который содержит номер телефона, состоящий из этих чисел,
    и название страны, которой номер принадлежит.
    Например:
    getPhoneNumberAndCountry({1, 8, 0, 0, 1, 2, 3, 4, 5, 6, 7}) -> {“1(800)123-45-67”, “USA”}
    */

    /*
     1. Positive testing Happy path
     if (int[] array) is Input = {1, 8, 0, 0, 1, 2, 3, 4, 5, 6, 7}
     return {“1(800)123-45-67”, “USA”}
     */

    @Test
    public void CreateArrayTest1() {
        //AAA
        //arrange
        int[] array = {1, 8, 0,0, 1, 2, 3, 4, 5, 6, 7};



        String expectedResult = Arrays.deepToString(new String[]{"1(800)123-45-67", "USA"});

        //actual
        String actualResult = new CreateArray().getPhoneNumberAndCountry(array);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

          /*
     2. Negative testing Happy path
     if (int[] array) is Input = {1, 8, 0, 0, 1, 92, 3, 4, 5, 6, 7}
     return {“ERROR”}
     */

    @Test
    public void CreateArrayTest2() {
        //AAA
        //arrange
        int[] array = {1, 8, 0, 0, 1, 92, 3, 4, 5, 6, 7};

        String expectedResult = "ERROR";

        //actual
        String actualResult = new CreateArray().getPhoneNumberAndCountry(array);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

          /*
     3.  Negative testing Happy path
     if (int[] array) is Input = {1, 8, 0, 1, 2, 3, 4, 5, 6, 7}; 10 NUM
     return "ERROR";
     */

    @Test
    public void CreateArrayTest3() {
        //AAA
        //arrange
        int[] array = {1, 8, 0, 1, 2, 3, 4, 5, 6, 7};

        String expectedResult = "ERROR";

        //actual
        String actualResult = new CreateArray().getPhoneNumberAndCountry(array);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }
         /*
         4.  Negative testing Happy path
     if (int[] array) is Input = {1, 8, 0, 0, 1, 1, 2, 3, 4, 5, 6, 7}; 12 NUM
     return "ERROR";
     */

    @Test
    public void CreateArrayTest4() {
        //AAA
        //arrange
        int[] array = {1, 8, 0, 0, 1, 1, 2, 3, 4, 5, 6, 7};

        String expectedResult = "ERROR";

        //actual
        String actualResult = new CreateArray().getPhoneNumberAndCountry(array);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

             /*
         5.  Negative testing Happy path
     if (int[] array) is Input = {0, 8, 0, 0, 1, 1, 2, 3, 4, 6, 7}; REGION CODE 0
     return "ERROR";
     */

    @Test
    public void CreateArrayTest5() {
        //AAA
        //arrange
        int[] array = {0, 8, 0, 0, 1, 1, 2, 3, 4, 6, 7};

        String expectedResult = "ERROR";

        //actual
        String actualResult = new CreateArray().getPhoneNumberAndCountry(array);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

                 /*
         6.  Negative testing Happy path
     if (int[] array) is Input = {0, -1, 0, 0, 1, 1, 2, 3, 4, 6, 7}; NEGATIVE NUM IN ARRAY
     return "ERROR";
     */

    @Test
    public void CreateArrayTest6() {
        //AAA
        //arrange
        int[] array = {0, -1, 0, 0, 1, 1, 2, 3, 4, 6, 7};

        String expectedResult = "ERROR";

        //actual
        String actualResult = new CreateArray().getPhoneNumberAndCountry(array);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

      /*
     1. Positive testing Happy path
     if (int[] array) is Input = {7, 8, 0, 0, 1, 2, 3, 4, 5, 6, 7}
     return {“7(800)123-45-67”, “Russia”}
     */

    @Test
    public void CreateArrayTest7() {
        //AAA
        //arrange
        int[] array = {7, 8, 0,0, 1, 2, 3, 4, 5, 6, 7};



        String expectedResult = Arrays.deepToString(new String[]{"7(800)123-45-67", "Russia"});

        //actual
        String actualResult = new CreateArray().getPhoneNumberAndCountry(array);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

}
