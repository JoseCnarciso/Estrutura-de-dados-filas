package com.estruturasDadosFilas.Estruturadedadosfilas.Aulas;

import com.estruturasDadosFilas.Estruturadedadosfilas.models.Paciente;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Aula07 {
    public static void main( String[] args ) {


        Queue<Integer> filaComPrioridade = new PriorityQueue<>();
        filaComPrioridade.add(2);
        filaComPrioridade.add(4);
        filaComPrioridade.add(1);
        filaComPrioridade.add(3);
        filaComPrioridade.add(5);

        System.out.println(filaComPrioridade);



        Queue<Paciente> filaComPrioridadePaciente = new PriorityQueue<>(
                new Comparator<Paciente>() {
                    @Override
                    public int compare( Paciente paciente1, Paciente pacient2 ) {
                        return Integer.valueOf(paciente1.getPrioridade()).compareTo(pacient2.getPrioridade());
                    }
                }
        );

        filaComPrioridadePaciente.add(new Paciente("B",2));
        filaComPrioridadePaciente.add(new Paciente("C",1));
        filaComPrioridadePaciente.add(new Paciente("A",3));
        System.out.println("\n" + filaComPrioridadePaciente);



    }
}
