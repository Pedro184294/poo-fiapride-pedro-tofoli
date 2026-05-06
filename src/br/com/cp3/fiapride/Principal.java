package br.com.cp3.fiapride;

public class Principal {

    public static void main(String[] args) {

        Passageiro p1 = new Passageiro();

        p1.nome = "Ana";
        p1.saldo = 50.0;

        // usando o método (ação)
        p1.exibirInformacoes();
    }
}