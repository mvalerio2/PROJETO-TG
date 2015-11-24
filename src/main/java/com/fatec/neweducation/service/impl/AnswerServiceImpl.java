package com.fatec.neweducation.service.impl;

import com.fatec.neweducation.dao.AnswerDAO;
import com.fatec.neweducation.model.Answer;
import com.fatec.neweducation.model.Game;
import com.fatec.neweducation.model.Question;
import com.fatec.neweducation.service.AnswerService;
import java.util.LinkedList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
public class AnswerServiceImpl implements AnswerService {

    @Autowired
    private AnswerDAO dao;

    @Override
    public void save(Answer answer) {
        dao.save(answer);

    }

    @Override
    public void delete(Integer id) {
        Answer answer = this.findById(id);
        dao.delete(answer);
    }

    @Override
    public void update(Answer answer) {
        dao.update(answer);

    }

    @Override
    public Answer findById(Integer id) {
        Answer answer = dao.getById(id);
        return answer;
    }

    @Override
    public List<Answer> findByQuestion(Question question) {
        String query = "from " + Answer.class.getName() + " a where a.fkQuestion.id = " + question.getId();
        return this.dao.executeQuery(query);
    }

}
