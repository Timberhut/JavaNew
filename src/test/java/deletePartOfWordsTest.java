import org.testng.Assert;
import org.testng.annotations.Test;

public class deletePartOfWordsTest {

    @Test
    public void deletePartOfWordsTest() {
        String str = "Red rover";
        int indexA = 1;
        int indexB = 4;

        String expectedResult = "Rover";

        String actualResult = new StringMethods().deletePartOfWords(str,indexA,indexB);

        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void deletePartOfWordsTest1() {
        String str = "Abracadabra";
        int indexA = 3;
        int indexB = 5;

        String expectedResult = "Abrdabra";

        String actualResult = new StringMethods().deletePartOfWords(str,indexA,indexB);

        Assert.assertEquals(actualResult,expectedResult);

    }

    @Test
    public void deletePartOfWordsTest2() {
        String str = "Abracadabra";
        int indexA = 0;
        int indexB = 1;

        String expectedResult = "racadabra";

        String actualResult = new StringMethods().deletePartOfWords(str,indexA,indexB);

        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void deletePartOfWordsTest3() {
        String str = "Abracadabra";
        int indexA = 1;
        int indexB = 1;

        String expectedResult = "Aracadabra";

        String actualResult = new StringMethods().deletePartOfWords(str,indexA,indexB);

        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void deletePartOfWordsTest4() {
        String str = "Red rover";
        int indexA = 4;
        int indexB = 1;

        String expectedResult = "Rover";

        String actualResult = new StringMethods().deletePartOfWords(str,indexA,indexB);

        Assert.assertEquals(actualResult,expectedResult);
    }
}
