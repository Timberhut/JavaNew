import org.testng.Assert;
import org.testng.annotations.Test;

public class IsPositiveNumberTest {

    /*
    Проверьте работу метода на числах 555, 0 и -555
     */

    /* Task 5.
    Test Data: 555, 0, -555

     1. Positive testing Happy path
     if (int anyNum > 0 )
     return true;
     */

    @Test
    public void testAnyNumMoreThanNull_HappyPath() {
        //AAA
        //arrange
        int anyNum = 555;

        boolean expectedResult = true;

        //actual
        boolean actualResult = new IsPositiveNumber().isPositiveNumber(anyNum);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

         /*
         2. Positive testing Happy path
     if (int anyNum < 0 )
            return false;
     */

    @Test
    public void testAnyNumLessThanNull_HappyPath() {
        //AAA
        //arrange
        int anyNum = -555;

        boolean expectedResult = false;

        //actual
        boolean actualResult = new IsPositiveNumber().isPositiveNumber(anyNum);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

             /*
         3. Positive testing Happy path
     if (int anyNum = 0 )
            return true;
     */

    @Test
    public void testAnyNumEqualNull_HappyPath() {
        //AAA
        //arrange
        int anyNum = 0;

        boolean expectedResult = true;

        //actual
        boolean actualResult = new IsPositiveNumber().isPositiveNumber(anyNum);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }
}
