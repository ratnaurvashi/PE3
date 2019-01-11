package com.stackroute.pe3main;

public class ExceptionExample extends Exception{

    //exception constructor
    ExceptionExample(String string){
        string = "Hello " + string;
        System.out.println(string);
    }

    public static void main(String[] args) throws ExceptionExample{
        try{
            int division = 25/0;
        }
        //division by zero- arithmetic exception
        catch(ArithmeticException e){
            new ExceptionExample("World");
            throw e;
        }
        finally{
            System.out.println("In exception block.");
        }
    }
}
