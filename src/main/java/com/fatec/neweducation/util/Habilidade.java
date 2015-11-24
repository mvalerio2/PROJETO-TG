/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.fatec.neweducation.util;


public class Habilidade {

    private String ALITERACAO;
    private String RIMA;
    private String SEGMENTACAOSILABICA;
    private String DISCRIMINACAOFONEMICA;
    private String MEMORIAFONOLOGICA;
    private String REPETICAODEPSEUDOPALAVRAS;
    private String COPIADEERITMO;
    private String MEMORIAVISUAL;
    private String COPIADEFORMAS;

    public Habilidade() {
        this.buildALITERACAO();
        this.buildCOPIADEERITMO();
        this.buildCOPIADEFORMAS();
        this.buildDISCRIMINACAOFONEMICA();
        this.buildMEMORIAFONOLOGICA();
        this.buildMEMORIAVISUAL();
        this.buildREPETICAODEPSEUDOPALAVRAS();
        this.buildRIMA();
        this.buildSEGMENTACAOSILABICA();
    }

    public String getALITERACAO() {
        return ALITERACAO;
    }

    public void setALITERACAO(String ALITERACAO) {
        this.ALITERACAO = ALITERACAO;
    }

    public String getRIMA() {
        return RIMA;
    }

    public void setRIMA(String RIMA) {
        this.RIMA = RIMA;
    }

    public String getSEGMENTACAOSILABICA() {
        return SEGMENTACAOSILABICA;
    }

    public void setSEGMENTACAOSILABICA(String SEGMENTACAOSILABICA) {
        this.SEGMENTACAOSILABICA = SEGMENTACAOSILABICA;
    }

    public String getDISCRIMINACAOFONEMICA() {
        return DISCRIMINACAOFONEMICA;
    }

    public void setDISCRIMINACAOFONEMICA(String DISCRIMINACAOFONEMICA) {
        this.DISCRIMINACAOFONEMICA = DISCRIMINACAOFONEMICA;
    }

    public String getMEMORIAFONOLOGICA() {
        return MEMORIAFONOLOGICA;
    }

    public void setMEMORIAFONOLOGICA(String MEMORIAFONOLOGICA) {
        this.MEMORIAFONOLOGICA = MEMORIAFONOLOGICA;
    }

    public String getREPETICAODEPSEUDOPALAVRAS() {
        return REPETICAODEPSEUDOPALAVRAS;
    }

    public void setREPETICAODEPSEUDOPALAVRAS(String REPETICAODEPSEUDOPALAVRAS) {
        this.REPETICAODEPSEUDOPALAVRAS = REPETICAODEPSEUDOPALAVRAS;
    }

    public String getCOPIADEERITMO() {
        return COPIADEERITMO;
    }

    public void setCOPIADEERITMO(String COPIADEERITMO) {
        this.COPIADEERITMO = COPIADEERITMO;
    }

    public String getMEMORIAVISUAL() {
        return MEMORIAVISUAL;
    }

    public void setMEMORIAVISUAL(String MEMORIAVISUAL) {
        this.MEMORIAVISUAL = MEMORIAVISUAL;
    }

    public String getCOPIADEFORMAS() {
        return COPIADEFORMAS;
    }

    public void setCOPIADEFORMAS(String COPIADEFORMAS) {
        this.COPIADEFORMAS = COPIADEFORMAS;
    }

    public void buildALITERACAO() {
        this.ALITERACAO = "Aliteração é a capacidade de identificar ou repetir a sílaba ou "
                + "fonema na posição inicial das palavras";
    }

    public void buildCOPIADEERITMO() {
        this.COPIADEERITMO = "Cópiai de Ritmo é a capacidade de blablablablablabalbalbalbalabalbalbala";
    }

    public void buildCOPIADEFORMAS() {
        this.COPIADEFORMAS = "Cópia de Formas é a capacidade de blablablablablabalbalbalbalabalbalbala";
    }

    public void buildDISCRIMINACAOFONEMICA() {
        this.DISCRIMINACAOFONEMICA = "Discriminação Fonêmica é a capacidade metalinguística que permite "
                + "analisar e refletir, de forma consciente, sobre a estrutura "
                + "fonológica da linguagem oral. Ou seja capacidade de discriminar fonêmas ";
    }

    public void buildMEMORIAFONOLOGICA() {
        this.MEMORIAFONOLOGICA = "Memória fonológica é capacidade de memorizar "
                + "palavras, sílabas e fonemas";
    }

    public void buildMEMORIAVISUAL() {
        this.MEMORIAVISUAL = "Memória Visual simultânea é a capacidade de reter "
                + "os estímulos visuais observados, já que é uma habilidade "
                + "para recordar as características completas de uma figura num conjunto.";
    }

    public void buildREPETICAODEPSEUDOPALAVRAS() {
        this.REPETICAODEPSEUDOPALAVRAS = "Recepetição de Peseudopalavras é a capacidade de blablablablablabalbalbalbalabalbalbala";
    }

    public void buildRIMA() {
        this.RIMA = "Rima é a capacidade de perceber que as palavras rimam "
                + "quando há semelhanças entre os sons desde "
                + "a vogal ou ditongo tónico até ao último fonema da palavra, "
                + "podendo abranger a rima da sílaba, a sílaba inteira ou mais "
                + "do que uma sílaba. Para identificar rimas, as crianças necessitam "
                + "ter a capacidade de identificar sons finais das palavras";
    }

    public void buildSEGMENTACAOSILABICA() {
        this.SEGMENTACAOSILABICA = "Segmentação Silábica é a capacidade de segmentar palavras em sílabas, "
                + "exigindo a execução de dois processos, a identificação e a "
                + "discriminação de sílabas, sendo que o primeiro processo é "
                + "facilitado aquando da produção isolada das sílabas";
    }


}
