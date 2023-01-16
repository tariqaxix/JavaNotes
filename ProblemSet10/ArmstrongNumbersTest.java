package ProblemSet10;

import java.util.Arrays;

public class ArmstrongNumbersTest {
    public static void main(String[] args) {
        ArmstrongNumber one = new ArmstrongNumber();
        System.out.println(one.isArmstrongNumber(153));
        int[] a = {3,2,5,7};
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
    }
}