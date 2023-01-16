package Midterm;

import java.util.*;
public class MergeArray{
    public static void main(String[] arg)
    {
        Scanner input= new Scanner(System.in);

        String n=input.next().strip();
        int N= Integer.parseInt(n);

        int[] list=new int[N];
        for (int i=0;i<N;i++){
            int num = input.nextInt();
            list[i]=num;
        }

        String M = input.next().strip();
        int num1 = Integer.parseInt(M);

        int[] list2 = new int[num1];
        for (int j = 0; j < num1; j++) {
            int num2 = input.nextInt();
            list2[j] = num2;
        }

        int [] sorted = new int[list.length + list2.length];
        if (N >= 0) System.arraycopy(list, 0, sorted, 0, N);
        int count=0;
        for( int k = N; k < sorted.length; k++){
            sorted[k] = list2[count];
            count++;
        }
        Arrays.sort(sorted);
        StringBuilder answer = new StringBuilder();
        for (int element:sorted){
            answer.append(element);
            answer.append(" ");
        }

        String required_output = answer.toString();
        System.out.println(required_output.substring(0,required_output.length()-1));

    }
}



















