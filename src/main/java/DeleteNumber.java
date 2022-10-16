public class DeleteNumber {
    /*
    Написать метод deleteNumber, который принимает на вход массив
    целых чисел и число number. Удалите все вхождения числа number
    из массива (пропусков быть не должно).
    ({0,1,2,2,3,0,4,2}, 2) -> {0, 1, 3, 0, 4}
     */
    public int[] deleteNumber(int[] array, int n) {
        // вычисляем длину будущего массива
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != n) {
                count++;
            }
        }
        // наполняем новый массив в соответствии с условиями задачи
        int[] result = new int[count];
        int j= 0;
        for (int i = 0; i < array.length; i++) {
                if (array[i] != n && result.length >= j) {
                    result[j] = array[i];
                    ++ j;
                }
            }
        return result;
    }

}
