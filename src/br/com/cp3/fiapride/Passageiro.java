package br.com.cp3.fiapride;

public class Passageiro {

    String nome;
    double saldo;

    // AÇÃO (método)
    void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Saldo: " + saldo);
    }
}