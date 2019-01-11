package com.stackroute.pe3main;

public class CheckConsecutive {

    public boolean checkConsecutiveNo(String numberString){
        //check for null
        if(numberString==null)
            return false;
        //check for empty string
        if(numberString==" " || numberString=="")
            return false;
        //splitting string by comma
        String[] number_string = numberString.split(",");
        int[] number= new int[number_string.length];
        for(int i=0;i<number_string.length;i++){
            //converting string element to integer
            number[i]=Integer.parseInt(number_string[i]);
        }
        int flag=0;
        //checking if numbers are consecutive
        if(number[0]<number[1]) {
            for (int i = 1; i < number_string.length; i++) {
                if (number[i - 1] != (number[i] - 1)) {
                    //numbers are not consecutive
                    flag = 1;
                    break;
                }
            }
        }
        else{
            for (int i = 1; i < number_string.length; i++) {
                if (number[i - 1] != (number[i] + 1)) {
                    //numbers are not consecutive
                    flag = 1;
                    break;
                }
            }
        }
        //numbers are consecutive
        if(flag==0) return true;
        return false;
    }
}
