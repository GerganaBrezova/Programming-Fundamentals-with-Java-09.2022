package ArraysExercise;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ZigZagArrays_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        String[] firstArray = new String[n];
        String[] secondArray = new String[n];

        for (int i = 0; i < n; i++) {
            String[] twoNum = scanner.nextLine().split(" ");
            String firstNum = twoNum[0];
            String secondNum = twoNum[1];

            if (i % 2 == 0){
                secondArray[i] = firstNum;
                firstArray[i] = secondNum;
            }else {
                firstArray[i] = firstNum;
                secondArray[i] = secondNum;
            }
        }
        System.out.println(String.join(" ", secondArray));
        System.out.println(String.join(" ", firstArray));
    }
}
