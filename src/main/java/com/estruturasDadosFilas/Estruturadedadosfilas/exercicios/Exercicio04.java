package com.estruturasDadosFilas.Estruturadedadosfilas.exercicios;

import com.estruturasDadosFilas.Estruturadedadosfilas.models.Fila;

import java.util.Random;

public class Exercicio04 {
    public static void main( String[] args ) {

        Fila<Integer> fila = new Fila<>();

        for (int i = 0; i < 10; i++) {
            fila.enfileirar(i);
        }

        Random aleatorio = new Random();

        int numero = 0;

        while (numero == 0) {
            numero = aleatorio.nextInt(10);
        }

        System.out.println("Número: " + numero);

        while (fila.tamanho() > 1 ){

            for (int i =0; i <numero; i++){
                fila.enfileirar(fila.desenfileirar());
            }
            System.out.println("Eliminado:  " + fila.desenfileirar());
        }

        System.out.println("Ganhador: " + fila.desenfileirar());


    }
}
