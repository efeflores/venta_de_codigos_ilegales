package com.example.venta_de_codigos_ilegales;

public class Login_act extends AppCompatActivity {
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

    public class LoginActivity extends AppCompatActivity {

        private EditText editUsuario, editContrasena;
        private Button btnIniciarSesion;
        private Administrador administrador;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_login);

            editUsuario = findViewById(R.id.editUsuario);
            editContrasena = findViewById(R.id.editContrasena);
            btnIniciarSesion = findViewById(R.id.btnIniciarSesion);
            administrador = new Administrador();

            btnIniciarSesion.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String usuario = editUsuario.getText().toString().trim();
                    String contrasena = editContrasena.getText().toString().trim();

                    if (usuario.isEmpty() || contrasena.isEmpty()) {
                        Toast.makeText(LoginActivity.this, "Por favor complete todos los campos", Toast.LENGTH_SHORT).show();
                    } else if (administrador.validarCredenciales(usuario, contrasena)) {
                        Toast.makeText(LoginActivity.this, "Inicio de sesión exitoso", Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(LoginActivity.this, MenuActivity.class);
                        startActivity(intent);
                        finish();
                    } else {
                        Toast.makeText(LoginActivity.this, "Credenciales incorrectas", Toast.LENGTH_SHORT).show();
                    }
                }
            });
        }
    }
