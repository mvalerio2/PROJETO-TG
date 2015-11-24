/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.fatec.neweducation.model.dto;

import com.fatec.neweducation.model.Answer;
import com.fatec.neweducation.model.Game;
import com.fatec.neweducation.model.PlayerSchoolGrade;
import com.fatec.neweducation.model.Question;
import com.fatec.neweducation.model.Standart;
import java.util.Date;


public class FakeGame {

    //Models
    private PlayerSchoolGrade playerSchoolGrade;

    private Question question;

    private Standart standart;

    private Answer answerA;
    private Answer answerB;
    private Answer answerC;

    private Game game;

    private Boolean correctResponse;


    public FakeGame() {
        this.game = new Game();
    }

    public PlayerSchoolGrade getPlayerSchoolGrade() {
        return playerSchoolGrade;
    }

    public void setPlayerSchoolGrade(PlayerSchoolGrade playerSchoolGrade) {
        this.playerSchoolGrade = playerSchoolGrade;
    }

    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }

    public Standart getStandart() {
        return standart;
    }

    public void setStandart(Standart standart) {
        this.standart = standart;
    }

    public Answer getAnswerA() {
        return answerA;
    }

    public void setAnswerA(Answer answerA) {
        this.answerA = answerA;
    }

    public Answer getAnswerB() {
        return answerB;
    }

    public void setAnswerB(Answer answerB) {
        this.answerB = answerB;
    }

    public Answer getAnswerC() {
        return answerC;
    }

    public void setAnswerC(Answer answerC) {
        this.answerC = answerC;
    }


    public Game getGame() {

        if (this.question != null) {
            this.game.setFkQuestionGame(this.getQuestion());
        }

        if (this.standart != null) {
            this.game.setFkStandart(this.getStandart());
        }

        if (this.playerSchoolGrade != null) {
            this.game.setFkPlayerSchoolGrade(this.getPlayerSchoolGrade());
        }

        if (this.correctResponse != null) {
            this.game.setIsCorrectAnswer(correctResponse);
        } else {
            this.game.setIsCorrectAnswer(false);
        }

        this.game.setCreationDate(new Date());

            return game;
        }

    public void setGame(Game game) {
        this.game = game;
    }

    public Boolean isCorrectResponse() {
        return correctResponse;
    }

    public void setCorrectResponse(Boolean correctResponse) {
        this.correctResponse = correctResponse;
    }


}
