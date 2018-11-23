package com.example.asus.myapplication;

public class ArithmeticOperation extends  Operation{
    public void plus(double first,double second){

        result=first+second;
    }

    public void minus(double first,double second){

        result=first-second;
    }

    public void division(double first,double second){

        result=first/second;
    }

    public void multiplication(double first,double second){

        result=first*second;
    }

    @Override
    public Double getResult() {
        return result;
    }
}
