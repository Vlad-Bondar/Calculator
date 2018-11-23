package com.example.asus.myapplication;

import android.widget.TextView;

import java.math.MathContext;

public class AdditionalOperation extends Operation {

    Boolean sign=true;

    @Override
    public Double getResult() {
        return result;
    }

    public void squarinng(double operandt,double degree)
     {

         result= Math.pow(operandt,degree);
     }

    public void rootExtraction(double operandt)
    {

        result= Math.sqrt(operandt);
    }


}
