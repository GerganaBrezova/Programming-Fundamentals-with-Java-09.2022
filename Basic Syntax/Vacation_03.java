package BasicSyntaxExercise;

import java.util.Scanner;

public class Vacation_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int people = Integer.parseInt(scanner.nextLine());
        String group = scanner.nextLine();
        String day = scanner.nextLine();
        double priceForOne = 0;

        if (day.equals("Friday")) {
            if (group.equals("Students")) {
                priceForOne += 8.45;
            } else if (group.equals("Business")) {
                priceForOne += 10.90;
            } else if (group.equals("Regular")) {
                priceForOne += 15;
            }
        }else if (day.equals("Saturday")){
            if (group.equals("Students")) {
                priceForOne += 9.80;
            } else if (group.equals("Business")) {
                priceForOne += 15.60;
            } else if (group.equals("Regular")) {
                priceForOne += 20;
            }
        }else if (day.equals("Sunday")){
            if (group.equals("Students")) {
                priceForOne += 10.46;
            } else if (group.equals("Business")) {
                priceForOne += 16;
            } else if (group.equals("Regular")) {
                priceForOne += 22.50;
            }
        }

        double totalPrice = people * priceForOne;
        if (group.equals("Students") && people >= 30){
            totalPrice *= 0.85;
        }else if (group.equals("Business") && people >= 100){
            totalPrice -= 10 * priceForOne;
        }else if (group.equals("Regular") && people >= 10 && people <= 20){
            totalPrice *= 0.95;
        }

        System.out.printf("Total price: %.2f", totalPrice);
    }
}