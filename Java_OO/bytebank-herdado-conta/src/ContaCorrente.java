
public class ContaCorrente extends Conta {
	
	public ContaCorrente(int agencia,int numero) {
		super(agencia,numero);
	}
	
	@Override
	public boolean Saca(double valor) {
		double valorASacar = valor + 0.2;
		return super.Saca(valorASacar);
	}

}
