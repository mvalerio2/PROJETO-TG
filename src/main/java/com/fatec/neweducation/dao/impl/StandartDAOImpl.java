package com.fatec.neweducation.dao.impl;

import com.fatec.neweducation.dao.AnswerDAO;
import com.fatec.neweducation.dao.StandartDAO;
import com.fatec.neweducation.model.Answer;
import com.fatec.neweducation.model.Standart;
import com.fatec.neweducation.util.HibernateUtil;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;


@Repository
public class StandartDAOImpl implements StandartDAO {

    
    private Session session;


    @Override
    public Standart getById(Integer id) {
        session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx = session.beginTransaction();
        Standart entity = (Standart) session.get(Standart.class, id);
        tx.commit();
        return entity;
    }

    @Override
    public Integer save(Standart entity) {
        session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx = session.beginTransaction();
        Integer id = (Integer) session.save(entity);
        tx.commit();
        return id;
    }

    @Override
    public void update(Standart entity) {
        session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx = session.beginTransaction();
        session.update(entity);
        tx.commit();
    }

    @Override
    public void delete(Standart entity) {
        session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx = session.beginTransaction();
        session.delete(entity);
        tx.commit();

    }

    @Override
    public List<Standart> findAll() {
        String query = "from " + Standart.class.getName();
        session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx = session.beginTransaction();
        List<Standart> list = session.createQuery(query).list();
        tx.commit();
        return list;
    }

    @Override
    public List<Standart> executeQuery(String query) {
        session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx = session.beginTransaction();
        List<Standart> list = session.createQuery(query).list();
        tx.commit();
        return list;
    }

}
