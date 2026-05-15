package br.com.fiapride.model;

public class Smartphone {

    private String dono;
    private Dispositivo dispositivo;

    public Smartphone(String dono, Dispositivo dispositivo) {

        setDono(dono);
        this.dispositivo = dispositivo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {

        if (dono == null || dono.isEmpty()) {

            System.out.println("Nome inválido!");
            return;
        }

        this.dono = dono;
    }

    public Dispositivo getDispositivo() {
        return dispositivo;
    }

    public void exibirInformacoes() {

        System.out.println("Dono: " + dono);

        System.out.println("Dispositivo: "
                + dispositivo.getModelo());
    }
}