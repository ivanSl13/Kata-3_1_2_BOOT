package ru.slepokurov.web.service;



import ru.slepokurov.web.model.User;

import java.util.List;

public interface UserService {

    List<User> getAllUsers();
    void addUser(User user);
    User getOneUser(int id);
    void updatUser(int id, User user);
    void deleteUser(int id);
}
