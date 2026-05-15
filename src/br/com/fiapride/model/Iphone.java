package br.com.fiapride.model;

public class Iphone extends Dispositivo implements Conectavel {

    private boolean faceId;

    public Iphone(String modelo,
                  int armazenamento,
                  boolean faceId) {

        super(modelo, armazenamento);

        this.faceId = faceId;
    }

    public boolean isFaceId() {
        return faceId;
    }

    @Override
    public String ligar() {

        return "iPhone iniciando...";
    }

    @Override
    public String conectarWifi() {

        return "iPhone conectado ao Wi-Fi";
    }
}