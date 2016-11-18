package com.example.a403.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button b1,b2,b3,b4,b5;
    EditText su1,su2;
    TextView Result;

    String  num1,num2;
    Double result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("simple calculator");
        su1 = (EditText)findViewById(R.id.editText2);
        su2 = (EditText)findViewById(R.id.editText3);
        b1 = (Button)findViewById(R.id.button2);
        b2 = (Button)findViewById(R.id.button3);
        b3 = (Button)findViewById(R.id.button4);
        b4 = (Button)findViewById(R.id.button5);
        b5 = (Button)findViewById(R.id.button6);
        Result = (TextView)findViewById(R.id.textView4);

        View.OnClickListener cl=new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                num1 = su1.getText().toString();
                num2 = su2.getText().toString();
                Double num3 = Double.parseDouble(num1);
                Double num4 = Double.parseDouble(num2);
                if (num1.isEmpty() || num2.isEmpty()) {
                    Toast.makeText(getApplicationContext(), "숫자를 입력하세요", Toast.LENGTH_SHORT).show();
                  return;
                }

                    if (v.getId() == R.id.button2) {
                        result = num3 + num4;
                    } else if (v.getId() == R.id.button3) {
                        result = num3 - num4;
                    } else if (v.getId() == R.id.button4) {
                        result = num3 * num4;
                    } else if (v.getId() == R.id.button5) {
                        if (num2.equals("0")) {
                            Toast.makeText(getApplicationContext(), "0으로 나눌수없습니다", Toast.LENGTH_SHORT).show();
                        } else {
                            result = num3 / num4;
                        }
                    } else if (v.getId() == R.id.button6) {
                        result = num3 % num4;
                    }
                    Result.setText(String.format("계산결과 : %.2f", result));

            }
        };
        b1.setOnClickListener(cl);
        b2.setOnClickListener(cl);
        b3.setOnClickListener(cl);
        b4.setOnClickListener(cl);
        b5.setOnClickListener(cl);
    }
}

