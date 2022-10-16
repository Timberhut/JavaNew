public class PeakElement {

    /* Part 2 Algorithms
    Task 10.	Написать алгоритм PeakElement,
    который принимает на вход массив целых чисел и
    возвращает значения пиковых элементов (элементы, которые больше своих соседей).
Test Data:
{3, 2, 7, 5, 1, 9, 23, 1} → {3, 7, 23}
     */

    public int[] peakElement(int[] array) {
// валидация массива (не пустой, нет отрицательных чисел)
        if (array.length > 0) {

// вычисляем длину будущего массива
            //int a = array.length;
            int count = 0;
            if (array[0] > array[1]) {
                count++;
            }
            for (int i = 1; i <= array.length - 2; i++) {
                if (array[i] > array[i - 1] && array[i] > array[i + 1]) {
                    count++;
                }
            }
            if (array[array.length - 1] > array[array.length - 2]) {
                count++;
            }
// создаем и наполняем массив требуемыми значениями
            int[] resultArray = new int[count];
            int j = 1;
            if (array[0] > array[1]) {
                resultArray[0] = array[0];
            }
            for (int i = 1; i <= array.length - 2; i++) {
                if (array[i] > array[i - 1] && array[i] > array[i + 1]) {
                    resultArray[j] = array[i];
                    j++;
                }
            }
            if (array[array.length - 1] > array[array.length - 2]) {
                resultArray[j] = array[array.length - 1];
            }
            return resultArray;
        }
        return new int[]{0};
    }
}
