/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.fatec.neweducation.model.dto;



public class GameResponse {

   
    private Boolean responseA;
    private Boolean responseB;
    private Boolean responseC;

    public GameResponse() {
    }


    public Boolean isResponseA() {
        return responseA;
    }

    public void setResponseA(Boolean responseA) {
        this.responseA = responseA;
    }

    public Boolean isResponseB() {
        return responseB;
    }

    public void setResponseB(Boolean responseB) {
        this.responseB = responseB;
    }

    public Boolean isResponseC() {
        return responseC;
    }

    public void setResponseC(Boolean responseC) {
        this.responseC = responseC;
    }

}
