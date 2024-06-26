package ProblemSet5;

import java.util.Scanner;
public class WordLengthes {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        String [] wordArray = console.nextLine().split(" ");

        int [] returnedValue = letterCount(wordArray);
        String stars = " ";

        for (int k = 0; k < returnedValue.length; k++){
            System.out.print((k+1) + ": " + returnedValue[k] + "\t");
            for (int m = 0; m < returnedValue[k]; m++){
                stars += "*";
            }
            System.out.println(stars);
            stars = " ";
        }
    }

    public static int []letterCount (String []wordArray){
        int []count = new int[wordArray.length];

        for (int i = 0; i < wordArray.length; i++){
            for (int j = 0; j < wordArray[i].length(); j++){
                if (Character.isLetter(wordArray[i].charAt(j))){
                    count[i] += 1;
                }
            }
        }
        return count;
    }
}