import org.testng.Assert;
import org.testng.annotations.Test;

public class IndexOfLetterFromStringTest {
        /*
     17. Напишите метод, который принимает строку и index,
     и возвращает численное значение буквы, которая находится
     на позиции index (использовать только один метод класса String)
     */

    @Test
    public void indexOfLetterFromStringTest1() {

        String str = "Hello World";
        int index = 4;

       int expectedResult = 111;

       int actualResult = new StringMethods().indexOfLetterFromString(str,index);

       Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void indexOfLetterFromStringTest2() {

        String str = "Hello World";
        int index = 0;

        int expectedResult = 72;

        int actualResult = new StringMethods().indexOfLetterFromString(str,index);

        Assert.assertEquals(actualResult,expectedResult);
    }
}
