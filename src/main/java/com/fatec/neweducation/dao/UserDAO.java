package com.fatec.neweducation.dao;

import com.fatec.neweducation.model.User;
import java.util.List;


public interface UserDAO {

    public User getById(Integer id);

    public Integer save(User entity);

    public void update(User entity);

    public void delete(User entity);

    public List<User> findAll();

    public List<User> executeQuery(String query);
}
