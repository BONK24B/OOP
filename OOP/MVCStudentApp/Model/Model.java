package MVCStudentApp.Model;

import java.util.List;
import java.util.Scanner;

import MVCStudentApp.Controller.IGetModel;


public class Model implements IGetModel{
    private List<StudentMVC> students;

    public Model(List<StudentMVC> students) {
        this.students = students;
    }

    public List<StudentMVC> getAllStudents(){
        return students;
    }

    @Override
    public void deleteById(List<StudentMVC> students) {
        Scanner scan = new Scanner(System.in);
        long id = scan.nextLong();
        boolean isFound = false;

        for (int i = 0; i < students.size(); i++){
            if (students.get(i).getStudentId() == id){
                students.remove(students.get(i));
                i--;
                isFound = true;
            }
        }
        if (!isFound){
            System.out.println("Student not found");
        }
    }
}
