package br.com.alura.one;

import java.sql.SQLException;
import java.sql.Statement;

import br.com.alura.one.factory.ConnectionFactory;

import java.sql.Connection;
import java.sql.ResultSet;

public class TestaInsercao {

	public static void main(String[] args)throws SQLException {
	
		ConnectionFactory factory = new ConnectionFactory();
		Connection connection = factory.recuperarConexao();
		
		Statement stm = connection.createStatement();
		stm.execute("INSERT INTO PRODUTO(nome,descricao)VALUES('celular','Celular Samsung A 01')"
					,Statement.RETURN_GENERATED_KEYS); 
		
		ResultSet rst = stm.getGeneratedKeys();
		while(rst.next()) {
			Integer id = rst.getInt(1);
			System.out.println(" O id criado foi o: " + id);
		}

	}

}