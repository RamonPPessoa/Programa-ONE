


public class Conta {
   private double saldo;
   private int agencia;
   private int numero;
   private Cliente titular;
   private static int total =0;
    
    
    
    
    public Conta(int agencia, int numero) {
    	
    	Conta.total++; // ou somente total++;
    	//System.out.println("Total de contas é: " + Conta.total);
    	this.agencia = agencia;
    	this.numero = numero;
    	//this.saldo =100;
    	//System.out.println("Criando uma conta" +  this.numero);
    }

    public void Depositar(double valor) {
        this.saldo = saldo + valor;
    }

    public boolean Saca(double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            return true;

    }else {
        return false;
    }
}
public boolean Transfere(double valor,Conta destino){
if(this.Saca(valor)){
    destino.Depositar(valor);
    return true;
}else {
    return false;
}
}

    public double getSaldo() {

        return this.saldo;
    }
    
    public int getNumero() {
    	return this.numero;
    }
    
    public void setNumero(int numero) {
    	if(agencia <=0) {
    		System.out.println("Sem valores menos ou iguais a 0");
    	}
    	this.numero = numero;
    }
    
    public int getAgencia() {
		return this.agencia;
	}
    public void setAgencia(int agencia) {
    	
    	if(agencia <=0) {
    		System.out.println("Sem valores menos ou iguais a 0");
    	}
		this.agencia = agencia;
	}
    
    public void setTitular(Cliente titular) {
		this.titular = titular;
	}
    public Cliente getTitular() {
		return titular;
	}
    public static int getTotal() {
    	return Conta.total;
}
}
