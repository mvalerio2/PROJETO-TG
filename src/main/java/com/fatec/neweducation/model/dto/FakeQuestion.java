package com.fatec.neweducation.model.dto;

import com.fatec.neweducation.model.Answer;
import com.fatec.neweducation.model.Question;
import com.fatec.neweducation.model.resources.Hability;
import com.fatec.neweducation.model.resources.TypeAnswer;
import com.fatec.neweducation.model.resources.TypeQuestion;
import java.io.Serializable;

public class FakeQuestion implements Serializable {

    //Id's
    private Integer idQuestion;
    private Integer idAnswerA;
    private Integer idAnswerB;
    private Integer idAnswerC;

    //Imagens
    private String pictureA;
    private String pictureB;
    private String pictureC;

    //Acertos
    private Boolean correctA;
    private Boolean correctB;
    private Boolean correctC;

    //Response
    private String responseA;
    private String responseB;
    private String responseC;

    //Audio
    private String audioA;
    private String audioB;
    private String audioC;


    //Questão
    private String asking;
    private Hability hability;
    private Integer difficulty;
    private TypeQuestion typeQuestion;
    private TypeAnswer typeAnswer;

    //Models
    private Question question;
    private Answer answerA;
    private Answer answerB;
    private Answer answerC;

    public FakeQuestion() {
        this.question = new Question();
        this.answerA = new Answer();
        this.answerB = new Answer();
        this.answerC = new Answer();
    }


    public Question getQuestion() {

        if (idQuestion != null) {
            question.setId(this.getIdQuestion());
        }

        if (asking != null) {
            question.setAsking(this.getAsking());
        }

        if (hability != null) {
            question.setHability(this.getHability());
        }

        if (difficulty != null) {
            question.setDifficulty(this.getDifficulty());
        }

        if (typeQuestion != null) {
            question.setTypeQuestion(this.getTypeQuestion());
        }
        this.question.setActive(Boolean.TRUE);

        return question;
    }

    public Answer getAnswerA() {

        answerA.setFkQuestion(this.getQuestion());

        if (idAnswerA != null) {
            answerA.setId(this.getIdAnswerA());
        }

        if (typeAnswer != null) {
            answerA.setTypeAnswer(this.getTypeAnswer());
        }

        if (pictureA != null) {
            answerA.setPicture(this.getPictureA());
        }

        if (responseA != null) {
            answerA.setResponse(responseA);
        }

        if (correctA != null) {
            answerA.setIsCorrect(this.getCorrectA());
        } else {
            answerA.setIsCorrect(false);
        }

        if (audioA != null) {
            answerA.setAudio(this.audioA);
        }

        return answerA;
    }

    public Answer getAnswerB() {


        answerB.setFkQuestion(this.getQuestion());

        if (idAnswerB != null) {
            answerB.setId(this.getIdAnswerB());
        }

        if (typeAnswer != null) {
            answerB.setTypeAnswer(this.getTypeAnswer());
        }

        if (pictureB != null) {
            answerB.setPicture(this.getPictureB());
        }

        if (responseB != null) {
            answerB.setResponse(responseB);
        }

        if (correctB != null) {
            answerB.setIsCorrect(this.getCorrectB());
        }

        if (audioB != null) {
            answerB.setAudio(this.audioB);
        } else {
            answerB.setIsCorrect(false);
        }

        return answerB;
    }

    public Answer getAnswerC() {

        answerC.setFkQuestion(this.getQuestion());

        if (idAnswerC != null) {
            answerC.setId(this.getIdAnswerC());
        }

        if (typeAnswer != null) {
            answerC.setTypeAnswer(this.getTypeAnswer());
        }

        if (pictureC != null) {
            answerC.setPicture(this.getPictureC());
        }

        if (responseC != null) {
            answerC.setResponse(responseC);
        }

        if (correctC != null) {
            answerC.setIsCorrect(this.getCorrectC());
        } else {
            answerC.setIsCorrect(false);
        }

        if (audioC != null) {
            answerC.setAudio(this.audioC);
        }

        return answerC;
    }

    public void setAnswerC(Answer answer) {

        this.answerC = answer;

        if (this.answerC.getId() != null) {
            this.setIdAnswerC(this.answerC.getId());
        }

        if (this.answerC.getTypeAnswer() != null) {
            this.setTypeAnswer(this.answerC.getTypeAnswer());
        }

        if (this.answerC.getPicture() != null) {
            this.setPictureC(this.answerC.getPicture());
        }

        if (this.answerC.getResponse() != null) {
            this.setResponseC(this.answerC.getResponse());
        }

        if (this.answerC.getIsCorrect() != null) {
            this.setCorrectC(this.answerC.getIsCorrect());
        } else {
            this.setCorrectC(false);
        }

        if (this.answerC.getAudio() != null) {
            this.setAudioC(this.answerC.getAudio());
        } else
            this.setAudioC("");

    }

