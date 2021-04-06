package ru.izotov.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.izotov.domain.User;

public interface UserRepo extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
