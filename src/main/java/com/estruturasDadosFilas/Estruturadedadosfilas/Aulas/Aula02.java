package com.estruturasDadosFilas.Estruturadedadosfilas.Aulas;

import com.estruturasDadosFilas.Estruturadedadosfilas.models.Fila;

public class Aula02 {
    public static void main( String[] args ) {

        Fila<Integer> fila = new Fila<>();

        fila.enfileirar(1);
        fila.enfileirar(2);
        fila.enfileirar(3);
        fila.enfileirar(4);

        System.out.println(fila.estaVazia());
        System.out.println(fila.tamanho());
        System.out.println(fila);

    }

}
