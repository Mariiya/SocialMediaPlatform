package com.platform.reverie.services;

import com.platform.reverie.models.User;
import org.springframework.stereotype.Component;

import java.math.BigInteger;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.function.Predicate;

@Component
public class UserDaoService {

    private static Collection<User> users = new ArrayList<>();

    static {
        users.add(new User(BigInteger.ONE, "Mariia", "Kozhushan", LocalDate.now().minusYears(22)));
        users.add(new User(BigInteger.ONE, "Katerina", "Kozhushan", LocalDate.now().minusYears(12)));
        users.add(new User(BigInteger.ONE, "Maxim", "Bataiev", LocalDate.now().minusYears(21)));
    }

    public Collection<User> findAll() {
        return users;
    }

    public User getUser(BigInteger id) {
        return findOne(id);
    }

    public User createUser(User user) {
        users.add(user);
        return user;
    }

    public User findOne(BigInteger id) {
        Predicate<? super User> predicate = user -> user.getId().equals(id);
        return users.stream().filter(predicate).findFirst().get();
    }
}
