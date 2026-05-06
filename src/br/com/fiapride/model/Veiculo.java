package br.com.fiapride.model;

public abstract class Veiculo { 

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

    // MÉTODO ABSTRATO (SEM IMPLEMENTAÇÃO)
    public abstract String emitirSom();
}