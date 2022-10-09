package ArraysExercise;

import java.util.Scanner;

public class Train_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int[] wagons = new int[n];
        for (int i = 0; i < wagons.length; i++) {
            int passengers = Integer.parseInt(scanner.nextLine());
            wagons[i] = passengers;
        }
        int sum = 0;
        for (int count : wagons) {
            System.out.print(count + " ");
            sum += count;
        }
        System.out.println();
        System.out.println(sum);
    }
}
