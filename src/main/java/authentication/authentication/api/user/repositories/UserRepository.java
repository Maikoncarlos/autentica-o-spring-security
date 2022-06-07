package authentication.authentication.api.user.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import authentication.authentication.api.user.entities.User;

public interface UserRepository extends JpaRepository<User, UUID> {

  User findByUsername(String username);

}
