package factory;

import domain.User;

import java.util.List;

public interface Factory {
    List selectAllUsers();
    User selectUserById(int id);
}
