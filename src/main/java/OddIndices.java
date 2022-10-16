import java.util.Arrays;

public class OddIndices {
    /* Task 2. Написать алгоритм OddIndices, который принимает массив целых чисел,
    и возвращает массив значений нечетных индексов*/

    public int[] oddIndices(int[] array) {
        if (array.length != 0) {
            int j = 0;
            //int arLen = array.length;
            int[] resultArray = new int[array.length / 2];

            for (int i = 0; i < array.length; i++) {
                if (i % 2 != 0) {
                    resultArray[j] = array[i];
                    j ++;
                }
            }

            return resultArray;

        }

        return null;
    }
}

/*
public static void main(String[] args) {
int[] array = {5, -6, -7, 8, 9, 10,345, -564, -333, 56, 33};
System.out.println(Arrays.toString(new OddIndices().oddIndices(array)));
 }
}
*/


