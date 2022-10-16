import org.testng.Assert;
import org.testng.annotations.Test;

public class HTTPRequestTest {


        @Test
        public void HTTPRequestTest() {
            //AAA
            //arrange
            String cityName = "London";
            String apiKey = "02a034f475aedac12ad58cd18d311059";

            String expectedResult = "https://api.openweathermap.org/data/2.5/weather?q=London&appid=02a034f475aedac12ad58cd18d311059";

            //actual
            String actualResult = new HTTPRequest().createRequest(cityName,apiKey);

            //Assert
            Assert.assertEquals(actualResult, expectedResult);
        }
    }

