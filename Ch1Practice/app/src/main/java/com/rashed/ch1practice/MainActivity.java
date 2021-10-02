package com.rashed.ch1practice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
    private TextView addTextView;
    private EditText n1, n2, editTextNumber;
    Button addButton, multiplicationButton;
    private TextView tv1, tv2, tv3, tv4, tv5, tv6, tv7, tv8, tv9, tv10;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) 
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addTextView = findViewById(R.id.addTextView);
        n1 = findViewById(R.id.n1);
        n2 = findViewById(R.id.n2);
        addButton = findViewById(R.id.addButton);
        multiplicationButton = findViewById(R.id.multiplicationButton);
        editTextNumber = findViewById(R.id.editTextNumber);

        tv1 = findViewById(R.id.tv1);
        tv2 = findViewById(R.id.tv2);
        tv3 = findViewById(R.id.tv3);
        tv4 = findViewById(R.id.tv4);
        tv5 = findViewById(R.id.tv5);
        tv6 = findViewById(R.id.tv6);
        tv7 = findViewById(R.id.tv7);
        tv8 = findViewById(R.id.tv8);
        tv9 = findViewById(R.id.tv9);
        tv10 = findViewById(R.id.tv10);

        addButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                int sum = Integer.parseInt(n1.getText().toString()) + Integer.parseInt(n2.getText().toString());
                Toast.makeText(MainActivity.this, "The sum is: " + sum, Toast.LENGTH_SHORT).show();
                addTextView.setText("The sum is: " + sum);
            }
        });

        multiplicationButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                int num = Integer.parseInt(editTextNumber.getText().toString());

                tv1.setText("" + num + " * " + 1 + " = " + num * 1);
                tv2.setText("" + num + " * " + 2 + " = " + num * 2);
                tv3.setText("" + num + " * " + 3 + " = " + num * 3);
                tv4.setText("" + num + " * " + 4 + " = " + num * 4);
                tv5.setText("" + num + " * " + 5 + " = " + num * 5);
                tv6.setText("" + num + " * " + 6 + " = " + num * 6);
                tv7.setText("" + num + " * " + 7 + " = " + num * 7);
                tv8.setText("" + num + " * " + 8 + " = " + num * 8);
                tv9.setText("" + num + " * " + 9 + " = " + num * 9);
                tv10.setText("" + num + " * " + 10 + " = " + num * 10);
            }
        });
    }
}