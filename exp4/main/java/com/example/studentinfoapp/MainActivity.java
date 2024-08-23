package com.example.studentinfoapp;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    private EditText rollNumberEditText;
    private TextView studentInfoTextView;
    private Map<String, String> studentDataMap = new HashMap<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rollNumberEditText = findViewById(R.id.rollNumberEditText);
        studentInfoTextView = findViewById(R.id.studentInfoTextView);
        Button searchButton = findViewById(R.id.searchButton);
        Button deleteButton = findViewById(R.id.deleteButton);

        loadCSVDataFromAssets();

        searchButton.setOnClickListener(v -> {
            String RollNo = rollNumberEditText.getText().toString().trim();
            if (studentDataMap.containsKey(RollNo)) {
                studentInfoTextView.setText(studentDataMap.get(RollNo));
            } else {
                studentInfoTextView.setText("Student not found!");
            }
        });

        deleteButton.setOnClickListener(v -> {
            String RollNo = rollNumberEditText.getText().toString().trim();
            if (studentDataMap.containsKey(RollNo)) {
                studentDataMap.remove(RollNo);
                studentInfoTextView.setText("Student record deleted!");
            } else {
                studentInfoTextView.setText("Student not found!");
            }
        });
    }

    private void loadCSVDataFromAssets() {
        try {
            InputStream inputStream = getAssets().open("data.csv");
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");

                // Ensure that the data array has the correct length before accessing its elements
                if (data.length >= 14) {
                    String rollNumber = data[0];
                    String studentInfo = "Name: " + getSafeValue(data, 1) + "\n" +
                            "Address: " + getSafeValue(data, 2) + "\n" +
                            "Father Mobile: " + getSafeValue(data, 3) + "\n" +
                            "Mother Mobile: " + getSafeValue(data, 4) + "\n" +
                            "Personal Mobile: " + getSafeValue(data, 5) + "\n" +
                            "Semester 1 GPA: " + getSafeValue(data, 6) + "\n" +
                            "Semester 2 GPA: " + getSafeValue(data, 7) + "\n" +
                            "Semester 3 GPA: " + getSafeValue(data, 8) + "\n" +
                            "Semester 4 GPA: " + getSafeValue(data, 9) + "\n" +
                            "CGPA: " + getSafeValue(data, 10) + "\n" +
                            "Govt or Management: " + getSafeValue(data, 11) + "\n" +
                            "Day Scholar or Hosteler: " + getSafeValue(data, 12) + "\n" +
                            "Community: " + getSafeValue(data, 13);
                    studentDataMap.put(rollNumber, studentInfo);
                } else {
                    // Log and skip the row with insufficient data
                    Log.e("CSV Parsing", "Invalid row in CSV: " + line);
                }
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
            Toast.makeText(this, "Failed to load CSV data", Toast.LENGTH_LONG).show();
        }
    }

    private String getSafeValue(String[] data, int index) {
        return index < data.length ? data[index] : "N/A"; // Return "N/A" if the index is out of bounds
    }}
