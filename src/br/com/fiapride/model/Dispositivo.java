package br.com.fiapride.model;

public abstract class Dispositivo {

    private String modelo;
    private int armazenamento;

    public Dispositivo(String modelo, int armazenamento) {

        this.modelo = modelo;
        setArmazenamento(armazenamento);
    }

    public String getModelo() {
        return modelo;
    }

    public int getArmazenamento() {
        return armazenamento;
    }

    public void setArmazenamento(int armazenamento) {

        if (armazenamento <= 0) {

            System.out.println("Armazenamento inválido!");
            return;
        }

        this.armazenamento = armazenamento;
    }

    public abstract String ligar();
}