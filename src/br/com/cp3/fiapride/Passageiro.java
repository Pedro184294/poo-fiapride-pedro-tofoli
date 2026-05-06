package br.com.cp3.fiapride;

public class Passageiro {

    String nome;
    double saldo;

    void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Saldo: " + saldo);
    }

    // MÉTODO 1
    void adicionarSaldo(double valor) {
        if (valor <= 0) {
            System.out.println("Valor inválido para adicionar!");
            return;
        }
        saldo += valor;
    }

    // MÉTODO 2
    void debitarSaldo(double valor) {
        if (valor <= 0) {
            System.out.println("Valor inválido para débito!");
            return;
        }
        if (valor > saldo) {
            System.out.println("Saldo insuficiente!");
            return;
        }
        saldo -= valor;
    }
}