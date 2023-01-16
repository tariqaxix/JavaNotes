package Quiz2;

import Quiz2.Matrix;

import java.util.Arrays;

public class MatrixTest {
    public static void main(String[] args) {
        Matrix x = new Matrix("1 2 3\n4 5 6\n7 8 9");
        System.out.println(Arrays.toString(x.getColumn(3)));
        System.out.println(Arrays.toString(x.getRow(3)));
    }
}
