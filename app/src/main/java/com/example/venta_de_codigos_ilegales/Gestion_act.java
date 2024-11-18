package com.example.venta_de_codigos_ilegales;

import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class Gestion_act extends AppCompatActivity {
    private EditText etNombre, etDescripcion, etPrecio;
    private DatabaseHelper dbHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gestion);

        etNombre = findViewById(R.id.etNombre);
        etDescripcion = findViewById(R.id.etDescripcion);
        etPrecio = findViewById(R.id.etPrecio);
        Button btnAgregar = findViewById(R.id.btnAgregar);
        Button btnMostrar = findViewById(R.id.btnMostrar);

        dbHelper = new DatabaseHelper(this);

        btnAgregar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                agregarDatos();
            }
        });

        btnMostrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(GestionActivity.this, ListViewActivity.class);
                startActivity(intent);
            }
        });
    }

    private void agregarDatos() {
        String nombre = etNombre.getText().toString();
        String descripcion = etDescripcion.getText().toString();
        String precio = etPrecio.getText().toString();

        if (nombre.isEmpty() || descripcion.isEmpty() || precio.isEmpty()) {
            Toast.makeText(this, "Por favor, complete todos los campos", Toast.LENGTH_SHORT).show();
        } else {
            SQLiteDatabase db = dbHelper.getWritableDatabase();
            ContentValues values = new ContentValues();
            values.put("nombre", nombre);
            values.put("descripcion", descripcion);
            values.put("precio", precio);

            long newRowId = db.insert("productos", null, values);
            if (newRowId != -1) {
                Toast.makeText(this, "Datos guardados correctamente", Toast.LENGTH_SHORT).show();
                etNombre.setText("");
                etDescripcion.setText("");
                etPrecio.setText("");
            } else {
                Toast.makeText(this, "Error al guardar los datos", Toast.LENGTH_SHORT).show();
            }
        }
    }
}