package com.fatec.neweducation.model.resources;

/**
 * Created by glaucia on 29/06/14.
 */
public enum State {

    SAOPAULO("São Paulo"),
    BAHIA("Bahia"),
    MINASGERAIS("Minas Gerais"),
    ESPIRITOSANTO("Espírito Santo"),
    TOCANTINS("Tocantins"),
    RIOGRANDEDOSUL("Rio Grande do Sul"),
    RIODEJANEIRO("Rio de Janeiro"),
    ACRE("Acre"),
    PERNANBUCO("Pernanbuco"),
    PARAIBA("Paraíba"),
    RIOGRANDEDONORTE("Rio Grande do Norte"),
    AMAZONAS("Amazonas"),
    CEARA("Ceará");

    private String valor;

    State(String valor) {
        this.valor = valor;
    }

    public String getValor() {
        return valor;
    }

}
