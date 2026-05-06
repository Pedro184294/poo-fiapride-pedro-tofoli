package br.com.cp3.fiapride;

import br.com.fiapride.model.*;
import java.util.ArrayList;
import java.util.List;

public class Principal {

    public static void main(String[] args) {

        Carro carro = new Carro("Toyota Corolla", "ABC-1234", 4);
        Moto moto = new Moto("Honda CG", "XYZ-9999", true);

        List<Veiculo> veiculos = new ArrayList<>();

        veiculos.add(carro);
        veiculos.add(moto);

        System.out.println("=== TESTE CLASSE ABSTRATA ===");

        for (Veiculo v : veiculos) {
            System.out.println(v.getModelo() + " - " + v.emitirSom());
        }
    }
}