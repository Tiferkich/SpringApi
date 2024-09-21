package ru.mephi.exam.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.util.Assert;
import ru.mephi.exam.models.Country;
import ru.mephi.exam.models.User;
import ru.mephi.exam.repository.UserRepository;

import java.util.List;

@ExtendWith(MockitoExtension.class)
public class UserServiceTest {
    @Mock
    private UserRepository userRepository;
    @InjectMocks
    private UserService userService;

    @Test
    public void shouldFindExeptCountry() {
        Mockito.when(userRepository.findAll()).thenReturn(getUsers());
        Country country = Country.RUSSIA;
        List<User> users = userService.findExeptCountry(country);
        Assertions.assertNotNull(users);
        for (User user : users) {
            Assertions.assertNotEquals(country, user.getCountry());
        }
    }


    private List<User> getUsers() {
        User user1 = new User(1L, "Daniel", 10, Country.RUSSIA);
        User user2 = new User(2L, "NIKITA", 20, Country.KOREA);
        User user3 = new User(3L, "USA", 10, Country.USA);
        User user4 = new User(4L, "NIKITA", 20, Country.CHINA);
        User user5 = new User(5L, "1", 10, Country.RUSSIA);
        User user6 = new User(6L, "2", 20, Country.KOREA);
        User user7 = new User(7L, "3", 10, Country.USA);
        User user8 = new User(8L, "4", 20, Country.JAPAN);
        return List.of(user1, user2, user3, user4, user5, user6, user7, user8);
    }
}
