package MVCStudentApp.Model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import MVCStudentApp.Controller.IGetModel;

public class HashModel implements IGetModel{

    private HashMap<Long, StudentMVC> students;

    public HashModel(List<StudentMVC> students) {
        this.students = new HashMap<Long, StudentMVC>();
        for (StudentMVC student : students) {
        this.students.put(student.getStudentId(), student);
    }
    }

    @Override
    public List<StudentMVC> getAllStudents() {
        List<StudentMVC> studs;
        studs = new ArrayList<>(students.values());
        return studs;
    }

    @Override
    public void deleteById(List<StudentMVC> students) {

        Scanner scan = new Scanner(System.in);
        Long id = scan.nextLong();

        if (this.students.containsKey(id)){
            this.students.remove(id);
        }
        else
            System.out.println("Student with id " + id + " not found");
    }
    
}
