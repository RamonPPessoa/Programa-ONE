package br.com.alura.one.jdbc;
import java.sql.SQLException;

public class TestaPoolConexoes {

	public static void main(String[] args) throws SQLException {
	
		ConnectionFactory connectionFactory = new ConnectionFactory();
		
		for(int i = 0;i<20;i++) {
			connectionFactory.recuperaConexao();
			
			System.out.println("Conexao de numero: " +i);
		}

	}

}
