import java.util.Arrays;

public class MinMaxAve {
    /* Part 2. Task 8 Написать алгоритм MinMaxAve, который принимает массив чисел int[]
    и 2 значения индексов. Алгоритм возвращает массив, который содержит минимальное значение,
    максимальное значение, и среднее среди всех значений между 2-мя индексами.

Test Data:
({1, 2, 3, 4, 5, 6, 7, 8}, 2, 6) →  {3, 7, 5}
     */

    public int[] minMaxAve(int[] array, int indexA, int indexB) {
// валидация входных данных
        if (array.length != 0 && indexA >= 0 && indexB >= 0) {

            int minArrayValue = array[indexA];
            int maxArrayValue = array[indexA];
            int sum = 0;
            int average;
// проверка и алгоритм в какой последовательности будем проверять массив (слева на право или наоборот)
            if (indexA >= indexB) {
                int temp;
                temp = indexA;
                indexA = indexB;
                indexB = temp;
            }
// вычисление макс и мин значений в заданном диапазоне + среднее значение)
            for (int i = indexA; i <= indexB; i++) {
                sum += array[i];
                if (array[i] <= minArrayValue) {
                    minArrayValue = array[i];
                }
                if (array[i] >= maxArrayValue) {
                    maxArrayValue = array[i];
                }
            }
            average = sum / ((indexB + 1) - indexA);


            return new int[]{minArrayValue, maxArrayValue, average};

        } else {

            return null;

        }
    }
}




