package com.example.asus.myapplication;

public class TrigonometricOperation extends Operation{

    @Override
    public Double getResult() {
        return result;
    }

    public void cos(double operandt)
      {
          result = Math.cos(operandt);
      }

     public void sin(double operandt)
      {
          result = Math.sin(operandt);
      }

      public  void  tg(double operandt)
       {
            result = Math.tan(operandt);
       }

       public  void  ctg(double operandt)
        {
            result = Math.cos(operandt)/Math.sin(operandt);
        }
}
