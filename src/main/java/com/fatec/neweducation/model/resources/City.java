package com.fatec.neweducation.model.resources;

/**
 * Created by glaucia on 29/06/14.
 */
public enum City {

    SAOJOSEDOSCAMPOS("São José dos Campos"),
    PIRACICABA("Piracicaba"),
    ANGRADOSREIS("Angra dos Reis"),
    RIOBRANCO("Rio Branco"),
    MANAUS("Manaus"),
    SALVADOR("Salvador"),
    VITORIA("Vitória"),
    BELOHORIZONTE("Belo Horizonte"),
    JOAOPESSOA("João Pessoa"),
    RECIFE("Recife"),
    RIODEJANEIRO("Rio de Janeiro"),
    NATAL("Natal"),
    PORTOALEGRE("Porto Alegre"),
    PALMAS("Palmas"),
    FORTALEZA("Fortaleza");

    private String valor;

    City(String valor) {
        this.valor = valor;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }
}
