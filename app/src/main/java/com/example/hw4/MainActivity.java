package com.example.hw4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText rest;
    private TextView cost;
    private Button bt1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

            rest = findViewById(R.id.editText2);
            cost = findViewById(R.id.textView5);
            bt1 = findViewById(R.id.button);

            bt1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int res1 = Integer.parseInt(rest.getText().toString());
                    int cos1 = res1%250;

                    if(cos1 != 0){
                        int sum1 = 75+(res1/250+1)*5;
                        cost.setText(String.valueOf(sum1));
                    }
                    else{
                        int sum2 = 75+(res1/250)*5;
                        cost.setText(String.valueOf(sum2));
                    }


                }
            });
    }
}
