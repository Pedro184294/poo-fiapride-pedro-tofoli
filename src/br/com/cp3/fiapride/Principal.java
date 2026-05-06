package br.com.cp3.fiapride;

import br.com.fiapride.model.*;
import java.util.ArrayList;
import java.util.List;

public class Principal {

    public static void main(String[] args) {

        System.out.println("===== TESTE GERAL DO SISTEMA =====\n");

        // =============================
        // 🔹 CRIAÇÃO DOS OBJETOS
        // =============================

        Carro carro = new Carro("Toyota Corolla", "ABC-1234", 4);
        Moto moto = new Moto("Honda CG", "XYZ-9999", true);

        Passageiro p1 = new Passageiro("Ana", 50.0, carro);

        // =============================
        // 🔹 TESTE PASSAGEIRO
        // =============================

        System.out.println("=== PASSAGEIRO ===");
        p1.exibirInformacoes();

        p1.adicionarSaldo(20);
        p1.debitarSaldo(30);

        System.out.println("\n=== PASSAGEIRO APÓS OPERAÇÕES ===");
        p1.exibirInformacoes();

        // =============================
        // 🔹 POLIMORFISMO (HERANÇA)
        // =============================

        System.out.println("\n=== POLIMORFISMO (VEÍCULOS) ===");

        List<Veiculo> veiculos = new ArrayList<>();
        veiculos.add(carro);
        veiculos.add(moto);

        for (Veiculo v : veiculos) {
            System.out.println(v.getModelo() + " - " + v.emitirSom());
        }

        // =============================
        // 🔹 INTERFACE (Pagavel)
        // =============================

        System.out.println("\n=== INTERFACE PAGÁVEL ===");

        List<Pagavel> pagamentos = new ArrayList<>();
        pagamentos.add(p1);
        pagamentos.add(carro);
        pagamentos.add(moto);

        for (Pagavel p : pagamentos) {
            System.out.println("Valor calculado: " + p.calcularPagamento());
        }

        System.out.println("\n===== FIM DO TESTE =====");
    }
}