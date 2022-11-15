package com.estruturasDadosFilas.Estruturadedadosfilas.models;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Paciente implements Comparable<Paciente> {

    private String nome;
    private int prioridade;




    // Método utilizado para ordenação
    @Override
    public int compareTo( Paciente paciente ) {

        // paciente1 > paciente2 retorna "> 0 (1)"
        // paciente 1 < paciente2 retorna "< 0 (-1)"



        // paciente1 > paciente2 retorna "> 0 (1)"
        if (this.prioridade > paciente.getPrioridade()) {
            return 1;


            // paciente 1 < paciente2 retorna "< 0 (-1)"
        } else if (this.prioridade < paciente.getPrioridade()) {
            return -1;
        }
        // paciente1 == paciente2 retorna "== 0 (0)"
        return 0;
    }
}
