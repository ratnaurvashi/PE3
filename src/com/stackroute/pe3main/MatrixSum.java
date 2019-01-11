package com.stackroute.pe3main;

public class MatrixSum {
    public int[][] matrixSum(int[][] matrix1, int[][] matrix2, int row, int column){
        //checking for null condition
        if((matrix1 == null) || (matrix2==null))
            return null;
        int[][] resultantMatrix = new int[row][column];
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                //adding the contents of matrix1 and matrix2 and putting in resultant matrix
                resultantMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return resultantMatrix;
    }
}
