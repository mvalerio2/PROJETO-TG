package com.fatec.neweducation.service;

import com.fatec.neweducation.model.Answer;
import com.fatec.neweducation.model.Question;
import java.util.List;

/**
 * Created by glaucia on 09/07/14.
 */
public interface AnswerService {

    public void save(Answer answer);

    public void delete(Integer id);

    public void update(Answer answer);

    public Answer findById(Integer id);

    public List<Answer> findByQuestion(Question question);
}
