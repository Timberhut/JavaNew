public class KthLargest {
    /*
    Part 2 Algorithms
    13. Написать алгоритм KthLargest, который принимает на вход
    массив целых чисел и число k, и возвращает k-тый максимальный элемент.
Test Data:
({4, 3, 7, 13, 5, 2, 9, 4, 12}, 3) → 9
 (13 и 12 - первый и второй самые большие элементы, а метод возвращает 9, как третий самый большой элемент)
     */
    public int kthLargest(int[] array, int k) {
        if (k > 0 && array.length !=0) {
            int temp;

            for (int i = 0; i < array.length; i++) {
                for (int j = i + 1; j < array.length; j++) {
                    if (array[i] > array[j]) {
                        temp = array[i];
                        array[i] = array[j];
                        array[j] = temp;
                    }
                }
            }

            return array[array.length - k];

        }

        return 0;

    }
}

