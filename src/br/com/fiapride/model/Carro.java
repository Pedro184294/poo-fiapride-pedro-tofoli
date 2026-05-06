package br.com.fiapride.model;

public class Carro extends Veiculo implements Pagavel {

    private int numeroPortas;

    public Carro(String modelo, String placa, int numeroPortas) {
        super(modelo, placa);
        this.numeroPortas = numeroPortas;
    }

    public int getNumeroPortas() {
        return numeroPortas;
    }

    // POLIMORFISMO
    @Override
    public String emitirSom() {
        return "Vrum Vrum 🚗";
    }

    // INTERFACE
    @Override
    public double calcularPagamento() {
        return 50 * Pagavel.TAXA;
    }
}