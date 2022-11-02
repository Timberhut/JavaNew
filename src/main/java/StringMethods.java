public class StringMethods {

    public String removeSpaces(String str) {
            /*
            1. Написать метод removeSpaces(), который принимает на вход строку.
            Если строка не пустая (проверить методом класса String), то примените метод
            по удалению пробелов в начале и в конце строки.
            Догадаться, каким методом из видео можно проверить, были ли пробелы в строке.
            Если пробелы были, то метод должен удалить их и вернуть сообщение: “Лишние пробелы удалены”.
            Если пробелов не было, вернуть сообщение “Пробелов не было”.
            Если строка пустая (проверить методом класса String), вернуть сообщение “Строка пустая”.

            Test Data:
            “    Red Rover School   “ → “Лишние пробелы удалены”
            “Red Rover School“ → “Пробелов не было”
            “” → “Строка пустая”
            */

        if (str.isEmpty()) {
            return "String is empty";
        } else {
            if (str.indexOf(" ") == 0 || str.indexOf(" ") == str.length() - 1) {
                str.trim();

                return "Extra spaces removed";

            }
        }

        return "String not contain any spaces";
    }

    public String removeAllAs(String str) {
        /*
        2. Написать алгоритм removeAllAs().
        С помощью методов из видео1,  написать алгоритм, который принимает на вход строку.
        Если строка валидная, то метод удаляет все буквы "a" из строки, если таковые имеются.
        Метод возвращает обработанную строку.
        Test Data:
        “    Red Rover School   “ →  “Red Rover School“
        “panda   “ → “pnd”
        “taramasalata” → “trmslt”
         */

        if (str.isEmpty()) {

            return "String is empty";

        } else {

            return str.replace("a", "").trim();

        }
    }

    public String removeAllZeros(String str) {
        /*
        3. Написать алгоритм removeAllZeros().
        С помощью методов из видео1, написать алгоритм, который принимает на вход строку,
        состоящую из цифр. Если строка валидная, то метод удаляет все пробелы из строки,
        если таковые имеются. Метод возвращает обработанную строку, в которой нет нулей.
        Если в строке не было нулей, метод возвращает сообщение “This is a valid string”.
        Test Data:
        “3504209706040000 “ →  “35429764“
        “0000000111“ → “111”
        */

        if (!str.isEmpty()) { //валидация на пустую строку
            if (str.contains("0")) { //валидация на содержание 0 в строке
                int count = 0;
                for (int i = 0; i < str.length(); i++) { //валидация на отсутствие символов
                    if (str.charAt(i) >= '0' && str.charAt(i) <= '9' || str.charAt(i) == ' ') {
                        count++;
                    }
                }
                if (count < str.length()) {

                    return "String is contain some letter or symbol";

                } else {

                    return str.replace("0", "").trim(); //удаление внешних пробелов и 0-лей в строке
                }
            }

            return "This is a valid string";

        }

        return "String is empty";

    }

    public String removeAllSpaces(String str) {
        /*
        4. Написать алгоритм removeAllSpaces.
        С помощью методов из видео1, написать алгоритм,
        который принимает на вход строку. Если строка валидная,
        то метод удаляет все пробелы из строки, если таковые имеются.
        Метод возвращает обработанную строку.

        Test Data:
        “    R e d     Ro ve    r Sc   h ool   “ →  “RedRoverSchool“
        “p a     n   d a   “ → “panda”
        */

        if (str.isEmpty()) {
            return "String is empty";
        } else {

            return str.replace(" ", "").trim();

        }
    }

    public String countAs(String str) {
        /*
        5. Напишите метод countAs(), который принимает на вход строку
        и считает, сколько букв а или А содержится в строке. Метод
        возвращает количество букв a/A, и количество букв/знаков
        в слове без букв a/A. Итоговый результат должен строится
        с помощью метода из видео 2.

        Test Data:
        “Abracadabra” → “5, 6”
        “Homenum Revelio” → “0, 15”
        “3 tarAmasAlatA” → “6, 8”
        */

        int countA = 0, countB = 0;
        str = str.toLowerCase();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'а') { // а - (Eng and rus character)
                ++countA;
            } else {
                ++countB;
            }
        }

        return countA + ", " + countB;

    }

    public Boolean countJava(String str) {
        /*
        6. Напишите метод countJava(), который принимает на вход текст
        и проверяет, содержится ли в тексте хотя бы одно слово Java.

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

        return str.contains("Java");
    }

    public String insertQuotes(String str) {
        /*
        7. Напишите метод insertQuotes(), который принимает
        слово и возвращает строку, в которой это слово “обернуто” в кавычки:

        Test Data:
        “Abracadabra” →  ““Abracadabra””
         */

        return "\"" + str + "\"";
    }

    public String insertQuotes(String str, String str2) {
        /*
         8. Напишите метод insertQuotes(), который принимает на вход две строки,
         и добавляет знак :  после слова “писал”, и оборачивает в кавычки вторую строку
         (результат строится с помощью метода concat())

         Test Data:
         “Федор Достоевский писал”, “Надо любить жизнь больше, чем смысл жизни.” →
         “Федор Достоевский писал: "Надо любить жизнь больше, чем смысл жизни."”
         Задание со звездочкой:
         “Наполеон Бонапарт писал”, “В моем словаре нет слова «невозможно».” →
         "Наполеон Бонапарт писал: "В моем словаре нет слова "невозможно".""
         */

        if (str.contains("писал")) {
            str = str.replace("писал", "писал: ");
        }
        if (str2.contains("«") || str2.contains("»") || str2.contains("'")) {
            str2 = str2.replace("«", "\"");
            str2 = str2.replace("»", "\"");
            str2 = str2.replace("'", "\"");
        }

        return str.concat(str2);

    }

    public String cityName(String city) {
        /*
        9. Напишите метод, кoторый принимает на вход название города и исправляет написание:

        Test Data:
        “ташкент” → “Ташкент”
        “ЧикаГО” → “Чикаго”
        */

        city = city.toLowerCase();
        city = city.substring(0, 1).toUpperCase() + city.substring(1);

        return city;

    }

    public String betweenLetters(String str, char letter) {
        /*
        10. Напишите метод, который принимает на вход строку и букву-параметр,
        и возвращает все, что находится между первой и последней буквой-параметром:

        Test Data: “Abracadabra”, “b” → “bracadab”
        “Whippersnapper”, “p” → “ppersnapp”
         */

        if (str.indexOf(letter) != -1) {

            return str.substring(str.indexOf(letter), str.lastIndexOf(letter) + 1);

        }

        return "There is no word or letter you are looking for";

    }

    public Boolean sameLastAndFirstLetter(String str) {
        /*
        11. Напишите метод, который принимает на вход слово,
        и возвращает true, если слово начинается и
        заканчивается на одинаковую букву, и false иначе

        Test Data: “Abracadabra” → true, “Whippersnapper” → false
        */

        String str1 = str.toLowerCase();
        if (str1.charAt(0) == str1.charAt(str1.length() - 1)) {

            return true;

        } else {

            return false;
        }

    }

    public String twoWords(String str) {
        /*
        12. Напишите метод, который принимает на вход строку из двух слов,
        разделенных пробелом, и возвращает последнее слово

        Test Data: “Red Rover” → “Rover”
        */

        if (!(str.isEmpty())) { // валидация на не пустой стринг
            str = str.trim();  // удаляем лишние пробелы вокруг текста если есть

            int count = 0;
            int indexOfLastWord = 0;
            for (int i = 0; i <= str.length() - 1; i++) {
                if (str.charAt(i) == ' ') {
                    count++; // счетчик сколько всего слов разделенных пробелом
                    indexOfLastWord = i + 1; // от какого индекса печатаем последнее слово в строке
                }
            }
            if (count != 0) {

                return str.substring(indexOfLastWord);

            } else {

                return "String contain 1 word or only spaces";
            }

        } else {

            return "String not contain any words";
        }

    }

    public String deletePartOfWords(String str, int indexA, int indexB) {
        /*
        13. Написать метод, который принимает строку, и 2 индекса.
        Метод удаляет все, что находится между двумя индексами включительно

        Test Data: “Red rover”, 1, 4 → “Rover”
        */

        if (indexA > indexB) {
            int temp;
            temp = indexB;
            indexB = indexA;
            indexA = temp;
        }

        return str.substring(0, indexA) + str.substring(indexB + 1);

    }

    public String[] divideWordsToArray(String str) {

        /*
        14. Напишите метод, который принимает на вход предложение
        и возвращает слова из этого предложения в виде массива слов

        Test Data: “QA for Everyone” → {“QA”, “for”, “Everyone”}
        “Александр Сергеевич Пушкин” → {“Александр”, “Сергеевич”, “Пушкин”}
         */

        String[] parts = str.split(" ");

        return parts;

    }

    public String fullNameDivideWordsToArray(String str) {
        /*
        15. Написать метод, который принимает на вход предложение,
        которое состоит из имени, фамилии, отчества и возвращает текст:

        Test Data:
        “Александр Сергеевич Пушкин” →
        “Имя: Александр
        Отчество: Сергеевич
        Фамилия: Пушкин”
    */

        if (!str.isEmpty()) { // валидация не пустой строки
            str = str.toLowerCase().trim();
            str = str.substring(0, 1).toUpperCase() + str.substring(1);
            str = str.replaceAll("( +)", " "); // замена лишних пробелов на 1 пробел


            String[] parts = str.split(" "); // перевод слов в эл.массива с разделением по пробелу
            if (parts.length == 3) { // проверка на наличие 3-х составляющих ФИО

                for (int i = 0; i < parts.length; i++) { // переводим каждую первую букву ФИО в заглавную
                    parts[i] = parts[i].substring(0, 1).toUpperCase() + parts[i].substring(1);
                }

                return "Имя: " + parts[0] + "\nОтчество: " + parts[1] + "\nФамилия: " + parts[2];

            } else {

                return "Incorrect format name";
            }

        } else {

            return"String is empty";

        }

    }

    public String repeatStringNtimes(String str, int repeat) {
   /*
    16. Написать метод, который принимает на вход слово и число n,
    и возвращает строку, где слово повторяется n раз.

    Test Data: “one”, 5 → “oneoneoneoneone”
    */
        return str.repeat(repeat);
    }

    public int indexOfLetterFromString(String str, int index) {
    /*
     17. Напишите метод, который принимает строку и index,
     и возвращает численное значение буквы, которая находится
     на позиции index (использовать только один метод класса String)
     */
        return str.codePointAt(index);
    }

    public Boolean threeWords(String str1, String str2, String str3) {
        /*
         18. Написать метод, который принимает 3 слова, и сравнивает их методом,
         который считает, что прописные и заглавные буквы - это одни и те же буквы.
         Метод возвращает true, если все слова одинаковы, и метод возвращает false, если слова не одинаковы:

         Test Data:
         “one”, “One”, “ONE”  → true
         “one”, “Один”, “ONE” → false
         */
        str1 = str1.toLowerCase().trim();
        str2 = str2.toLowerCase().trim();
        str3 = str3.toLowerCase().trim();

        if (str1.equals(str2) && str1.equals(str3)) {

            return true;

        } else {

            return false;

        }
    }
}











