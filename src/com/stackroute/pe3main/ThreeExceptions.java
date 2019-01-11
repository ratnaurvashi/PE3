package com.stackroute.pe3main;

public class ThreeExceptions extends Exception{

    public static void someMethod(String s) {
        System.out.println(s.toLowerCase());
    }

    public static void main(String[] args){
        int[] array;
        try{
            array = new int[-20];
        }
        catch(NegativeArraySizeException ex){
            System.out.println("Error: NegativeArraySizeException!");
        }
        try{
            array = new int[5];
            array[20]= 300;
        }
        catch (IndexOutOfBoundsException ex){
            System.out.println("Error: IndexOutOfBoundsException!");
        }
        try{
            someMethod(null);
        }
        catch (NullPointerException ex){
            System.out.println("Error: NullPointerException!");
        }
        finally{
            System.out.println();
            System.out.println("In exception block.");
        }
    }
}
