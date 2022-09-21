package BasicSyntaxExercise;

import java.util.Scanner;

public class VendingMachine_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        double sumCoins = 0.0;

        while (!input.equals("Start")){
            double insertedCoins = Double.parseDouble(input);

            if (insertedCoins != 0.1 && insertedCoins != 0.2 && insertedCoins != 0.5 && insertedCoins != 1 && insertedCoins != 2){
                System.out.printf("Cannot accept %.2f%n", insertedCoins);
            }else {
                sumCoins += insertedCoins;
            }
            input = scanner.nextLine();
        }
        input = scanner.nextLine();

        while (!input.equals("End")){
            switch (input){
                case "Nuts":
                    if (sumCoins < 2.0){
                        System.out.println("Sorry, not enough money");
                    }else {
                        sumCoins -= 2.0;
                        System.out.println("Purchased Nuts");
                    }
                    break;
                case "Water":
                    if (sumCoins < 0.7){
                        System.out.println("Sorry, not enough money");
                    }else {
                        sumCoins -= 0.7;
                        System.out.println("Purchased Water");
                    }
                    break;
                case "Crisps":
                    if (sumCoins < 1.5){
                        System.out.println("Sorry, not enough money");
                    }else {
                        sumCoins -= 1.5;
                        System.out.println("Purchased Crisps");
                    }
                    break;
                case "Soda":
                    if (sumCoins < 0.8){
                        System.out.println("Sorry, not enough money");
                    }else {
                        sumCoins -= 0.8;
                        System.out.println("Purchased Soda");
                    }
                    break;
                case "Coke":
                    if (sumCoins < 1.0){
                        System.out.println("Sorry, not enough money");
                    }else {
                        sumCoins -= 1.0;
                        System.out.println("Purchased Coke");
                    }
                    break;
                default:
                    System.out.println("Invalid product");
                    break;
            }
            input = scanner.nextLine();
        }
        if (sumCoins >= 0){
            System.out.printf("Change: %.2f", sumCoins);
        }



    }
}
