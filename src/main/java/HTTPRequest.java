public class HTTPRequest {
    /*
    Следуя инструкциям с урока (вкладка Network in Chome DevTools)
    изучите response с 8-дневным прогнозом погоды и поймите, откуда берутся какие данные в интерфейсе
На сайте openWeather.com найдите в документации названия городов на языках,
которые поддерживаются в запросах (geocoding). Найдите и скопируйте, как называется город Лондон на языках
Greek "el": "Λονδίνο",
Persian (Farsi) fa": "لندن",
Hindi "hi": "लंदन",
French "fr": "Londres",
English "en": "London",

В классе HTTPRequest:
8. Создать переменные типа String с названиями города Лондон на перечисленных выше языках.
9. Создать метод createRequest(), который принимает на вход параметры:
String cityName
String apiKey
Метод возвращает строку запроса по названию города
(шаблон запроса нужно взять в документации), вставляя необходимые параметры в шаблон.
Метод так же печатает созданные запросы на разных языках.
Скопируйте полученные строки запросов, сделайте запросы в браузере, и сравните ответы, совпадают ли они или нет.

https://api.openweathermap.org/data/2.5/weather?q=London&appid=02a034f475aedac12ad58cd18d311059
     */

    public String createRequest (String cityName, String apiKey) {

        String greek = "Λονδίνο";
        String farsi = "لندن";
        String hindi = "लंदन";
        String french = "Londres";
        String english = "London";
        String key = "02a034f475aedac12ad58cd18d311059";
        String[] leng = {greek,farsi,hindi,french,english};

        String result = "https://api.openweathermap.org/data/2.5/weather?q=" + cityName + "&appid=" + apiKey;

        if (cityName.equals("London")){
            for (String el:leng) {
        System.out.println("https://api.openweathermap.org/data/2.5/weather?q=" + el + "&appid=" + apiKey);
            }
        }
        return result;
    }
}
