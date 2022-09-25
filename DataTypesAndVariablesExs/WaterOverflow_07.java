package DataTypesAndVariablesExs;

import java.util.Scanner;

public class WaterOverflow_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lines = Integer.parseInt(scanner.nextLine());

        int sumLiters = 0;
        for (int i = 1; i <= lines; i++) {
            int liters = Integer.parseInt(scanner.nextLine());
            if (liters > 255){
                System.out.printf("Insufficient capacity!%n");
            }else {
                sumLiters += liters;
            }

            if (sumLiters > 255){
                sumLiters -= liters;
                System.out.printf("Insufficient capacity!%n");
            }
        }
        System.out.println(sumLiters);
    }
}