    public void setAnswerB(Answer answer) {

        this.answerB = answer;

        if (this.answerB.getId() != null) {
            this.setIdAnswerC(this.answerB.getId());
        }

        if (this.answerB.getTypeAnswer() != null) {
            this.setTypeAnswer(this.answerB.getTypeAnswer());
        }

        if (this.answerB.getPicture() != null) {
            this.setPictureC(this.answerB.getPicture());
        }

        if (this.answerB.getResponse() != null) {
            this.setResponseC(this.answerB.getResponse());
        }

        if (this.answerB.getIsCorrect() != null) {
            this.setCorrectC(this.answerB.getIsCorrect());
        } else {
            this.setCorrectC(false);
        }

        if (this.answerB.getAudio() != null) {
            this.setAudioC(this.answerB.getAudio());
        }

    }

    public void setAnswerA(Answer answer) {

        this.answerA = answer;

        if (this.answerA.getId() != null) {
            this.setIdAnswerC(this.answerA.getId());
        }

        if (this.answerA.getTypeAnswer() != null) {
            this.setTypeAnswer(this.answerA.getTypeAnswer());
        }

        if (this.answerA.getPicture() != null) {
            this.setPictureC(this.answerA.getPicture());
        }

        if (this.answerA.getResponse() != null) {
            this.setResponseC(this.answerA.getResponse());
        }

        if (this.answerA.getIsCorrect() != null) {
            this.setCorrectC(this.answerA.getIsCorrect());
        } else {
            this.setCorrectC(false);
        }

        if (this.answerA.getAudio() != null) {
            this.setAudioC(this.answerA.getAudio());
        } else
            this.setAudioA("");

    }

    public void setQuestion(Question question) {

        this.question = question;

        if (question.getId() != null) {
            this.setIdQuestion(this.question.getId());
        }

        if (question.getAsking() != null) {
            this.setAsking(this.question.getAsking());
        }

        if (question.getHability() != null) {
            this.setHability(this.question.getHability());
        }

        if (question.getTypeQuestion() != null) {
            this.setTypeQuestion(this.question.getTypeQuestion());
        }

    }

    public Integer getIdQuestion() {
        return idQuestion;
    }

    public void setIdQuestion(Integer idQuestion) {
        this.idQuestion = idQuestion;
    }

    public Integer getIdAnswerA() {
        return idAnswerA;
    }

    public void setIdAnswerA(Integer idAnswerA) {
        this.idAnswerA = idAnswerA;
    }

    public Integer getIdAnswerB() {
        return idAnswerB;
    }

    public void setIdAnswerB(Integer idAnswerB) {
        this.idAnswerB = idAnswerB;
    }

    public Integer getIdAnswerC() {
        return idAnswerC;
    }

    public void setIdAnswerC(Integer idAnswerC) {
        this.idAnswerC = idAnswerC;
    }

    public String getPictureA() {
        return pictureA;
    }

    public void setPictureA(String pictureA) {
        this.pictureA = pictureA;
    }

    public String getPictureB() {
        return pictureB;
    }

    public void setPictureB(String pictureB) {
        this.pictureB = pictureB;
    }

    public String getPictureC() {
        return pictureC;
    }

    public void setPictureC(String pictureC) {
        this.pictureC = pictureC;
    }

    public Boolean getCorrectA() {
        return correctA;
    }

    public void setCorrectA(Boolean correctA) {
        this.correctA = correctA;
    }

    public Boolean getCorrectB() {
        return correctB;
    }

    public void setCorrectB(Boolean correctB) {
        this.correctB = correctB;
    }

    public Boolean getCorrectC() {
        return correctC;
    }

    public void setCorrectC(Boolean correctC) {
        this.correctC = correctC;
    }

    public String getResponseA() {
        return responseA;
    }

    public void setResponseA(String responseA) {
        this.responseA = responseA;
    }

    public String getResponseB() {
        return responseB;
    }

    public void setResponseB(String responseB) {
        this.responseB = responseB;
    }

    public String getResponseC() {
        return responseC;
    }

    public void setResponseC(String responseC) {
        this.responseC = responseC;
    }

    public String getAudioA() {
        return audioA;
    }

    public void setAudioA(String audioA) {
        this.audioA = audioA;
    }

    public String getAudioB() {
        return audioB;
    }

    public void setAudioB(String audioB) {
        this.audioB = audioB;
    }

    public String getAudioC() {
        return audioC;
    }

    public void setAudioC(String audioC) {
        this.audioC = audioC;
    }

    public String getAsking() {
        return asking;
    }

    public void setAsking(String asking) {
        this.asking = asking;
    }

    public Hability getHability() {
        return hability;
    }

    public void setHability(Hability hability) {
        this.hability = hability;
    }

    public Integer getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(Integer difficulty) {
        this.difficulty = difficulty;
    }

    public TypeQuestion getTypeQuestion() {
        return typeQuestion;
    }

    public void setTypeQuestion(TypeQuestion typeQuestion) {
        this.typeQuestion = typeQuestion;
    }

    public TypeAnswer getTypeAnswer() {
        return typeAnswer;
    }

    public void setTypeAnswer(TypeAnswer typeAnswer) {
        this.typeAnswer = typeAnswer;
    }

}
