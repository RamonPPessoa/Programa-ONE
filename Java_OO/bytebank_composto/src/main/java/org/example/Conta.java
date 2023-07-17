package org.example;

public class Conta {
   private double saldo;
    int agencia;
    int numero;
    Cliente titular;

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

    public double exibeSaldo() {
        return this.saldo;
    }
}
