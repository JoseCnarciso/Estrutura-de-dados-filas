package com.estruturasDadosFilas.Estruturadedadosfilas.models;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Pessoa implements Comparable<Pessoa> {

    private String nome;
    private int prioridade;

    @Override
    public int compareTo( Pessoa pessoa ) {

        if (prioridade > pessoa.prioridade) {
            return 1;
        } else if (prioridade < pessoa.prioridade) {
            return -1;
        }
        return 0;
    }
}
