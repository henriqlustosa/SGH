package br.com.hspm.sgh.persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

	public void AbrirConexao() {
		// auto close connection
        try (Connection conn = DriverManager.getConnection("jdbc:postgresql://10.10.73.14:6433/hm0615_hspm", "hm0615_hspm", "pwd_hm0615_hspm")) {

            if (conn != null) {
                System.out.println("Connected to the database!");
            } else {
                System.out.println("Failed to make connection!");
            }

        } catch (SQLException e) {
            System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }
	}
}
