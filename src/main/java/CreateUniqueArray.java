import java.lang.reflect.Array;
import java.util.Arrays;

public class CreateUniqueArray {

    public int[] createUniqueArray(int[] array) {
        int check = 0;
// валидация массива (не пустой, нет отрицательных чисел)
        if (array.length > 0) {
            for (int i = 0; i < array.length; i++) {
                if (array[i] < 0) {
                    check++;
                }
            }
        }

        if (array.length > 0 && check == 0) {
// замена всех повторений на -1
            int count = 0;
            for (int i = 0; i < array.length; i++) {
                for (int j = i + 1; j < array.length; j++) {
                    if (array[i] == array[j]) {
                        array[j] = -1;
                    }
                }
            }
// вычисление разницы длинны нового массива
            for (int i = 0; i < array.length; i++) {
                if (array[i] == -1) {
                    count = count + 1;
                }
            }
// заполнение нового массива с исключением повторений
            int[] tempArray = new int[array.length - count];
            int count2 = 0;
            for (int i = 0; i < array.length; i++) {
                if (array[i] != -1) {
                    tempArray[count2] = array[i];
                    count2++;
                }
            }

            return tempArray;

        }

        return new int[]{0};

    }
}



