package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    double input1 = 0, input2 = 0;
    TextView edt1, edt2;
    boolean Add, Sub, Mul, Div, Rem, dec, cos, sin, tan, pow, sq, sqrt, log, exp;
    Button button0, button1, button2, button3, button4, button5, button6, button7, button8, button9,
            buttonAdd, buttonSub, buttonMul, buttonDiv, buttonEqual, buttonClr, buttonDot,
            buttonRem, buttonCos, buttonSin, buttonTan, buttonPow, buttonSq, buttonSqrt,
            buttonLog, buttonExp ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button0 = findViewById(R.id.button0);
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);
        button6 = findViewById(R.id.button6);
        button7 = findViewById(R.id.button7);
        button8 = findViewById(R.id.button8);
        button9 = findViewById(R.id.button9);

        buttonAdd = findViewById(R.id.buttonadd);
        buttonSub = findViewById(R.id.buttonsub);
        buttonMul = findViewById(R.id.buttonmul);
        buttonDiv = findViewById(R.id.buttondiv);
        buttonRem = findViewById(R.id.buttonrem);
        buttonCos = findViewById(R.id.buttoncos);
        buttonSin = findViewById(R.id.buttonsin);
        buttonTan = findViewById(R.id.buttontan);
        buttonSqrt = findViewById(R.id.buttonsqrt);
        buttonPow = findViewById(R.id.buttonpow);
        buttonLog = findViewById(R.id.buttonlog);
        buttonExp = findViewById(R.id.buttonexp);

        buttonClr = findViewById(R.id.buttonclr);
        buttonEqual = findViewById(R.id.buttoneql);
        edt1 = findViewById(R.id.input);
        edt2 = findViewById(R.id.display);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText() + "1");
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText() + "2");
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText() + "3");
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText() + "4");
            }
        });



        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText() + "5");
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText() + "6");
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText() + "7");
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText() + "8");
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText() + "9");
            }
        });

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText() + "0");
            }
        });

        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edt1.getText().length() != 0) {
                    input1 = Double.parseDouble(edt1.getText().toString());
                    Add = true;
                    dec = false;
                    edt1.setText("+");
                }
            }
        });

        buttonSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edt1.getText().length() != 0) {
                    input1 = Double.parseDouble(edt1.getText().toString());
                    Sub = true;
                    dec = false;
                    edt1.setText("-");
                }
            }
        });

        buttonMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edt1.getText().length() != 0) {
                    input1 = Double.parseDouble(edt1.getText().toString());
                    Mul = true;
                    dec = false;
                    edt1.setText(null);
                }
            }
        });

        buttonDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edt1.getText().length() != 0) {
                    input1 = Double.parseDouble(edt1.getText().toString());
                    Div = true;
                    dec = false;
                    edt1.setText(null);
                }
            }
        });

        buttonRem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edt1.getText().length() != 0) {
                    input1 = Double.parseDouble(edt1.getText().toString());
                    Rem = true;
                    dec = false;
                    edt1.setText(null);
                }
            }
        });

        buttonCos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edt1.getText().length() != 0) {
                    input1 = Double.parseDouble(edt1.getText().toString());
                    cos = true;
                    dec = false;
                    edt1.setText("cos");
                }
            }
        });

        buttonSin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edt1.getText().length() != 0) {
                    input1 = Double.parseDouble(edt1.getText().toString());
                    sin = true;
                    dec = false;
                    edt1.setText("sin");
                }
            }
        });

        buttonTan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edt1.getText().length() != 0) {
                    input1 = Double.parseDouble(edt1.getText().toString());
                    tan = true;
                    dec = false;
                    edt1.setText("tan");
                }
            }
        });

        buttonPow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edt1.getText().length() != 0) {
                    input1 = Double.parseDouble(edt1.getText().toString());
                    pow = true;
                    dec = false;
                    edt1.setText(null);
                }
            }
        });


        buttonSqrt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edt1.getText().length() != 0) {
                    input1 = Double.parseDouble(edt1.getText().toString());
                    sqrt = true;
                    dec = false;
                    edt1.setText("^2");
                }
            }
        });

        buttonLog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edt1.getText().length() != 0) {
                    input1 = Double.parseDouble(edt1.getText().toString());
                    log = true;
                    dec = false;
                    edt1.setText("log");
                }
            }
        });

        buttonExp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edt1.getText().length() != 0) {
                    input1 = Double.parseDouble(edt1.getText().toString());
                    exp = true;
                    dec = false;
                    edt1.setText("e^");
                }
            }
        });



        buttonClr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText("");
                edt2.setText("");
                input1 = 0.0;
                input2 = 0.0;
            }
        });

        buttonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Add || Sub || Mul || Div || Rem || pow) {
                    input2 = Double.parseDouble(edt1.getText().toString());
                }

                if (Add) {
                    edt1.setText((int) input1 + "+" + (int) input2);
                    double radd = input1 + input2;
                    edt2.setText((int) radd + "");
                    Add = false;
                }

                if (Sub) {
                    edt1.setText((int) input1 + "-" + (int) input2);
                    double rsub = input1 - input2;
                    edt2.setText((int) rsub + "");
                    Sub = false;
                }

                if (Mul) {
                    edt1.setText((int) input1 + "*" + (int) input2);
                    double rmul = input1 * input2;
                    edt2.setText((int) rmul + "");
                    Mul = false;
                }

                if (Div) {
                    edt1.setText((int) input1 + "/" + (int) input2);
                    double rdiv = input1 / input2;
                    edt2.setText(rdiv + "");
                    Div = false;
                }

                if (Rem) {
                    edt1.setText((int) input1 + "%" + (int) input2);
                    double rrem = input1 % input2;
                    edt2.setText((int) rrem + "");
                    Rem = false;
                }

                if (cos) {
                    edt1.setText("cos(" + (int) input1 + ")");
                    double ceql = Math.cos(Math.toRadians(input1));
                    edt2.setText(ceql + "");
                    cos = false;
                }

                if (sin) {
                    edt1.setText("sin(" + (int) input1 + ")");
                    double seql = Math.sin(Math.toRadians(input1));
                    edt2.setText(seql + "");
                    sin = false;
                }

                if (tan) {
                    edt1.setText("tan(" + (int) input1 + ")");
                    double teql = Math.tan(Math.toRadians(input1));
                    edt2.setText(teql + "");
                    tan = false;
                }

                if (sqrt) {
                    edt1.setText("sqrt(" + (int) input1 + ")");
                    double sqrteql = Math.sqrt(input1);
                    edt2.setText(sqrteql + "");
                    sqrt = false;
                }

                if (sq) {
                    edt1.setText((int) input1 + "^2");
                    double sqeql = input1 * input1;
                    edt2.setText(sqeql + "");
                    log = false;
                }

                if (pow) {
                    edt1.setText((int) input1 + "^" + (int) input2);
                    double peql = Math.pow(input1, input2);
                    edt2.setText(peql + "");
                    pow = false;
                }

                if (log) {
                    edt1.setText("log(" + (int) input1 + ")");
                    double lgeql = Math.log10(input1);
                    edt2.setText(lgeql + "");
                    log = false;
                }

                if (exp) {
                    edt1.setText("e^" + (int) input1);
                    double expeql = Math.exp(input1);
                    edt2.setText(expeql + "");
                    exp = false;
                }
            }
        });
    }
}