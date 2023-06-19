package HW3.Controllers;

import HW3.Services.TeacherService;
import HW3.StudentDomain.Teacher;

public class TeacherController implements IUserController<Teacher>{

    private final TeacherService dataService = new TeacherService();

    @Override
    public void create(String firstName, String secondName, int age) {
        dataService.create(firstName, secondName, age);
    }
    
}
