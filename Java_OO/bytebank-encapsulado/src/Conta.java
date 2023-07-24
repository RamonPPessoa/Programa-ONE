


public class Conta {
   private double saldo;
    int agencia;
   private int numero;
    Cliente titular;
    
    
    
    public Conta(int agencia, int numero) {
    	this.agencia = agencia;
    	this.numero = numero;
    	
    	System.out.println("Criando uma conta" +  this.numero);
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
if(this.saldo >=valor){
    this.saldo-= valor;
    destino.Depositar(valor);
    return true;
}
    return false;
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
}
