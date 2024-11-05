// Menu_act.java
public class Menu_act extends AppCompatActivity {
    private Button gestionButton, listaButton, spinnerButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        gestionButton = findViewById(R.id.gestionButton);
        listaButton = findViewById(R.id.listaButton);
        spinnerButton = findViewById(R.id.spinnerButton);

        // Redirigir a Gestión
        gestionButton.setOnClickListener(v -> {
            Intent intent = new Intent(Menu_act.this, Gestion_act.class);
            startActivity(intent);
        });

        // Redirigir a Lista
        listaButton.setOnClickListener(v -> {
            Intent intent = new Intent(Menu_act.this, Lista_act.class);
            startActivity(intent);
        });

        // Redirigir a Spinner
        spinnerButton.setOnClickListener(v -> {
            Intent intent = new Intent(Menu_act.this, Spinner_act.class);
            startActivity(intent);
        });
    }
}
