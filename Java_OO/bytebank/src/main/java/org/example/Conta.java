package org.example;

public class Conta {
    double saldo;
    int agencia;
    int numero;
    String titular;

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


}
