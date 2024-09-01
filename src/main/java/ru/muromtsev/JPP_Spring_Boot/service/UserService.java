package ru.muromtsev.JPP_Spring_Boot.service;


import ru.muromtsev.JPP_Spring_Boot.model.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();

    User showUser(int id);

    void delete(int id);

    void save(User user);

    void update(int id, User udatedUser);
}