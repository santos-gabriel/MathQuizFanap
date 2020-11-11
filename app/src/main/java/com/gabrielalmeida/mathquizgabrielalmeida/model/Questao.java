package com.gabrielalmeida.mathquizgabrielalmeida.model;
public class Questao {
    private String imagem;
    private String texto;
    private double respostaCorreta;
    private double respostaIncorreta;

    public Questao(){ }

    public Questao(String imagem, String texto, double respostaCorreta, double respostaIncorreta){
        this.imagem = imagem;
        this.texto = texto;
        this.respostaCorreta = respostaCorreta;
        this.respostaIncorreta = respostaIncorreta;
    }

    public String getImagem(){
        return this.imagem;
    }

    public void setImagem(String imagem){
        this.imagem = imagem;
    }

    public String getTexto(){
        return this.texto;
    }

    public void setTexto(String texto){
        this.texto = texto;
    }

    public double getRespostaCorreta(){
        return this.respostaCorreta;
    }

    public void setRespostaCorreta(double respostaCorreta){
        this.respostaCorreta = respostaCorreta;
    }

    public double getRespostaIncorreta(){
        return this.respostaIncorreta;
    }

    public void setRespostaIncorreta(double respostaIncorreta){
        this.respostaIncorreta = respostaIncorreta;
    }

}
