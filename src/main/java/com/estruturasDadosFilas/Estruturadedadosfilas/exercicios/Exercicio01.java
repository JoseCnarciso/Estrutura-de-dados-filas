package com.estruturasDadosFilas.Estruturadedadosfilas.exercicios;

import com.estruturasDadosFilas.Estruturadedadosfilas.models.Documento;
import com.estruturasDadosFilas.Estruturadedadosfilas.models.Fila;

public class Exercicio01 {
    public static void main( String[] args ) {

        Fila<Documento> filaImpressoa = new Fila<>();

        filaImpressoa.enfileirar(new Documento("A",5));
        filaImpressoa.enfileirar(new Documento("B",4));
        filaImpressoa.enfileirar(new Documento("C",12));
        filaImpressoa.enfileirar(new Documento("D",0));

        while (!filaImpressoa.estaVazia()){
            Documento doc = filaImpressoa.desenfileirar();
            System.out.println("Imprimimdo documentos: " + doc.getNome());
            try {
                Thread.sleep(200 * doc.getNumeroFolhas());
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }

        System.out.println("Todos os documentos foram impressos.");

    }
}
