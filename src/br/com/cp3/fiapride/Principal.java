package br.com.cp3.fiapride;

import br.com.fiapride.model.*;
import java.util.ArrayList;
import java.util.List;

public class Principal {

    public static void main(String[] args) {

        System.out.println("===== SISTEMA DE SMARTPHONES =====\n");

        Android android = new Android("Samsung Galaxy", 256, "Android 14");

        Iphone iphone = new Iphone("iPhone 15", 512, true);

        Smartphone smartphone = new Smartphone(
                "Pedro",
                android
        );

        System.out.println("=== SMARTPHONE ===");
        smartphone.exibirInformacoes();

        System.out.println("\n=== POLIMORFISMO ===");

        List<Dispositivo> dispositivos = new ArrayList<>();

        dispositivos.add(android);
        dispositivos.add(iphone);

        for (Dispositivo dispositivo : dispositivos) {

            System.out.println(
                    dispositivo.getModelo()
                    + " -> "
                    + dispositivo.ligar()
            );
        }

        System.out.println("\n=== INTERFACE ===");

        List<Conectavel> conectaveis = new ArrayList<>();

        conectaveis.add(android);
        conectaveis.add(iphone);

        for (Conectavel c : conectaveis) {

            System.out.println(
                    "Conexão: "
                    + c.conectarWifi()
            );
        }

        System.out.println("\n===== FIM =====");
    }
}