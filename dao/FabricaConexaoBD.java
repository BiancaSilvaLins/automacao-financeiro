package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class FabricaConexaoBD {

	private Connection connection;

	public Connection getConnectionContra() {
		try {
			connection = DriverManager.getConnection("jdbc:postgresql://postgres.teste.capes.gov.br:5432/teste",
					"webcontra", "webcontra");
			System.out.println("Conectado ao banco de dados...");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Falha ao conectar com banco dados : " + e);
		}
		return connection;
	}

	public Connection getConnectionSadmin() {
		try {
			connection = DriverManager.getConnection("jdbc:oracle:thin:@rac-dh.capes.gov.br:1521/hom",
					"WEBSEGURANCA", "WEBSEGURANCA");
			System.out.println("Conectado ao banco de dados...");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Falha ao conectar com banco dados : " + e);
		}
		return connection;
	}

	public void close() {
		try {
			this.connection.close();
			System.out.println("Conexão com banco de dados foi fechada com sucesso");
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			System.out.println("Ocorreu erro ao fechar conexão com banco de dados" + e);
		}
	}

	public static void main(String[] args) {
		FabricaConexaoBD fb = new FabricaConexaoBD();
		fb.getConnectionContra();
/*		ConsultaDadosGeneric.executeQuerySadmin(QueryUpdate.alteraPerfilSadmin(1215));*/
		
		fb.close();
	}
}
