package br.com.alura.one;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.alura.one.factory.ConnectionFactory;


public class TestaRemocao {
	
	public static void main(String[] args) throws SQLException{

	ConnectionFactory factory = new ConnectionFactory();
	Connection connection = factory.recuperarConexao();
	
	PreparedStatement stm = connection.prepareStatement("DELETE FROM PRODUTO WHERE ID > ?");
	stm.setInt(1,2);
	stm.execute(); 
	
Integer linhasModificadas =	stm.getUpdateCount();

System.out.println("LInhas que foram modificadas: "  + linhasModificadas);
	
	
}
}
