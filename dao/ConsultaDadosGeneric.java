package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public abstract class ConsultaDadosGeneric {

	private static Connection connection;
	private static PreparedStatement preparedStatement;

	public static void executeQueryContra(String query) {

		try {
			preparedStatement = getConnectionContra().prepareStatement(query);
			preparedStatement.executeUpdate();
			System.out.println("A query foi executada com sucesso!");

		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Ocorreu erro ao executar a query : " + e);
		}

	}

	public static void executeQuerySadmin(String query) {

		try {
			preparedStatement = getConnectionSadmin().prepareStatement(query);
			preparedStatement.executeUpdate();
			System.out.println("A query foi executada com sucesso!");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Ocorreu erro ao executar a query : " + e);
		}
	}

	public static void closeAllConnectionsBD() {
		try {
			preparedStatement.close();
			connection.close();
			System.out.println("Fechando todas as conexões com banco de dados.");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Ocorreu erro ao fechar todas as conexões com banco de dados : " + e);
		}

	}

	private static Connection getConnectionContra() {
		return connection = new FabricaConexaoBD().getConnectionContra();
	}

	private static Connection getConnectionSadmin() {
		return connection = new FabricaConexaoBD().getConnectionSadmin();
	}

}
