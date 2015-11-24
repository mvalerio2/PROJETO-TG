package com.fatec.neweducation.service;


import com.fatec.neweducation.model.User;
import com.fatec.neweducation.model.resources.TypeUser;
import java.util.List;


public interface UserService {

    public Integer save(User user);

    public void delete(Integer id);

    public void update(User user);

    public User findById(Integer id);

    public List<User> findAll();

    public User findByName(String name);

    public List<User> findByType(TypeUser type);
}
