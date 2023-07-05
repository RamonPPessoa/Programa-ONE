package org.example;

public class TestaMetodo {
    public static void main(String[] args) {
            Conta conta1 = new Conta();
            conta1.saldo = 200;
            conta1.Depositar(150);

        System.out.println( conta1.saldo);
        conta1.Saca(50);
        System.out.println(conta1.saldo );
    }
}
