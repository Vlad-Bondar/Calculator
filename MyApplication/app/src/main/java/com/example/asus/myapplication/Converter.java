package com.example.asus.myapplication;

public class Converter {


    public String toBinary(double ch)
     {
         String str = Double.toHexString(ch);
         return str;
     }

     public double toDec(String str)
      {
          int i =Integer.parseInt(str, 2);
          double ch=(double)i;
          return ch;
      }
}
