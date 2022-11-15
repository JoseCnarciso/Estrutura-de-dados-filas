package com.estruturasDadosFilas.Estruturadedadosfilas.models;

import javax.swing.*;

public class Fila<T> extends EstruturaEstatica<T> {

    public Fila( int capacidade ) {
        super(capacidade);
    }

    public Fila() {
        super();
    }

    public void enfileirar( T elemento ) {

        // Primeira opção
//        this.elementos[this.tamanho] =elemento;
//        this.tamanho++;

        //Segunda opção
//        this.elementos[this.tamanho++] = elemento;

        this.adiciona(elemento);
    }

    public T espiar() {
        if (this.estaVazia()) {
            String msg = " A fila está vazia";
            return (T) msg;
        }
        return this.elementos[0];
    }

    public T desenfileirar() {

        final int POSICAO = 0;
        if (this.estaVazia()) {
            return null;
        }

        T elementoAserRemovido = this.elementos[POSICAO];

        this.remove(POSICAO);
//        for (int i = POSICAO; i < tamanho - 1; i++) {
//            elementos[i] = elementos[i + 1];
//        }
//        tamanho--;
        return elementoAserRemovido;
    }



}
