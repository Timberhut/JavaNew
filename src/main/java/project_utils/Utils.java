package project_utils;

public class Utils {

    public String numRec(int[] array) {

        String phoneNum = String.valueOf(array[0]);
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
        }
        return phoneNum;
    }



}


