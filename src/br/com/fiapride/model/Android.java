package br.com.fiapride.model;

public class Android extends Dispositivo implements Conectavel {

    private String versaoAndroid;

    public Android(String modelo,
                   int armazenamento,
                   String versaoAndroid) {

        super(modelo, armazenamento);

        this.versaoAndroid = versaoAndroid;
    }

    public String getVersaoAndroid() {
        return versaoAndroid;
    }

    @Override
    public String ligar() {

        return "Android iniciando...";
    }

    @Override
    public String conectarWifi() {

        return "Android conectado ao Wi-Fi";
    }
}