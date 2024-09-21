package ru.mephi.exam.contoller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.mephi.exam.models.Country;
import ru.mephi.exam.models.User;
import ru.mephi.exam.service.UserService;

import java.util.List;

@RestController
@ResponseBody
public class UserControl {

    @Autowired
    private UserService userService;

    @GetMapping("user-api/v1/users")
    public List<User> getAllUsers() {
        return userService.getAll();
    }

    @PostMapping("user-api/v1/users")
    public User addUser(@RequestBody User user) {
        return userService.save(user);
    }

    @GetMapping("user-api/v1/{country}")
    public List<User> getUserExeptCountry(@PathVariable Country country) {
        return userService.findExeptCountry(country);
    }
}
