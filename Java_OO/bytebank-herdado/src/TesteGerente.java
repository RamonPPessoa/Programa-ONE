
public class TesteGerente {

	public static void main(String[] args) {
		Gerente gen1 = new Gerente();
		
		gen1.setNome("Marcela");
		gen1.setCpf("46464545");
		gen1.setSalario(6000);
		
		System.out.println(gen1.getNome());
		System.out.println(gen1.getCpf());
		System.out.println(gen1.getSalario());
		
		gen1.setSenha(54545454);
		boolean autentica = gen1.autentica(54545454);
		System.out.println(autentica);
		
		System.out.println(gen1.getBonificacao());
		
		

	}

}
