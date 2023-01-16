package ProblemSet2;

import java.util.Scanner;



public class Greeting {
    public static void main(String [] args) {
        // Part 1: Greeting
        greeting();



    }



    public static void greeting(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Welcome to Vacation Planner!\nWhat is your name: ");
        String name = scanner.nextLine();
        System.out.print("Nice to meet you " + name + ", where are you traveling to? ");
        String destination = scanner.nextLine();
        System.out.println("Great! " + destination + " sounds like a great trip\n***********");
    }
}