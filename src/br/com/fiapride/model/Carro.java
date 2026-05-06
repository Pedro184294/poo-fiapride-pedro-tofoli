package br.com.fiapride.model;

public class Carro extends Veiculo {

    private int numeroPortas;

    public Carro(String modelo, String placa, int numeroPortas) {
        super(modelo, placa);
        this.numeroPortas = numeroPortas;
    }

    public int getNumeroPortas() {
        return numeroPortas;
    }

    @Override
    public String emitirSom() {
        return "Vrum Vrum 🚗";
    }
}