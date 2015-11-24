package com.fatec.neweducation.model.resources;

/**
 * Created by glaucia on 29/06/14.
 */
public enum TypeQuestion {

    FAE1("FAE 1"),
    FAE2("FAE 2"),
    FAE3("FAE 3"),
    FAE4("FAE 4"),
    FAE5("FAE 5"),
    FAE6("FAE 6");

    private String valor;

    TypeQuestion(String valor) {
        this.valor = valor;
    }

    public String getValor() {
        return valor;
    }

}
