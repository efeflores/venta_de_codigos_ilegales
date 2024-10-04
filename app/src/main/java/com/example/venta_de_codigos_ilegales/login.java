package com.example.venta_de_codigos_ilegales;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;


class Login extends AppCompatActivity {

    private EditText usernameField;
    private EditText passwordField;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        usernameField = findViewById(R.id.username);
        passwordField = findViewById(R.id.password);
        Button loginButton = findViewById(R.id.login_button);

        loginButton.setOnClickListener(v -> validateLogin());
    }

    private void validateLogin() {
        String username = usernameField.getText().toString();
        String password = passwordField.getText().toString();

        // Validate empty fields
        if (username.isEmpty() || password.isEmpty()) {
            Toast.makeText(this, "Fields cannot be empty", Toast.LENGTH_SHORT).show();
        }
        // Correct credentials
        else if (username.equals("aiep") && password.equals("2024")) {
            Toast.makeText(this, "Login Successful", Toast.LENGTH_SHORT).show();
        }
        // Invalid credentials
        else {
            Toast.makeText(this, "Invalid username or password", Toast.LENGTH_SHORT).show();
        }
    }
}