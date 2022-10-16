import java.util.Arrays;

public class SumOfTwo {
    /* Part 2 Algorithms
    14.	Написать алгоритм SumOfTwo, который принимает на вход массив целых чисел,
    и число n. Алгоритм возвращает пары элементов, которые в сумме дают число n.
Test Data:
({4, 3, 7, 12, 5, 2, 9, 4, 12}, 12)  → {{3, 9}, {7, 5}}
     */

    public String sumOfTwo(int[] array, int n) {

        int count = 0;
// вычисляем длину будущего массива
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] + array[i] == n) {
                    count++;
                }
            }
        }
// наполняем новый массив результатом вычислений
        int next = 0;
        int[][] result = new int[count][2];
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] + array[i] == n) {
                    result[next][1] = array[j];
                    result[next][0] = array[i];
                    next ++;
                }
            }
        }
        return (Arrays.deepToString(result));
    }


}

