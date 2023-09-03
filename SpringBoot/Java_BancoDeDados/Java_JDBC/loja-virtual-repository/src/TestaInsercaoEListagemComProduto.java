import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import br.com.alura.one.dao.ProdutoDAO;
import br.com.alura.one.factory.ConnectionFactory;
import br.com.alura.one.modelo.Produto;


public class TestaInsercaoEListagemComProduto {

	public static void main(String[] args) throws SQLException {
		Produto cama = new Produto("Cama","Cama King");
		
		try(Connection connection = new ConnectionFactory().recuperarConexao()){
			ProdutoDAO produtoDao = new ProdutoDAO(connection);
			
			produtoDao.salvar(cama);
			List<Produto> listaDeProdutos = produtoDao.listar();
			listaDeProdutos.stream().forEach(lp -> System.out.println(lp));
		

	}



}
}
