package DataTypesAndVariablesExs;

import java.util.Scanner;

public class PokeMon_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int powerN = Integer.parseInt(scanner.nextLine());
        int distanceM = Integer.parseInt(scanner.nextLine());
        int exhaustionFactorY = Integer.parseInt(scanner.nextLine());

        int targets = 0;
        int startingPower = powerN;

        while (powerN >= distanceM) {
            powerN -= distanceM;
            targets++;

            if (powerN == startingPower / 2 && exhaustionFactorY != 0) {
                powerN /= exhaustionFactorY;
            }
        }
        System.out.println(powerN);
        System.out.print(targets);
    }
}
