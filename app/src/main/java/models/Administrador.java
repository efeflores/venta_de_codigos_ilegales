package models;

public class Administrador {
    private String username = "aiep";
    private String password = "2024";
    private int id;
    public boolean validarCredenciales(String usuario, String contrasena) {
        return usuario.equals(username) && contrasena.equals(password);
    }
}
