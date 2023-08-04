
public class TesteContas {

	public static void main(String[] args) {
		
		ContaCorrente cc = new ContaCorrente(111,111);
		cc.Depositar(100.0);
		
		ContaPoupanca cp = new ContaPoupanca(222, 222);
		cp.Depositar(200.0);
		
		cc.Transfere(10.0, cp);
		
		System.out.println("Saldo conta CC" +cc.getSaldo());
		System.out.println("Saldo conta CP" +cp.getSaldo());


	}

}
