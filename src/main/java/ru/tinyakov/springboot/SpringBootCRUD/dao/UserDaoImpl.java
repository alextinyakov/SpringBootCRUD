package ru.tinyakov.springboot.SpringBootCRUD.dao;


import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import ru.tinyakov.springboot.SpringBootCRUD.models.User;

import java.util.List;

@Repository
public class UserDaoImpl implements UserDao {

    @PersistenceContext
    private EntityManager entityManager;



    @Override
    public void add(User user) {

        entityManager.persist(user);
    }

    @Override
    public List<User> index() {

        return entityManager.
                createQuery("select user from User user")
                .getResultList();
    }


    @Override
    public User showById(Long id) {
        return entityManager.find(User.class, id);
    }

    @Override
    public void update(User updatedUser) {
        entityManager.merge(updatedUser);
    }

    @Override
    public void delete(Long id) {
        entityManager.remove(showById(id));
    }
}
