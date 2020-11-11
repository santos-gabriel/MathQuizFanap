package com.gabrielalmeida.mathquizgabrielalmeida.model;

public class AnalizadorQuestao {

    public boolean isRespostaCorreta(Questao questao, double resposta){
        return questao.getRespostaCorreta() == resposta;
    }

}
