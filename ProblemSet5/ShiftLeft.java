package ProblemSet5;

import java.util.Scanner;
import java.util.ArrayList;

public class ShiftLeft {
    public static void main(String[] args) {
        final Scanner input = new Scanner(System.in);
        System.out.println("Enter your numbers, press return to end.");
        ArrayList<Integer> numbersArray = new ArrayList<>();
        String numberString = "Not Empty";
        while (!numberString.isEmpty()) {
            try {
                numberString = input.nextLine();
                int number = Integer.parseInt(numberString);
                numbersArray.add(number);
            } catch (Exception e) {
                if (!numberString.isEmpty()) {
                    System.out.println("Not a legal number. Try again!");
                }
            }
        }
        System.out.println("Enter N:");
        int totalShifts = input.nextInt();
        if (numbersArray.size() > 0) {
            for (int shiftCounter = 0; shiftCounter < totalShifts; shiftCounter++) {
                int firstItem = numbersArray.get(0);
                numbersArray.remove(0);
                numbersArray.add(numbersArray.size(), firstItem);
            }
            for (int number: numbersArray) {
                if (number == numbersArray.get(numbersArray.size() - 1)) {
                    System.out.print(number);
                }
                else {
                    System.out.printf("%d, ", number);
                }
            }
        }
    }
}