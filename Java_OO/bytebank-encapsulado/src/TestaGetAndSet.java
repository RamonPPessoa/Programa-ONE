
public class TestaGetAndSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Conta conta1 = new Conta();
		
		conta1.setNumero(1550);
		
		System.out.println(conta1.getNumero());
		
		Cliente usuario1 = new Cliente();
		
		usuario1.setNome("João Silva");
		
		conta1.setTitular(usuario1);
		
		System.out.println(conta1.getTitular().getNome());
		
		
		
		conta1.getTitular().setProfissao("Analista");
		

		System.out.println(conta1.getTitular().getProfissao());

	}

}
