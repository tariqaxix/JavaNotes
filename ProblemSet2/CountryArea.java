package ProblemSet2;

import java.util.Scanner;



public class CountryArea {
    public static void main(String [] args) {



        countryArea();
    }



    public static void countryArea(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("What is square area of your destination country in km2? ");
        int kmArea = scanner.nextInt();



        double miArea = (kmArea * 0.38610215854245) * 100;
        miArea = (int) miArea;



        System.out.println("In miles2 that is " +
                miArea/100);
    }
}
