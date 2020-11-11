package com.gabrielalmeida.mathquizgabrielalmeida.model;

import java.util.ArrayList;
import java.util.List;

public class QuestaoRepositorio {

    public List<Questao> getListaQuestoes(){
        return new ArrayList<Questao>(){{
            add(new Questao("imagem1", "Qual o número de honra de todo Corinthiano", 171,24));
            add(new Questao("imagem2", "Texto da pergunda 2", 15,20));
            add(new Questao("imagem3", "Texto da pergunda 3", 20,10));
            add(new Questao("imagem4","Texto da pergunda 4", 14,10.5));
            add(new Questao("imagem5", "Texto da pergunda 5", 750,1250));
        }};
    }
}
