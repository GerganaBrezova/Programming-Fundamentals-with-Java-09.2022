package ArraysExercise;

import java.util.Scanner;

public class CommonElements_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] firstArray = scanner.nextLine().split(" ");
        String[] secondArray = scanner.nextLine().split(" ");

        for (String element : secondArray) {
            for (String element1 : firstArray) {
                if (element.equals(element1)) {
                    System.out.print(element + " ");
                    //break;
                }
            }
        }
    }
}
