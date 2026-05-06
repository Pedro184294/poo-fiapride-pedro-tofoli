package br.com.fiapride.model;

public class Moto extends Veiculo {

    private boolean temBau;

    public Moto(String modelo, String placa, boolean temBau) {
        super(modelo, placa);
        this.temBau = temBau;
    }

    public boolean isTemBau() {
        return temBau;
    }

    @Override
    public String emitirSom() {
        return "Rááááá 🚀";
    }
}