package com.estruturasDadosFilas.Estruturadedadosfilas.models;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.Random;


@AllArgsConstructor
@NoArgsConstructor
public class PSNovosPacientes implements Runnable {

    private FilaComPrioridade<Pessoa> fila;
    private int contador = 7;
    private Random prioridade = new Random();

    public PSNovosPacientes( FilaComPrioridade<Pessoa> fila ) {
        this.fila = fila;
    }

    @Override
    public void run() {

        for (int i = 0; i < 8; i++) {
            try {
                Thread.sleep(8000);
                Pessoa pessoa = new Pessoa("" + contador, prioridade.nextInt(3));
                fila.enfileirar(pessoa);
                contador++;
                System.out.println(pessoa + " enfileirada.");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
