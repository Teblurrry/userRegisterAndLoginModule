package net.guides.springboot.registration_login_demo.repository;

import net.guides.springboot.registration_login_demo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}
