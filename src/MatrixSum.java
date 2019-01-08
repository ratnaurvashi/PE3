import java.util.Scanner;

public class MatrixSum {

    public int[][] matrixSum(int[][] matrix1, int[][] matrix2, int row, int column){
        if((matrix1 == null) || (matrix2==null))
            return null;
        int[][] resultantMatrix = new int[row][column];
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                resultantMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return resultantMatrix;
    }

    public static void main(String[] args){
        MatrixSum obj = new MatrixSum();
        Scanner sc = new Scanner(System.in);
        System.out.println("Input number of rows of matrix: ");
        int row = sc.nextInt();
        System.out.println("Input number of columns of matrix: ");
        int column = sc.nextInt();
        int[][] matrix1 = new int[row][column];
        int[][] matrix2 = new int[row][column];
        System.out.println("Input elements of first matrix: ");
        for(int i=0; i<row; i++){
            for(int j=0; j<column; j++){
                matrix1[i][j]=sc.nextInt();
            }
        }
        System.out.println("Input the elements of second matrix: ");
        for(int i=0; i<row; i++){
            for(int j=0; j<column; j++){
                matrix2[i][j]=sc.nextInt();
            }
        }
        System.out.println(obj.matrixSum(matrix1,matrix2,row,column)[0]);
    }
}
