package br.com.alura.one;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;




import br.com.alura.one.dao.CategoriaDAO;
import br.com.alura.one.dao.ProdutoDAO;
import br.com.alura.one.factory.ConnectionFactory;
import br.com.alura.one.modelo.Categoria;
import br.com.alura.one.modelo.Produto;


public class TestaListagemDeCategorias {

	public static void main(String[] args) throws SQLException {

		try(Connection connection = new ConnectionFactory().recuperarConexao()) {
			CategoriaDAO categoriaDAO = new CategoriaDAO(connection);	
			List<Categoria> listaDeCategorias = categoriaDAO.listar();
			listaDeCategorias.stream().forEach(ct -> {
			System.out.println(ct.getNome());
			try {
				for(Produto produto : new ProdutoDAO(connection).buscar(ct)) {
					System.out.println(ct.getNome()+ " - " + produto.getNome());
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			});
				
		}
	}
}
