package br.com.cp3.fiapride;

import br.com.fiapride.model.Passageiro;

public class Principal {

    public static void main(String[] args) {

        Passageiro p1 = new Passageiro();

        p1.setNome("Ana");
        p1.setSaldo(50.0);

        // TESTE DE VALOR INVÁLIDO NO SETTER
        p1.setSaldo(-50);

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