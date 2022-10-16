import org.testng.Assert;
import org.testng.annotations.Test;

public class OddEvenTest {

    //Task 1. //    Test Data: -345 → “Odd”; 0 → “Even”; 222222 → “Even”

    // 1. Positive testing Happy path
    // if (int toCheckOddEvenNumber) is even
    // return "Even";

    @Test
    public void testIntToCheckOddEvenNumberIsEven_HappyPath() {
        //AAA
        //arrange
        int toCheckOddEvenNumber = 222222;

        String expectedResult = "Even";

        //actual
        String actualResult = new OddEven().oddEven(toCheckOddEvenNumber);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);

    }

    //2. Positive testing Happy path
    // if (int toCheckOddEvenNumber) is 0 (Even)
    // return "Even";
    @Test
    public void testIntToCheckOddEvenNumberIsEven0_HappyPath() {
        //AAA
        //arrange
        int toCheckOddEvenNumber = 0;

        String expectedResult = "Even";

        //actual
        String actualResult = new OddEven().oddEven(toCheckOddEvenNumber);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);

    }
    //3. Positive testing Happy path
    // if (int toCheckOddEvenNumber) is Odd
    // return "Odd";

    @Test
    public void testIntToCheckOddEvenNumberIsOdd_HappyPath() {
        //AAA
        //arrange
        int toCheckOddEvenNumber = -345;

        String expectedResult = "Odd";

        //actual
        String actualResult = new OddEven().oddEven(toCheckOddEvenNumber);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);

    }
}








