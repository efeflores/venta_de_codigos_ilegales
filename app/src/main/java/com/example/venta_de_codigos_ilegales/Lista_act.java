package com.example.venta_de_codigos_ilegales;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class Lista_act extends AppCompatActivity {
    private ListView listView;
    private DatabaseHelper dbHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview);

        listView = findViewById(R.id.listView);
        dbHelper = new DatabaseHelper(this);

        cargarDatos();
    }

    private void cargarDatos() {
        SQLiteDatabase db = dbHelper.getReadableDatabase();
        Cursor cursor = db.rawQuery("SELECT nombre, descripcion, precio FROM productos", null);

        ArrayList<String> datos = new ArrayList<>();
        while (cursor.moveToNext()) {
            String nombre = cursor.getString(0);
            String descripcion = cursor.getString(1);
            String precio = cursor.getString(2);

            datos.add("Nombre: " + nombre + "\nDescripción: " + descripcion + "\nPrecio: $" + precio);
        }
        cursor.close();

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, datos);
        listView.setAdapter(adapter);
    }
}