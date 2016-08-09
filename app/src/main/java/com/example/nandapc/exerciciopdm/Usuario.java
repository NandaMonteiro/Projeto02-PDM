package com.example.nandapc.exerciciopdm;

import java.util.List;

/**
 * Created by NandaPC on 08/08/2016.
 */
public class Usuario {

    private String nome;
    private String senha;
    private List<Mensagem> mensagemList;

    public Usuario() {

    }

    public Usuario(String nome, String senha, List<Mensagem> mensagemList) {
        this.nome = nome;
        this.senha = senha;
        this.mensagemList = mensagemList;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public List<Mensagem> getMensagemList() {
        return mensagemList;
    }

    public void setMensagemList(List<Mensagem> mensagemList) {
        this.mensagemList = mensagemList;
    }
}
