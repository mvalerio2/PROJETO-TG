package com.fatec.neweducation.dao.impl;

import com.fatec.neweducation.dao.UserDAO;
import com.fatec.neweducation.model.School;
import com.fatec.neweducation.model.User;
import com.fatec.neweducation.util.HibernateUtil;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;


@Repository
public class UserDAOImpl implements UserDAO {

    private Session session;

    @Override
    public User getById(Integer id) {
        session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx = session.beginTransaction();
        User entity = (User) session.get(User.class, id);
        tx.commit();
        return entity;
    }

    @Override
    public Integer save(User entity) {
        session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx = session.beginTransaction();
        Integer id = (Integer) session.save(entity);
        tx.commit();
        return id;
    }

    @Override
    public void update(User entity) {
        session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx = session.beginTransaction();
        session.update(entity);
        tx.commit();
    }

    @Override
    public void delete(User entity) {
        session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx = session.beginTransaction();
        session.delete(entity);
        tx.commit();
    }

    @Override
    public List<User> findAll() {
        String query = "from " + User.class.getName();
        session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx = session.beginTransaction();
        List<User> list = session.createQuery(query).list();
        tx.commit();
        return list;
    }

    @Override
    public List<User> executeQuery(String query) {
        session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx = session.beginTransaction();
        List<User> list = session.createQuery(query).list();
        tx.commit();
        return list;
    }
}
