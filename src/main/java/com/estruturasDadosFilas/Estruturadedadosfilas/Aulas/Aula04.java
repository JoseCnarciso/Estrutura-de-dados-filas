package com.estruturasDadosFilas.Estruturadedadosfilas.Aulas;

import com.estruturasDadosFilas.Estruturadedadosfilas.models.Fila;

public class Aula04 {
    public static void main( String[] args ) {

        Fila<Integer> fila = new Fila<>();

        System.out.println(fila.espiar());


        fila.enfileirar(0); // primeira posição
        fila.enfileirar(1); // segunda posição
        fila.enfileirar(2); // terceira posição
        fila.enfileirar(3); // quarta posição
        fila.enfileirar(4); // quinta posição

        System.out.println(fila.espiar());
        System.out.println(fila.toString());
        System.out.println(fila.desenfileirar());
        System.out.println(fila.toString());
        System.out.println(fila.desenfileirar());
        System.out.println(fila.toString());
        System.out.println(fila.desenfileirar());
        System.out.println(fila.desenfileirar());
        System.out.println(fila.toString());
        System.out.println(fila.desenfileirar());





        System.out.println(fila.espiar());
        System.out.println(fila);


    }
}
