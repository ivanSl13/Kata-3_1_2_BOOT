package ru.slepokurov.web.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.slepokurov.web.model.User;
import ru.slepokurov.web.repositories.UsersRepositories;

import java.util.List;

@Service
@Transactional(readOnly = true)
public class UserServiceImpl implements UserService {
    private final UsersRepositories usersRepositories;

    @Autowired
    public UserServiceImpl(UsersRepositories usersRepositories) {
        this.usersRepositories = usersRepositories;
    }

    @Override
    public List<User> getAllUsers() {
        return usersRepositories.findAll();
    }

    @Override
    @Transactional
    public void addUser(User user) {
        usersRepositories.save(user);
    }

    @Override
    public User getOneUser(int id) {
        return usersRepositories.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public void updatUser(int id, User user) {
        user.setId(id);
        usersRepositories.save(user);
    }

    @Override
    @Transactional
    public void deleteUser(int id) {
        usersRepositories.deleteById(id);
    }

}
