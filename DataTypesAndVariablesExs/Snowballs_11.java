package DataTypesAndVariablesExs;

import java.util.Scanner;

public class Snowballs_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int snowballs = Integer.parseInt(scanner.nextLine());

        double bestValue = Double.MIN_VALUE;
        int bestShow = 0;
        int bestTime = 0;
        int bestQuality = 0;

        for (int i = 1; i <= snowballs; i++) {
            int snowballSnow = Integer.parseInt(scanner.nextLine());
            int snowballTime = Integer.parseInt(scanner.nextLine());
            int snowballQuality = Integer.parseInt(scanner.nextLine());

            double snowballValue = Math.pow((snowballSnow * 1.00 / snowballTime), snowballQuality);
            if (snowballValue > bestValue) {
                bestValue = snowballValue;
                bestShow = snowballSnow;
                bestTime = snowballTime;
                bestQuality = snowballQuality;
            }
        }
        System.out.printf("%d : %d = %.0f (%d)", bestShow, bestTime, bestValue, bestQuality);
    }
}
