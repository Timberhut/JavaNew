import project_utils.Utils;
import java.util.Arrays;

public class CreateArray {
    /*
    В классе CreateArray написать метод getPhoneNumberAndCountry(),
    который принимает массив из 11 целых положительных чисел от 0 до 9,
    и возвращает массив, который содержит номер телефона, состоящий из этих чисел,
    и название страны, которой номер принадлежит.
Например:
getPhoneNumberAndCountry({1, 8, 0, 0, 1, 2, 3, 4, 5, 6, 7}) -> {“1(800)123-45-67”, “USA”}
     */
    String getPhoneNumberAndCountry(int[] array) {
        String[] result = new String[2];
        String erResult = "";

//валидация входящего массива
        if (array.length != 11 || array[0] == 0) {
            erResult = "ERROR";
        }
            for (int i = 0; i < array.length; i++) {
                if (array[i] < 0 || array[i] >= 10) {
                    erResult = "ERROR";
                }
            }
        if (erResult != "ERROR") {
// преобразуем array в формат телефонного номера in String
         /* String phoneNum = String.valueOf(array[0]);
            phoneNum += "(";
            for (int i = 1; i < 4; i++) {
                phoneNum += String.valueOf(array[i]);
            }
            phoneNum += ")";
            for (int i = 4; i < 7; i++) {
                phoneNum += String.valueOf(array[i]);
            }
            phoneNum += "-";
            for (int i = 7; i < 9; i++) {
                phoneNum += String.valueOf(array[i]);
            }
            phoneNum += "-";
            for (int i = 9; i <= 10; i++) {
                phoneNum += String.valueOf(array[i]);
            } */
         String phoneNum = new Utils().numRec(array);

// вычисляем код страны (по условиям задачи, код не может быть длиннее одной цифры, иначе длинна массива это не номер тел.)
            String country = "";
            switch (array[0]) {
                case 1:
                    country += "USA";
                    break;
                case 2:
                    country += "Africa";
                    break;
                case 3:
                    country += "Europe";
                    break;
                case 4:
                    country += "Europe";
                    break;
                case 5:
                    country += "South America, Mexico";
                    break;
                case 6:
                    country += "Australia";
                    break;
                case 7:
                    country += "Russia";
                    break;
                case 8:
                    country += "Japan";
                    break;
                case 9:
                    country += "West and South Asia, Middle East";
                    break;
            }
            result[0] = phoneNum;
            result[1] = country;

            return Arrays.toString(result);

        } else return erResult;

    }
}








