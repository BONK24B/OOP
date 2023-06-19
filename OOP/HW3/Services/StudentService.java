package HW3.Services;

import java.util.ArrayList;
import java.util.List;

import HW3.StudentDomain.PersonComparator;
import HW3.StudentDomain.Student;

public class StudentService implements IUserService<Student>{
    private long count;
    private List<Student> students;

    public StudentService() {
        this.students = new ArrayList<>();
    }

    @Override
    public List<Student> getAll() {
        return students;
    }

    @Override
    public void create(String firstName, String secondName, int age) {
        Student student = new Student(firstName, secondName, age, count);
        count++;
        students.add(student);
    }

    public List<Student> getSortedByName(){
        List<Student> newStudentList = new ArrayList<>(students);
        newStudentList.sort(new PersonComparator<Student>());

        return newStudentList;
    }
}
