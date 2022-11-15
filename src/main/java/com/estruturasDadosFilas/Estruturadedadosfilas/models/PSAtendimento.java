package com.estruturasDadosFilas.Estruturadedadosfilas.models;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class PSAtendimento implements Runnable {

    private FilaComPrioridade<Pessoa> fila;


    @Override
    public void run() {
        while (!fila.estaVazia()) {
            try {
                System.out.println(fila.desenfileirar() + " atendida. ");

                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        System.out.println("Atendimento concluido. ");

    }
}
