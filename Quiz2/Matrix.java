package Quiz2;

class Matrix {
    public int[][] mat;

    Matrix(String matrixAsString) {
        String[] x = matrixAsString.split("\n", -1);
        String[][] y =new String[x.length][x[0].split(" ", -1).length];
        int count =0;


        for (String s : x){
            y[count]=s.split(" ", -1);
            count++;
        }

        int[][] matrix = new int[y.length][y[0].length];
        for (int i=0;i<y.length;i++){
            for (int j=0;j<y[i].length;j++){
                matrix[i][j]=Integer.parseInt(y[i][j]);
            }
        }
        mat = matrix;
    }

    int[] getRow(int rowNumber) {
        return mat[rowNumber-1];
    }

    int[] getColumn(int columnNumber) {
        int[] column=new int[mat.length];
        for (int i=0;i<mat.length;i++){
            column[i]=mat[i][columnNumber-1];
        }
        return column;
    }
}