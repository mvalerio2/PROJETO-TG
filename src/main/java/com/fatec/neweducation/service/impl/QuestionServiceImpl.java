package com.fatec.neweducation.service.impl;

import com.fatec.neweducation.dao.QuestionDAO;
import com.fatec.neweducation.model.Answer;
import com.fatec.neweducation.model.Question;
import com.fatec.neweducation.model.Standart;
import com.fatec.neweducation.model.resources.Hability;
import com.fatec.neweducation.model.resources.TypeQuestion;
import com.fatec.neweducation.service.AnswerService;
import com.fatec.neweducation.service.QuestionService;
import java.util.Collections;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
public class QuestionServiceImpl implements QuestionService {

    @Autowired
    private QuestionDAO dao;

    private AnswerService answerService;

    @Override
    public void save(Question question) {
        dao.save(question);
    }

    @Override
    public void delete(Integer id) {
        Question question = this.findById(id);
        question.setActive(Boolean.FALSE);
        dao.update(question);
    }

    @Override
    public void update(Question question) {
        dao.update(question);
        List<Answer> listAnswer;
        listAnswer = answerService.findByQuestion(question);
        for (Answer answer : listAnswer) {
            answerService.update(answer);
        }
    }

    @Override
    public Question findById(Integer id) {
        return dao.getById(id);
    }

    @Override
    public List<Question> findByFAE(TypeQuestion type) {
        String query = "from " + Question.class.getName() + " q where q.typeQuestion = '" + type + "' and q.active = 1";
        return this.dao.executeQuery(query);
    }

    @Override
    public List<Question> findByHability(Hability hability) {
        String query = "from " + Question.class.getName() + " q where q.hability = '" + hability + "' and q.active = 1";
        return this.dao.executeQuery(query);
    }

    @Override
    public List<Question> findByDifficulty(Integer difficulty) {
        String query = "from " + Question.class.getName() + " q where q.difficulty = " + difficulty + " and q.active = 1";
        return this.dao.executeQuery(query);
    }

    @Override
    public List<Question> findByfindByHabilityAndDifficulty(Hability hability, Integer difficulty) {
        String query = "from " + Question.class.getName() + " q where q.difficulty = " + difficulty + " and q.hability = '" + hability + "' and q.active = 1";
        return this.dao.executeQuery(query);
    }

    @Override
    public List<Question> findByfindByStandart(Standart standart) {
        String query = "from " + Question.class.getName() + " q where q.difficulty = " + standart.getDifficulty() + " and q.hability = '" + standart.getHability() + "' and q.active = 1";
        List<Question> list = this.dao.executeQuery(query);
        if (list.size() >= 5) {
            Collections.shuffle(list);
            return list.subList(0, 5);
        }
        String query2 = "from " + Question.class.getName() + " q where q.difficulty = " + standart.getDifficulty() + " and q.active = 1";
        List<Question> list2 = this.dao.executeQuery(query2);
        if (list2.size() >= 5) {
            Collections.shuffle(list2);
            return list2.subList(0, 5);
        }
        String query3 = "from " + Question.class.getName() + " q where q.active = 1";
        List<Question> list3 = this.dao.executeQuery(query3);
        Collections.shuffle(list3);
        return list3.subList(0, 5);

    }
}
