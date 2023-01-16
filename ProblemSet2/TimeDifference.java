package ProblemSet2;

import java.util.Scanner;

public class TimeDifference {
    public static void main(String [] args) {
        timeDifference();
    }
    public static void timeDifference(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("What is the time difference, in hours, between your home and your destination? ");
        int hoursDifference = scanner.nextInt();
        int midnightDifference = 0;
        if (hoursDifference < 0) {
            midnightDifference = 24;
        }
        System.out.println("That means that when it is midnight at home it will be " +
                (midnightDifference + hoursDifference)%24 +
                ":00 in your travel destination and when it's noon at home it will be " +
                (12 + hoursDifference)%24 + ":00 in your travel destination");
        System.out.println(" ");
    }
}