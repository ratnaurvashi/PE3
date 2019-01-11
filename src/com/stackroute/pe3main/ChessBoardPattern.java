package com.stackroute.pe3main;

public class ChessBoardPattern {

    public String[][] printChessBoard(int length, int width){
        //if the length and width entered are not correct
        if(length!=8 && width!=8){
            String[][] pattern = new String[1][1];
            pattern[0][0]="invalid";
            return pattern;
        }
        String[][] pattern = new String[8][8];
        for(int i=0;i<length;i++){
            for(int j=0;j<width;j++){
                //putting WW for white
                if((i==0 && j==0) || (i==0 && j%2==0) || (i%2!=0 && j%2!=0) || (i%2==0 && j==0) || (i%2==0 && j%2==0)){
                    pattern[i][j]="WW|";
                }
                else{
                    //putting BB for white
                    pattern[i][j]="BB|";
                }
            }
        }
        return pattern;
    }
}
