package org.example;

public class ExemploReferencia {
    public static void main(String[] args) {
        Conta conta1 = new Conta();
        conta1.saldo = 350;
        System.out.println("Saldo da conta 1 :" + conta1.saldo);


        Conta conta2 = conta1;

        conta2.saldo = 200;

        System.out.println("Saldo da conta 1 :" + conta1.saldo);
        System.out.println("Saldo da conta 2 :" + conta2.saldo);

    }
}
