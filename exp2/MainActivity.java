package com.example.myapplication1;

import android.os.Bundle;
import android.graphics.Color;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    Button buttonChangeFont, buttonChangeColor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);
        buttonChangeFont = findViewById(R.id.buttonChangeFont);
        buttonChangeColor = findViewById(R.id.buttonChangeColor);

        buttonChangeFont.setOnClickListener(v -> {
            textView.setTextSize(30);  // Example font size change
            Toast.makeText(getApplicationContext(), "Font Size Changed", Toast.LENGTH_LONG).show();
        });

        buttonChangeColor.setOnClickListener(v -> {
            textView.setTextColor(Color.RED);
            Toast.makeText(getApplicationContext(), "Text Color Changed", Toast.LENGTH_LONG).show();
        });
    }
}
