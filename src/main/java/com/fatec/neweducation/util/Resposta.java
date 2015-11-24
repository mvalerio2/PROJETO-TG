/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.fatec.neweducation.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Resposta {

    private List<String> certa;

    private List<String> errada;

    private List<String> emoticonCertos;

    private List<String> emoticonErrados;


    public Resposta() {
        this.makeListCerta();
        this.makeListErrada();
        this.makeListEmoticonCertos();
        this.makeListEmoticonErrados();
    }

    //Metodos de inicialização
    public void makeListCerta() {
        this.certa = new ArrayList<String>();

        this.certa.add("Está mandando muito bem.");
        this.certa.add("Essa foi fácil.");
        this.certa.add("Está detonando.");
        this.certa.add("Parabéns! Você está indo muito bem.");
        this.certa.add("Não tem pra ninguém.");
        this.certa.add("Boa! Está jogando muito bem.");
    }

    public void makeListErrada() {
        this.errada = new ArrayList<String>();

        this.errada.add("Que pena. Essa não era a certa.");
        this.errada.add("Tudo bem, na próxima você acerta.");
        this.errada.add("Essa estava bem díficil.");
    }

    public void makeListEmoticonErrados() {
        this.emoticonErrados = new ArrayList<String>();

        this.emoticonErrados.add("confuso");
        this.emoticonErrados.add("meio_sorriso");
        this.emoticonErrados.add("normal");
        this.emoticonErrados.add("professor_triste");
        this.emoticonErrados.add("triste");
        this.emoticonErrados.add("own");
        this.emoticonErrados.add("triste_roxo");
    }

    public void makeListEmoticonCertos() {
        this.emoticonCertos = new ArrayList<String>();

        this.emoticonCertos.add("descolado");
        this.emoticonCertos.add("esperto");
        this.emoticonCertos.add("feliz");
        this.emoticonCertos.add("feliz_roxo");
        this.emoticonCertos.add("joia");
        this.emoticonCertos.add("nerd");
        this.emoticonCertos.add("orgulhoso");
        this.emoticonCertos.add("paz_amor");
        this.emoticonCertos.add("piscadinha");
        this.emoticonCertos.add("professor");
        this.emoticonCertos.add("sorriso");
        this.emoticonCertos.add("super_feliz");
    }

    public List<String> getCerta() {
        Collections.shuffle(certa);
        return certa;
    }

    public void setCerta(List<String> certa) {
        this.certa = certa;
    }

    public List<String> getErrada() {
        Collections.shuffle(errada);
        return errada;
    }

    public void setErrada(List<String> errada) {
        this.errada = errada;
    }

    public List<String> getEmoticonCertos() {
        Collections.shuffle(emoticonCertos);
        return emoticonCertos;
    }

    public void setEmoticonCertos(List<String> emoticonCertos) {
        this.emoticonCertos = emoticonCertos;
    }

    public List<String> getEmoticonErrados() {
        Collections.shuffle(emoticonErrados);
        return emoticonErrados;
    }

    public void setEmoticonErrados(List<String> emoticonErrados) {
        this.emoticonErrados = emoticonErrados;
    }




}
