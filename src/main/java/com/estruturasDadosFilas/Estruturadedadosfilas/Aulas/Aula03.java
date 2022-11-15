package com.estruturasDadosFilas.Estruturadedadosfilas.Aulas;

import com.estruturasDadosFilas.Estruturadedadosfilas.models.Fila;

public class Aula03 {
    public static void main( String[] args ) {

        Fila<Integer> fila = new Fila<>();

        System.out.println(fila.espiar());


        fila.enfileirar(5);
        fila.enfileirar(1);
        fila.enfileirar(2);
        fila.enfileirar(3);
        fila.enfileirar(4);

        System.out.println(fila.espiar());

        System.out.println(fila.toString());

        System.out.println(fila.tamanho());


    }
}
