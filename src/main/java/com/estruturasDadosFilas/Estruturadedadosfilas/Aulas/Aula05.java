package com.estruturasDadosFilas.Estruturadedadosfilas.Aulas;

import java.util.LinkedList;
import java.util.Queue;

public class Aula05 {
    public static void main( String[] args ) {
        Queue<Integer> fila = new LinkedList<>();
        fila.add(1); // enqueue  =  enfileirar
        fila.add(2);
        fila.add(3);

        System.out.println(fila);
        System.out.println("\n" + fila.peek());  // peek() = espiar()

        System.out.println(fila.remove());
        System.out.println(fila);

    }
}
