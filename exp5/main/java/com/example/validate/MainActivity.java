package com.example.validate;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText editTextName, editTextID;
    private Button buttonValidate, buttonReset;
    private ImageView inbavelImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextName = findViewById(R.id.editTextName);
        editTextID = findViewById(R.id.editTextID);
        buttonValidate = findViewById(R.id.buttonValidate);
        buttonReset = findViewById(R.id.buttonReset);
        inbavelImage = findViewById(R.id.inbavelImage);

        // Validation Button Action
        buttonValidate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = editTextName.getText().toString();
                String id = editTextID.getText().toString();

                if (validateName(name) && validateID(id)) {
                    Toast toast = Toast.makeText(MainActivity.this, "Validation Successful!", Toast.LENGTH_LONG);
                    View toastView = toast.getView();
                    toastView.setBackgroundColor(Color.parseColor("#4CAF50")); // Green background
                    toast.show();
                    editTextName.setBackgroundColor(Color.parseColor("#4CAF50"));
                    editTextID.setBackgroundColor(Color.parseColor("#4CAF50"));
                } else {
                    Toast toast = Toast.makeText(MainActivity.this, "Validation Failed!", Toast.LENGTH_LONG);
                    View toastView = toast.getView();
                    toastView.setBackgroundColor(Color.parseColor("#F44336")); // Red background
                    toast.show();
                    editTextName.setBackgroundColor(Color.parseColor("#F44336"));
                    editTextID.setBackgroundColor(Color.parseColor("#F44336"));
                }
            }
        });

        // Reset Button Action
        buttonReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editTextName.setText("");
                editTextID.setText("");
                editTextName.setBackgroundColor(Color.TRANSPARENT);
                editTextID.setBackgroundColor(Color.TRANSPARENT);
            }
        });
    }

    // Name Validation
    private boolean validateName(String name) {
        return name.matches("[a-zA-Z]+");
    }

    // ID Validation
    private boolean validateID(String id) {
        return id.length() == 10 &&
                id.matches("^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[@#$%^&+=]).{10}$") &&
                !id.matches(".*(.)\\1{2}.*");
    }
}
