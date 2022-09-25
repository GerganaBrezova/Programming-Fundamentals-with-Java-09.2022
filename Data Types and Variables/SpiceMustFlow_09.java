package DataTypesAndVariablesExs;

import java.util.Scanner;

public class SpiceMustFlow_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startingYield = Integer.parseInt(scanner.nextLine());

        int days = 0;
        int totalInStorage = 0;

        while (startingYield >= 100){
            totalInStorage += startingYield;
            startingYield -= 10;

            totalInStorage -= 26;
            days++;
        }
        totalInStorage -= 26;

        if (totalInStorage < 0){
            totalInStorage = 0;
        }
        System.out.printf("%d%n%d", days, totalInStorage);

    }
}
