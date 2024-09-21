package ru.mephi.exam.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.mephi.exam.models.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
