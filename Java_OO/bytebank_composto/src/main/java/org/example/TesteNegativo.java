package org.example;

public class TesteNegativo {
    public static void main(String[] args) {
            Conta conta = new Conta();
            conta.Depositar(200);
        System.out.println(conta.Saca(300) );

       conta.Saca(300);

        System.out.println(conta.getSaldo());
    }
}
