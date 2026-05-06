package br.com.fiapride.model;

public class Veiculo {

    protected String modelo;
    protected String placa;

    public Veiculo(String modelo, String placa) {
        this.modelo = modelo;
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public String getPlaca() {
        return placa;
    }

    // MÉTODO GENÉRICO
    public String emitirSom() {
        return "Som genérico de veículo";
    }
}