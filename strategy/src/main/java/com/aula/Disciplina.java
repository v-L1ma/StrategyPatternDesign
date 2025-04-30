package com.aula;

public class Disciplina {
    private String nome;
    private double p1;
    private double p2;
    private double media;
    private String situacao;
    private MediaStrategy estrategia;

    public Disciplina (MediaStrategy estrategia) {
       this.estrategia = estrategia;
    }

    public double calcularMedia(){
        return this.media= estrategia.calcularMedia(p1,p2);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getP1() {
        return p1;
    }

    public void setP1(double p1) {
        this.p1 = p1;
    }

    public double getP2() {
        return p2;
    }

    public void setP2(double p2) {
        this.p2 = p2;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    public String getSituacao() {
        return estrategia.verificarSituacao(media);
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public MediaStrategy getEstrategia() {
        return estrategia;
    }

    public void setEstrategia(MediaStrategy estrategia) {
        this.estrategia = estrategia;
    }
}
