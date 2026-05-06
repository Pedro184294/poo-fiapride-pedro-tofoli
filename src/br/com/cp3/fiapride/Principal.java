package br.com.cp3.fiapride;

import br.com.fiapride.model.*;

public class Principal {

    public static void main(String[] args) {

        Carro carro = new Carro("Toyota Corolla", "ABC-1234", 4);
        Moto moto = new Moto("Honda CG", "XYZ-9999", true);

        Passageiro p1 = new Passageiro("Ana", 50.0, carro);

        System.out.println("=== PASSAGEIRO COM CARRO ===");
        p1.exibirInformacoes();

        System.out.println("\n=== TESTE MOTO ===");
        System.out.println("Modelo: " + moto.getModelo());
        System.out.println("Placa: " + moto.getPlaca());
        System.out.println("Tem baú: " + moto.isTemBau());
    }
}