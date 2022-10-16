import org.testng.Assert;
import org.testng.annotations.Test;

public class countJavaTest {
    /*
    Test Data:
    “As of March 2022, Java 18 is the latest version, while Java 17,
    11 and 8 are the current long-term support (LTS) versions.
    Oracle released the last zero-cost public update for the
    legacy version Java 8 LTS in January 2019 for commercial use,
    although it will otherwise still support Java 8 with public
    updates for personal use indefinitely. Other vendors have
    begun to offer zero-cost builds of OpenJDK 8 and 11 that are
    still receiving security and other upgrades.” → true

    “99 little bugs in a code.
    99 little bugs in a code.
    Take one down, and patch it around.
    235 critical bugs in the code.” → false
    */

    @Test
    public void countJavaTest1(){
        String str = "As of March 2022, Java 18 is the latest version, while Java 17, \n" +
                "11 and 8 are the current long-term support (LTS) versions. \n" +
                "Oracle released the last zero-cost public update for the \n" +
                "legacy version Java 8 LTS in January 2019 for commercial use, \n" +
                "although it will otherwise still support Java 8 with public \n" +
                "updates for personal use indefinitely. Other vendors have \n" +
                "begun to offer zero-cost builds of OpenJDK 8 and 11 that are \n" +
                "still receiving security and other upgrades.";

        Boolean expectedResult = true;

        Boolean actualResult = new StringMethods().countJava(str);

        Assert.assertEquals(expectedResult,actualResult);
    }

    @Test
    public void countJavaTest2(){
        String str = "99 little bugs in a code.\n" +
                "99 little bugs in a code.\n" +
                "Take one down, and patch it around.\n" +
                "235 critical bugs in the code.";

        Boolean expectedResult = false;

        Boolean actualResult = new StringMethods().countJava(str);

        Assert.assertEquals(expectedResult,actualResult);
    }
}
