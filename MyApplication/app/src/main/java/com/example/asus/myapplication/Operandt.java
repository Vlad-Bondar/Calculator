package com.example.asus.myapplication;

public class Operandt{
    private double firstOperandt;
    private double secondOperandt;

    Operandt(){
        firstOperandt=(byte) 0;
        secondOperandt=(byte) 0;
    }

    public double getFirstOperandt() {
        return firstOperandt;
    }

    public double getSecondOperandt() {
        return secondOperandt;
    }

    public void setFirstOperandt(double firstOperandt) {
        this.firstOperandt = firstOperandt;
    }

    public void setSecondOperandt(double secondOperandt) {
        this.secondOperandt = secondOperandt;
    }
}
