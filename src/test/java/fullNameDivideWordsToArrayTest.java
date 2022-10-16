import org.testng.Assert;
import org.testng.annotations.Test;

public class fullNameDivideWordsToArrayTest {


    @Test
    public void fullNameDivideWordsTest() {

        String str = "Александр Сергеевич Пушкин";

        String expectedResult = "Имя: Александр\n" + "Отчество: Сергеевич\n" + "Фамилия: Пушкин";

        String actualResult = new StringMethods().fullNameDivideWordsToArray(str);

        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void fullNameDivideWordsUnexpectedSpacesTest2() {

        String str = "   алЕксАндр       сергЕеВич       пуШкИн";

        String expectedResult = "Имя: Александр\n" + "Отчество: Сергеевич\n" + "Фамилия: Пушкин";

        String actualResult = new StringMethods().fullNameDivideWordsToArray(str);

        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void fullNameDivideWordsCorrectUpperLowerCaseTest3() {

        String str = "алЕксАндр Сергеевич       пуШкИн  ";

        String expectedResult = "Имя: Александр\n" + "Отчество: Сергеевич\n" + "Фамилия: Пушкин";

        String actualResult = new StringMethods().fullNameDivideWordsToArray(str);

        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void notFullNameDivideWordsTest4() {

        String str = "Александр Пушкин";

        String expectedResult = "Incorrect format name";

        String actualResult = new StringMethods().fullNameDivideWordsToArray(str);

        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void emptyfullNameDivideWordsTest5() {

        String str = "";

        String expectedResult = "String is empty";

        String actualResult = new StringMethods().fullNameDivideWordsToArray(str);

        Assert.assertEquals(actualResult,expectedResult);
    }
}
