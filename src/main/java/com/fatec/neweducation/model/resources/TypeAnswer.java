package com.fatec.neweducation.model.resources;

/**
 * Created by glaucia on 09/07/14.
 */
public enum TypeAnswer {
    FAE1("FAE1"),
    FAE2("FAE2"),
    FAE3("FAE3"),
    FAE4("FAE4"),
    FAE5("FAE5"),
    FAE6("FAE6");

    private String valor;

    TypeAnswer(String valor) {
        this.valor = valor;
    }

    public String getValor() {
        return valor;
    }
}
