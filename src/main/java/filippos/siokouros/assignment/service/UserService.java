package filippos.siokouros.assignment.service;


import filippos.siokouros.assignment.model.User;

public interface UserService {
    public User findUserByEmail(String email);
    public void saveUser(User user);
}
