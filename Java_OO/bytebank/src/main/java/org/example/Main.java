package org.example;

public class Main {
    public static void main(String[] args) {
        Conta conta1 = new Conta();
        conta1.saldo = 350;
        System.out.println(conta1.saldo);

        conta1.saldo +=200;
        System.out.println(conta1.saldo);

        Conta conta2 = new Conta();
        conta2.saldo = 150;

        System.out.println("Conta 1: " + conta1.saldo);

        System.out.println("Conta 2: " + conta2.saldo);
    }
}