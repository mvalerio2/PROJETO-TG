package com.fatec.neweducation.dao.impl;

import com.fatec.neweducation.dao.QuestionDAO;
import com.fatec.neweducation.model.Question;
import com.fatec.neweducation.util.HibernateUtil;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;


@Repository
public class QuestionDAOImpl implements QuestionDAO {

    private Session session;

    @Override
    public Question getById(Integer id) {
        session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx = session.beginTransaction();
        Question entity = (Question) session.get(Question.class, id);
        tx.commit();
        return entity;
    }

    @Override
    public Integer save(Question entity) {
        session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx = session.beginTransaction();
        Integer id = (Integer) session.save(entity);
        tx.commit();
        return id;
    }

    @Override
    public void update(Question entity) {
        session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx = session.beginTransaction();
        session.update(entity);
        tx.commit();
    }

    @Override
    public void delete(Question entity) {
        session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx = session.beginTransaction();
        session.delete(entity);
        tx.commit();
    }

    @Override
    public List<Question> findAll() {
        session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx = session.beginTransaction();
        List<Question> list = session.createSQLQuery("select {question.*} from question").addEntity("question", Question.class).list();
        tx.commit();
        return list;
    }

    @Override
    public List<Question> executeQuery(String query) {
        session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx = session.beginTransaction();
        List<Question> list = session.createQuery(query).list();
        tx.commit();
        return list;
    }
}