package authentication.authentication.api.user.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import authentication.authentication.api.user.repositories.UserRepository;
import authentication.authentication.api.user.entities.User;

@Service
public class CreateUserService {

  @Autowired
  UserRepository userRepository;

  public User execute(User user) {

    User existsUser = userRepository.findByUsername(user.getUsername());

    if (existsUser != null) {
      throw new Error("User already exists!");
    }

    User createdUser = userRepository.save(user);

    return createdUser;
  }

}
