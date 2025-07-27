package com.marfelin.rescon.modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conexionBD {
    private static final String URL = "jdbc:sqlite:db/rescon.db"; // Cambia el nombre si quieres otra base

    public static Connection conectar() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(URL);
            System.out.println("Conexión a SQLite establecida.");
        } catch (SQLException e) {
            System.out.println("Error al conectar a SQLite: " + e.getMessage());
        }
        return conn;
    }
}
