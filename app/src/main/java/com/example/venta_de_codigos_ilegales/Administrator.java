package com.example.venta_de_codigos_ilegales;

public class Administrator {

    private final String username;
    private final String password;

    public Administrator() {
        this.username = "aiep";
        this.password = "2024";
    }

    public boolean validateCredentials(String inputUsername, String inputPassword) {
        return inputUsername.equals(username) && inputPassword.equals(password);
    }
}