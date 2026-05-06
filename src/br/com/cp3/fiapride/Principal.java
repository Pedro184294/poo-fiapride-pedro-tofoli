package br.com.cp3.fiapride;

public class Principal {

    public static void main(String[] args) {

        Passageiro p1 = new Passageiro();

        p1.nome = "Ana";
        p1.saldo = 50.0;

        System.out.println("=== INICIAL ===");
        p1.exibirInformacoes();

        // TESTES VÁLIDOS
        p1.adicionarSaldo(20);
        p1.debitarSaldo(30);

        // TESTES INVÁLIDOS
        p1.adicionarSaldo(-10);
        p1.debitarSaldo(100);

        System.out.println("=== FINAL ===");
        p1.exibirInformacoes();
    }
}