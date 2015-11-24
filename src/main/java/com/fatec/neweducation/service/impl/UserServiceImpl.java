package com.fatec.neweducation.service.impl;

import com.fatec.neweducation.dao.UserDAO;
import com.fatec.neweducation.model.User;
import com.fatec.neweducation.model.resources.TypeUser;
import com.fatec.neweducation.service.UserService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDAO dao;

    @Override
    //TODO - incluir mensagem de erro
    public Integer save(User user) {
        if (this.isAvailableName(user.getNameUser())) {
            Integer id = dao.save(user);
            return id;
        }
        return null;
    }

    @Override
    public void delete(Integer id) {
        User user = this.findById(id);
        user.setActive(Boolean.FALSE);
        dao.update(user);
    }

    @Override
    public void update(User user) {
        dao.update(user);

    }

    @Override
    public User findById(Integer id) {
        return dao.getById(id);
    }

    @Override
    public List<User> findAll() {
        String query = "from " + User.class.getName() + " u where u.active = 1";
        return this.dao.executeQuery(query);
    }

    @Override
    public User findByName(String name) {
        String query = "from " + User.class.getName() + " u where u.loginUser = '" + name + "'";
        List<User> list = this.dao.executeQuery(query);
        if (!list.isEmpty()) {
            return list.get(0);
        }
        return null;
    }

    public boolean isAvailableName(String name) {
        User userFind = this.findByName(name);
        return userFind == null;
    }

    @Override
    public List<User> findByType(TypeUser type) {
        String query = "from " + User.class.getName() + " u where u.typeUser = '" + type.getValor() + "' and u.active = 1";
        return this.dao.executeQuery(query);
    }
}
