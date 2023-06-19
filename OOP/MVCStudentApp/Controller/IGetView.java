package MVCStudentApp.Controller;

import java.util.List;

import MVCStudentApp.Model.StudentMVC;

public interface IGetView {
    public void printAllStudents(List<StudentMVC> students);
    public String prompt(String message);
}
