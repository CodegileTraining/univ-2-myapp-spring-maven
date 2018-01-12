package com.codegile.university.repository.db;

import com.codegile.university.repository.model.User;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepositoryImpl implements UserRepository {

    private Object database;

    @Override
    public void saveUser(User user) {
        // TODO save user to MySQL DB.
    }
}
