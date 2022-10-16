import java.util.Arrays;

public class SortArray {
    /*
    12.	Написать алгоритм SortArray, который принимает на вход
    массив целых чисел, и сортирует элементы массива в порядке возрастания.

Test Data:
{4, 3, 7, 12, 5, 2, 9, 4, 12} → {2, 3, 4, 4, 5, 7, 9, 12, 12}
     */

    public int[] sortArray (int[] array){
// валидация массива (пустой - не пустой)
        if (array.length > 0) {
//создаем пустой int контейнер для присвоения наименьшего эл-та
        int temp;
// проверка массива с присвоением наименьшего числа в Temp int и переменой мест наименьшей и текущей переменной
        for(int i = 0; i < array.length; i ++) {
            temp = array[i]; // присваиваем Temp текущее значение каждой проверки
            for(int j = i + 1; j < array.length; j ++) {
                if (array[i] > array[j]) {
                    temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }
        }

       return array;

    }

        return new int[]{0};

    }
}

