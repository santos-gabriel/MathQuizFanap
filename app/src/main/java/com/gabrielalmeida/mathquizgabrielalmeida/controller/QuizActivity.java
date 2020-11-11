package com.gabrielalmeida.mathquizgabrielalmeida.controller;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.gabrielalmeida.mathquizgabrielalmeida.R;

import com.gabrielalmeida.mathquizgabrielalmeida.model.AnalizadorQuestao;
import com.gabrielalmeida.mathquizgabrielalmeida.model.Questao;
import com.gabrielalmeida.mathquizgabrielalmeida.model.QuestaoRepositorio;

public class QuizActivity extends AppCompatActivity {

    private QuestaoRepositorio repositorio = new QuestaoRepositorio();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        Questao questao = repositorio.getListaQuestoes().get(0);

        TextView textViewTextoPergunta = findViewById(R.id.txtPergunta);
        textViewTextoPergunta.setText(questao.getTexto());

        Button botaoResposta1 = findViewById(R.id.btnResposta1);
        botaoResposta1.setText(String.valueOf(questao.getRespostaCorreta()));

        View.OnClickListener listener = new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                final String resposta = ((Button)view).getText().toString();

                AnalizadorQuestao analisadorQuestao = new AnalizadorQuestao();
                Questao questao = repositorio.getListaQuestoes().get(0);

                String mensagem = "";

                if (analisadorQuestao.isRespostaCorreta(questao, Double.valueOf(resposta))) {
                    mensagem = "Parabéns, a resposta está correta :) !!!";
                } else {
                    mensagem = "Aah, a resposta está incorreta :( !!!";
                }

                Toast.makeText(QuizActivity.this, mensagem, Toast.LENGTH_SHORT).show();
            }
        };

        botaoResposta1.setOnClickListener(listener);

        Button botaoResposta2 = findViewById(R.id.btnResposta2);
        botaoResposta2.setText(String.valueOf(questao.getRespostaIncorreta()));

        botaoResposta2.setOnClickListener(listener);

        Button botaoProximaPergunta = findViewById(R.id.btnProsseguir);
        botaoProximaPergunta.setText("Próxima pergunta...");

    }
}