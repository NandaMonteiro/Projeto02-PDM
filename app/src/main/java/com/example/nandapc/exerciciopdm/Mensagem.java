package com.example.nandapc.exerciciopdm;

/**
 * Created by NandaPC on 08/08/2016.
 */
public class Mensagem {

    private int id;
    private String mensagem;

    public Mensagem() {
    }

    public Mensagem(int id, String mensagem) {
        this.id = id;
        this.mensagem = mensagem;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }
}
