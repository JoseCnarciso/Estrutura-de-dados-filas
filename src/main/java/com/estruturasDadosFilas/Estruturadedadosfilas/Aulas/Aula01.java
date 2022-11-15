package com.estruturasDadosFilas.Estruturadedadosfilas.Aulas;

import com.estruturasDadosFilas.Estruturadedadosfilas.models.Fila;

public class Aula01 {
    public static void main( String[] args ) {

        Fila<Integer> novaFila = new Fila<>();

        System.out.println(novaFila.estaVazia());
        System.out.println(novaFila.tamanho());
    }

}
