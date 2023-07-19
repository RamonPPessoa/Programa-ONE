package org.example;

public class ContaSemCliente {
    public static void main(String[] args) {
        Conta contaPedro =  new Conta();
        System.out.println(contaPedro.getSaldo());

        contaPedro.titular = new Cliente();
        System.out.println(contaPedro.titular);


        contaPedro.titular.nome = " Pedro";
        System.out.println(contaPedro.titular.nome);
    }
}
