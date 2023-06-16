package OOP.HW3.Controllers;

import OOP.HW3.StudentDomain.User;

public interface IUserController<T extends User> {
    void create(String firstName, String secondName, int age);
}
