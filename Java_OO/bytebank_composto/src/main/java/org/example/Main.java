package org.example;

public class Main {
    public static void main(String[] args) {

        Cliente john = new Cliente();
        john.nome = "John da Silva";
        john.cpf = "555.555.555-33";
        john.profissao = "Analista";

        Conta conta1 = new Conta();
        conta1.Depositar(200);

        conta1.titular = john;
        System.out.println(conta1.titular.nome);
    }
}