import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class Spinner_act extends AppCompatActivity {

    private Spinner spinnerAutomoviles;
    private Button btnCalcular;
    private TextView txtResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner);

        spinnerAutomoviles = findViewById(R.id.spinnerAutomoviles);
        btnCalcular = findViewById(R.id.btnCalcular);
        txtResultado = findViewById(R.id.txtResultado);

        // Lista de automóviles
        Automovil[] automoviles = {
                new Automovil("Hyundai Elantra", 12000000, 2250),
                new Automovil("Toyota Corolla", 14000000, 2500),
                new Automovil("Mazda 3", 13000000, 2300)
        };

        // Adaptador para el Spinner
        ArrayAdapter<Automovil> adapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_spinner_item,
                automoviles
        );
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerAutomoviles.setAdapter(adapter);

        // Acción del botón
        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Automovil automovilSeleccionado = (Automovil) spinnerAutomoviles.getSelectedItem();
                if (automovilSeleccionado != null) {
                    String resultado = "Nombre del Automóvil: " + automovilSeleccionado.getNombre() +
                            "\nValor del Automóvil: " + automovilSeleccionado.getPrecio() +
                            "\nValor del Recargo: " + automovilSeleccionado.getRecargo() +
                            "\nTotal: " + automovilSeleccionado.calcularTotal();
                    txtResultado.setText(resultado);
                } else {
                    Toast.makeText(SpinnerActivity.this, "Seleccione un automóvil", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
