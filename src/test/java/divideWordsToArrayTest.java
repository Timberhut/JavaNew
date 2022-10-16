import org.testng.Assert;
import org.testng.annotations.Test;

public class divideWordsToArrayTest {
    /*
    Test Data:
    “QA for Everyone” → {“QA”, “for”, “Everyone”}
    “Александр Сергеевич Пушкин” → {“Александр”, “Сергеевич”, “Пушкин”}
    */

    @Test
    public void divideWordsToArrayTest() {

        String str = "QA for Everyone";

        String[] expectedResult = {"QA", "for", "Everyone"};

        String[] actualResult = new StringMethods().divideWordsToArray(str);

        Assert.assertEquals(actualResult,expectedResult);
    }



    @Test
    public void divideWordsToArrayTest1() {

        String str = "Александр Сергеевич Пушкин";

        String[] expectedResult = {"Александр", "Сергеевич", "Пушкин"};

        String[] actualResult = new StringMethods().divideWordsToArray(str);

        Assert.assertEquals(actualResult,expectedResult);
    }
}
