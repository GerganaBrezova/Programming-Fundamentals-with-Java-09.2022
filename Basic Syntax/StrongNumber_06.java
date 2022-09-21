package BasicSyntaxExercise;

import java.util.Scanner;

public class StrongNumber_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int sumFact = 0;
        int startNumber = number;

        while (number > 0){
            int lastDigit = number % 10;

            int factorial = 1;
            for (int i = 1; i <= lastDigit; i++) {
                factorial *= i;
            }
            sumFact += factorial;

            number = number / 10;
        }

        if (startNumber == sumFact){
            System.out.println("yes");
        }else {
            System.out.println("no");
        }
    }
}
