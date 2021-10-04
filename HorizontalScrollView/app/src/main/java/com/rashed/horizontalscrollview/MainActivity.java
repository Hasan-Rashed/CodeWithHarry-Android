package com.rashed.horizontalscrollview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
    private Button button4;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button4 = findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
//                Toast.makeText(MainActivity.this, "Button clicked", Toast.LENGTH_SHORT).show();
                Log.d("Rashed", "button is working");
            }
        });
    }
}