package com.estruturasDadosFilas.Estruturadedadosfilas.exercicios;

import com.estruturasDadosFilas.Estruturadedadosfilas.models.Fila;

public class Exercicio02 {
    public static void main( String[] args ) {

        Fila<String> regular = new Fila<>();
        Fila<String> prioridades = new Fila<>();

        final int MAX_PRIORIDADE = 3;

        regular.enfileirar("\nPessoa 1");
        regular.enfileirar("\nPessoa 2");
        regular.enfileirar("\npessoa 3");
        prioridades.enfileirar("\nPessoa 1p");
        prioridades.enfileirar("\nPessoa 2p");
        prioridades.enfileirar("\nPessoa 3p");
        prioridades.enfileirar("\nPessoa 4p");
        prioridades.enfileirar("\nPessoa 5p");
        regular.enfileirar("\nPessoa 4");
        regular.enfileirar("\nPessoa 5");
        regular.enfileirar("\nPessoa 6");
        regular.enfileirar("\nPessoa 7");
        regular.enfileirar("\nPessoa 8");

        while (!regular.estaVazia() || prioridades.estaVazia()) {

            int contador = 0;

            while (!prioridades.estaVazia() && contador < MAX_PRIORIDADE) {
                atendePessoa(prioridades);
                contador++;
            }
            if (!regular.estaVazia()) {
                atendePessoa(regular);
            }
            if (prioridades.estaVazia()) {
                while (!regular.estaVazia()) {
                    atendePessoa(regular);
                }
            }

        }
    }

    public static void atendePessoa( Fila<String> fila ) {
        String pessoaAtendida = fila.desenfileirar();
        System.out.println(pessoaAtendida + " foi atendida ");
    }


}
