package br.com.hspm.sgh.persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
	public Connection getConnection() {
        String url = "jdbc:postgresql://10.10.73.14:6433/hm0615_hspm";  
        String usuario = "hm0615_hspm";  
        String senha = "pwd_hm0615_hspm"; 
		Connection result = null;
		try {
			Class.forName("org.postgresql.Driver");
			result = DriverManager.getConnection(url, usuario, senha);
			return result;                        
        }  
		catch (SQLException e) {
            System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }
		return result;
	}

	
}
