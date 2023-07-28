
public class TestandoValores {

	public static void main(String[] args) {
		
		//int total = 0; // recomendado zerar variavel local
	
		Conta conta = new Conta(9999,6666);
		
		Conta conta2 = new Conta(2222,101010);
		Conta conta3 = new Conta(11111,151515);
		
		System.out.println(Conta.getTotal());

	}

}
