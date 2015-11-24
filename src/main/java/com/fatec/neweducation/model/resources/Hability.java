package com.fatec.neweducation.model.resources;

/**
 * Created by glaucia on 29/06/14.
 */
public enum Hability {

    ALITERACAO("Aliteração"),
    RIMA("Rima"),
    SEGMENTACAOSILABICA("Segmentação Silábica"),
    DISCRIMINACAOFONEMICA("Discriminação Fonêmica"),
    MEMORIAFONOLOGICA("Memória Fonológica"),
    REPETICAODEPSEUDOPALAVRAS("Repetição de Pseudopalavras"),
    COPIADEERITMO("Cópia de Ritmo"),
    MEMORIAVISUAL("Memória Visual"),
    COPIADEFORMAS("Cópia de Formas");

    private String valor;

    Hability(String valor) {
        this.valor = valor;
    }

    public String getValor() {
        return valor;
    }
}
