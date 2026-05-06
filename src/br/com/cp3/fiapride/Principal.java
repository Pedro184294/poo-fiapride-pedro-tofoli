package br.com.cp3.fiapride;

import br.com.fiapride.model.Passageiro;
import br.com.fiapride.model.Veiculo;

public class Principal {

    public static void main(String[] args) {

        Veiculo v1 = new Veiculo("Toyota Corolla", "ABC-1234");

        Passageiro p1 = new Passageiro("Ana", 50.0, v1);

        System.out.println("=== INICIAL ===");
        p1.exibirInformacoes();

        p1.adicionarSaldo(20);
        p1.debitarSaldo(30);

        System.out.println("=== FINAL ===");
        p1.exibirInformacoes();
    }
}