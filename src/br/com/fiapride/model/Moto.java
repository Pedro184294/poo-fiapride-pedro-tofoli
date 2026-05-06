package br.com.fiapride.model;

public class Moto extends Veiculo {

    private boolean temBau;

    public Moto(String modelo, String placa, boolean temBau) {
        super(modelo, placa); // 🔥 chama construtor da mãe
        this.temBau = temBau;
    }

    public boolean isTemBau() {
        return temBau;
    }
}