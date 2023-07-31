
public class TesteReferencia {

	public static void main(String[] args) {
		
		Gerente gen1 = new Gerente();
		
		gen1.setNome("Paula");
		gen1.setSalario(6000);
		
		Funcionario f1 = new Funcionario();
		f1.setSalario(3000);
		
		Funcionario ev = new EditorDeVideo();		
		ev.setSalario(2000);
		
		
		ControleBonificacao controle = new ControleBonificacao();
		controle.registra(gen1);
		//controle.registra(f1);
		//controle.registra(ev);
		
		System.out.println(controle.getSoma());
		
	
		
		
		
		
		

	}

}
