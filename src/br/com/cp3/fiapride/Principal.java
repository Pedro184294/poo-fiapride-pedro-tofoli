package br.com.cp3.fiapride;

import br.com.fiapride.model.Passageiro;

public class Principal {

    public static void main(String[] args) {

        // 🔹 AGORA USANDO CONSTRUTOR
        Passageiro p1 = new Passageiro("Ana", 50.0);

        System.out.println("=== INICIAL ===");
        p1.exibirInformacoes();

        // TESTES
        p1.adicionarSaldo(20);
        p1.debitarSaldo(30);

        p1.adicionarSaldo(-10);
        p1.debitarSaldo(100);

        System.out.println("=== FINAL ===");
        p1.exibirInformacoes();
    }
}