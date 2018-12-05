package com.example.asus.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class StartActivity extends AppCompatActivity  {
    Operandt operandt= new Operandt();
    ArithmeticOperation arithmeticOperation= new ArithmeticOperation();
    LogicalOperation logicalOperation=new LogicalOperation();
    TrigonometricOperation trigonometricOperation=new TrigonometricOperation();
    AdditionalOperation additionalOperation=new AdditionalOperation();
    String sign="";
    Boolean signNumber=true,changeFlag=true;

    Button zeroButton;
    Button oneButton ;
    Button twoButton;
    Button threeButton;
    Button fourButton;
    Button fiveButton;
    Button sixButton;
    Button sevenButton;
    Button eightButton;
    Button nineButton;
    Button plusButton;
    Button minusButton;
    Button divisionButton;
    Button multiplicationButton;
    Button sqrtButton;
    Button sinButton;
    Button cosButton;
    Button tgButton;
    Button ctgButton;
    Button dotButton;
    Button oppositeButton;
    Button exponentButton;
    Button signButton;
    Button equalButton;
    Button clearButton;
    Button changeButton;
    Button orButton;
    Button notButton;
    Button xorButton;
    Button andButton;
    TextView textView ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
        setActions();

    }

    private void setActions() {

        zeroButton = findViewById(R.id.zeroButton);
        oneButton =  findViewById(R.id.oneButton);
        twoButton= findViewById(R.id.twoButton);
        threeButton= findViewById(R.id.threeButton);
        fourButton= findViewById(R.id.fourButton);
        fiveButton= findViewById(R.id.fiveButton);
        sixButton= findViewById(R.id.sixButton);
        sevenButton= findViewById(R.id.sevenButton);
        eightButton = findViewById(R.id.eightButton);
        nineButton= findViewById(R.id.nineButton);
        plusButton= findViewById(R.id.plusButton);
        minusButton= findViewById(R.id.minusButton);
        divisionButton= findViewById(R.id.divisionButton);
        multiplicationButton= findViewById(R.id.multiplicationButton);
        sqrtButton= findViewById(R.id.sqrtButton);
        sinButton= findViewById(R.id.sinButton);
        cosButton= findViewById(R.id.cosButton);
        tgButton= findViewById(R.id.tgButton);
        ctgButton= findViewById(R.id.ctgButton);
        oppositeButton=findViewById(R.id.oppositeButton);
        exponentButton=findViewById(R.id.exponentButton);
        dotButton= findViewById(R.id.dotButton);
        signButton= findViewById(R.id.signButton);
        equalButton=findViewById(R.id.equalButton);
        clearButton=findViewById(R.id.clearButton);
        changeButton=findViewById(R.id.changeButton);
        orButton=findViewById(R.id.orButton);
        xorButton=findViewById(R.id.xorButton);
        andButton=findViewById(R.id.andButton);
        notButton=findViewById(R.id.notButton);
        textView = findViewById(R.id.textView);

        zeroButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.append("0");
            }
        });
        oneButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.append("1");
            }
        });
        twoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.append("2");
            }
        });

        threeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.append("3");
            }
        });

        fourButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.append("4");
            }
        });

        fiveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.append("5");
            }
        });

        sixButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.append("6");
            }
        });

        sevenButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.append("7");
            }
        });

        eightButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.append("8");
            }
        });

        nineButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.append("9");
            }
        });

        equalButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (!sign.equals("") && !textView.getText().toString().equals("")) {
                    operandt.setSecondOperandt(readOperandt());
                    switch (sign) {
                        case "+":
                            arithmeticOperation.plus(operandt.getFirstOperandt(), operandt.getSecondOperandt());
                            textView.setText(arithmeticOperation.getResult().toString());
                            break;

                        case "-":
                            arithmeticOperation.minus(operandt.getFirstOperandt(), operandt.getSecondOperandt());
                            textView.setText(arithmeticOperation.getResult().toString());
                            break;

                        case "*":
                            arithmeticOperation.multiplication(operandt.getFirstOperandt(), operandt.getSecondOperandt());
                            textView.setText(arithmeticOperation.getResult().toString());
                            break;

                        case "÷":
                            arithmeticOperation.division(operandt.getFirstOperandt(), operandt.getSecondOperandt());
                            textView.setText(arithmeticOperation.getResult().toString());
                            break;

                        case "xor":
                            logicalOperation.xor(operandt.getFirstOperandt(), operandt.getSecondOperandt());
                            textView.setText(logicalOperation.getResult().toString());
                            break;

                        case "or":
                            logicalOperation.or(operandt.getFirstOperandt(), operandt.getSecondOperandt());
                            textView.setText(logicalOperation.getResult().toString());
                            break;

                        case "and":
                            logicalOperation.and(operandt.getFirstOperandt(), operandt.getSecondOperandt());
                            textView.setText(logicalOperation.getResult().toString());
                            break;

                        case "expon":
                            additionalOperation.squarinng(operandt.getFirstOperandt(), operandt.getSecondOperandt());
                            textView.setText(additionalOperation.getResult().toString());
                            break;
                    }
                }
            }
        });

        clearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("");
                sign="";
                operandt.setSecondOperandt((byte) 0);
                operandt.setFirstOperandt((byte) 0);
            }
        });

        dotButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!textView.getText().toString().equals("")) {
                    textView.append(".");
                }
            }
        });

        plusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!textView.getText().toString().equals("")) {
                    operandt.setFirstOperandt(readOperandt());
                    textView.setText("");
                    sign = "+";
                }
            }
        });

        minusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!textView.getText().toString().equals("")) {
                    operandt.setFirstOperandt(readOperandt());
                    textView.setText("");
                    sign = "-";
                }
            }
        });

        divisionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!textView.getText().toString().equals("")) {
                    operandt.setFirstOperandt(readOperandt());
                    textView.setText("");
                    sign = "÷";
                }
            }
        });

        multiplicationButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!textView.getText().toString().equals("")) {
                    operandt.setFirstOperandt(readOperandt());
                    textView.setText("");
                    sign = "*";
                }
            }
        });

        sqrtButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!textView.getText().toString().equals("")) {
                    operandt.setFirstOperandt(readOperandt());
                    additionalOperation.rootExtraction(operandt.getFirstOperandt());
                    textView.setText(additionalOperation.getResult().toString());

                }
            }
        });

        notButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!textView.getText().toString().equals("")) {
                    operandt.setFirstOperandt(readOperandt());
                    logicalOperation.not(operandt.getFirstOperandt());
                    textView.setText(logicalOperation.getResult().toString());
                }
            }
        });

        sinButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!textView.getText().toString().equals("")) {
                    operandt.setFirstOperandt(readOperandt());
                    trigonometricOperation.sin(operandt.getFirstOperandt());
                    textView.setText(trigonometricOperation.getResult().toString());
                }
            }
        });
        cosButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!textView.getText().toString().equals("")) {
                    operandt.setFirstOperandt(readOperandt());
                    trigonometricOperation.cos(operandt.getFirstOperandt());
                    textView.setText(trigonometricOperation.getResult().toString());
                }
            }
        });

        tgButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!textView.getText().toString().equals("")) {
                    operandt.setFirstOperandt(readOperandt());
                    trigonometricOperation.tg(operandt.getFirstOperandt());
                    textView.setText(trigonometricOperation.getResult().toString());
                }
            }
        });

        ctgButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!textView.getText().toString().equals("")) {
                    operandt.setFirstOperandt(readOperandt());
                    trigonometricOperation.ctg(operandt.getFirstOperandt());
                    textView.setText(trigonometricOperation.getResult().toString());
                }
            }
        });

        oppositeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!textView.getText().toString().equals("")) {
                    operandt.setFirstOperandt(readOperandt());
                    Double ch = 1 / operandt.getFirstOperandt();

                    textView.setText(ch.toString());
                }
            }
        });


        exponentButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!textView.getText().toString().equals("")) {
                    operandt.setFirstOperandt(readOperandt());
                    textView.setText("");
                    sign = "expon";
                }
            }
        });

        xorButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!textView.getText().toString().equals("")) {
                    operandt.setFirstOperandt(readOperandt());
                    textView.setText("");
                    sign = "xor";
                }
            }
        });

        orButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!textView.getText().toString().equals("")) {
                    operandt.setFirstOperandt(readOperandt());
                    textView.setText("");
                    sign = "or";
                }
            }
        });

        andButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!textView.getText().toString().equals("")) {
                    operandt.setFirstOperandt(readOperandt());
                    textView.setText("");
                    sign = "and";
                }
            }
        });


        signButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!textView.getText().toString().equals("")) {
                    if (signNumber && readOperandt() > 0) {
                        Double str = readOperandt();

                        textView.setText("-");
                        textView.append(str.toString());
                        signNumber = false;
                    }
                    else if (readOperandt() < 0) {
                        Double str = readOperandt() * (-1);
                        textView.setText(str.toString());
                        signNumber = true;
                    }
                }
            }
        });



        changeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(changeFlag)
                 {
                     sinButton.setEnabled(false);
                     sinButton.setVisibility(View.INVISIBLE);

                     cosButton.setEnabled(false);
                     cosButton.setVisibility(View.INVISIBLE);

                     tgButton.setEnabled(false);
                     tgButton.setVisibility(View.INVISIBLE);

                     ctgButton.setEnabled(false);
                     ctgButton.setVisibility(View.INVISIBLE);

                     xorButton.setEnabled(true);
                     xorButton.setVisibility(View.VISIBLE);

                     orButton.setEnabled(true);
                     orButton.setVisibility(View.VISIBLE);

                     notButton.setEnabled(true);
                     notButton.setVisibility(View.VISIBLE);

                     andButton.setEnabled(true);
                     andButton.setVisibility(View.VISIBLE);

                     plusButton.setEnabled(false);
                     minusButton.setEnabled(false);
                     divisionButton.setEnabled(false);
                     multiplicationButton.setEnabled(false);
                     sqrtButton.setEnabled(false);
                     dotButton.setEnabled(false);
                     exponentButton.setEnabled(false);
                     oppositeButton.setEnabled(false);
                     signButton.setEnabled(false);
                     changeFlag=false;

                 }
                 else {
                    xorButton.setEnabled(false);
                    xorButton.setVisibility(View.INVISIBLE);

                    orButton.setEnabled(false);
                    orButton.setVisibility(View.INVISIBLE);

                    andButton.setEnabled(false);
                    andButton.setVisibility(View.INVISIBLE);

                    notButton.setEnabled(false);
                    notButton.setVisibility(View.INVISIBLE);

                    sinButton.setEnabled(true);
                    sinButton.setVisibility(View.VISIBLE);

                    cosButton.setEnabled(true);
                    cosButton.setVisibility(View.VISIBLE);

                    tgButton.setEnabled(true);
                    tgButton.setVisibility(View.VISIBLE);

                    ctgButton.setEnabled(true);
                    ctgButton.setVisibility(View.VISIBLE);

                    plusButton.setEnabled(true);
                    minusButton.setEnabled(true);
                    divisionButton.setEnabled(true);
                    multiplicationButton.setEnabled(true);
                    sqrtButton.setEnabled(true);
                    dotButton.setEnabled(true);
                    exponentButton.setEnabled(true);
                    oppositeButton.setEnabled(true);
                    signButton.setEnabled(true);
                    changeFlag=true;

                }

                textView.setText("");
            }
        });

    }

    public double readOperandt(){

        return  Double.parseDouble(textView.getText().toString());
    }
}