package com.example.acledaexam;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {
    private static final String MOCK_USERNAME = "test";
    private static final String MOCK_PASSWORD = "test";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Button loginButton = findViewById(R.id.btnSignIn);
        loginButton.setBackgroundColor(Color.parseColor("#EDBE3C"));
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Mocking user input
                EditText usernameEditText = findViewById(R.id.edtUser);
                EditText passwordEditText = findViewById(R.id.edtPass);

                String enteredUsername = usernameEditText.getText().toString().trim();
                String enteredPassword = passwordEditText.getText().toString().trim();

                // Check if entered credentials match the mock data
                if (enteredUsername.equals(MOCK_USERNAME) && enteredPassword.equals(MOCK_PASSWORD)) {
                    // Successful login
                    startActivity(new Intent(LoginActivity.this, HomeActivityMain.class));
                    finish();
                } else {
                    // Invalid credentials, show an error message or handle accordingly
                    Toast.makeText(LoginActivity.this, "Invalid credentials", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
