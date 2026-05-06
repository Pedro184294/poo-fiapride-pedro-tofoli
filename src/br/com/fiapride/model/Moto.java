package br.com.fiapride.model;

public class Moto extends Veiculo implements Pagavel {

    private boolean temBau;

    public Moto(String modelo, String placa, boolean temBau) {
        super(modelo, placa);
        this.temBau = temBau;
    }

    public boolean isTemBau() {
        return temBau;
    }

    // POLIMORFISMO
    @Override
    public String emitirSom() {
        return "Rááááá 🚀";
    }

    // INTERFACE
    @Override
    public double calcularPagamento() {
        return 30 * Pagavel.TAXA;
    }
}