public class Login_act extends AppCompatActivity {
    private EditText usernameEditText, passwordEditText;
    private Button loginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        usernameEditText = findViewById(R.id.username);
        passwordEditText = findViewById(R.id.password);
        loginButton = findViewById(R.id.loginButton);

        loginButton.setOnClickListener(v -> {
            String username = usernameEditText.getText().toString();
            String password = passwordEditText.getText().toString();

            // Validar credenciales
            if (username.equals("aiep") && password.equals("2024")) {
                // Redirigir al menú
                Intent intent = new Intent(Login_act.this, Menu_act.class);
                startActivity(intent);
                finish(); // Finaliza la actividad de login para que no pueda regresar con el botón atrás
            } else {
                Toast.makeText(Login_act.this, "Usuario o contraseña incorrecta", Toast.LENGTH_SHORT).show();
            }
        });
    }
}