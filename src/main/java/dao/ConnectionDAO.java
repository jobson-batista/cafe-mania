package dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionDAO {
	
	/** Módulo de Conexão **/

	// Parâmetros de conexão
	private String driver = "com.mysql.cj.jdbc.Driver";
	private String url = "jdbc:mysql://127.0.0.1:3306/cafemania?useTimezone=true&serverTimezone=UTC";
	
	private String user = "root";
	private String password = "root@root";
	
	// Método de conexão
	protected Connection connect() {
		Connection con = null;
		try {
			Class.forName(driver); // Lê o driver do banco de dados.
			con = DriverManager.getConnection(url, user, password);
			return con;
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}

}
