package ru.tinyakov.springboot.SpringBootCRUD.Service;


import ru.tinyakov.springboot.SpringBootCRUD.models.User;

import java.util.List;

public interface UserService {
    void add(User user);
    List<User> index();
    User showById(Long id);
    void update(User updatedUser);
    void delete(Long id);
}
