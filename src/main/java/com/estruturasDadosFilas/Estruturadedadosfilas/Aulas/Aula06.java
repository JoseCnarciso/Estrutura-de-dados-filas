package com.estruturasDadosFilas.Estruturadedadosfilas.Aulas;

import com.estruturasDadosFilas.Estruturadedadosfilas.models.FilaComPrioridade;
import com.estruturasDadosFilas.Estruturadedadosfilas.models.Paciente;

import java.util.LinkedList;
import java.util.Queue;

public class Aula06 {
    public static void main( String[] args ) {

        FilaComPrioridade<Integer> filac = new FilaComPrioridade<>();
        filac.enfileirar(1);
        filac.enfileirar(3);
        filac.enfileirar(2);
        filac.enfileirar(4);

        System.out.println(filac);



        FilaComPrioridade<Paciente> fila = new FilaComPrioridade<>();

        fila.enfileirar(new Paciente("A",2));
        fila.enfileirar(new Paciente("c",1));
        fila.enfileirar(new Paciente("D",3));
        fila.enfileirar(new Paciente("B",4));
        System.out.println(fila);
        System.out.println(fila.desenfileirar());





    }
}
