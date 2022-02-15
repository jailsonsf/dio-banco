package com.diobanco;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setNome("Jailson");

        Conta cc = new ContaCorrente(cliente);
        Conta cp = new ContaPoupanca(cliente);

        cc.depositar(100);
        cc.transferir(40, cp);

        cp.sacar(20);

        cc.extrato();
        cp.extrato();
    }
}
