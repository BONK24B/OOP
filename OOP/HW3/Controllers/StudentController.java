package OOP.HW3.Controllers;

import OOP.HW3.Services.StudentService;
import OOP.HW3.StudentDomain.Student;

public class StudentController implements IUserController<Student>{
    private final StudentService dataService = new StudentService();

    @Override
    public void create(String firstName, String secondName, int age) {
        dataService.create(firstName, secondName, age);
    }

    
}
