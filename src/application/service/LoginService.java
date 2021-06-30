package application.service;

import application.entity.User;
import application.repository.LoginRepository;

public class LoginService {

  private final LoginRepository loginRepository = new LoginRepository();

  public boolean login(String username, String password) {
    User user = loginRepository.getUserByUsername(username);

    return user != null && user.getPassword().equals(password);
  }
}
