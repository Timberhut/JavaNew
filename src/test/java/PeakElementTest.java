import org.testng.Assert;
import org.testng.annotations.Test;

public class PeakElementTest {
    /* Part 2 Algorithms
    Task 10.	Написать алгоритм PeakElement,
    который принимает на вход массив целых чисел и
    возвращает значения пиковых элементов (элементы, которые больше своих соседей).
Test Data:
{3, 2, 7, 5, 1, 9, 23, 1} → {3, 7, 23}
     */


        /*
      1. Positive testing Happy path
     if Array input {3, 2, 7, 5, 1, 9, 23, 1}
     return {3, 7, 23};
     */

@Test
    public void PeakElementFinder() {
        //AAA
        //arrange
        int[] array = {3, 2, 7, 5, 1, 9, 23, 1};

        int[] expectedResult = {3, 7, 23};

        //actual
        int[] actualResult = new PeakElement().peakElement(array);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    /*
      2. Positive testing Happy path
     if Array input {3, 2, 7, 5, 1, 9, -23, 1, -2, -1,-2, 0 , -1, 45, 55, 46, 90};
     return {3, 7, 9, 1, -1, 0, 55, 90};
     */


    @Test
    public void PeakElementFinder2() {
        //AAA
        //arrange
        int[] array = {3, 2, 7, 5, 1, 9, -23, 1, -2, -1,-2, 0 , -1, 45, 55, 46, 90};

        int[] expectedResult = {3, 7, 9, 1, -1, 0, 55, 90};

        //actual
        int[] actualResult = new PeakElement().peakElement(array);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

        /*
      3. Negative testing Happy path
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
        int[] actualResult = new PeakElement().peakElement(array);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }
}

