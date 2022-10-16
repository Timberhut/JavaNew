import org.testng.Assert;
import org.testng.annotations.Test;

public class insertQuotes2Test {

            /*
         Напишите метод insertQuotes(), который принимает на вход две строки,
         и добавляет знак :  после слова “писал”, и оборачивает в кавычки вторую строку
         (результат строится с помощью метода concat())

         Test Data:
         “Федор Достоевский писал”, “Надо любить жизнь больше, чем смысл жизни.” →
         “Федор Достоевский писал: "Надо любить жизнь больше, чем смысл жизни."”
         Задание со звездочкой:
         “Наполеон Бонапарт писал”, “В моем словаре нет слова «невозможно».” →
         "Наполеон Бонапарт писал: "В моем словаре нет слова "невозможно".""
         */

    @Test
    public void insertQuotes2Test1 (){
        String str = "Федор Достоевский писал";
        String str2 = "\"Надо любить жизнь больше, чем смысл жизни.\"";

        String expectedResult = "Федор Достоевский писал: \"Надо любить жизнь больше, чем смысл жизни.\"";

        String actualResult = new StringMethods().insertQuotes(str,str2);

        Assert.assertEquals(expectedResult,actualResult);
    }

    @Test
    public void insertQuotes2Test2 (){
        String str = "Наполеон Бонапарт писал";
        String str2 = "\"В моем словаре нет слова «невозможно».\"";

        String expectedResult = "Наполеон Бонапарт писал: \"В моем словаре нет слова \"невозможно\".\"";

        String actualResult = new StringMethods().insertQuotes(str,str2);

        Assert.assertEquals(expectedResult,actualResult);
    }
}
