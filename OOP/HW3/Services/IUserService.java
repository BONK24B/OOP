package OOP.HW3.Services;

import java.util.List;

public interface IUserService<T> {
    List<T> getAll();
    void create(String firstName, String secondName, int age);
}
