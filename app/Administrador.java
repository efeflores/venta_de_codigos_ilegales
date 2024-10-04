public class Administrador {

    private String username;
    private String password;

    // Constructor
    public Administrador() {
        this.username = "aiep";  // Usuario correcto
        this.password = "2024";  // Contraseña correcta
    }

    // Getters y Setters
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    // Método para validar si los datos ingresados son correctos
    public boolean validarCredenciales(String userInput, String passwordInput) {
        return userInput.equals(this.username) && passwordInput.equals(this.password);
    }
}