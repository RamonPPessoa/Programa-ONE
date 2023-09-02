import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import br.com.alura.one.factory.ConnectionFactory;
import br.com.alura.one.modelo.Produto;


public class TestaInsercaoProduto {

	public static void main(String[] args) throws SQLException {
		Produto cama = new Produto("Cama","Cama King");
		
		try(Connection connection = new ConnectionFactory().recuperarConexao()){
			
			String sql = "INSERT INTO PRODUTO(NOME,DESCRICAO)VALUES(?,?)";
			
			try(PreparedStatement pstm = connection.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS)){
					
				
				pstm.setString(1, cama.getNome());
				pstm.setString(2,cama.getDescricao());
				pstm.execute();
				
				try(ResultSet rst = pstm.getGeneratedKeys()){
					while(rst.next()) {
						cama.setId(rst.getInt(1));
					}
				}
			}
		}
		System.out.println(cama);

	}



}
