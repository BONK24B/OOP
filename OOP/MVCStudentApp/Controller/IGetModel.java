package MVCStudentApp.Controller;

import java.util.List;

import MVCStudentApp.Model.StudentMVC;

public interface IGetModel {
    public List<StudentMVC> getAllStudents();
    public void deleteById(List<StudentMVC> students);
}
