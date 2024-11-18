// Menu_act.java
public class Menu_act extends AppCompatActivity {
    private Button gestionButton, listaButton, spinnerButton;
package com.example.proyectobase;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

    public class MenuActivity extends AppCompatActivity {
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_menu);

            Button gestionButton = findViewById(R.id.btnGestion);
            Button listaButton = findViewById(R.id.btnLista);
            Button spinnerButton = findViewById(R.id.btnSpinner);

            gestionButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(MenuActivity.this, GestionActivity.class);
                    startActivity(intent);
                }
            });

            listaButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(MenuActivity.this, ListViewActivity.class);
                    startActivity(intent);
                }
            });

            spinnerButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(MenuActivity.this, SpinnerActivity.class);
                    startActivity(intent);
                }
            });

            btnSpinner.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(MenuActivity.this, SpinnerActivity.class);
                    startActivity(intent);
                }
            });
        }
    }
}