package com.rashed.layoutdesign;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
    private Button submit, show;
    private EditText editTextTextPersonName, editTextTextPersonName2, editTextTextPersonName3, editTextTextEmailAddress, editTextPhone;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        submit = findViewById(R.id.button);
        show = findViewById(R.id.show);

        submit.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Toast.makeText(MainActivity.this, "Your review has been submitted", Toast.LENGTH_SHORT).show();
            }
        });

        /*show.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                String s = editTextTextPersonName.getText().toString();
                String s1 = editTextTextPersonName2.getText().toString();
                String s2 = editTextTextPersonName3.getText().toString();
                String s3 = editTextTextEmailAddress.getText().toString();
                String s4 = editTextPhone.getText().toString();

                Toast.makeText(MainActivity.this, s, Toast.LENGTH_SHORT).show();
                Toast.makeText(MainActivity.this, s1, Toast.LENGTH_SHORT).show();
                Toast.makeText(MainActivity.this, s2, Toast.LENGTH_SHORT).show();
                Toast.makeText(MainActivity.this, s3, Toast.LENGTH_SHORT).show();
                Toast.makeText(MainActivity.this, s4, Toast.LENGTH_SHORT).show();
            }
        });*/
    }
}