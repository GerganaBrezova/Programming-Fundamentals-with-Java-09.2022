package BasicSyntaxExercise;

import java.util.Scanner;

public class RageExpenses_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lostGames = Integer.parseInt(scanner.nextLine());
        double headsetPrice = Double.parseDouble(scanner.nextLine());
        double mousePrice = Double.parseDouble(scanner.nextLine());
        double keyboardPrice = Double.parseDouble(scanner.nextLine());
        double displayPrice = Double.parseDouble(scanner.nextLine());
        double expenses = 0.0;

        for (int i = 1; i <= lostGames ; i++) {
            if (i % 2 == 0){
                expenses += headsetPrice;
            }
            if (i % 3 == 0){
                expenses += mousePrice;
            }
            if (i % 6 == 0 ){
                expenses += keyboardPrice;
            }
            if (i % 12 == 0){
                expenses += displayPrice;
            }

        }
        System.out.printf("Rage expenses: %.2f lv.", expenses);
    }
}
