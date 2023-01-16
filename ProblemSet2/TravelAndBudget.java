package ProblemSet2;

import java.util.Scanner;
public class TravelAndBudget {
    public static void main(String[] args) {


        travelTimeBudget();

    }
    private static void travelTimeBudget() {
        Scanner input = new Scanner(System.in);
        System.out.println("How many days are you going to spend traveling? ");
        int tripSpan = input.nextInt();
        System.out.println("How much money, in USD, are you planning to spend on your trip: ");
        Double tripBudget = input.nextDouble();
        System.out.print("What is the three letter currency symbol for your travel destination? ");
        String destinationCurrencySymbol = input.next();
        System.out.print("How many " + destinationCurrencySymbol + " are there in 1 USD? ");
        Double exchangeRate = input.nextDouble();

        int tripSpanInHours = tripSpan * 24;
        int tripSpanInMinutes = tripSpanInHours * 60;
        int tripSpanInSeconds = tripSpanInMinutes * 60;
        System.out.println("\nIf you are travelling for " + tripSpan + " days that is the same as " + tripSpanInHours + " hours or " + tripSpanInMinutes + " minutes " + "or " + tripSpanInSeconds + " seconds.");

        double budgetPerDay = tripBudget / tripSpan;
        budgetPerDay = budgetPerDay * 100;
        budgetPerDay = (int) budgetPerDay;
        budgetPerDay =(double) budgetPerDay/100.0;
        System.out.println("If you are going to spend $" + tripBudget + " USD that means per day you can spend up to " + budgetPerDay + " USD");

        double tripBudgetInForeignCurrency = tripBudget * exchangeRate;
        tripBudgetInForeignCurrency = tripBudgetInForeignCurrency * 100;
        tripBudgetInForeignCurrency = (int) tripBudgetInForeignCurrency;
        tripBudgetInForeignCurrency = tripBudgetInForeignCurrency /100.0;
        double dailyBudgetInForeignCurrency = tripBudgetInForeignCurrency / tripSpan;
        dailyBudgetInForeignCurrency = dailyBudgetInForeignCurrency *100;
        dailyBudgetInForeignCurrency = (int)dailyBudgetInForeignCurrency;
        dailyBudgetInForeignCurrency = dailyBudgetInForeignCurrency/100.0;
        System.out.println("Your total budget in " + destinationCurrencySymbol + " is " + tripBudgetInForeignCurrency + " " + destinationCurrencySymbol + ", which per day is " + dailyBudgetInForeignCurrency + " " + destinationCurrencySymbol);

    }
}