package com.fatec.neweducation.model.resources;

/**
 * Created by glaucia on 29/06/14.
 */
public enum TypeUser {

    EDUCADOR("Educador"),
    ESTUDANTE("Estudante");

    private String valor;

    TypeUser(String valor) {
        this.valor = valor;
    }

    public String getValor() {
        return valor;
    }


}
