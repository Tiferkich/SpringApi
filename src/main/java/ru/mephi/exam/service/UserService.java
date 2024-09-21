package ru.mephi.exam.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.mephi.exam.models.Country;
import ru.mephi.exam.models.User;
import ru.mephi.exam.repository.UserRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<User> getAll() {
        return userRepository.findAll();
    }

    public User save(User user) {
        return userRepository.save(user);
    }

    public List<User> findExeptCountry(Country country) {
        List<User> users = new ArrayList<>();
        for (User user : userRepository.findAll()) {
            if (!user.getCountry().equals(country)) {
                users.add(user);
            }
        }
        return users;
    }

}
