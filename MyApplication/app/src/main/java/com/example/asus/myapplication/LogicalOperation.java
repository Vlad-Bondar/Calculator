package com.example.asus.myapplication;

public class LogicalOperation extends Operation {

    public void xor(double first ,double second) {
        int firstCh=(int)first;
        int secondCh=(int)second;
        result=firstCh^secondCh;
    }
    public void not(double first ) {
        int firstCh=(int)first;
        result=~firstCh;
    }
    public void and(double first ,double second) {

        int firstCh=(int)first;
        int secondCh=(int)second;
        result=firstCh&secondCh;
    }
    public void or(double first ,double second) {
        int firstCh=(int)first;
        int secondCh=(int)second;
        result=firstCh|secondCh;
    }

    @Override
    public Double getResult() {
        return result;
    }
}
